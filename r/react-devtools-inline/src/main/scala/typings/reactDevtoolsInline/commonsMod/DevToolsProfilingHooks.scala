package typings.reactDevtoolsInline.commonsMod

import typings.reactReconciler.mod.Fiber
import typings.reactReconciler.mod.Lanes
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevToolsProfilingHooks extends StObject {
  
  def markCommitStarted(lanes: Lanes): Unit
  
  def markCommitStopped(): Unit
  
  def markComponentErrored(fiber: Fiber, thrownValue: Any, lanes: Lanes): Unit
  
  def markComponentLayoutEffectMountStarted(fiber: Fiber): Unit
  
  def markComponentLayoutEffectMountStopped(): Unit
  
  def markComponentLayoutEffectUnmountStarted(fiber: Fiber): Unit
  
  def markComponentLayoutEffectUnmountStopped(): Unit
  
  def markComponentPassiveEffectMountStarted(fiber: Fiber): Unit
  
  def markComponentPassiveEffectMountStopped(): Unit
  
  def markComponentPassiveEffectUnmountStarted(fiber: Fiber): Unit
  
  def markComponentPassiveEffectUnmountStopped(): Unit
  
  // Fiber level methods:
  def markComponentRenderStarted(fiber: Fiber): Unit
  
  def markComponentRenderStopped(): Unit
  
  def markComponentSuspended(fiber: Fiber, wakeable: PromiseLike[Any], lanes: Lanes): Unit
  
  def markForceUpdateScheduled(fiber: Fiber, lane: Lane): Unit
  
  def markLayoutEffectsStarted(lanes: Lanes): Unit
  
  def markLayoutEffectsStopped(): Unit
  
  def markPassiveEffectsStarted(lanes: Lanes): Unit
  
  def markPassiveEffectsStopped(): Unit
  
  // Scheduling methods:
  def markRenderScheduled(lane: Lane): Unit
  
  // Work loop level methods:
  def markRenderStarted(lanes: Lanes): Unit
  
  def markRenderStopped(): Unit
  
  def markRenderYielded(): Unit
  
  def markStateUpdateScheduled(fiber: Fiber, lane: Lane): Unit
}
object DevToolsProfilingHooks {
  
  inline def apply(
    markCommitStarted: Lanes => Unit,
    markCommitStopped: () => Unit,
    markComponentErrored: (Fiber, Any, Lanes) => Unit,
    markComponentLayoutEffectMountStarted: Fiber => Unit,
    markComponentLayoutEffectMountStopped: () => Unit,
    markComponentLayoutEffectUnmountStarted: Fiber => Unit,
    markComponentLayoutEffectUnmountStopped: () => Unit,
    markComponentPassiveEffectMountStarted: Fiber => Unit,
    markComponentPassiveEffectMountStopped: () => Unit,
    markComponentPassiveEffectUnmountStarted: Fiber => Unit,
    markComponentPassiveEffectUnmountStopped: () => Unit,
    markComponentRenderStarted: Fiber => Unit,
    markComponentRenderStopped: () => Unit,
    markComponentSuspended: (Fiber, PromiseLike[Any], Lanes) => Unit,
    markForceUpdateScheduled: (Fiber, Lane) => Unit,
    markLayoutEffectsStarted: Lanes => Unit,
    markLayoutEffectsStopped: () => Unit,
    markPassiveEffectsStarted: Lanes => Unit,
    markPassiveEffectsStopped: () => Unit,
    markRenderScheduled: Lane => Unit,
    markRenderStarted: Lanes => Unit,
    markRenderStopped: () => Unit,
    markRenderYielded: () => Unit,
    markStateUpdateScheduled: (Fiber, Lane) => Unit
  ): DevToolsProfilingHooks = {
    val __obj = js.Dynamic.literal(markCommitStarted = js.Any.fromFunction1(markCommitStarted), markCommitStopped = js.Any.fromFunction0(markCommitStopped), markComponentErrored = js.Any.fromFunction3(markComponentErrored), markComponentLayoutEffectMountStarted = js.Any.fromFunction1(markComponentLayoutEffectMountStarted), markComponentLayoutEffectMountStopped = js.Any.fromFunction0(markComponentLayoutEffectMountStopped), markComponentLayoutEffectUnmountStarted = js.Any.fromFunction1(markComponentLayoutEffectUnmountStarted), markComponentLayoutEffectUnmountStopped = js.Any.fromFunction0(markComponentLayoutEffectUnmountStopped), markComponentPassiveEffectMountStarted = js.Any.fromFunction1(markComponentPassiveEffectMountStarted), markComponentPassiveEffectMountStopped = js.Any.fromFunction0(markComponentPassiveEffectMountStopped), markComponentPassiveEffectUnmountStarted = js.Any.fromFunction1(markComponentPassiveEffectUnmountStarted), markComponentPassiveEffectUnmountStopped = js.Any.fromFunction0(markComponentPassiveEffectUnmountStopped), markComponentRenderStarted = js.Any.fromFunction1(markComponentRenderStarted), markComponentRenderStopped = js.Any.fromFunction0(markComponentRenderStopped), markComponentSuspended = js.Any.fromFunction3(markComponentSuspended), markForceUpdateScheduled = js.Any.fromFunction2(markForceUpdateScheduled), markLayoutEffectsStarted = js.Any.fromFunction1(markLayoutEffectsStarted), markLayoutEffectsStopped = js.Any.fromFunction0(markLayoutEffectsStopped), markPassiveEffectsStarted = js.Any.fromFunction1(markPassiveEffectsStarted), markPassiveEffectsStopped = js.Any.fromFunction0(markPassiveEffectsStopped), markRenderScheduled = js.Any.fromFunction1(markRenderScheduled), markRenderStarted = js.Any.fromFunction1(markRenderStarted), markRenderStopped = js.Any.fromFunction0(markRenderStopped), markRenderYielded = js.Any.fromFunction0(markRenderYielded), markStateUpdateScheduled = js.Any.fromFunction2(markStateUpdateScheduled))
    __obj.asInstanceOf[DevToolsProfilingHooks]
  }
  
