package typings
package reactDashReconcilerLib.reactDashReconcilerMod.ReactReconcilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostConfig[Type, Props, Container, Instance, TextInstance, HydratableInstance, PublicInstance, HostContext, UpdatePayload, ChildSet, TimeoutHandle, NoTimeout] extends js.Object {
  // -------------------
  //      Mutation
  //     (optional)
  // -------------------
  var appendChild: js.UndefOr[
    js.Function2[/* parentInstance */ Instance, /* child */ Instance | TextInstance, scala.Unit]
  ] = js.native
  var appendChildToContainer: js.UndefOr[
    js.Function2[/* container */ Container, /* child */ Instance | TextInstance, scala.Unit]
  ] = js.native
  var appendChildToContainerChildSet: js.UndefOr[
    js.Function2[/* childSet */ ChildSet, /* child */ Instance | TextInstance, scala.Unit]
  ] = js.native
  // -------------------
  //     Hydration
  //     (optional)
  // -------------------
  var canHydrateInstance: js.UndefOr[
    js.Function3[
      /* instance */ HydratableInstance, 
      /* type */ Type, 
      /* props */ Props, 
      scala.Null | Instance
    ]
  ] = js.native
  var canHydrateTextInstance: js.UndefOr[
    js.Function2[
      /* instance */ HydratableInstance, 
      /* text */ java.lang.String, 
      scala.Null | TextInstance
    ]
  ] = js.native
  // -------------------
  //     Persistence
  //     (optional)
  // -------------------
  var cloneInstance: js.UndefOr[
    js.Function8[
      /* instance */ Instance, 
      /* updatePayload */ scala.Null | UpdatePayload, 
      /* type */ Type, 
      /* oldProps */ Props, 
      /* newProps */ Props, 
      /* internalInstanceHandle */ OpaqueHandle, 
      /* keepChildren */ scala.Boolean, 
      /* recyclableInstance */ Instance, 
      Instance
    ]
  ] = js.native
  var commitMount: js.UndefOr[
    js.Function4[
      /* instance */ Instance, 
      /* type */ Type, 
      /* newProps */ Props, 
      /* internalInstanceHandle */ OpaqueHandle, 
      scala.Unit
    ]
  ] = js.native
  var commitTextUpdate: js.UndefOr[
    js.Function3[
      /* textInstance */ TextInstance, 
      /* oldText */ java.lang.String, 
      /* newText */ java.lang.String, 
      scala.Unit
    ]
  ] = js.native
  var commitUpdate: js.UndefOr[
    js.Function6[
      /* instance */ Instance, 
      /* updatePayload */ UpdatePayload, 
      /* type */ Type, 
      /* oldProps */ Props, 
      /* newProps */ Props, 
      /* internalInstanceHandle */ OpaqueHandle, 
      scala.Unit
    ]
  ] = js.native
  var createContainerChildSet: js.UndefOr[js.Function1[/* container */ Container, ChildSet]] = js.native
  var didNotFindHydratableContainerInstance: js.UndefOr[
    js.Function3[/* parentContainer */ Container, /* type */ Type, /* props */ Props, scala.Unit]
  ] = js.native
  var didNotFindHydratableContainerTextInstance: js.UndefOr[
    js.Function2[/* parentContainer */ Container, /* text */ java.lang.String, scala.Unit]
  ] = js.native
  var didNotFindHydratableInstance: js.UndefOr[
    js.Function5[
      /* parentType */ Type, 
      /* parentProps */ Props, 
      /* parentInstance */ Instance, 
      /* type */ Type, 
      /* props */ Props, 
      scala.Unit
    ]
  ] = js.native
  var didNotFindHydratableTextInstance: js.UndefOr[
    js.Function4[
      /* parentType */ Type, 
      /* parentProps */ Props, 
      /* parentInstance */ Instance, 
      /* text */ java.lang.String, 
      scala.Unit
    ]
  ] = js.native
  var didNotHydrateContainerInstance: js.UndefOr[
    js.Function2[/* parentContainer */ Container, /* instance */ Instance | TextInstance, scala.Unit]
  ] = js.native
  var didNotHydrateInstance: js.UndefOr[
    js.Function4[
      /* parentType */ Type, 
      /* parentProps */ Props, 
      /* parentInstance */ Instance, 
      /* instance */ Instance | TextInstance, 
      scala.Unit
    ]
  ] = js.native
  var didNotMatchHydratedContainerTextInstance: js.UndefOr[
    js.Function3[
      /* parentContainer */ Container, 
      /* textInstance */ TextInstance, 
      /* text */ java.lang.String, 
      scala.Unit
    ]
  ] = js.native
  var didNotMatchHydratedTextInstance: js.UndefOr[
    js.Function5[
      /* parentType */ Type, 
      /* parentProps */ Props, 
      /* parentInstance */ Instance, 
      /* textInstance */ TextInstance, 
      /* text */ java.lang.String, 
      scala.Unit
    ]
  ] = js.native
  var finalizeContainerChildren: js.UndefOr[js.Function2[/* container */ Container, /* newChildren */ ChildSet, scala.Unit]] = js.native
  var getFirstHydratableChild: js.UndefOr[
    js.Function1[/* parentInstance */ Instance | Container, scala.Null | HydratableInstance]
  ] = js.native
  var getNextHydratableSibling: js.UndefOr[
    js.Function1[
      /* instance */ Instance | TextInstance | HydratableInstance, 
      scala.Null | HydratableInstance
    ]
  ] = js.native
  var hydrateInstance: js.UndefOr[
    js.Function6[
      /* instance */ Instance, 
      /* type */ Type, 
      /* props */ Props, 
      /* rootContainerInstance */ Container, 
      /* hostContext */ HostContext, 
      /* internalInstanceHandle */ OpaqueHandle, 
      scala.Null | UpdatePayload
    ]
  ] = js.native
  var hydrateTextInstance: js.UndefOr[
    js.Function3[
      /* textInstance */ TextInstance, 
      /* text */ java.lang.String, 
      /* internalInstanceHandle */ OpaqueHandle, 
      scala.Boolean
    ]
  ] = js.native
  var insertBefore: js.UndefOr[
    js.Function3[
      /* parentInstance */ Instance, 
      /* child */ Instance | TextInstance, 
      /* beforeChild */ Instance | TextInstance, 
      scala.Unit
    ]
  ] = js.native
  var insertInContainerBefore: js.UndefOr[
    js.Function3[
      /* container */ Container, 
      /* child */ Instance | TextInstance, 
      /* beforeChild */ Instance | TextInstance, 
      scala.Unit
    ]
  ] = js.native
  // Temporary workaround for scenario where multiple renderers concurrently
  // render using the same context objects. E.g. React DOM and React ART on the
  // same page. DOM is the primary renderer; ART is the secondary renderer.
  var isPrimaryRenderer: scala.Boolean = js.native
  var noTimeout: NoTimeout = js.native
  var removeChild: js.UndefOr[
    js.Function2[/* parentInstance */ Instance, /* child */ Instance | TextInstance, scala.Unit]
  ] = js.native
  var removeChildFromContainer: js.UndefOr[
    js.Function2[/* container */ Container, /* child */ Instance | TextInstance, scala.Unit]
  ] = js.native
  var replaceContainerChildren: js.UndefOr[js.Function2[/* container */ Container, /* newChildren */ ChildSet, scala.Unit]] = js.native
  var resetTextContent: js.UndefOr[js.Function1[/* instance */ Instance, scala.Unit]] = js.native
  var supportsHydration: scala.Boolean = js.native
  var supportsMutation: scala.Boolean = js.native
  var supportsPersistence: scala.Boolean = js.native
  def appendInitialChild(parentInstance: Instance, child: Instance | TextInstance): scala.Unit = js.native
  def cancelDeferredCallback(callbackID: js.Any): scala.Unit = js.native
  def clearTimeout(handle: NoTimeout | TimeoutHandle): scala.Unit = js.native
  def createInstance(
    `type`: Type,
    props: Props,
    rootContainerInstance: Container,
    hostContext: HostContext,
    internalInstanceHandle: OpaqueHandle
  ): Instance = js.native
  def createTextInstance(
    text: java.lang.String,
    rootContainerInstance: Container,
    hostContext: HostContext,
    internalInstanceHandle: OpaqueHandle
  ): TextInstance = js.native
  def finalizeInitialChildren(
    parentInstance: Instance,
    `type`: Type,
    props: Props,
    rootContainerInstance: Container,
    hostContext: HostContext
  ): scala.Boolean = js.native
  def getChildHostContext(parentHostContext: HostContext, `type`: Type, rootContainerInstance: Container): HostContext = js.native
  def getPublicInstance(instance: Instance | TextInstance): PublicInstance = js.native
  def getRootHostContext(rootContainerInstance: Container): HostContext = js.native
  def now(): scala.Double = js.native
  def prepareForCommit(containerInfo: Container): scala.Unit = js.native
  def prepareUpdate(
    instance: Instance,
    `type`: Type,
    oldProps: Props,
    newProps: Props,
    rootContainerInstance: Container,
    hostContext: HostContext
  ): scala.Null | UpdatePayload = js.native
  def resetAfterCommit(containerInfo: Container): scala.Unit = js.native
  def scheduleDeferredCallback(callback: js.Function0[_]): js.Any = js.native
  def scheduleDeferredCallback(callback: js.Function0[_], options: reactDashReconcilerLib.Anon_Timeout): js.Any = js.native
  def setTimeout(handler: js.Function1[/* repeated */ js.Any, scala.Unit], timeout: scala.Double): TimeoutHandle | NoTimeout = js.native
  def shouldDeprioritizeSubtree(`type`: Type, props: Props): scala.Boolean = js.native
  def shouldSetTextContent(`type`: Type, props: Props): scala.Boolean = js.native
}

