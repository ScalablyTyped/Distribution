package typings.semanticUiEmbed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.ErrorSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.ErrorSettings._Impl>> */
trait PartialPickImplkeyofImplMethod extends js.Object {
  var method: js.UndefOr[String] = js.undefined
  var noURL: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplMethod {
  @scala.inline
  def apply(method: String = null, noURL: String = null): PartialPickImplkeyofImplMethod = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (noURL != null) __obj.updateDynamic("noURL")(noURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplMethod]
  }
}

