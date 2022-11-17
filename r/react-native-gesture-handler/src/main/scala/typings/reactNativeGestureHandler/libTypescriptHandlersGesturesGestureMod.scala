package typings.reactNativeGestureHandler

import typings.react.mod.ComponentType
import typings.react.mod.MutableRefObject
import typings.react.mod.RefObject
import typings.reactNativeGestureHandler.libTypescriptHandlersFlingGestureHandlerMod.FlingGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersForceTouchGestureHandlerMod.ForceTouchGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.CommonGestureConfig
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.GestureStateChangeEvent
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.GestureTouchEvent
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.GestureUpdateEvent
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HitSlop
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureStateManagerMod.GestureStateManagerType
import typings.reactNativeGestureHandler.libTypescriptHandlersLongPressGestureHandlerMod.LongPressGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersNativeViewGestureHandlerMod.NativeViewGestureHandlerPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersPinchGestureHandlerMod.PinchGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersRotationGestureHandlerMod.RotationGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersTapGestureHandlerMod.TapGestureHandlerEventPayload
import typings.std.Exclude
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersGesturesGestureMod {
  
  /* note: abstract class */ @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gesture", "BaseGesture")
  @js.native
  open class BaseGesture[EventPayloadT /* <: Record[String, Any] */] () extends Gesture {
    
    /* private */ var addDependency: Any = js.native
    
    def cancelsTouchesInView(value: Boolean): this.type = js.native
    
    var config: BaseGestureConfig = js.native
    
    def enabled(enabled: Boolean): this.type = js.native
    
    /* private */ var gestureId: Any = js.native
    
    var handlerName: String = js.native
    
    var handlerTag: Double = js.native
    
    var handlers: HandlerCallbacks[EventPayloadT] = js.native
    
    def hitSlop(hitSlop: HitSlop): this.type = js.native
    
    /* protected */ def isWorklet(callback: js.Function): Boolean = js.native
    
    def onBegin(callback: js.Function1[/* event */ GestureStateChangeEvent[EventPayloadT], Unit]): this.type = js.native
    
    def onEnd(
      callback: js.Function2[/* event */ GestureStateChangeEvent[EventPayloadT], /* success */ Boolean, Unit]
    ): this.type = js.native
    
    def onFinalize(
      callback: js.Function2[/* event */ GestureStateChangeEvent[EventPayloadT], /* success */ Boolean, Unit]
    ): this.type = js.native
    
    def onStart(callback: js.Function1[/* event */ GestureStateChangeEvent[EventPayloadT], Unit]): this.type = js.native
    
    def onTouchesCancelled(callback: TouchEventHandlerType): this.type = js.native
    
    def onTouchesDown(callback: TouchEventHandlerType): this.type = js.native
    
    def onTouchesMove(callback: TouchEventHandlerType): this.type = js.native
    
    def onTouchesUp(callback: TouchEventHandlerType): this.type = js.native
    
    def requireExternalGestureToFail(gestures: (Exclude[GestureRef, Double])*): this.type = js.native
    
    def runOnJS(runOnJS: Boolean): this.type = js.native
    
    def shouldCancelWhenOutside(value: Boolean): this.type = js.native
    
    def shouldUseReanimated: Boolean = js.native
    
    def simultaneousWithExternalGesture(gestures: (Exclude[GestureRef, Double])*): this.type = js.native
    
    def withRef(ref: MutableRefObject[js.UndefOr[GestureType]]): this.type = js.native
    
    def withTestId(id: String): this.type = js.native
  }
  
  object CALLBACK_TYPE {
    
    @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gesture", "CALLBACK_TYPE.BEGAN")
    @js.native
    val BEGAN: 1 = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gesture", "CALLBACK_TYPE.CHANGE")
    @js.native
    val CHANGE: 4 = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gesture", "CALLBACK_TYPE.END")
    @js.native
    val END: 5 = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gesture", "CALLBACK_TYPE.FINALIZE")
    @js.native
    val FINALIZE: 6 = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gesture", "CALLBACK_TYPE.START")
    @js.native
    val START: 2 = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gesture", "CALLBACK_TYPE.TOUCHES_CANCELLED")
    @js.native
    val TOUCHES_CANCELLED: 10 = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gesture", "CALLBACK_TYPE.TOUCHES_DOWN")
    @js.native
    val TOUCHES_DOWN: 7 = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gesture", "CALLBACK_TYPE.TOUCHES_MOVE")
    @js.native
    val TOUCHES_MOVE: 8 = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gesture", "CALLBACK_TYPE.TOUCHES_UP")
    @js.native
    val TOUCHES_UP: 9 = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gesture", "CALLBACK_TYPE.UNDEFINED")
    @js.native
    val UNDEFINED: 0 = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gesture", "CALLBACK_TYPE.UPDATE")
    @js.native
    val UPDATE: 3 = js.native
  }
  /* Inlined { readonly UNDEFINED :0,  readonly BEGAN :1,  readonly START :2,  readonly UPDATE :3,  readonly CHANGE :4,  readonly END :5,  readonly FINALIZE :6,  readonly TOUCHES_DOWN :7,  readonly TOUCHES_MOVE :8,  readonly TOUCHES_UP :9,  readonly TOUCHES_CANCELLED :10}[keyof { readonly UNDEFINED :0,  readonly BEGAN :1,  readonly START :2,  readonly UPDATE :3,  readonly CHANGE :4,  readonly END :5,  readonly FINALIZE :6,  readonly TOUCHES_DOWN :7,  readonly TOUCHES_MOVE :8,  readonly TOUCHES_UP :9,  readonly TOUCHES_CANCELLED :10}] */
  type CALLBACK_TYPE = 3 | 2 | 4 | 0 | 7 | 5 | 6 | 10 | 9 | 8 | 1
  
  /* note: abstract class */ @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gesture", "ContinousBaseGesture")
  @js.native
  open class ContinousBaseGesture[EventPayloadT /* <: Record[String, Any] */, EventChangePayloadT /* <: Record[String, Any] */] () extends BaseGesture[EventPayloadT] {
    
    def manualActivation(manualActivation: Boolean): this.type = js.native
    
    def onChange(callback: js.Function1[/* event */ GestureUpdateEvent[EventPayloadT & EventChangePayloadT], Unit]): this.type = js.native
    
    def onUpdate(callback: js.Function1[/* event */ GestureUpdateEvent[EventPayloadT], Unit]): this.type = js.native
  }
  
  /* note: abstract class */ @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gesture", "Gesture")
  @js.native
  open class Gesture () extends StObject {
    
    /**
      * Assign handlerTag to the gesture instance and set ref.current (if a ref is set)
      */
    def initialize(): Unit = js.native
    
    /**
      * Make sure that values of properties defining relations are arrays. Do any necessary
      * preprocessing required to configure relations between handlers. Called just before
      * updating the handler on the native side.
      */
    def prepare(): Unit = js.native
    
    /**
      * Return array of gestures, providing the same interface for creating and updating
      * handlers, no matter which object was used to create gesture instance.
      */
    def toGestureArray(): js.Array[GestureType] = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait BaseGestureConfig
    extends StObject
       with CommonGestureConfig {
    
    var cancelsTouchesInView: js.UndefOr[Boolean] = js.undefined
    
    var manualActivation: js.UndefOr[Boolean] = js.undefined
    
    var needsPointerData: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[MutableRefObject[js.UndefOr[GestureType]]] = js.undefined
    
    var requireToFail: js.UndefOr[js.Array[GestureRef]] = js.undefined
    
    var runOnJS: js.UndefOr[Boolean] = js.undefined
    
    var simultaneousWith: js.UndefOr[js.Array[GestureRef]] = js.undefined
    
    var testId: js.UndefOr[String] = js.undefined
  }
  object BaseGestureConfig {
    
    inline def apply(): BaseGestureConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseGestureConfig]
    }
    
    extension [Self <: BaseGestureConfig](x: Self) {
      
      inline def setCancelsTouchesInView(value: Boolean): Self = StObject.set(x, "cancelsTouchesInView", value.asInstanceOf[js.Any])
      
      inline def setCancelsTouchesInViewUndefined: Self = StObject.set(x, "cancelsTouchesInView", js.undefined)
      
      inline def setManualActivation(value: Boolean): Self = StObject.set(x, "manualActivation", value.asInstanceOf[js.Any])
      
      inline def setManualActivationUndefined: Self = StObject.set(x, "manualActivation", js.undefined)
      
      inline def setNeedsPointerData(value: Boolean): Self = StObject.set(x, "needsPointerData", value.asInstanceOf[js.Any])
      
      inline def setNeedsPointerDataUndefined: Self = StObject.set(x, "needsPointerData", js.undefined)
      
      inline def setRef(value: MutableRefObject[js.UndefOr[GestureType]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRequireToFail(value: js.Array[GestureRef]): Self = StObject.set(x, "requireToFail", value.asInstanceOf[js.Any])
      
      inline def setRequireToFailUndefined: Self = StObject.set(x, "requireToFail", js.undefined)
      
      inline def setRequireToFailVarargs(value: GestureRef*): Self = StObject.set(x, "requireToFail", js.Array(value*))
      
      inline def setRunOnJS(value: Boolean): Self = StObject.set(x, "runOnJS", value.asInstanceOf[js.Any])
      
      inline def setRunOnJSUndefined: Self = StObject.set(x, "runOnJS", js.undefined)
      
      inline def setSimultaneousWith(value: js.Array[GestureRef]): Self = StObject.set(x, "simultaneousWith", value.asInstanceOf[js.Any])
      
      inline def setSimultaneousWithUndefined: Self = StObject.set(x, "simultaneousWith", js.undefined)
      
      inline def setSimultaneousWithVarargs(value: GestureRef*): Self = StObject.set(x, "simultaneousWith", js.Array(value*))
      
      inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
      
      inline def setTestIdUndefined: Self = StObject.set(x, "testId", js.undefined)
    }
  }
  
  type GestureRef = Double | GestureType | (RefObject[js.UndefOr[ComponentType[js.Object] | GestureType]])
  
  type GestureType = BaseGesture[
    FlingGestureHandlerEventPayload | ForceTouchGestureHandlerEventPayload | LongPressGestureHandlerEventPayload | NativeViewGestureHandlerPayload | PanGestureHandlerEventPayload | PinchGestureHandlerEventPayload | (Record[String, Any | scala.Nothing]) | RotationGestureHandlerEventPayload | TapGestureHandlerEventPayload
  ]
  
  trait HandlerCallbacks[EventPayloadT /* <: Record[String, Any] */] extends StObject {
    
    var changeEventCalculator: js.UndefOr[
        js.Function2[
          /* current */ GestureUpdateEvent[Record[String, Any]], 
          /* previous */ js.UndefOr[GestureUpdateEvent[Record[String, Any]]], 
          GestureUpdateEvent[Record[String, Any]]
        ]
      ] = js.undefined
    
    var gestureId: Double
    
    var handlerTag: Double
    
    var isWorklet: js.Array[Boolean]
    
    var onBegin: js.UndefOr[js.Function1[/* event */ GestureStateChangeEvent[EventPayloadT], Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var onEnd: js.UndefOr[
        js.Function2[/* event */ GestureStateChangeEvent[EventPayloadT], /* success */ Boolean, Unit]
      ] = js.undefined
    
    var onFinalize: js.UndefOr[
        js.Function2[/* event */ GestureStateChangeEvent[EventPayloadT], /* success */ Boolean, Unit]
      ] = js.undefined
    
    var onStart: js.UndefOr[js.Function1[/* event */ GestureStateChangeEvent[EventPayloadT], Unit]] = js.undefined
    
    var onTouchesCancelled: js.UndefOr[TouchEventHandlerType] = js.undefined
    
    var onTouchesDown: js.UndefOr[TouchEventHandlerType] = js.undefined
    
    var onTouchesMove: js.UndefOr[TouchEventHandlerType] = js.undefined
    
    var onTouchesUp: js.UndefOr[TouchEventHandlerType] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function1[/* event */ GestureUpdateEvent[EventPayloadT], Unit]] = js.undefined
  }
  object HandlerCallbacks {
    
    inline def apply[EventPayloadT /* <: Record[String, Any] */](gestureId: Double, handlerTag: Double, isWorklet: js.Array[Boolean]): HandlerCallbacks[EventPayloadT] = {
      val __obj = js.Dynamic.literal(gestureId = gestureId.asInstanceOf[js.Any], handlerTag = handlerTag.asInstanceOf[js.Any], isWorklet = isWorklet.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandlerCallbacks[EventPayloadT]]
    }
    
    extension [Self <: HandlerCallbacks[?], EventPayloadT /* <: Record[String, Any] */](x: Self & HandlerCallbacks[EventPayloadT]) {
      
      inline def setChangeEventCalculator(
        value: (/* current */ GestureUpdateEvent[Record[String, Any]], /* previous */ js.UndefOr[GestureUpdateEvent[Record[String, Any]]]) => GestureUpdateEvent[Record[String, Any]]
      ): Self = StObject.set(x, "changeEventCalculator", js.Any.fromFunction2(value))
      
      inline def setChangeEventCalculatorUndefined: Self = StObject.set(x, "changeEventCalculator", js.undefined)
      
      inline def setGestureId(value: Double): Self = StObject.set(x, "gestureId", value.asInstanceOf[js.Any])
      
      inline def setHandlerTag(value: Double): Self = StObject.set(x, "handlerTag", value.asInstanceOf[js.Any])
      
      inline def setIsWorklet(value: js.Array[Boolean]): Self = StObject.set(x, "isWorklet", value.asInstanceOf[js.Any])
      
      inline def setIsWorkletVarargs(value: Boolean*): Self = StObject.set(x, "isWorklet", js.Array(value*))
      
      inline def setOnBegin(value: /* event */ GestureStateChangeEvent[EventPayloadT] => Unit): Self = StObject.set(x, "onBegin", js.Any.fromFunction1(value))
      
      inline def setOnBeginUndefined: Self = StObject.set(x, "onBegin", js.undefined)
      
      inline def setOnChange(value: /* event */ Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnEnd(value: (/* event */ GestureStateChangeEvent[EventPayloadT], /* success */ Boolean) => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction2(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnFinalize(value: (/* event */ GestureStateChangeEvent[EventPayloadT], /* success */ Boolean) => Unit): Self = StObject.set(x, "onFinalize", js.Any.fromFunction2(value))
      
      inline def setOnFinalizeUndefined: Self = StObject.set(x, "onFinalize", js.undefined)
      
      inline def setOnStart(value: /* event */ GestureStateChangeEvent[EventPayloadT] => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOnTouchesCancelled(value: (/* event */ GestureTouchEvent, /* stateManager */ GestureStateManagerType) => Unit): Self = StObject.set(x, "onTouchesCancelled", js.Any.fromFunction2(value))
      
      inline def setOnTouchesCancelledUndefined: Self = StObject.set(x, "onTouchesCancelled", js.undefined)
      
      inline def setOnTouchesDown(value: (/* event */ GestureTouchEvent, /* stateManager */ GestureStateManagerType) => Unit): Self = StObject.set(x, "onTouchesDown", js.Any.fromFunction2(value))
      
      inline def setOnTouchesDownUndefined: Self = StObject.set(x, "onTouchesDown", js.undefined)
      
      inline def setOnTouchesMove(value: (/* event */ GestureTouchEvent, /* stateManager */ GestureStateManagerType) => Unit): Self = StObject.set(x, "onTouchesMove", js.Any.fromFunction2(value))
      
      inline def setOnTouchesMoveUndefined: Self = StObject.set(x, "onTouchesMove", js.undefined)
      
      inline def setOnTouchesUp(value: (/* event */ GestureTouchEvent, /* stateManager */ GestureStateManagerType) => Unit): Self = StObject.set(x, "onTouchesUp", js.Any.fromFunction2(value))
      
      inline def setOnTouchesUpUndefined: Self = StObject.set(x, "onTouchesUp", js.undefined)
      
      inline def setOnUpdate(value: /* event */ GestureUpdateEvent[EventPayloadT] => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    }
  }
  
  type TouchEventHandlerType = js.Function2[/* event */ GestureTouchEvent, /* stateManager */ GestureStateManagerType, Unit]
}
