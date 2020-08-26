package typings.semanticUiNag.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'detachable'> */
@js.native
trait PickImpldetachable extends js.Object {
  var detachable: Boolean = js.native
}

object PickImpldetachable {
  @scala.inline
  def apply(detachable: Boolean): PickImpldetachable = {
    val __obj = js.Dynamic.literal(detachable = detachable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldetachable]
  }
  @scala.inline
  implicit class PickImpldetachableOps[Self <: PickImpldetachable] (val x: Self) extends AnyVal {
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
    def setDetachable(value: Boolean): Self = this.set("detachable", value.asInstanceOf[js.Any])
  }
  
}

