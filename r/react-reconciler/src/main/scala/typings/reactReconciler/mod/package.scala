package typings.reactReconciler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // react-reconciler/ReactFiberExpirationTime
  type ExpirationTime = scala.Double
  
  type FiberRoot = typings.reactReconciler.mod.BaseFiberRootProperties with typings.reactReconciler.mod.ProfilingOnlyFiberRootProperties
  
  // react-reconciler/ReactFiberReconciler
  type OpaqueHandle = typings.reactReconciler.mod.Fiber
  
  type OpaqueRoot = typings.reactReconciler.mod.FiberRoot
  
  type PendingInteractionMap = typings.std.Map[
    typings.reactReconciler.mod.ExpirationTime, 
    typings.std.Set[typings.reactReconciler.mod.Interaction]
  ]
  
  // shared/ReactTypes
  type ReactEmpty = js.UndefOr[scala.Null | scala.Boolean]
  
  type ReactNodeList = typings.reactReconciler.mod.ReactEmpty | typings.react.mod.ReactNode
  
  // shared/ReactSideEffectTags
  type SideEffectTag = scala.Double
  
  // react-reconciler/ReactTypeOfMode
  type TypeOfMode = scala.Double
}
