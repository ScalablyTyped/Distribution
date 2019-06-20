package typings
package reactDashPortalLib.reactDashPortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalFunctionParams extends js.Object {
  var isOpen: scala.Boolean = js.native
  def closePortal(): scala.Unit = js.native
  def openPortal(): scala.Unit = js.native
  def openPortal(event: js.Any): scala.Unit = js.native
  def portal(children: reactLib.reactMod.ReactNode): reactLib.reactMod.ReactElement = js.native
}

