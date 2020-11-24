package typings.sharepoint.global.SP.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.UI.PopoutMenu")
@js.native
class PopoutMenu protected ()
  extends typings.sharepoint.SP.UI.PopoutMenu {
  def this(
    launcherId: String,
    menuId: String,
    iconId: String,
    launcherOpenCssClass: String,
    textDirection: String,
    closeIconUrl: String,
    isClustered: Boolean,
    closeIconOffsetLeft: Double,
    closeIconOffsetTop: Double,
    closeIconHeight: Double,
    closeIconWidth: Double
  ) = this()
}
/* static members */
@JSGlobal("SP.UI.PopoutMenu")
@js.native
object PopoutMenu extends js.Object {
  
  def closeActivePopoutMenuInstance(): Unit = js.native
  
  def createPopoutMenuInstanceAndLaunch(
    anchorId: String,
    menuId: String,
    iconId: String,
    anchorOpenCss: String,
    textDirection: String,
    closeIconUrl: String,
    isClustered: Boolean,
    x: Double,
    y: Double,
    height: Double,
    width: Double
  ): Unit = js.native
}
