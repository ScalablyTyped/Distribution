package typings.reactMdPortal

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/portal/types/getContainer", JSImport.Namespace)
@js.native
object getContainerMod extends js.Object {
  
  def getContainer(): HTMLElement | Null = js.native
  def getContainer(into: js.UndefOr[PortalInto], intoId: String): HTMLElement | Null = js.native
  def getContainer(into: PortalInto): HTMLElement | Null = js.native
  
  type PortalInto = (js.Function0[HTMLElement | Null]) | HTMLElement | String | Null
}
