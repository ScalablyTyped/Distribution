package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.interfacesMod.AdaptedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotationGestureDetectorMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web/detectors/RotationGestureDetector", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RotationGestureDetector {
    def this(callbacks: RotationGestureListener) = this()
    
    /* private */ /* CompleteClass */
    var anchorX: Any = js.native
    
    /* private */ /* CompleteClass */
    var anchorY: Any = js.native
    
    /* private */ /* CompleteClass */
    var currentTime: Any = js.native
    
    /* private */ /* CompleteClass */
    var finish: Any = js.native
    
    /* CompleteClass */
    override def getAnchorX(): Double = js.native
    
    /* CompleteClass */
    override def getAnchorY(): Double = js.native
    
    /* CompleteClass */
    override def getRotation(): Double = js.native
    
    /* CompleteClass */
    override def getTimeDelta(): Double = js.native
    
    /* private */ /* CompleteClass */
    var isInProgress: Any = js.native
    
    /* private */ /* CompleteClass */
    var keyPointers: Any = js.native
    
    /* CompleteClass */
    override def onRotation(detector: RotationGestureDetector): Boolean = js.native
    
    /* CompleteClass */
    override def onRotationBegin(detector: RotationGestureDetector): Boolean = js.native
    
    /* CompleteClass */
    override def onRotationEnd(detector: RotationGestureDetector): Unit = js.native
    
    /* CompleteClass */
    override def onTouchEvent(event: AdaptedEvent, tracker: typings.reactNativeGestureHandler.pointerTrackerMod.default): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var previousAngle: Any = js.native
    
    /* private */ /* CompleteClass */
    var previousTime: Any = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var rotation: Any = js.native
    
    /* private */ /* CompleteClass */
    var setKeyPointers: Any = js.native
    
    /* private */ /* CompleteClass */
    var updateCurrent: Any = js.native
  }
  
  trait RotationGestureDetector
    extends StObject
       with RotationGestureListener {
    
    /* private */ var anchorX: Any
    
    /* private */ var anchorY: Any
    
    /* private */ var currentTime: Any
    
    /* private */ var finish: Any
    
    def getAnchorX(): Double
    
    def getAnchorY(): Double
    
    def getRotation(): Double
    
    def getTimeDelta(): Double
    
    /* private */ var isInProgress: Any
    
    /* private */ var keyPointers: Any
    
    def onTouchEvent(event: AdaptedEvent, tracker: typings.reactNativeGestureHandler.pointerTrackerMod.default): Boolean
    
    /* private */ var previousAngle: Any
    
    /* private */ var previousTime: Any
    
    def reset(): Unit
    
    /* private */ var rotation: Any
    
    /* private */ var setKeyPointers: Any
    
    /* private */ var updateCurrent: Any
  }
  object RotationGestureDetector {
    
    inline def apply(
      anchorX: Any,
      anchorY: Any,
      currentTime: Any,
      finish: Any,
      getAnchorX: () => Double,
      getAnchorY: () => Double,
      getRotation: () => Double,
      getTimeDelta: () => Double,
      isInProgress: Any,
      keyPointers: Any,
      onRotation: RotationGestureDetector => Boolean,
      onRotationBegin: RotationGestureDetector => Boolean,
      onRotationEnd: RotationGestureDetector => Unit,
      onTouchEvent: (AdaptedEvent, typings.reactNativeGestureHandler.pointerTrackerMod.default) => Boolean,
      previousAngle: Any,
      previousTime: Any,
      reset: () => Unit,
      rotation: Any,
      setKeyPointers: Any,
      updateCurrent: Any
    ): RotationGestureDetector = {
      val __obj = js.Dynamic.literal(anchorX = anchorX.asInstanceOf[js.Any], anchorY = anchorY.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], finish = finish.asInstanceOf[js.Any], getAnchorX = js.Any.fromFunction0(getAnchorX), getAnchorY = js.Any.fromFunction0(getAnchorY), getRotation = js.Any.fromFunction0(getRotation), getTimeDelta = js.Any.fromFunction0(getTimeDelta), isInProgress = isInProgress.asInstanceOf[js.Any], keyPointers = keyPointers.asInstanceOf[js.Any], onRotation = js.Any.fromFunction1(onRotation), onRotationBegin = js.Any.fromFunction1(onRotationBegin), onRotationEnd = js.Any.fromFunction1(onRotationEnd), onTouchEvent = js.Any.fromFunction2(onTouchEvent), previousAngle = previousAngle.asInstanceOf[js.Any], previousTime = previousTime.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), rotation = rotation.asInstanceOf[js.Any], setKeyPointers = setKeyPointers.asInstanceOf[js.Any], updateCurrent = updateCurrent.asInstanceOf[js.Any])
      __obj.asInstanceOf[RotationGestureDetector]
    }
    
    extension [Self <: RotationGestureDetector](x: Self) {
      
      inline def setAnchorX(value: Any): Self = StObject.set(x, "anchorX", value.asInstanceOf[js.Any])
      
      inline def setAnchorY(value: Any): Self = StObject.set(x, "anchorY", value.asInstanceOf[js.Any])
      
      inline def setCurrentTime(value: Any): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      inline def setFinish(value: Any): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
      
      inline def setGetAnchorX(value: () => Double): Self = StObject.set(x, "getAnchorX", js.Any.fromFunction0(value))
      
      inline def setGetAnchorY(value: () => Double): Self = StObject.set(x, "getAnchorY", js.Any.fromFunction0(value))
      
      inline def setGetRotation(value: () => Double): Self = StObject.set(x, "getRotation", js.Any.fromFunction0(value))
      
      inline def setGetTimeDelta(value: () => Double): Self = StObject.set(x, "getTimeDelta", js.Any.fromFunction0(value))
      
      inline def setIsInProgress(value: Any): Self = StObject.set(x, "isInProgress", value.asInstanceOf[js.Any])
      
      inline def setKeyPointers(value: Any): Self = StObject.set(x, "keyPointers", value.asInstanceOf[js.Any])
      
      inline def setOnTouchEvent(value: (AdaptedEvent, typings.reactNativeGestureHandler.pointerTrackerMod.default) => Boolean): Self = StObject.set(x, "onTouchEvent", js.Any.fromFunction2(value))
      
      inline def setPreviousAngle(value: Any): Self = StObject.set(x, "previousAngle", value.asInstanceOf[js.Any])
      
      inline def setPreviousTime(value: Any): Self = StObject.set(x, "previousTime", value.asInstanceOf[js.Any])
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setRotation(value: Any): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setSetKeyPointers(value: Any): Self = StObject.set(x, "setKeyPointers", value.asInstanceOf[js.Any])
      
      inline def setUpdateCurrent(value: Any): Self = StObject.set(x, "updateCurrent", value.asInstanceOf[js.Any])
    }
  }
  
  trait RotationGestureListener extends StObject {
    
    def onRotation(detector: RotationGestureDetector): Boolean
    
    def onRotationBegin(detector: RotationGestureDetector): Boolean
    
    def onRotationEnd(detector: RotationGestureDetector): Unit
  }
  object RotationGestureListener {
    
    inline def apply(
      onRotation: RotationGestureDetector => Boolean,
      onRotationBegin: RotationGestureDetector => Boolean,
      onRotationEnd: RotationGestureDetector => Unit
    ): RotationGestureListener = {
      val __obj = js.Dynamic.literal(onRotation = js.Any.fromFunction1(onRotation), onRotationBegin = js.Any.fromFunction1(onRotationBegin), onRotationEnd = js.Any.fromFunction1(onRotationEnd))
      __obj.asInstanceOf[RotationGestureListener]
    }
    
    extension [Self <: RotationGestureListener](x: Self) {
      
      inline def setOnRotation(value: RotationGestureDetector => Boolean): Self = StObject.set(x, "onRotation", js.Any.fromFunction1(value))
      
      inline def setOnRotationBegin(value: RotationGestureDetector => Boolean): Self = StObject.set(x, "onRotationBegin", js.Any.fromFunction1(value))
      
      inline def setOnRotationEnd(value: RotationGestureDetector => Unit): Self = StObject.set(x, "onRotationEnd", js.Any.fromFunction1(value))
    }
  }
}
