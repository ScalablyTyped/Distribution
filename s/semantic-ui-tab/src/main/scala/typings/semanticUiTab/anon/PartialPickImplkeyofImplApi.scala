package typings.semanticUiTab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl>> */
trait PartialPickImplkeyofImplApi extends js.Object {
  var api: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var missingTab: js.UndefOr[String] = js.undefined
  var noContent: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var recursion: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplApi {
  @scala.inline
  def apply(
    api: String = null,
    method: String = null,
    missingTab: String = null,
    noContent: String = null,
    path: String = null,
    recursion: String = null,
    state: String = null
  ): PartialPickImplkeyofImplApi = {
    val __obj = js.Dynamic.literal()
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (missingTab != null) __obj.updateDynamic("missingTab")(missingTab.asInstanceOf[js.Any])
    if (noContent != null) __obj.updateDynamic("noContent")(noContent.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (recursion != null) __obj.updateDynamic("recursion")(recursion.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplApi]
  }
}

