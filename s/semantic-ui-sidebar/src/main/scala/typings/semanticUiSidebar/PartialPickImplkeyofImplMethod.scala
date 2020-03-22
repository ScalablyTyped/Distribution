package typings.semanticUiSidebar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl>> */
trait PartialPickImplkeyofImplMethod extends js.Object {
  var method: js.UndefOr[String] = js.undefined
  var movedSidebar: js.UndefOr[String] = js.undefined
  var notFound: js.UndefOr[String] = js.undefined
  var overlay: js.UndefOr[String] = js.undefined
  var pusher: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplMethod {
  @scala.inline
  def apply(
    method: String = null,
    movedSidebar: String = null,
    notFound: String = null,
    overlay: String = null,
    pusher: String = null
  ): PartialPickImplkeyofImplMethod = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (movedSidebar != null) __obj.updateDynamic("movedSidebar")(movedSidebar.asInstanceOf[js.Any])
    if (notFound != null) __obj.updateDynamic("notFound")(notFound.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (pusher != null) __obj.updateDynamic("pusher")(pusher.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplMethod]
  }
}

