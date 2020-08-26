package typings.semanticUiRating.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.Rating.ClassNameSettings._Impl, 'loading'> */
@js.native
trait PickImplloading extends js.Object {
  var loading: String = js.native
}

object PickImplloading {
  @scala.inline
  def apply(loading: String): PickImplloading = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplloading]
  }
  @scala.inline
  implicit class PickImplloadingOps[Self <: PickImplloading] (val x: Self) extends AnyVal {
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
    def setLoading(value: String): Self = this.set("loading", value.asInstanceOf[js.Any])
  }
  
}

