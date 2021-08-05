package typings.reactMdPortal

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getContainerMod {
  
  @JSImport("@react-md/portal/types/getContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getContainer(): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getContainer")().asInstanceOf[HTMLElement | Null]
  inline def getContainer(into: Unit, intoId: String): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getContainer")(into.asInstanceOf[js.Any], intoId.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  inline def getContainer(into: PortalInto): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getContainer")(into.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  inline def getContainer(into: PortalInto, intoId: String): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getContainer")(into.asInstanceOf[js.Any], intoId.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  type PortalInto = (js.Function0[HTMLElement | Null]) | HTMLElement | String | Null
}
