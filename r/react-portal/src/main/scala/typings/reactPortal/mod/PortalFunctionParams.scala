package typings.reactPortal.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalFunctionParams extends js.Object {
  
  def closePortal(): Unit = js.native
  
  var isOpen: Boolean = js.native
  
  def openPortal(): Unit = js.native
  def openPortal(event: js.Any): Unit = js.native
  
  def portal(children: ReactNode): ReactElement = js.native
}
