package typings.reactThreeFiber

import typings.reactThreeFiber.anon.Advance
import typings.reactThreeFiber.rendererMod.Root
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loopMod {
  
  @JSImport("@react-three/fiber/dist/declarations/src/core/loop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addAfterEffect(callback: GlobalRenderCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addAfterEffect")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def addEffect(callback: GlobalRenderCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addEffect")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def addTail(callback: GlobalRenderCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addTail")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def createLoop[TCanvas](roots: Map[TCanvas, Root]): Advance = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoop")(roots.asInstanceOf[js.Any]).asInstanceOf[Advance]
  
  inline def flushGlobalEffects(`type`: GlobalEffectType, timestamp: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flushGlobalEffects")(`type`.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactThreeFiber.reactThreeFiberStrings.before
    - typings.reactThreeFiber.reactThreeFiberStrings.after
    - typings.reactThreeFiber.reactThreeFiberStrings.tail
  */
  trait GlobalEffectType extends StObject
  object GlobalEffectType {
    
    inline def after: typings.reactThreeFiber.reactThreeFiberStrings.after = "after".asInstanceOf[typings.reactThreeFiber.reactThreeFiberStrings.after]
    
    inline def before: typings.reactThreeFiber.reactThreeFiberStrings.before = "before".asInstanceOf[typings.reactThreeFiber.reactThreeFiberStrings.before]
    
    inline def tail: typings.reactThreeFiber.reactThreeFiberStrings.tail = "tail".asInstanceOf[typings.reactThreeFiber.reactThreeFiberStrings.tail]
  }
  
  type GlobalRenderCallback = js.Function1[/* timeStamp */ Double, Unit]
}
