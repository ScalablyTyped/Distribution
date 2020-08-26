package typings.semanticUiDimmer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.ClassNameSettings._Impl, 'pageDimmer'> */
@js.native
trait PickImplpageDimmer extends js.Object {
  var pageDimmer: String = js.native
}

object PickImplpageDimmer {
  @scala.inline
  def apply(pageDimmer: String): PickImplpageDimmer = {
    val __obj = js.Dynamic.literal(pageDimmer = pageDimmer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpageDimmer]
  }
  @scala.inline
  implicit class PickImplpageDimmerOps[Self <: PickImplpageDimmer] (val x: Self) extends AnyVal {
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
    def setPageDimmer(value: String): Self = this.set("pageDimmer", value.asInstanceOf[js.Any])
  }
  
}

