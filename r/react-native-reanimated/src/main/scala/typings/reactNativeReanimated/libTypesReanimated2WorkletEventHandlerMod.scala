package typings.reactNativeReanimated

import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.NativeEvent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2WorkletEventHandlerMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/WorkletEventHandler", JSImport.Default)
  @js.native
  open class default[T /* <: NativeEvent[T] */] protected ()
    extends StObject
       with WorkletEventHandler[T] {
    def this(worklet: js.Function1[/* event */ T, Unit]) = this()
    def this(worklet: js.Function1[/* event */ T, Unit], eventNames: js.Array[String]) = this()
  }
  
  @js.native
  trait WorkletEventHandler[T /* <: NativeEvent[T] */] extends StObject {
    
    var eventNames: js.Array[String] = js.native
    
    var listeners: Record[String, js.Function1[/* event */ T, Unit]] = js.native
    
    var reattachNeeded: Boolean = js.native
    
    def registerForEvents(viewTag: Double): Unit = js.native
    def registerForEvents(viewTag: Double, fallbackEventName: String): Unit = js.native
    
    var registrations: js.Array[String] = js.native
    
    def unregisterFromEvents(): Unit = js.native
    
    def updateWorklet(newWorklet: js.Function1[/* event */ T, Unit]): Unit = js.native
    
    var viewTag: js.UndefOr[Double] = js.native
    
    def worklet(event: T): Unit = js.native
  }
}
