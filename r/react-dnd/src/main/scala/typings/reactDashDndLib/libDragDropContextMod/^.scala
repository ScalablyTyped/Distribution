package typings
package reactDashDndLib.libDragDropContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/DragDropContext", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(Provider) */ val Consumer: reactLib.reactMod.ReactNs.ComponentType[
    reactLib.reactMod.ReactNs.ConsumerProps[reactDashDndLib.libDragDropContextMod.DragDropContext[js.Any]]
  ] = js.native
  val DragDropContextProvider: reactLib.reactMod.ReactNs.SFC[reactDashDndLib.libDragDropContextMod.DragDropContextProviderProps[js.Any]] = js.native
  def DragDropContext(backendFactory: dndDashCoreLib.libInterfacesMod.BackendFactory): js.Function1[
    /* DecoratedComponent */ (reactLib.reactMod.ReactNs.ComponentClass[_, _]) | reactLib.reactMod.ReactNs.StatelessComponent[_], 
    ((reactLib.reactMod.ReactNs.ComponentClass[_, _]) | reactLib.reactMod.ReactNs.StatelessComponent[_]) with reactDashDndLib.libInterfacesMod.ContextComponent[_]
  ] = js.native
  def DragDropContext(backendFactory: dndDashCoreLib.libInterfacesMod.BackendFactory, backendContext: js.Any): js.Function1[
    /* DecoratedComponent */ (reactLib.reactMod.ReactNs.ComponentClass[_, _]) | reactLib.reactMod.ReactNs.StatelessComponent[_], 
    ((reactLib.reactMod.ReactNs.ComponentClass[_, _]) | reactLib.reactMod.ReactNs.StatelessComponent[_]) with reactDashDndLib.libInterfacesMod.ContextComponent[_]
  ] = js.native
  def DragDropContext(
    backendFactory: dndDashCoreLib.libInterfacesMod.BackendFactory,
    backendContext: js.Any,
    debugMode: scala.Boolean
  ): js.Function1[
    /* DecoratedComponent */ (reactLib.reactMod.ReactNs.ComponentClass[_, _]) | reactLib.reactMod.ReactNs.StatelessComponent[_], 
    ((reactLib.reactMod.ReactNs.ComponentClass[_, _]) | reactLib.reactMod.ReactNs.StatelessComponent[_]) with reactDashDndLib.libInterfacesMod.ContextComponent[_]
  ] = js.native
  def createChildContext[BackendContext](backend: dndDashCoreLib.libInterfacesMod.BackendFactory): reactDashDndLib.Anon_DragDropManager[BackendContext] = js.native
  def createChildContext[BackendContext](backend: dndDashCoreLib.libInterfacesMod.BackendFactory, context: BackendContext): reactDashDndLib.Anon_DragDropManager[BackendContext] = js.native
  def createChildContext[BackendContext](
    backend: dndDashCoreLib.libInterfacesMod.BackendFactory,
    context: BackendContext,
    debugMode: scala.Boolean
  ): reactDashDndLib.Anon_DragDropManager[BackendContext] = js.native
}

