package typings.reactDevtoolsInline.commonsMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-devtools-inline/commons", "EventEmitter")
@js.native
open class EventEmitter[Events] () extends StObject {
  
  def addListener[Event /* <: /* keyof Events */ String */](
    event: Event,
    listener: js.Function1[
      /* args */ EventParams[
        /* import warning: importer.ImportType#apply Failed type conversion: Events[Event] */ js.Any
      ], 
      Unit
    ]
  ): Unit = js.native
  
  def emit[Event /* <: /* keyof Events */ String */](
    event: Event,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventParams<Events[Event]> is not an array type */ args: EventParams[
      /* import warning: importer.ImportType#apply Failed type conversion: Events[Event] */ js.Any
    ]
  ): Unit = js.native
  
  var listenersMap: Map[String, js.Array[AnyFn]] = js.native
  
  def removeAllListeners(): Unit = js.native
  
  def removeListener(event: /* keyof Events */ String, listener: AnyFn): Unit = js.native
}
