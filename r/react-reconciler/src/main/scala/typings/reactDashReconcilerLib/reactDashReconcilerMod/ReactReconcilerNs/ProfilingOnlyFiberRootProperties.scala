package typings
package reactDashReconcilerLib.reactDashReconcilerMod.ReactReconcilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The following attributes are only used by interaction tracing builds.
// They enable interactions to be associated with their async work,
// And expose interaction metadata to the React DevTools Profiler plugin.
// Note that these attributes are only defined when the enableSchedulerTracing flag is enabled.
trait ProfilingOnlyFiberRootProperties extends js.Object {
  var interactionThreadID: scala.Double
  var memoizedInteractions: stdLib.Set[Interaction]
  var pendingInteractionMap: PendingInteractionMap
}

object ProfilingOnlyFiberRootProperties {
  @scala.inline
  def apply(
    interactionThreadID: scala.Double,
    memoizedInteractions: stdLib.Set[Interaction],
    pendingInteractionMap: PendingInteractionMap
  ): ProfilingOnlyFiberRootProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("interactionThreadID")(interactionThreadID)
    __obj.updateDynamic("memoizedInteractions")(memoizedInteractions)
    __obj.updateDynamic("pendingInteractionMap")(pendingInteractionMap)
    __obj.asInstanceOf[ProfilingOnlyFiberRootProperties]
  }
}

