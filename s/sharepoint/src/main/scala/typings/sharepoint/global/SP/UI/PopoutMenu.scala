package typings.sharepoint.global.SP.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.UI.PopoutMenu")
@js.native
class PopoutMenu protected ()
  extends StObject
     with typings.sharepoint.SP.UI.PopoutMenu {
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
  
  /* CompleteClass */
  override def closeMenu(): Unit = js.native
  
  //#region Methods
  /**
    * Releases resources held by an object that implements the Sys.IDisposable interface.
    * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  override def launchMenu(): Unit = js.native
}
object PopoutMenu {
  
  @JSGlobal("SP.UI.PopoutMenu")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def closeActivePopoutMenuInstance(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeActivePopoutMenuInstance")().asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
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
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopoutMenuInstanceAndLaunch")(anchorId.asInstanceOf[js.Any], menuId.asInstanceOf[js.Any], iconId.asInstanceOf[js.Any], anchorOpenCss.asInstanceOf[js.Any], textDirection.asInstanceOf[js.Any], closeIconUrl.asInstanceOf[js.Any], isClustered.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
