package typings.sentryReplay

import typings.sentryReplay.typesTypesMod.ReplayContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersHandleHistoryMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/handleHistory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handleHistorySpanListener(replay: ReplayContainer): js.Function1[/* handlerData */ HistoryHandlerData, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleHistorySpanListener")(replay.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* handlerData */ HistoryHandlerData, Unit]]
  
  trait HistoryHandlerData extends StObject {
    
    var from: String
    
    var to: String
  }
  object HistoryHandlerData {
    
    inline def apply(from: String, to: String): HistoryHandlerData = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistoryHandlerData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HistoryHandlerData] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
