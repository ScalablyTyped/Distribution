package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.AdaptedEvent
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebToolsPointerTrackerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web/tools/PointerTracker", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with PointerTracker
  /* static members */
  object default {
    
    @JSImport("react-native-gesture-handler/lib/typescript/web/tools/PointerTracker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def shareCommonPointers(stPointers: js.Array[Double], ndPointers: js.Array[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shareCommonPointers")(stPointers.asInstanceOf[js.Any], ndPointers.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @js.native
  trait PointerTracker extends StObject {
    
    def addToTracker(event: AdaptedEvent): Unit = js.native
    
    /* private */ var cachedAverages: Any = js.native
    
    def getData(): Map[Double, TrackerElement] = js.native
    
    def getLastAvgX(): Double = js.native
    
    def getLastAvgY(): Double = js.native
    
    /**
      * Returns X coordinate of last moved pointer
      */
    def getLastX(): Double = js.native
    /**
      *
      * @param pointerId
      * Returns X coordinate of given pointer
      */
    def getLastX(pointerId: Double): Double = js.native
    
    /**
      * Returns Y coordinate of last moved pointer
      */
    def getLastY(): Double = js.native
    /**
      *
      * @param pointerId
      * Returns Y coordinate of given pointer
      */
    def getLastY(pointerId: Double): Double = js.native
    
    def getMappedTouchEventId(touchEventId: Double): Double = js.native
    
    def getSumX(): Double = js.native
    def getSumX(ignoredPointer: Double): Double = js.native
    
    def getSumY(): Double = js.native
    def getSumY(ignoredPointer: Double): Double = js.native
    
    def getTrackedPointersCount(): Double = js.native
    
    def getTrackedPointersID(): js.Array[Double] = js.native
    
    def getVelocityX(pointerId: Double): Double = js.native
    
    def getVelocityY(pointerId: Double): Double = js.native
    
    /* private */ var lastMovedPointerId: Any = js.native
    
    /* private */ var mapTouchEventId: Any = js.native
    
    def removeFromTracker(pointerId: Double): Unit = js.native
    
    /* private */ var removeMappedTouchId: Any = js.native
    
    def resetTracker(): Unit = js.native
    
    /* private */ var touchEventsIds: Any = js.native
    
    def track(event: AdaptedEvent): Unit = js.native
    
    /* private */ var trackedPointers: Any = js.native
  }
  
  trait TrackerElement extends StObject {
    
    var lastX: Double
    
    var lastY: Double
    
    var timeStamp: Double
    
    var velocityX: Double
    
    var velocityY: Double
  }
  object TrackerElement {
    
    inline def apply(lastX: Double, lastY: Double, timeStamp: Double, velocityX: Double, velocityY: Double): TrackerElement = {
      val __obj = js.Dynamic.literal(lastX = lastX.asInstanceOf[js.Any], lastY = lastY.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackerElement]
    }
    
    extension [Self <: TrackerElement](x: Self) {
      
      inline def setLastX(value: Double): Self = StObject.set(x, "lastX", value.asInstanceOf[js.Any])
      
      inline def setLastY(value: Double): Self = StObject.set(x, "lastY", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setVelocityX(value: Double): Self = StObject.set(x, "velocityX", value.asInstanceOf[js.Any])
      
      inline def setVelocityY(value: Double): Self = StObject.set(x, "velocityY", value.asInstanceOf[js.Any])
    }
  }
}
