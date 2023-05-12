package typings.sentryReplay

import typings.sentryReplay.anon.Target
import typings.sentryReplay.typesTypesMod.ReplayContainer
import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersHandleDomMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/handleDom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handleDom(handlerData: DomHandlerData): Breadcrumb | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("handleDom")(handlerData.asInstanceOf[js.Any]).asInstanceOf[Breadcrumb | Null]
  
  inline def handleDomListener(replay: ReplayContainer): js.Function1[/* handlerData */ DomHandlerData, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleDomListener")(replay.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* handlerData */ DomHandlerData, Unit]]
  
  trait DomHandlerData extends StObject {
    
    var event: Node | Target
    
    var name: String
  }
  object DomHandlerData {
    
    inline def apply(event: Node | Target, name: String): DomHandlerData = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomHandlerData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DomHandlerData] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: Node | Target): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
