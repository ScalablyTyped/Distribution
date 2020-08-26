package typings.sharepoint.global.SP.UI

import typings.sharepoint.SP.UI.Controls.INavigationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.Controls")
@js.native
object Controls extends js.Object {
  @js.native
  class ControlManager ()
    extends typings.sharepoint.SP.UI.Controls.ControlManager
  
  @js.native
  class Navigation protected ()
    extends typings.sharepoint.SP.UI.Controls.Navigation {
    def this(placeholderDOMElementId: String, options: INavigationOptions) = this()
  }
  
  @js.native
  class NavigationOptions () extends INavigationOptions
  
  @js.native
  class SettingsLink ()
    extends typings.sharepoint.SP.UI.Controls.SettingsLink
  
  /* static members */
  @js.native
  object ControlManager extends js.Object {
    def getControl(placeHolderId: String): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Navigation extends js.Object {
    def getVersionedLayoutsUrl(pageName: String): String = js.native
  }
  
}

