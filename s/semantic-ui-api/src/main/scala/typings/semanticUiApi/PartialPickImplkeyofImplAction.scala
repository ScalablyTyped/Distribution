package typings.semanticUiApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.MetadataSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.MetadataSettings._Impl>> */
trait PartialPickImplkeyofImplAction extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplAction {
  @scala.inline
  def apply(action: String = null, url: String = null): PartialPickImplkeyofImplAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplAction]
  }
}

