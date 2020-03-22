package typings.semanticUiSidebar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplFixed extends js.Object {
  var fixed: js.UndefOr[String] = js.undefined
  var omitted: js.UndefOr[String] = js.undefined
  var pusher: js.UndefOr[String] = js.undefined
  var sidebar: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplFixed {
  @scala.inline
  def apply(fixed: String = null, omitted: String = null, pusher: String = null, sidebar: String = null): PartialPickImplkeyofImplFixed = {
    val __obj = js.Dynamic.literal()
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (omitted != null) __obj.updateDynamic("omitted")(omitted.asInstanceOf[js.Any])
    if (pusher != null) __obj.updateDynamic("pusher")(pusher.asInstanceOf[js.Any])
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplFixed]
  }
}

