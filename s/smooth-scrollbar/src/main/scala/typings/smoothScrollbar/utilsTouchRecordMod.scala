package typings.smoothScrollbar

import org.scalablytyped.runtime.NumberDictionary
import typings.smoothScrollbar.anon.Y
import typings.std.Touch
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsTouchRecordMod {
  
  @JSImport("smooth-scrollbar/utils/touch-record", "TouchRecord")
  @js.native
  open class TouchRecord () extends StObject {
    
    /* private */ var _activeTouchID: Any = js.native
    
    /* private */ var _add: Any = js.native
    
    /* private */ var _delete: Any = js.native
    
    /* private */ var _getActiveTracker: Any = js.native
    
    /* private */ var _has: Any = js.native
    
    /* private */ val _primitiveValue: Any = js.native
    
    /* private */ var _renew: Any = js.native
    
    /* private */ var _setActiveID: Any = js.native
    
    /* private */ var _touchList: Any = js.native
    
    def getDelta(): Y = js.native
    
    def getEasingDistance(damping: Double): Y = js.native
    
    def getVelocity(): Y = js.native
    
    def isActive(): Boolean = js.native
    
    def release(evt: TouchEvent): Unit = js.native
    
    def track(evt: TouchEvent): NumberDictionary[Tracker] = js.native
    
    def update(evt: TouchEvent): NumberDictionary[Tracker] = js.native
  }
  
  @JSImport("smooth-scrollbar/utils/touch-record", "Tracker")
  @js.native
  open class Tracker protected () extends StObject {
    def this(touch: Touch) = this()
    
    var delta: Y = js.native
    
    var lastPosition: Y = js.native
    
    def update(touch: Touch): Unit = js.native
    
    var updateTime: Double = js.native
    
    var velocity: Y = js.native
    
    val velocityMultiplier: Double = js.native
  }
}
