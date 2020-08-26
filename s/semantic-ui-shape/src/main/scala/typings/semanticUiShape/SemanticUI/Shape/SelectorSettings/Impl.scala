package typings.semanticUiShape.SemanticUI.Shape.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default '.side'
    */
  var side: String = js.native
  /**
    * @default '.sides'
    */
  var sides: String = js.native
}

object Impl {
  @scala.inline
  def apply(side: String, sides: String): Impl = {
    val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def setSide(value: String): Self = this.set("side", value.asInstanceOf[js.Any])
    @scala.inline
    def setSides(value: String): Self = this.set("sides", value.asInstanceOf[js.Any])
  }
  
}

