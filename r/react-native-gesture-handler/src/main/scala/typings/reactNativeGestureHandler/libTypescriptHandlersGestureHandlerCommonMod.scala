package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactNativeGestureHandler.anon.ACTIVE
import typings.reactNativeGestureHandler.libTypescriptTouchEventTypeMod.TouchEventType
import typings.reactNativeGestureHandler.libTypescriptTypeUtilsMod.ValueOf
import typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod._ConfigArgs
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.cancelsTouchesInView
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.enabled
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.hitSlop
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.id
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.onActivated
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.onBegan
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.onCancelled
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.onEnded
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.onFailed
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.onGestureEvent
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.onHandlerStateChange
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.shouldCancelWhenOutside
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.simultaneousHandlers
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.userSelect
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.waitFor
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersGestureHandlerCommonMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestureHandlerCommon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestureHandlerCommon", "baseGestureHandlerProps")
  @js.native
  val baseGestureHandlerProps: js.Tuple15[
    id, 
    enabled, 
    shouldCancelWhenOutside, 
    hitSlop, 
    cancelsTouchesInView, 
    userSelect, 
    waitFor, 
    simultaneousHandlers, 
    onBegan, 
    onFailed, 
    onCancelled, 
    onActivated, 
    onEnded, 
    onGestureEvent, 
    onHandlerStateChange
  ] = js.native
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestureHandlerCommon", "baseGestureHandlerWithMonitorProps")
  @js.native
  val baseGestureHandlerWithMonitorProps: js.Array[String] = js.native
  
  inline def filterConfig(props: Record[String, Any], validProps: js.Array[String]): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterConfig")(props.asInstanceOf[js.Any], validProps.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def filterConfig(props: Record[String, Any], validProps: js.Array[String], defaults: Record[String, Any]): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterConfig")(props.asInstanceOf[js.Any], validProps.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  inline def findNodeHandle(): Null | Double | (Component[Any, Any, Any]) | (ComponentClass[Any, ComponentState]) = ^.asInstanceOf[js.Dynamic].applyDynamic("findNodeHandle")().asInstanceOf[Null | Double | (Component[Any, Any, Any]) | (ComponentClass[Any, ComponentState])]
  inline def findNodeHandle(node: Double): Null | Double | (Component[Any, Any, Any]) | (ComponentClass[Any, ComponentState]) = ^.asInstanceOf[js.Dynamic].applyDynamic("findNodeHandle")(node.asInstanceOf[js.Any]).asInstanceOf[Null | Double | (Component[Any, Any, Any]) | (ComponentClass[Any, ComponentState])]
  inline def findNodeHandle(node: Component[Any, Any, Any]): Null | Double | (Component[Any, Any, Any]) | (ComponentClass[Any, ComponentState]) = ^.asInstanceOf[js.Dynamic].applyDynamic("findNodeHandle")(node.asInstanceOf[js.Any]).asInstanceOf[Null | Double | (Component[Any, Any, Any]) | (ComponentClass[Any, ComponentState])]
  inline def findNodeHandle(node: ComponentClass[Any, ComponentState]): Null | Double | (Component[Any, Any, Any]) | (ComponentClass[Any, ComponentState]) = ^.asInstanceOf[js.Dynamic].applyDynamic("findNodeHandle")(node.asInstanceOf[js.Any]).asInstanceOf[Null | Double | (Component[Any, Any, Any]) | (ComponentClass[Any, ComponentState])]
  
  inline def scheduleFlushOperations(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scheduleFlushOperations")().asInstanceOf[Unit]
  
  trait BaseGestureHandlerProps_[ExtraEventPayloadT /* <: Record[String, Any] */]
    extends StObject
       with CommonGestureConfig {
    
    var cancelsTouchesInView: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onActivated: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
    
    var onBegan: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
    
    var onCancelled: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
    
    var onEnded: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
    
    var onFailed: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[Record[String, Any]], Unit]] = js.undefined
    
    var onGestureEvent: js.UndefOr[js.Function1[/* event */ GestureEvent[ExtraEventPayloadT], Unit]] = js.undefined
    
    var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ HandlerStateChangeEvent[ExtraEventPayloadT], Unit]] = js.undefined
    
    var simultaneousHandlers: js.UndefOr[Ref[Any] | js.Array[Ref[Any]]] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
    
    var waitFor: js.UndefOr[Ref[Any] | js.Array[Ref[Any]]] = js.undefined
  }
  object BaseGestureHandlerProps_ {
    
    inline def apply[ExtraEventPayloadT /* <: Record[String, Any] */](): BaseGestureHandlerProps_[ExtraEventPayloadT] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseGestureHandlerProps_[ExtraEventPayloadT]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseGestureHandlerProps_[?], ExtraEventPayloadT /* <: Record[String, Any] */] (val x: Self & BaseGestureHandlerProps_[ExtraEventPayloadT]) extends AnyVal {
      
      inline def setCancelsTouchesInView(value: Boolean): Self = StObject.set(x, "cancelsTouchesInView", value.asInstanceOf[js.Any])
      
      inline def setCancelsTouchesInViewUndefined: Self = StObject.set(x, "cancelsTouchesInView", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
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
      
      inline def setOnGestureEvent(value: /* event */ GestureEvent[ExtraEventPayloadT] => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
      
      inline def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
      
      inline def setOnHandlerStateChange(value: /* event */ HandlerStateChangeEvent[ExtraEventPayloadT] => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
      
      inline def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
      
      inline def setSimultaneousHandlers(value: Ref[Any] | js.Array[Ref[Any]]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
      
      inline def setSimultaneousHandlersFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "simultaneousHandlers", js.Any.fromFunction1(value))
      
      inline def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
      
      inline def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
      
      inline def setSimultaneousHandlersVarargs(value: Ref[Any]*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value*))
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setWaitFor(value: Ref[Any] | js.Array[Ref[Any]]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
      
      inline def setWaitForFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "waitFor", js.Any.fromFunction1(value))
      
      inline def setWaitForNull: Self = StObject.set(x, "waitFor", null)
      
      inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
      
      inline def setWaitForVarargs(value: Ref[Any]*): Self = StObject.set(x, "waitFor", js.Array(value*))
    }
  }
  
  trait CommonGestureConfig extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var hitSlop: js.UndefOr[HitSlop] = js.undefined
    
    var shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined
    
    var userSelect: js.UndefOr[UserSelect] = js.undefined
  }
  object CommonGestureConfig {
    
    inline def apply(): CommonGestureConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonGestureConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonGestureConfig] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHitSlop(value: HitSlop): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setShouldCancelWhenOutside(value: Boolean): Self = StObject.set(x, "shouldCancelWhenOutside", value.asInstanceOf[js.Any])
      
      inline def setShouldCancelWhenOutsideUndefined: Self = StObject.set(x, "shouldCancelWhenOutside", js.undefined)
      
      inline def setUserSelect(value: UserSelect): Self = StObject.set(x, "userSelect", value.asInstanceOf[js.Any])
      
      inline def setUserSelectUndefined: Self = StObject.set(x, "userSelect", js.undefined)
    }
  }
  
  trait GestureEvent[ExtraEventPayloadT] extends StObject {
    
    var nativeEvent: GestureEventPayload & ExtraEventPayloadT
  }
  object GestureEvent {
    
    inline def apply[ExtraEventPayloadT](nativeEvent: GestureEventPayload & ExtraEventPayloadT): GestureEvent[ExtraEventPayloadT] = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[GestureEvent[ExtraEventPayloadT]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GestureEvent[?], ExtraEventPayloadT] (val x: Self & GestureEvent[ExtraEventPayloadT]) extends AnyVal {
      
      inline def setNativeEvent(value: GestureEventPayload & ExtraEventPayloadT): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait GestureEventPayload extends StObject {
    
    var handlerTag: Double
    
    var numberOfPointers: Double
    
    var state: ValueOf[ACTIVE]
  }
  object GestureEventPayload {
    
    inline def apply(handlerTag: Double, numberOfPointers: Double, state: ValueOf[ACTIVE]): GestureEventPayload = {
      val __obj = js.Dynamic.literal(handlerTag = handlerTag.asInstanceOf[js.Any], numberOfPointers = numberOfPointers.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[GestureEventPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GestureEventPayload] (val x: Self) extends AnyVal {
      
      inline def setHandlerTag(value: Double): Self = StObject.set(x, "handlerTag", value.asInstanceOf[js.Any])
      
      inline def setNumberOfPointers(value: Double): Self = StObject.set(x, "numberOfPointers", value.asInstanceOf[js.Any])
      
      inline def setState(value: ValueOf[ACTIVE]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type GestureStateChangeEvent[GestureStateChangeEventPayloadT] = HandlerStateChangeEventPayload & GestureStateChangeEventPayloadT
  
  trait GestureTouchEvent extends StObject {
    
    var allTouches: js.Array[TouchData]
    
    var changedTouches: js.Array[TouchData]
    
    var eventType: TouchEventType
    
    var handlerTag: Double
    
    var numberOfTouches: Double
    
    var state: ValueOf[ACTIVE]
  }
  object GestureTouchEvent {
    
    inline def apply(
      allTouches: js.Array[TouchData],
      changedTouches: js.Array[TouchData],
      eventType: TouchEventType,
      handlerTag: Double,
      numberOfTouches: Double,
      state: ValueOf[ACTIVE]
    ): GestureTouchEvent = {
      val __obj = js.Dynamic.literal(allTouches = allTouches.asInstanceOf[js.Any], changedTouches = changedTouches.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], handlerTag = handlerTag.asInstanceOf[js.Any], numberOfTouches = numberOfTouches.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[GestureTouchEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GestureTouchEvent] (val x: Self) extends AnyVal {
      
      inline def setAllTouches(value: js.Array[TouchData]): Self = StObject.set(x, "allTouches", value.asInstanceOf[js.Any])
      
      inline def setAllTouchesVarargs(value: TouchData*): Self = StObject.set(x, "allTouches", js.Array(value*))
      
      inline def setChangedTouches(value: js.Array[TouchData]): Self = StObject.set(x, "changedTouches", value.asInstanceOf[js.Any])
      
      inline def setChangedTouchesVarargs(value: TouchData*): Self = StObject.set(x, "changedTouches", js.Array(value*))
      
      inline def setEventType(value: TouchEventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setHandlerTag(value: Double): Self = StObject.set(x, "handlerTag", value.asInstanceOf[js.Any])
      
      inline def setNumberOfTouches(value: Double): Self = StObject.set(x, "numberOfTouches", value.asInstanceOf[js.Any])
      
      inline def setState(value: ValueOf[ACTIVE]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type GestureUpdateEvent[GestureEventPayloadT] = GestureEventPayload & GestureEventPayloadT
  
  trait HandlerStateChangeEvent[ExtraEventPayloadT] extends StObject {
    
    var nativeEvent: HandlerStateChangeEventPayload & ExtraEventPayloadT
  }
  object HandlerStateChangeEvent {
    
    inline def apply[ExtraEventPayloadT](nativeEvent: HandlerStateChangeEventPayload & ExtraEventPayloadT): HandlerStateChangeEvent[ExtraEventPayloadT] = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandlerStateChangeEvent[ExtraEventPayloadT]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HandlerStateChangeEvent[?], ExtraEventPayloadT] (val x: Self & HandlerStateChangeEvent[ExtraEventPayloadT]) extends AnyVal {
      
      inline def setNativeEvent(value: HandlerStateChangeEventPayload & ExtraEventPayloadT): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait HandlerStateChangeEventPayload
    extends StObject
       with GestureEventPayload {
    
    var oldState: ValueOf[ACTIVE]
  }
  object HandlerStateChangeEventPayload {
    
    inline def apply(handlerTag: Double, numberOfPointers: Double, oldState: ValueOf[ACTIVE], state: ValueOf[ACTIVE]): HandlerStateChangeEventPayload = {
      val __obj = js.Dynamic.literal(handlerTag = handlerTag.asInstanceOf[js.Any], numberOfPointers = numberOfPointers.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandlerStateChangeEventPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HandlerStateChangeEventPayload] (val x: Self) extends AnyVal {
      
      inline def setOldState(value: ValueOf[ACTIVE]): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.reactNativeGestureHandler.anon.PartialRecordleftrighttop
    - typings.reactNativeGestureHandler.anon.Recordwidthleftnumber
    - typings.reactNativeGestureHandler.anon.Recordwidthrightnumber
    - typings.reactNativeGestureHandler.anon.Recordheighttopnumber
    - typings.reactNativeGestureHandler.anon.Recordheightbottomnumber
  */
  type HitSlop = _HitSlop | Double
  
  trait TouchData extends StObject {
    
    var absoluteX: Double
    
    var absoluteY: Double
    
    var id: Double
    
    var x: Double
    
    var y: Double
  }
  object TouchData {
    
    inline def apply(absoluteX: Double, absoluteY: Double, id: Double, x: Double, y: Double): TouchData = {
      val __obj = js.Dynamic.literal(absoluteX = absoluteX.asInstanceOf[js.Any], absoluteY = absoluteY.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[TouchData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TouchData] (val x: Self) extends AnyVal {
      
      inline def setAbsoluteX(value: Double): Self = StObject.set(x, "absoluteX", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteY(value: Double): Self = StObject.set(x, "absoluteY", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.none
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.auto
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.text
  */
  trait UserSelect
    extends StObject
       with _ConfigArgs
  object UserSelect {
    
    inline def auto: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.auto = "auto".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.auto]
    
    inline def none: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.none = "none".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.none]
    
    inline def text: typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.text = "text".asInstanceOf[typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.text]
  }
  
  trait _HitSlop extends StObject
  object _HitSlop {
    
    inline def PartialRecordleftrighttop(): typings.reactNativeGestureHandler.anon.PartialRecordleftrighttop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactNativeGestureHandler.anon.PartialRecordleftrighttop]
    }
    
    inline def Recordheightbottomnumber(bottom: Double, height: Double): typings.reactNativeGestureHandler.anon.Recordheightbottomnumber = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNativeGestureHandler.anon.Recordheightbottomnumber]
    }
    
    inline def Recordheighttopnumber(height: Double, top: Double): typings.reactNativeGestureHandler.anon.Recordheighttopnumber = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNativeGestureHandler.anon.Recordheighttopnumber]
    }
    
    inline def Recordwidthleftnumber(left: Double, width: Double): typings.reactNativeGestureHandler.anon.Recordwidthleftnumber = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNativeGestureHandler.anon.Recordwidthleftnumber]
    }
    
    inline def Recordwidthrightnumber(right: Double, width: Double): typings.reactNativeGestureHandler.anon.Recordwidthrightnumber = {
      val __obj = js.Dynamic.literal(right = right.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNativeGestureHandler.anon.Recordwidthrightnumber]
    }
  }
}
