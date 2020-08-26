package typings.reactNativeFlipCard.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackProps extends js.Object {
  var chilren: js.Array[Element] = js.native
  var flipHorizontal: Boolean = js.native
  var flipVertical: Boolean = js.native
  var perspective: Double = js.native
}

object BackProps {
  @scala.inline
  def apply(chilren: js.Array[Element], flipHorizontal: Boolean, flipVertical: Boolean, perspective: Double): BackProps = {
    val __obj = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any], flipHorizontal = flipHorizontal.asInstanceOf[js.Any], flipVertical = flipVertical.asInstanceOf[js.Any], perspective = perspective.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackProps]
  }
  @scala.inline
  implicit class BackPropsOps[Self <: BackProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChilrenVarargs(value: Element*): Self = this.set("chilren", js.Array(value :_*))
    @scala.inline
    def setChilren(value: js.Array[Element]): Self = this.set("chilren", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlipHorizontal(value: Boolean): Self = this.set("flipHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlipVertical(value: Boolean): Self = this.set("flipVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerspective(value: Double): Self = this.set("perspective", value.asInstanceOf[js.Any])
  }
  
}

