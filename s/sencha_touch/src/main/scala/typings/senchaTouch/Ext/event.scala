package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.mixin.IIdentifiable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object event {
  
  type IController = IBase
  
  trait IDispatcher
    extends StObject
       with IBase {
    
    /** [Method] Returns the value of publishers
      * @returns Object
      */
    var getPublishers: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Sets the value of publishers
      * @param publishers Object The new value.
      */
    var setPublishers: js.UndefOr[js.Function1[/* publishers */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IDispatcher {
    
    inline def apply(): IDispatcher = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDispatcher]
    }
    
    extension [Self <: IDispatcher](x: Self) {
      
      inline def setGetPublishers(value: () => Any): Self = StObject.set(x, "getPublishers", js.Any.fromFunction0(value))
      
      inline def setGetPublishersUndefined: Self = StObject.set(x, "getPublishers", js.undefined)
      
      inline def setSetPublishers(value: /* publishers */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setPublishers", js.Any.fromFunction1(value))
      
      inline def setSetPublishersUndefined: Self = StObject.set(x, "setPublishers", js.undefined)
    }
  }
  
  trait IDom extends StObject {
    
    /** [Property] (Number) */
    var distance: js.UndefOr[Double] = js.undefined
    
    /** [Method] Gets the x coordinate of the event
      * @returns Number
      */
    var getPageX: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Gets the y coordinate of the event
      * @returns Number
      */
    var getPageY: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Gets the target for the event
      * @param selector String A simple selector to filter the target or look for an ancestor of the target
      * @param maxDepth Number/Mixed The max depth to search as a number or element (defaults to 10 || document.body)
      * @param returnEl Boolean true to return a Ext.Element object instead of DOM node.
      * @returns HTMLElement
      */
    var getTarget: js.UndefOr[
        js.Function3[
          /* selector */ js.UndefOr[java.lang.String], 
          /* maxDepth */ js.UndefOr[Any], 
          /* returnEl */ js.UndefOr[Boolean], 
          HTMLElement
        ]
      ] = js.undefined
    
    /** [Method] Returns the time of the event
      * @returns Date
      */
    var getTime: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Gets the X and Y coordinates of the event
      * @returns Array
      */
    var getXY: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Property] (Number) */
    var pageX: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var pageY: js.UndefOr[Double] = js.undefined
    
    /** [Method] Prevents the browsers default handling of the event  */
    var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Property] (HTMLElement) */
    var target: js.UndefOr[HTMLElement] = js.undefined
  }
  object IDom {
    
    inline def apply(): IDom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDom]
    }
    
    extension [Self <: IDom](x: Self) {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setGetPageX(value: () => Double): Self = StObject.set(x, "getPageX", js.Any.fromFunction0(value))
      
      inline def setGetPageXUndefined: Self = StObject.set(x, "getPageX", js.undefined)
      
      inline def setGetPageY(value: () => Double): Self = StObject.set(x, "getPageY", js.Any.fromFunction0(value))
      
      inline def setGetPageYUndefined: Self = StObject.set(x, "getPageY", js.undefined)
      
      inline def setGetTarget(
        value: (/* selector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[Any], /* returnEl */ js.UndefOr[Boolean]) => HTMLElement
      ): Self = StObject.set(x, "getTarget", js.Any.fromFunction3(value))
      
      inline def setGetTargetUndefined: Self = StObject.set(x, "getTarget", js.undefined)
      
      inline def setGetTime(value: () => Any): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
      
      inline def setGetTimeUndefined: Self = StObject.set(x, "getTime", js.undefined)
      
      inline def setGetXY(value: () => Array): Self = StObject.set(x, "getXY", js.Any.fromFunction0(value))
      
      inline def setGetXYUndefined: Self = StObject.set(x, "getXY", js.undefined)
      
      inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      inline def setPageXUndefined: Self = StObject.set(x, "pageX", js.undefined)
      
      inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      inline def setPageYUndefined: Self = StObject.set(x, "pageY", js.undefined)
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait IEvent
    extends StObject
       with IBase
       with IDom {
    
    /** [Property] (Number) */
    var angle: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var direction: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var duration: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var rotation: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var scale: js.UndefOr[Double] = js.undefined
    
    /** [Method] Stop the event preventDefault and stopPropagation
      * @returns Ext.event.Event this
      */
    var stopEvent: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Cancels bubbling of the event
      * @returns Ext.event.Event this
      */
    var stopPropagation: js.UndefOr[js.Function0[this.type]] = js.undefined
  }
  object IEvent {
    
    inline def apply(): IEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEvent]
    }
    
    extension [Self <: IEvent](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setStopEvent(value: () => IEvent): Self = StObject.set(x, "stopEvent", js.Any.fromFunction0(value))
      
      inline def setStopEventUndefined: Self = StObject.set(x, "stopEvent", js.undefined)
      
      inline def setStopPropagation(value: () => IEvent): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
    }
  }
  
  type IListenerStack = IBase
  
  type ITouch = IDom
  
  object publisher {
    
    type IComponentDelegation = IPublisher
    
    type IComponentPaint = IPublisher
    
    type IComponentSize = IPublisher
    
    type IDom = IPublisher
    
    type IElementPaint = IPublisher
    
    type IElementSize = IPublisher
    
    type IPublisher = IBase
    
    trait ITouchGesture
      extends StObject
         with IBase {
      
      /** [Method] Returns the value of moveThrottle
        * @returns Number
        */
      var getMoveThrottle: js.UndefOr[js.Function0[Double]] = js.undefined
      
      /** [Method] Returns the value of recognizers
        * @returns Object
        */
      var getRecognizers: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Sets the value of moveThrottle
        * @param moveThrottle Number The new value.
        */
      var setMoveThrottle: js.UndefOr[js.Function1[/* moveThrottle */ js.UndefOr[Double], Unit]] = js.undefined
      
      /** [Method] Sets the value of recognizers
        * @param recognizers Object The new value.
        */
      var setRecognizers: js.UndefOr[js.Function1[/* recognizers */ js.UndefOr[Any], Unit]] = js.undefined
    }
    object ITouchGesture {
      
      inline def apply(): ITouchGesture = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITouchGesture]
      }
      
      extension [Self <: ITouchGesture](x: Self) {
        
        inline def setGetMoveThrottle(value: () => Double): Self = StObject.set(x, "getMoveThrottle", js.Any.fromFunction0(value))
        
        inline def setGetMoveThrottleUndefined: Self = StObject.set(x, "getMoveThrottle", js.undefined)
        
        inline def setGetRecognizers(value: () => Any): Self = StObject.set(x, "getRecognizers", js.Any.fromFunction0(value))
        
        inline def setGetRecognizersUndefined: Self = StObject.set(x, "getRecognizers", js.undefined)
        
        inline def setSetMoveThrottle(value: /* moveThrottle */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMoveThrottle", js.Any.fromFunction1(value))
        
        inline def setSetMoveThrottleUndefined: Self = StObject.set(x, "setMoveThrottle", js.undefined)
        
        inline def setSetRecognizers(value: /* recognizers */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setRecognizers", js.Any.fromFunction1(value))
        
        inline def setSetRecognizersUndefined: Self = StObject.set(x, "setRecognizers", js.undefined)
      }
    }
  }
  
  object recognizer {
    
    trait IDoubleTap
      extends StObject
         with IRecognizer {
      
      /** [Method] Returns the value of maxDuration
        * @returns Number
        */
      var getMaxDuration: js.UndefOr[js.Function0[Double]] = js.undefined
      
      /** [Method] Sets the value of maxDuration
        * @param maxDuration Number The new value.
        */
      var setMaxDuration: js.UndefOr[js.Function1[/* maxDuration */ js.UndefOr[Double], Unit]] = js.undefined
    }
    object IDoubleTap {
      
      inline def apply(): IDoubleTap = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IDoubleTap]
      }
      
      extension [Self <: IDoubleTap](x: Self) {
        
        inline def setGetMaxDuration(value: () => Double): Self = StObject.set(x, "getMaxDuration", js.Any.fromFunction0(value))
        
        inline def setGetMaxDurationUndefined: Self = StObject.set(x, "getMaxDuration", js.undefined)
        
        inline def setSetMaxDuration(value: /* maxDuration */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxDuration", js.Any.fromFunction1(value))
        
        inline def setSetMaxDurationUndefined: Self = StObject.set(x, "setMaxDuration", js.undefined)
      }
    }
    
    trait IDrag
      extends StObject
         with IRecognizer {
      
      /** [Method] Returns the value of minDistance
        * @returns Number
        */
      var getMinDistance: js.UndefOr[js.Function0[Double]] = js.undefined
      
      /** [Config Option] (Number) */
      var minDistance: js.UndefOr[Double] = js.undefined
      
      /** [Method] Sets the value of minDistance
        * @param minDistance Number The new value.
        */
      var setMinDistance: js.UndefOr[js.Function1[/* minDistance */ js.UndefOr[Double], Unit]] = js.undefined
    }
    object IDrag {
      
      inline def apply(): IDrag = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IDrag]
      }
      
      extension [Self <: IDrag](x: Self) {
        
        inline def setGetMinDistance(value: () => Double): Self = StObject.set(x, "getMinDistance", js.Any.fromFunction0(value))
        
        inline def setGetMinDistanceUndefined: Self = StObject.set(x, "getMinDistance", js.undefined)
        
        inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
        
        inline def setMinDistanceUndefined: Self = StObject.set(x, "minDistance", js.undefined)
        
        inline def setSetMinDistance(value: /* minDistance */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinDistance", js.Any.fromFunction1(value))
        
        inline def setSetMinDistanceUndefined: Self = StObject.set(x, "setMinDistance", js.undefined)
      }
    }
    
    trait IEdgeSwipe
      extends StObject
         with ISwipe
    object IEdgeSwipe {
      
      inline def apply(): IEdgeSwipe = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IEdgeSwipe]
      }
    }
    
    type IHorizontalSwipe = ISwipe
    
    trait ILongPress
      extends StObject
         with IRecognizer {
      
      /** [Method] Returns the value of minDuration
        * @returns Number
        */
      var getMinDuration: js.UndefOr[js.Function0[Double]] = js.undefined
      
      /** [Method] Sets the value of minDuration
        * @param minDuration Number The new value.
        */
      var setMinDuration: js.UndefOr[js.Function1[/* minDuration */ js.UndefOr[Double], Unit]] = js.undefined
    }
    object ILongPress {
      
      inline def apply(): ILongPress = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ILongPress]
      }
      
      extension [Self <: ILongPress](x: Self) {
        
        inline def setGetMinDuration(value: () => Double): Self = StObject.set(x, "getMinDuration", js.Any.fromFunction0(value))
        
        inline def setGetMinDurationUndefined: Self = StObject.set(x, "getMinDuration", js.undefined)
        
        inline def setSetMinDuration(value: /* minDuration */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinDuration", js.Any.fromFunction1(value))
        
        inline def setSetMinDurationUndefined: Self = StObject.set(x, "setMinDuration", js.undefined)
      }
    }
    
    type IMultiTouch = typings.senchaTouch.Ext.event.recognizer.ITouch
    
    type IPinch = IMultiTouch
    
    trait IRecognizer
      extends StObject
         with IIdentifiable {
      
      /** [Method] Returns the value of callbackScope
        * @returns Object
        */
      var getCallbackScope: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Retrieves the id of this component
        * @returns String id
        */
      @JSName("getId")
      var getId_IRecognizer: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
      
      /** [Method] Returns the value of onFailed
        * @returns Object
        */
      var getOnFailed: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Returns the value of onRecognized
        * @returns Object
        */
      var getOnRecognized: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Sets the value of callbackScope
        * @param callbackScope Object The new value.
        */
      var setCallbackScope: js.UndefOr[js.Function1[/* callbackScope */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of onFailed
        * @param onFailed Object The new value.
        */
      var setOnFailed: js.UndefOr[js.Function1[/* onFailed */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of onRecognized
        * @param onRecognized Object The new value.
        */
      var setOnRecognized: js.UndefOr[js.Function1[/* onRecognized */ js.UndefOr[Any], Unit]] = js.undefined
    }
    object IRecognizer {
      
      inline def apply(): IRecognizer = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IRecognizer]
      }
      
      extension [Self <: IRecognizer](x: Self) {
        
        inline def setGetCallbackScope(value: () => Any): Self = StObject.set(x, "getCallbackScope", js.Any.fromFunction0(value))
        
        inline def setGetCallbackScopeUndefined: Self = StObject.set(x, "getCallbackScope", js.undefined)
        
        inline def setGetId(value: () => java.lang.String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
        
        inline def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
        
        inline def setGetOnFailed(value: () => Any): Self = StObject.set(x, "getOnFailed", js.Any.fromFunction0(value))
        
        inline def setGetOnFailedUndefined: Self = StObject.set(x, "getOnFailed", js.undefined)
        
        inline def setGetOnRecognized(value: () => Any): Self = StObject.set(x, "getOnRecognized", js.Any.fromFunction0(value))
        
        inline def setGetOnRecognizedUndefined: Self = StObject.set(x, "getOnRecognized", js.undefined)
        
        inline def setSetCallbackScope(value: /* callbackScope */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setCallbackScope", js.Any.fromFunction1(value))
        
        inline def setSetCallbackScopeUndefined: Self = StObject.set(x, "setCallbackScope", js.undefined)
        
        inline def setSetOnFailed(value: /* onFailed */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setOnFailed", js.Any.fromFunction1(value))
        
        inline def setSetOnFailedUndefined: Self = StObject.set(x, "setOnFailed", js.undefined)
        
        inline def setSetOnRecognized(value: /* onRecognized */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setOnRecognized", js.Any.fromFunction1(value))
        
        inline def setSetOnRecognizedUndefined: Self = StObject.set(x, "setOnRecognized", js.undefined)
      }
    }
    
    type IRotate = IMultiTouch
    
    type ISingleTouch = typings.senchaTouch.Ext.event.recognizer.ITouch
    
    trait ISwipe
      extends StObject
         with IRecognizer {
      
      /** [Method] Returns the value of maxDuration
        * @returns Number
        */
      var getMaxDuration: js.UndefOr[js.Function0[Double]] = js.undefined
      
      /** [Method] Returns the value of maxOffset
        * @returns Number
        */
      var getMaxOffset: js.UndefOr[js.Function0[Double]] = js.undefined
      
      /** [Method] Returns the value of minDistance
        * @returns Number
        */
      var getMinDistance: js.UndefOr[js.Function0[Double]] = js.undefined
      
      /** [Method] Sets the value of maxDuration
        * @param maxDuration Number The new value.
        */
      var setMaxDuration: js.UndefOr[js.Function1[/* maxDuration */ js.UndefOr[Double], Unit]] = js.undefined
      
      /** [Method] Sets the value of maxOffset
        * @param maxOffset Number The new value.
        */
      var setMaxOffset: js.UndefOr[js.Function1[/* maxOffset */ js.UndefOr[Double], Unit]] = js.undefined
      
      /** [Method] Sets the value of minDistance
        * @param minDistance Number The new value.
        */
      var setMinDistance: js.UndefOr[js.Function1[/* minDistance */ js.UndefOr[Double], Unit]] = js.undefined
    }
    object ISwipe {
      
      inline def apply(): ISwipe = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISwipe]
      }
      
      extension [Self <: ISwipe](x: Self) {
        
        inline def setGetMaxDuration(value: () => Double): Self = StObject.set(x, "getMaxDuration", js.Any.fromFunction0(value))
        
        inline def setGetMaxDurationUndefined: Self = StObject.set(x, "getMaxDuration", js.undefined)
        
        inline def setGetMaxOffset(value: () => Double): Self = StObject.set(x, "getMaxOffset", js.Any.fromFunction0(value))
        
        inline def setGetMaxOffsetUndefined: Self = StObject.set(x, "getMaxOffset", js.undefined)
        
        inline def setGetMinDistance(value: () => Double): Self = StObject.set(x, "getMinDistance", js.Any.fromFunction0(value))
        
        inline def setGetMinDistanceUndefined: Self = StObject.set(x, "getMinDistance", js.undefined)
        
        inline def setSetMaxDuration(value: /* maxDuration */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxDuration", js.Any.fromFunction1(value))
        
        inline def setSetMaxDurationUndefined: Self = StObject.set(x, "setMaxDuration", js.undefined)
        
        inline def setSetMaxOffset(value: /* maxOffset */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxOffset", js.Any.fromFunction1(value))
        
        inline def setSetMaxOffsetUndefined: Self = StObject.set(x, "setMaxOffset", js.undefined)
        
        inline def setSetMinDistance(value: /* minDistance */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinDistance", js.Any.fromFunction1(value))
        
        inline def setSetMinDistanceUndefined: Self = StObject.set(x, "setMinDistance", js.undefined)
      }
    }
    
    trait ITap
      extends StObject
         with IRecognizer {
      
      /** [Method] Returns the value of moveDistance
        * @returns Number
        */
      var getMoveDistance: js.UndefOr[js.Function0[Double]] = js.undefined
      
      /** [Config Option] (Number) */
      var moveDistance: js.UndefOr[Double] = js.undefined
      
      /** [Method] Sets the value of moveDistance
        * @param moveDistance Number The new value.
        */
      var setMoveDistance: js.UndefOr[js.Function1[/* moveDistance */ js.UndefOr[Double], Unit]] = js.undefined
    }
    object ITap {
      
      inline def apply(): ITap = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITap]
      }
      
      extension [Self <: ITap](x: Self) {
        
        inline def setGetMoveDistance(value: () => Double): Self = StObject.set(x, "getMoveDistance", js.Any.fromFunction0(value))
        
        inline def setGetMoveDistanceUndefined: Self = StObject.set(x, "getMoveDistance", js.undefined)
        
        inline def setMoveDistance(value: Double): Self = StObject.set(x, "moveDistance", value.asInstanceOf[js.Any])
        
        inline def setMoveDistanceUndefined: Self = StObject.set(x, "moveDistance", js.undefined)
        
        inline def setSetMoveDistance(value: /* moveDistance */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMoveDistance", js.Any.fromFunction1(value))
        
        inline def setSetMoveDistanceUndefined: Self = StObject.set(x, "setMoveDistance", js.undefined)
      }
    }
    
    type ITouch = IRecognizer
    
    type IVerticalSwipe = ISwipe
  }
}
