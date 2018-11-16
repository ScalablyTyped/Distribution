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

