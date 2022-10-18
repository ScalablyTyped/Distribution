package typings.reactSpringShared

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcFrameLoopMod {
  
  object frameLoop {
    
    @JSImport("@react-spring/shared/dist/declarations/src/FrameLoop", "frameLoop")
    @js.native
    val ^ : js.Any = js.native
    
    /** Advance all animations by the given time. */
    @JSImport("@react-spring/shared/dist/declarations/src/FrameLoop", "frameLoop.advance")
    @js.native
    def advance: js.Function1[/* dt */ Double, Boolean] = js.native
    inline def advance_=(x: js.Function1[/* dt */ Double, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("advance")(x.asInstanceOf[js.Any])
    
    /**
      * Clear all animations. For testing purposes.
      *
      * ☠️ Never call this from within the frameloop.
      */
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    @JSImport("@react-spring/shared/dist/declarations/src/FrameLoop", "frameLoop.idle")
    @js.native
    val idle: Boolean = js.native
    
    /** Call this when an animation's priority changes. */
    inline def sort(animation: OpaqueAnimation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(animation.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Advance the given animation on every frame until idle. */
    inline def start(animation: OpaqueAnimation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(animation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait OpaqueAnimation extends StObject {
    
    def advance(dt: Double): Unit
    
    var idle: Boolean
    
    var priority: Double
  }
  object OpaqueAnimation {
    
    inline def apply(advance: Double => Unit, idle: Boolean, priority: Double): OpaqueAnimation = {
      val __obj = js.Dynamic.literal(advance = js.Any.fromFunction1(advance), idle = idle.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpaqueAnimation]
    }
    
    extension [Self <: OpaqueAnimation](x: Self) {
      
      inline def setAdvance(value: Double => Unit): Self = StObject.set(x, "advance", js.Any.fromFunction1(value))
      
      inline def setIdle(value: Boolean): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
}
