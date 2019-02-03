package typings
package sharepointLib.SPNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.PopoutMenu")
@js.native
class PopoutMenu protected ()
  extends microsoftDashAjaxLib.SysNs.IDisposable {
  def this(launcherId: java.lang.String, menuId: java.lang.String, iconId: java.lang.String, launcherOpenCssClass: java.lang.String, textDirection: java.lang.String, closeIconUrl: java.lang.String, isClustered: scala.Boolean, closeIconOffsetLeft: scala.Double, closeIconOffsetTop: scala.Double, closeIconHeight: scala.Double, closeIconWidth: scala.Double) = this()
  def closeMenu(): scala.Unit = js.native
  //#region Methods
  /**
    * Releases resources held by an object that implements the Sys.IDisposable interface.
    * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def launchMenu(): scala.Unit = js.native
}

/* static members */
@JSGlobal("SP.UI.PopoutMenu")
@js.native
object PopoutMenu extends js.Object {
  def closeActivePopoutMenuInstance(): scala.Unit = js.native
  def createPopoutMenuInstanceAndLaunch(
    anchorId: java.lang.String,
    menuId: java.lang.String,
    iconId: java.lang.String,
    anchorOpenCss: java.lang.String,
    textDirection: java.lang.String,
    closeIconUrl: java.lang.String,
    isClustered: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    height: scala.Double,
    width: scala.Double
  ): scala.Unit = js.native
}

