package typings.sharepoint.global.SP.UI

import org.scalablytyped.runtime.StObject
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
object PopoutMenu {
  
  /* static member */
  @JSGlobal("SP.UI.PopoutMenu.closeActivePopoutMenuInstance")
  @js.native
  def closeActivePopoutMenuInstance(): Unit = js.native
  
  /* static member */
  @JSGlobal("SP.UI.PopoutMenu.createPopoutMenuInstanceAndLaunch")
  @js.native
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
