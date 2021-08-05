package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply[Type, Props, Container, Instance, TextInstance, HydratableInstance, PublicInstance, HostContext, UpdatePayload, ChildSet, TimeoutHandle, NoTimeout](
  // tslint:disable-next-line:no-unnecessary-generics
config: typings.reactReconciler.mod.HostConfig[
  Type, 
  Props, 
  Container, 
  Instance, 
  TextInstance, 
  HydratableInstance, 
  PublicInstance, 
  HostContext, 
  UpdatePayload, 
  ChildSet, 
  TimeoutHandle, 
  NoTimeout
]
): typings.reactReconciler.mod.Reconciler[Instance, TextInstance, Container, PublicInstance] = typings.reactReconciler.mod.^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[typings.reactReconciler.mod.Reconciler[Instance, TextInstance, Container, PublicInstance]]

// react-reconciler/ReactFiberExpirationTime
type ExpirationTime = scala.Double

// react-reconciler/ReactFiberReconciler
type OpaqueHandle = typings.reactReconciler.mod.Fiber

type OpaqueRoot = typings.reactReconciler.mod.FiberRoot

type PendingInteractionMap = typings.std.Map[
typings.reactReconciler.mod.ExpirationTime, 
typings.std.Set[typings.reactReconciler.mod.Interaction]]

// shared/ReactTypes
type ReactEmpty = js.UndefOr[scala.Null | scala.Boolean]

type ReactNodeList = typings.reactReconciler.mod.ReactEmpty | typings.react.mod.ReactNode

// shared/ReactSideEffectTags
type SideEffectTag = scala.Double

// react-reconciler/ReactTypeOfMode
type TypeOfMode = scala.Double
