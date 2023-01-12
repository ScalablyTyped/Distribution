package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.AdaptedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebDetectorsScaleGestureDetectorMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web/detectors/ScaleGestureDetector", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ScaleGestureDetector {
    def this(callbacks: ScaleGestureListener) = this()
    
    /* private */ /* CompleteClass */
    var currentSpan: Any = js.native
    
    /* private */ /* CompleteClass */
    var currentTime: Any = js.native
    
    /* private */ /* CompleteClass */
    var focusX: Any = js.native
    
    /* private */ /* CompleteClass */
    var focusY: Any = js.native
    
    /* CompleteClass */
    override def getCurrentSpan(): Double = js.native
    
    /* CompleteClass */
    override def getFocusX(): Double = js.native
    
    /* CompleteClass */
    override def getFocusY(): Double = js.native
    
    /* CompleteClass */
    override def getScaleFactor(numOfPointers: Double): Double = js.native
    
    /* CompleteClass */
    override def getTimeDelta(): Double = js.native
    
    /* private */ /* CompleteClass */
    var inProgress: Any = js.native
    
    /* private */ /* CompleteClass */
    var initialSpan: Any = js.native
    
    /* private */ /* CompleteClass */
    var minSpan: Any = js.native
    
    /* CompleteClass */
    override def onScale(detector: ScaleGestureDetector): Boolean = js.native
    
    /* CompleteClass */
    override def onScaleBegin(detector: ScaleGestureDetector): Boolean = js.native
    
    /* CompleteClass */
    override def onScaleEnd(detector: ScaleGestureDetector): Unit = js.native
    
    /* CompleteClass */
    override def onTouchEvent(
      event: AdaptedEvent,
      tracker: typings.reactNativeGestureHandler.libTypescriptWebToolsPointerTrackerMod.default
    ): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var prevSpan: Any = js.native
    
    /* private */ /* CompleteClass */
    var prevTime: Any = js.native
    
    /* private */ /* CompleteClass */
    var spanSlop: Any = js.native
  }
  
  trait ScaleGestureDetector
    extends StObject
       with ScaleGestureListener {
    
    /* private */ var currentSpan: Any
    
    /* private */ var currentTime: Any
    
    /* private */ var focusX: Any
    
    /* private */ var focusY: Any
    
    def getCurrentSpan(): Double
    
    def getFocusX(): Double
    
    def getFocusY(): Double
    
    def getScaleFactor(numOfPointers: Double): Double
    
    def getTimeDelta(): Double
    
    /* private */ var inProgress: Any
    
    /* private */ var initialSpan: Any
    
    /* private */ var minSpan: Any
    
    def onTouchEvent(
      event: AdaptedEvent,
      tracker: typings.reactNativeGestureHandler.libTypescriptWebToolsPointerTrackerMod.default
    ): Boolean
    
    /* private */ var prevSpan: Any
    
    /* private */ var prevTime: Any
    
    /* private */ var spanSlop: Any
  }
  object ScaleGestureDetector {
    
    inline def apply(
      currentSpan: Any,
      currentTime: Any,
      focusX: Any,
      focusY: Any,
      getCurrentSpan: () => Double,
      getFocusX: () => Double,
      getFocusY: () => Double,
      getScaleFactor: Double => Double,
      getTimeDelta: () => Double,
      inProgress: Any,
      initialSpan: Any,
      minSpan: Any,
      onScale: ScaleGestureDetector => Boolean,
      onScaleBegin: ScaleGestureDetector => Boolean,
      onScaleEnd: ScaleGestureDetector => Unit,
      onTouchEvent: (AdaptedEvent, typings.reactNativeGestureHandler.libTypescriptWebToolsPointerTrackerMod.default) => Boolean,
      prevSpan: Any,
      prevTime: Any,
      spanSlop: Any
    ): ScaleGestureDetector = {
      val __obj = js.Dynamic.literal(currentSpan = currentSpan.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], focusX = focusX.asInstanceOf[js.Any], focusY = focusY.asInstanceOf[js.Any], getCurrentSpan = js.Any.fromFunction0(getCurrentSpan), getFocusX = js.Any.fromFunction0(getFocusX), getFocusY = js.Any.fromFunction0(getFocusY), getScaleFactor = js.Any.fromFunction1(getScaleFactor), getTimeDelta = js.Any.fromFunction0(getTimeDelta), inProgress = inProgress.asInstanceOf[js.Any], initialSpan = initialSpan.asInstanceOf[js.Any], minSpan = minSpan.asInstanceOf[js.Any], onScale = js.Any.fromFunction1(onScale), onScaleBegin = js.Any.fromFunction1(onScaleBegin), onScaleEnd = js.Any.fromFunction1(onScaleEnd), onTouchEvent = js.Any.fromFunction2(onTouchEvent), prevSpan = prevSpan.asInstanceOf[js.Any], prevTime = prevTime.asInstanceOf[js.Any], spanSlop = spanSlop.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleGestureDetector]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScaleGestureDetector] (val x: Self) extends AnyVal {
      
      inline def setCurrentSpan(value: Any): Self = StObject.set(x, "currentSpan", value.asInstanceOf[js.Any])
      
      inline def setCurrentTime(value: Any): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      inline def setFocusX(value: Any): Self = StObject.set(x, "focusX", value.asInstanceOf[js.Any])
      
      inline def setFocusY(value: Any): Self = StObject.set(x, "focusY", value.asInstanceOf[js.Any])
      
      inline def setGetCurrentSpan(value: () => Double): Self = StObject.set(x, "getCurrentSpan", js.Any.fromFunction0(value))
      
      inline def setGetFocusX(value: () => Double): Self = StObject.set(x, "getFocusX", js.Any.fromFunction0(value))
      
      inline def setGetFocusY(value: () => Double): Self = StObject.set(x, "getFocusY", js.Any.fromFunction0(value))
      
      inline def setGetScaleFactor(value: Double => Double): Self = StObject.set(x, "getScaleFactor", js.Any.fromFunction1(value))
      
      inline def setGetTimeDelta(value: () => Double): Self = StObject.set(x, "getTimeDelta", js.Any.fromFunction0(value))
      
      inline def setInProgress(value: Any): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
      
      inline def setInitialSpan(value: Any): Self = StObject.set(x, "initialSpan", value.asInstanceOf[js.Any])
      
      inline def setMinSpan(value: Any): Self = StObject.set(x, "minSpan", value.asInstanceOf[js.Any])
      
      inline def setOnTouchEvent(
        value: (AdaptedEvent, typings.reactNativeGestureHandler.libTypescriptWebToolsPointerTrackerMod.default) => Boolean
      ): Self = StObject.set(x, "onTouchEvent", js.Any.fromFunction2(value))
      
      inline def setPrevSpan(value: Any): Self = StObject.set(x, "prevSpan", value.asInstanceOf[js.Any])
      
      inline def setPrevTime(value: Any): Self = StObject.set(x, "prevTime", value.asInstanceOf[js.Any])
      
      inline def setSpanSlop(value: Any): Self = StObject.set(x, "spanSlop", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScaleGestureListener extends StObject {
    
    def onScale(detector: ScaleGestureDetector): Boolean
    
    def onScaleBegin(detector: ScaleGestureDetector): Boolean
    
    def onScaleEnd(detector: ScaleGestureDetector): Unit
  }
  object ScaleGestureListener {
    
    inline def apply(
      onScale: ScaleGestureDetector => Boolean,
      onScaleBegin: ScaleGestureDetector => Boolean,
      onScaleEnd: ScaleGestureDetector => Unit
    ): ScaleGestureListener = {
      val __obj = js.Dynamic.literal(onScale = js.Any.fromFunction1(onScale), onScaleBegin = js.Any.fromFunction1(onScaleBegin), onScaleEnd = js.Any.fromFunction1(onScaleEnd))
      __obj.asInstanceOf[ScaleGestureListener]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScaleGestureListener] (val x: Self) extends AnyVal {
      
      inline def setOnScale(value: ScaleGestureDetector => Boolean): Self = StObject.set(x, "onScale", js.Any.fromFunction1(value))
      
      inline def setOnScaleBegin(value: ScaleGestureDetector => Boolean): Self = StObject.set(x, "onScaleBegin", js.Any.fromFunction1(value))
      
      inline def setOnScaleEnd(value: ScaleGestureDetector => Unit): Self = StObject.set(x, "onScaleEnd", js.Any.fromFunction1(value))
    }
  }
}
