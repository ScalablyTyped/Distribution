package typings
package reactDashReconcilerLib.reactDashReconcilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactReconcilerNs {
  // 0 is PROD, 1 is DEV.
  // Might add PROFILE later.
  type BundleType = reactDashReconcilerLib.reactDashReconcilerLibNumbers.`0` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`1`
  // react-reconciler/ReactFiberExpirationTime
  type ExpirationTime = scala.Double
  type FiberRoot = BaseFiberRootProperties with ProfilingOnlyFiberRootProperties
  // react-reconciler/ReactFiberReconciler
  type OpaqueHandle = Fiber
  type OpaqueRoot = FiberRoot
  type PendingInteractionMap = stdLib.Map[ExpirationTime, stdLib.Set[Interaction]]
  // shared/ReactTypes
  type ReactEmpty = js.UndefOr[scala.Null | scala.Boolean]
  type ReactNodeList = ReactEmpty | reactLib.reactMod.ReactNs.ReactNode
  // shared/ReactSideEffectTags
  type SideEffectTag = scala.Double
  // react-reconciler/ReactTypeOfMode
  type TypeOfMode = scala.Double
  // shared/ReactWorkTags
  type WorkTag = reactDashReconcilerLib.reactDashReconcilerLibNumbers.`0` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`1` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`2` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`3` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`4` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`5` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`6` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`7` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`8` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`9` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`10` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`11` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`12` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`13` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`14` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`15` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`16` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`17` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`18`
}
