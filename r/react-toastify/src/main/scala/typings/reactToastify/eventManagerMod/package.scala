package typings.reactToastify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventManagerMod {
  type Callback = typings.reactToastify.eventManagerMod.OnShowCallback | typings.reactToastify.eventManagerMod.OnClearCallback | typings.reactToastify.eventManagerMod.OnClearWaitingQueue | typings.reactToastify.eventManagerMod.OnDidMountCallback | typings.reactToastify.eventManagerMod.OnWillUnmountCallback | typings.reactToastify.eventManagerMod.OnChangeCallback
  type OnChangeCallback = js.Function2[
    /* toast */ scala.Double, 
    /* containerId */ js.UndefOr[scala.Double | java.lang.String], 
    scala.Unit
  ]
  type OnClearCallback = js.Function1[/* id */ js.UndefOr[typings.reactToastify.typesMod.Id], scala.Unit]
  type OnClearWaitingQueue = js.Function1[/* params */ typings.reactToastify.typesMod.ClearWaitingQueueParams, scala.Unit]
  type OnDidMountCallback = js.Function1[
    /* containerInstance */ typings.reactToastify.useToastContainerMod.ContainerInstance, 
    scala.Unit
  ]
  type OnShowCallback = js.Function2[
    /* content */ typings.reactToastify.typesMod.ToastContent, 
    /* options */ typings.reactToastify.typesMod.NotValidatedToastProps, 
    scala.Unit
  ]
  type OnWillUnmountCallback = typings.reactToastify.eventManagerMod.OnDidMountCallback
  type TimeoutId = typings.std.ReturnType[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.setTimeout */ js.Any
  ]
}