  extension [Self <: DevToolsProfilingHooks](x: Self) {
    
    inline def setMarkCommitStarted(value: Lanes => Unit): Self = StObject.set(x, "markCommitStarted", js.Any.fromFunction1(value))
    
    inline def setMarkCommitStopped(value: () => Unit): Self = StObject.set(x, "markCommitStopped", js.Any.fromFunction0(value))
    
    inline def setMarkComponentErrored(value: (Fiber, Any, Lanes) => Unit): Self = StObject.set(x, "markComponentErrored", js.Any.fromFunction3(value))
    
    inline def setMarkComponentLayoutEffectMountStarted(value: Fiber => Unit): Self = StObject.set(x, "markComponentLayoutEffectMountStarted", js.Any.fromFunction1(value))
    
    inline def setMarkComponentLayoutEffectMountStopped(value: () => Unit): Self = StObject.set(x, "markComponentLayoutEffectMountStopped", js.Any.fromFunction0(value))
    
    inline def setMarkComponentLayoutEffectUnmountStarted(value: Fiber => Unit): Self = StObject.set(x, "markComponentLayoutEffectUnmountStarted", js.Any.fromFunction1(value))
    
    inline def setMarkComponentLayoutEffectUnmountStopped(value: () => Unit): Self = StObject.set(x, "markComponentLayoutEffectUnmountStopped", js.Any.fromFunction0(value))
    
    inline def setMarkComponentPassiveEffectMountStarted(value: Fiber => Unit): Self = StObject.set(x, "markComponentPassiveEffectMountStarted", js.Any.fromFunction1(value))
    
    inline def setMarkComponentPassiveEffectMountStopped(value: () => Unit): Self = StObject.set(x, "markComponentPassiveEffectMountStopped", js.Any.fromFunction0(value))
    
    inline def setMarkComponentPassiveEffectUnmountStarted(value: Fiber => Unit): Self = StObject.set(x, "markComponentPassiveEffectUnmountStarted", js.Any.fromFunction1(value))
    
    inline def setMarkComponentPassiveEffectUnmountStopped(value: () => Unit): Self = StObject.set(x, "markComponentPassiveEffectUnmountStopped", js.Any.fromFunction0(value))
    
    inline def setMarkComponentRenderStarted(value: Fiber => Unit): Self = StObject.set(x, "markComponentRenderStarted", js.Any.fromFunction1(value))
    
    inline def setMarkComponentRenderStopped(value: () => Unit): Self = StObject.set(x, "markComponentRenderStopped", js.Any.fromFunction0(value))
    
    inline def setMarkComponentSuspended(value: (Fiber, PromiseLike[Any], Lanes) => Unit): Self = StObject.set(x, "markComponentSuspended", js.Any.fromFunction3(value))
    
    inline def setMarkForceUpdateScheduled(value: (Fiber, Lane) => Unit): Self = StObject.set(x, "markForceUpdateScheduled", js.Any.fromFunction2(value))
    
    inline def setMarkLayoutEffectsStarted(value: Lanes => Unit): Self = StObject.set(x, "markLayoutEffectsStarted", js.Any.fromFunction1(value))
    
    inline def setMarkLayoutEffectsStopped(value: () => Unit): Self = StObject.set(x, "markLayoutEffectsStopped", js.Any.fromFunction0(value))
    
    inline def setMarkPassiveEffectsStarted(value: Lanes => Unit): Self = StObject.set(x, "markPassiveEffectsStarted", js.Any.fromFunction1(value))
    
    inline def setMarkPassiveEffectsStopped(value: () => Unit): Self = StObject.set(x, "markPassiveEffectsStopped", js.Any.fromFunction0(value))
    
    inline def setMarkRenderScheduled(value: Lane => Unit): Self = StObject.set(x, "markRenderScheduled", js.Any.fromFunction1(value))
    
    inline def setMarkRenderStarted(value: Lanes => Unit): Self = StObject.set(x, "markRenderStarted", js.Any.fromFunction1(value))
    
    inline def setMarkRenderStopped(value: () => Unit): Self = StObject.set(x, "markRenderStopped", js.Any.fromFunction0(value))
    
    inline def setMarkRenderYielded(value: () => Unit): Self = StObject.set(x, "markRenderYielded", js.Any.fromFunction0(value))
    
    inline def setMarkStateUpdateScheduled(value: (Fiber, Lane) => Unit): Self = StObject.set(x, "markStateUpdateScheduled", js.Any.fromFunction2(value))
  }
}
