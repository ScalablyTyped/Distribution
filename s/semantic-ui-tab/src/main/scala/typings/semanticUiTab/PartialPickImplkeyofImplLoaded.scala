package typings.semanticUiTab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.MetadataSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.MetadataSettings._Impl>> */
trait PartialPickImplkeyofImplLoaded extends js.Object {
  var loaded: js.UndefOr[String] = js.undefined
  var promise: js.UndefOr[String] = js.undefined
  var tab: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplLoaded {
  @scala.inline
  def apply(loaded: String = null, promise: String = null, tab: String = null): PartialPickImplkeyofImplLoaded = {
    val __obj = js.Dynamic.literal()
    if (loaded != null) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplLoaded]
  }
}

