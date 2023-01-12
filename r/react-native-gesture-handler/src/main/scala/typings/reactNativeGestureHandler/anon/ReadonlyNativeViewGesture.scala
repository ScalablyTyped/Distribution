package typings.reactNativeGestureHandler.anon

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.GestureEvent
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HandlerStateChangeEvent
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HitSlop
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.UserSelect
import typings.reactNativeGestureHandler.libTypescriptHandlersNativeViewGestureHandlerMod.NativeViewGestureHandlerPayload
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native-gesture-handler.react-native-gesture-handler/lib/typescript/handlers/NativeViewGestureHandler.NativeViewGestureHandlerProps> */
trait ReadonlyNativeViewGesture extends StObject {
  
  val cancelsTouchesInView: js.UndefOr[Boolean] = js.undefined
  
  val children: js.UndefOr[ReactNode] = js.undefined
  
  val disallowInterruption: js.UndefOr[Boolean] = js.undefined
  
  val enabled: js.UndefOr[Boolean] = js.undefined
  
  val hitSlop: js.UndefOr[HitSlop] = js.undefined
  
  val id: js.UndefOr[String] = js.undefined
  
  val onActivated: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
  
  val onBegan: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
  
  val onCancelled: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
  
  val onEnded: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
  
  val onFailed: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
  
  val onGestureEvent: js.UndefOr[js.Function1[/* event */ GestureEvent[NativeViewGestureHandlerPayload], Unit]] = js.undefined
  
  val onHandlerStateChange: js.UndefOr[
    js.Function1[/* event */ HandlerStateChangeEvent[NativeViewGestureHandlerPayload], Unit]
  ] = js.undefined
  
  val shouldActivateOnStart: js.UndefOr[Boolean] = js.undefined
  
  val shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined
  
  val simultaneousHandlers: js.UndefOr[Ref[Any] | js.Array[Ref[Any]]] = js.undefined
  
  val testID: js.UndefOr[String] = js.undefined
  
  val userSelect: js.UndefOr[UserSelect] = js.undefined
  
  val waitFor: js.UndefOr[Ref[Any] | js.Array[Ref[Any]]] = js.undefined
}
object ReadonlyNativeViewGesture {
  
  inline def apply(): ReadonlyNativeViewGesture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyNativeViewGesture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyNativeViewGesture] (val x: Self) extends AnyVal {
    
    inline def setCancelsTouchesInView(value: Boolean): Self = StObject.set(x, "cancelsTouchesInView", value.asInstanceOf[js.Any])
    
    inline def setCancelsTouchesInViewUndefined: Self = StObject.set(x, "cancelsTouchesInView", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisallowInterruption(value: Boolean): Self = StObject.set(x, "disallowInterruption", value.asInstanceOf[js.Any])
    
    inline def setDisallowInterruptionUndefined: Self = StObject.set(x, "disallowInterruption", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHitSlop(value: HitSlop): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOnActivated(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Unit): Self = StObject.set(x, "onActivated", js.Any.fromFunction1(value))
    
    inline def setOnActivatedUndefined: Self = StObject.set(x, "onActivated", js.undefined)
    
    inline def setOnBegan(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Unit): Self = StObject.set(x, "onBegan", js.Any.fromFunction1(value))
    
    inline def setOnBeganUndefined: Self = StObject.set(x, "onBegan", js.undefined)
    
    inline def setOnCancelled(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Unit): Self = StObject.set(x, "onCancelled", js.Any.fromFunction1(value))
    
    inline def setOnCancelledUndefined: Self = StObject.set(x, "onCancelled", js.undefined)
    
    inline def setOnEnded(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnFailed(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Unit): Self = StObject.set(x, "onFailed", js.Any.fromFunction1(value))
    
    inline def setOnFailedUndefined: Self = StObject.set(x, "onFailed", js.undefined)
    
    inline def setOnGestureEvent(value: /* event */ GestureEvent[NativeViewGestureHandlerPayload] => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
    
    inline def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    inline def setOnHandlerStateChange(value: /* event */ HandlerStateChangeEvent[NativeViewGestureHandlerPayload] => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
    
    inline def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
    
    inline def setShouldActivateOnStart(value: Boolean): Self = StObject.set(x, "shouldActivateOnStart", value.asInstanceOf[js.Any])
    
    inline def setShouldActivateOnStartUndefined: Self = StObject.set(x, "shouldActivateOnStart", js.undefined)
    
    inline def setShouldCancelWhenOutside(value: Boolean): Self = StObject.set(x, "shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    inline def setShouldCancelWhenOutsideUndefined: Self = StObject.set(x, "shouldCancelWhenOutside", js.undefined)
    
    inline def setSimultaneousHandlers(value: Ref[Any] | js.Array[Ref[Any]]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
    
    inline def setSimultaneousHandlersFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "simultaneousHandlers", js.Any.fromFunction1(value))
    
    inline def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
    
    inline def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
    
    inline def setSimultaneousHandlersVarargs(value: Ref[Any]*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value*))
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setUserSelect(value: UserSelect): Self = StObject.set(x, "userSelect", value.asInstanceOf[js.Any])
    
    inline def setUserSelectUndefined: Self = StObject.set(x, "userSelect", js.undefined)
    
    inline def setWaitFor(value: Ref[Any] | js.Array[Ref[Any]]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    inline def setWaitForFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "waitFor", js.Any.fromFunction1(value))
    
    inline def setWaitForNull: Self = StObject.set(x, "waitFor", null)
    
    inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    
    inline def setWaitForVarargs(value: Ref[Any]*): Self = StObject.set(x, "waitFor", js.Array(value*))
  }
}
