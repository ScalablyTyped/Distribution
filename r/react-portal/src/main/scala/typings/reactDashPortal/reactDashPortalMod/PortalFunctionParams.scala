package typings.reactDashPortal.reactDashPortalMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalFunctionParams extends js.Object {
  var isOpen: Boolean = js.native
  def closePortal(): Unit = js.native
  def openPortal(): Unit = js.native
  def openPortal(event: js.Any): Unit = js.native
  def portal(children: ReactNode): ReactElement = js.native
}

