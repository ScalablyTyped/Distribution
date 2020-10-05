package typings.storybookTheming.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Easing extends js.Object {
  var rubber: String = js.native
}

object Easing {
  @scala.inline
  def apply(rubber: String): Easing = {
    val __obj = js.Dynamic.literal(rubber = rubber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Easing]
  }
  @scala.inline
  implicit class EasingOps[Self <: Easing] (val x: Self) extends AnyVal {
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
    def setRubber(value: String): Self = this.set("rubber", value.asInstanceOf[js.Any])
  }
  
}

