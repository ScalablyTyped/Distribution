package typings.reactReconciler.mod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The following attributes are only used by interaction tracing builds.
// They enable interactions to be associated with their async work,
// And expose interaction metadata to the React DevTools Profiler plugin.
// Note that these attributes are only defined when the enableSchedulerTracing flag is enabled.
trait ProfilingOnlyFiberRootProperties extends js.Object {
  var interactionThreadID: Double
  var memoizedInteractions: Set[Interaction]
  var pendingInteractionMap: PendingInteractionMap
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
}

