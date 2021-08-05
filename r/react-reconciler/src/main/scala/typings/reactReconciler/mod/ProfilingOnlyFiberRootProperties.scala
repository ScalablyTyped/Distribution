package typings.reactReconciler.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// The following attributes are only used by interaction tracing builds.
// They enable interactions to be associated with their async work,
// And expose interaction metadata to the React DevTools Profiler plugin.
// Note that these attributes are only defined when the enableSchedulerTracing flag is enabled.
trait ProfilingOnlyFiberRootProperties extends StObject {
  
  var interactionThreadID: Double
  
  var memoizedInteractions: Set[Interaction]
  
  var pendingInteractionMap: PendingInteractionMap
}
object ProfilingOnlyFiberRootProperties {
  
  inline def apply(
    interactionThreadID: Double,
    memoizedInteractions: Set[Interaction],
    pendingInteractionMap: PendingInteractionMap
  ): ProfilingOnlyFiberRootProperties = {
    val __obj = js.Dynamic.literal(interactionThreadID = interactionThreadID.asInstanceOf[js.Any], memoizedInteractions = memoizedInteractions.asInstanceOf[js.Any], pendingInteractionMap = pendingInteractionMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilingOnlyFiberRootProperties]
  }
  
  extension [Self <: ProfilingOnlyFiberRootProperties](x: Self) {
    
    inline def setInteractionThreadID(value: Double): Self = StObject.set(x, "interactionThreadID", value.asInstanceOf[js.Any])
    
    inline def setMemoizedInteractions(value: Set[Interaction]): Self = StObject.set(x, "memoizedInteractions", value.asInstanceOf[js.Any])
    
    inline def setPendingInteractionMap(value: PendingInteractionMap): Self = StObject.set(x, "pendingInteractionMap", value.asInstanceOf[js.Any])
  }
}
