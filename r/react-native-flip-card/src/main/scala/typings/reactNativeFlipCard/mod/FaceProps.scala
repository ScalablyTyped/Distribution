package typings.reactNativeFlipCard.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceProps extends js.Object {
  var chilren: js.Array[Element] = js.native
}

object FaceProps {
  @scala.inline
  def apply(chilren: js.Array[Element]): FaceProps = {
    val __obj = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceProps]
  }
  @scala.inline
  implicit class FacePropsOps[Self <: FaceProps] (val x: Self) extends AnyVal {
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
  }
  
}

