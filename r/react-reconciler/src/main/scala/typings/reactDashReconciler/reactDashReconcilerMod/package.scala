package typings.reactDashReconciler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashReconcilerMod {
  import typings.react.reactMod.ReactNode
  import typings.std.Map
  import typings.std.Set

  // react-reconciler/ReactFiberExpirationTime
  type ExpirationTime = Double
  type FiberRoot = BaseFiberRootProperties with ProfilingOnlyFiberRootProperties
  // react-reconciler/ReactFiberReconciler
  type OpaqueHandle = Fiber
  type OpaqueRoot = FiberRoot
  type PendingInteractionMap = Map[ExpirationTime, Set[Interaction]]
  // shared/ReactTypes
  type ReactEmpty = js.UndefOr[Null | Boolean]
  type ReactNodeList = ReactEmpty | ReactNode
  // shared/ReactSideEffectTags
  type SideEffectTag = Double
  // react-reconciler/ReactTypeOfMode
  type TypeOfMode = Double
}
