package typings.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ClassNameSettings._Impl, 'dimmed'> */
@js.native
trait PickImpldimmed extends js.Object {
  var dimmed: String = js.native
}

object PickImpldimmed {
  @scala.inline
  def apply(dimmed: String): PickImpldimmed = {
    val __obj = js.Dynamic.literal(dimmed = dimmed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimmed]
  }
  @scala.inline
  implicit class PickImpldimmedOps[Self <: PickImpldimmed] (val x: Self) extends AnyVal {
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
    def setDimmed(value: String): Self = this.set("dimmed", value.asInstanceOf[js.Any])
  }
  
}

