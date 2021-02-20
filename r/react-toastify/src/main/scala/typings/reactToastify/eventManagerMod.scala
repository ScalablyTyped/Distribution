package typings.reactToastify

import typings.react.mod.ReactNode
import typings.reactToastify.reactToastifyNumbers.`0`
import typings.reactToastify.reactToastifyNumbers.`1`
import typings.reactToastify.reactToastifyNumbers.`2`
import typings.reactToastify.reactToastifyNumbers.`3`
import typings.reactToastify.reactToastifyNumbers.`4`
import typings.reactToastify.reactToastifyNumbers.`5`
import typings.reactToastify.typesMod.ClearWaitingQueueParams
import typings.reactToastify.typesMod.Id
import typings.reactToastify.typesMod.NotValidatedToastProps
import typings.reactToastify.typesMod.ToastContent
import typings.reactToastify.useToastContainerMod.ContainerInstance
import typings.std.Map
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventManagerMod {
  
  @JSImport("react-toastify/dist/core/eventManager", "eventManager")
  @js.native
  val eventManager: EventManager_ = js.native
  
  type Callback = OnShowCallback | OnClearCallback | OnClearWaitingQueue | OnDidMountCallback | OnWillUnmountCallback | OnChangeCallback
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactToastify.reactToastifyNumbers.`0`
    - typings.reactToastify.reactToastifyNumbers.`1`
    - typings.reactToastify.reactToastifyNumbers.`2`
    - typings.reactToastify.reactToastifyNumbers.`3`
    - typings.reactToastify.reactToastifyNumbers.`4`
    - typings.reactToastify.reactToastifyNumbers.`5`
  */
  trait Event extends StObject
  object Event {
    
    @scala.inline
    def Change: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def Clear: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def ClearWaitingQueue: `5` = 5.asInstanceOf[`5`]
    
    @scala.inline
    def DidMount: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def Show: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def WillUnmount: `3` = 3.asInstanceOf[`3`]
  }
  
  @js.native
  trait EventManager_ extends StObject {
    
    def cancelEmit(event: Event): EventManager_ = js.native
    
    var emitQueue: Map[Event, js.Array[TimeoutId]] = js.native
    
    @JSName("emit")
    def emit_0(event: `0`, content: ReactNode, options: NotValidatedToastProps): Unit = js.native
    @JSName("emit")
    def emit_1(event: `1`): Unit = js.native
    @JSName("emit")
    def emit_1(event: `1`, id: String): Unit = js.native
    @JSName("emit")
    def emit_1(event: `1`, id: Double): Unit = js.native
    @JSName("emit")
    def emit_2(event: `2`, containerInstance: ContainerInstance): Unit = js.native
    @JSName("emit")
    def emit_3(event: `3`, containerInstance: ContainerInstance): Unit = js.native
    @JSName("emit")
    def emit_4(event: `4`, toast: Double): Unit = js.native
    @JSName("emit")
    def emit_4(event: `4`, toast: Double, containerId: String): Unit = js.native
    @JSName("emit")
    def emit_4(event: `4`, toast: Double, containerId: Double): Unit = js.native
    @JSName("emit")
    def emit_5(event: `5`, params: ClearWaitingQueueParams): Unit = js.native
    
    var list: Map[Event, js.Array[Callback]] = js.native
    
    def off(event: Event): EventManager_ = js.native
    def off(event: Event, callback: Callback): EventManager_ = js.native
    
    @JSName("on")
    def on_0(event: `0`, callback: OnShowCallback): EventManager_ = js.native
    @JSName("on")
    def on_1(event: `1`, callback: OnClearCallback): EventManager_ = js.native
    @JSName("on")
    def on_2(event: `2`, callback: OnDidMountCallback): EventManager_ = js.native
    @JSName("on")
    def on_3(event: `3`, callback: OnWillUnmountCallback): EventManager_ = js.native
    @JSName("on")
    def on_4(event: `4`, callback: OnChangeCallback): EventManager_ = js.native
    @JSName("on")
    def on_5(event: `5`, callback: OnClearWaitingQueue): EventManager_ = js.native
  }
  
  type OnChangeCallback = js.Function2[/* toast */ Double, /* containerId */ js.UndefOr[Double | String], Unit]
  
  type OnClearCallback = js.Function1[/* id */ js.UndefOr[Id], Unit]
  
  type OnClearWaitingQueue = js.Function1[/* params */ ClearWaitingQueueParams, Unit]
  
  type OnDidMountCallback = js.Function1[/* containerInstance */ ContainerInstance, Unit]
  
  type OnShowCallback = js.Function2[/* content */ ToastContent, /* options */ NotValidatedToastProps, Unit]
  
  type OnWillUnmountCallback = OnDidMountCallback
  
  type TimeoutId = ReturnType[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.setTimeout */ js.Any
  ]
}
