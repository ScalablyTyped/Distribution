package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'revalidate'> */
@js.native
trait PickImplrevalidate extends js.Object {
  var revalidate: Boolean = js.native
}

object PickImplrevalidate {
  @scala.inline
  def apply(revalidate: Boolean): PickImplrevalidate = {
    val __obj = js.Dynamic.literal(revalidate = revalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrevalidate]
  }
  @scala.inline
  implicit class PickImplrevalidateOps[Self <: PickImplrevalidate] (val x: Self) extends AnyVal {
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
    def setRevalidate(value: Boolean): Self = this.set("revalidate", value.asInstanceOf[js.Any])
  }
  
}

