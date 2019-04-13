package typings
package reactDashReconcilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashReconcilerMod {
  // react-reconciler/ReactFiberExpirationTime
  type ExpirationTime = scala.Double
  type FiberRoot = BaseFiberRootProperties with ProfilingOnlyFiberRootProperties
  // react-reconciler/ReactFiberReconciler
  type OpaqueHandle = Fiber
  type OpaqueRoot = FiberRoot
  type PendingInteractionMap = stdLib.Map[ExpirationTime, stdLib.Set[Interaction]]
  // shared/ReactTypes
  type ReactEmpty = js.UndefOr[scala.Null | scala.Boolean]
  type ReactNodeList = ReactEmpty | reactLib.reactMod.ReactNode
  // shared/ReactSideEffectTags
  type SideEffectTag = scala.Double
  // react-reconciler/ReactTypeOfMode
  type TypeOfMode = scala.Double
}
