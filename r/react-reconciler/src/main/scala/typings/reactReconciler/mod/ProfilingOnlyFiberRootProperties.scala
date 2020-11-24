package typings.reactReconciler.mod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// The following attributes are only used by interaction tracing builds.
// They enable interactions to be associated with their async work,
// And expose interaction metadata to the React DevTools Profiler plugin.
// Note that these attributes are only defined when the enableSchedulerTracing flag is enabled.
@js.native
trait ProfilingOnlyFiberRootProperties extends js.Object {
  
  var interactionThreadID: Double = js.native
  
  var memoizedInteractions: Set[Interaction] = js.native
  
  var pendingInteractionMap: PendingInteractionMap = js.native
}
object ProfilingOnlyFiberRootProperties {
  
  @scala.inline
  def apply(
    interactionThreadID: Double,
    memoizedInteractions: Set[Interaction],
    pendingInteractionMap: PendingInteractionMap
  ): ProfilingOnlyFiberRootProperties = {
    val __obj = js.Dynamic.literal(interactionThreadID = interactionThreadID.asInstanceOf[js.Any], memoizedInteractions = memoizedInteractions.asInstanceOf[js.Any], pendingInteractionMap = pendingInteractionMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilingOnlyFiberRootProperties]
  }
  
  @scala.inline
  implicit class ProfilingOnlyFiberRootPropertiesOps[Self <: ProfilingOnlyFiberRootProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInteractionThreadID(value: Double): Self = this.set("interactionThreadID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoizedInteractions(value: Set[Interaction]): Self = this.set("memoizedInteractions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingInteractionMap(value: PendingInteractionMap): Self = this.set("pendingInteractionMap", value.asInstanceOf[js.Any])
  }
}
