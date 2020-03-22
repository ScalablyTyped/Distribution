package typings.semanticUiNag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-nag.SemanticUI.Nag.AnimationSettings._Impl, keyof semantic-ui-nag.SemanticUI.Nag.AnimationSettings._Impl>> */
trait PartialPickImplkeyofImplHide extends js.Object {
  var hide: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplHide {
  @scala.inline
  def apply(hide: String = null, show: String = null): PartialPickImplkeyofImplHide = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplHide]
  }
}

