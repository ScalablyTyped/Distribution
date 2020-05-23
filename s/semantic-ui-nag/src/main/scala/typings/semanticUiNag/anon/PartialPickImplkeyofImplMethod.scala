package typings.semanticUiNag.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-nag.SemanticUI.Nag.ErrorSettings._Impl, keyof semantic-ui-nag.SemanticUI.Nag.ErrorSettings._Impl>> */
trait PartialPickImplkeyofImplMethod extends js.Object {
  var method: js.UndefOr[String] = js.undefined
  var noCookieStorage: js.UndefOr[String] = js.undefined
  var noStorage: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplMethod {
  @scala.inline
  def apply(method: String = null, noCookieStorage: String = null, noStorage: String = null): PartialPickImplkeyofImplMethod = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (noCookieStorage != null) __obj.updateDynamic("noCookieStorage")(noCookieStorage.asInstanceOf[js.Any])
    if (noStorage != null) __obj.updateDynamic("noStorage")(noStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplMethod]
  }
}

