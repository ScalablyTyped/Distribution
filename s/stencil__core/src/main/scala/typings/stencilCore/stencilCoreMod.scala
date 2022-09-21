package typings.stencilCore

import typings.std.Node
import typings.stencilCore.anon.Ael
import typings.stencilCore.stencilPublicRuntimeMod.ComponentDecorator
import typings.stencilCore.stencilPublicRuntimeMod.ElementDecorator
import typings.stencilCore.stencilPublicRuntimeMod.ErrorHandler
import typings.stencilCore.stencilPublicRuntimeMod.EventDecorator
import typings.stencilCore.stencilPublicRuntimeMod.FunctionalComponent
import typings.stencilCore.stencilPublicRuntimeMod.HTMLStencilElement
import typings.stencilCore.stencilPublicRuntimeMod.HostAttributes
import typings.stencilCore.stencilPublicRuntimeMod.ListenDecorator
import typings.stencilCore.stencilPublicRuntimeMod.MethodDecorator
import typings.stencilCore.stencilPublicRuntimeMod.PropDecorator
import typings.stencilCore.stencilPublicRuntimeMod.RafCallback
import typings.stencilCore.stencilPublicRuntimeMod.ResolutionHandler
import typings.stencilCore.stencilPublicRuntimeMod.StateDecorator
import typings.stencilCore.stencilPublicRuntimeMod.UserBuildConditionals
import typings.stencilCore.stencilPublicRuntimeMod.VNode
import typings.stencilCore.stencilPublicRuntimeMod.VNodeData
import typings.stencilCore.stencilPublicRuntimeMod.WatchDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stencilCoreMod {
  
  @JSImport("@stencil/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stencil/core", "Build")
  @js.native
  val Build: UserBuildConditionals = js.native
  
  @JSImport("@stencil/core", "Component")
  @js.native
  val Component: ComponentDecorator = js.native
  
  @JSImport("@stencil/core", "Element")
  @js.native
  val Element: ElementDecorator = js.native
  
  @JSImport("@stencil/core", "Event")
  @js.native
  val Event: EventDecorator = js.native
  
  @JSImport("@stencil/core", "Fragment")
  @js.native
  val Fragment: FunctionalComponent[js.Object] = js.native
  
  @JSImport("@stencil/core", "Host")
  @js.native
  val Host: FunctionalComponent[HostAttributes] = js.native
  
  @JSImport("@stencil/core", "Listen")
  @js.native
  val Listen: ListenDecorator = js.native
  
  @JSImport("@stencil/core", "Method")
  @js.native
  val Method: MethodDecorator = js.native
  
  @JSImport("@stencil/core", "Prop")
  @js.native
  val Prop: PropDecorator = js.native
  
  @JSImport("@stencil/core", "State")
  @js.native
  val State: StateDecorator = js.native
  
  @JSImport("@stencil/core", "Watch")
  @js.native
  val Watch: WatchDecorator = js.native
  
  inline def forceUpdate(ref: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceUpdate")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getAssetPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAssetPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getElement(ref: Any): HTMLStencilElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(ref.asInstanceOf[js.Any]).asInstanceOf[HTMLStencilElement]
  
  inline def getMode[T](ref: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getMode")(ref.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def getRenderingRef(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderingRef")().asInstanceOf[Any]
  
  object h {
    
    inline def apply(sel: Any): VNode = ^.asInstanceOf[js.Dynamic].apply(sel.asInstanceOf[js.Any]).asInstanceOf[VNode]
    inline def apply(sel: Any, children: js.Array[js.UndefOr[VNode | Null]]): VNode = (^.asInstanceOf[js.Dynamic].apply(sel.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def apply(sel: Any, data: Null, children: js.Array[js.UndefOr[VNode | Null]]): VNode = (^.asInstanceOf[js.Dynamic].apply(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def apply(sel: Any, data: Null, children: VNode): VNode = (^.asInstanceOf[js.Dynamic].apply(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def apply(sel: Any, data: Null, text: String): VNode = (^.asInstanceOf[js.Dynamic].apply(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def apply(sel: Any, data: VNodeData): VNode = (^.asInstanceOf[js.Dynamic].apply(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def apply(sel: Any, data: VNodeData, children: js.Array[js.UndefOr[VNode | Null]]): VNode = (^.asInstanceOf[js.Dynamic].apply(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def apply(sel: Any, data: VNodeData, children: VNode): VNode = (^.asInstanceOf[js.Dynamic].apply(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def apply(sel: Any, data: VNodeData, text: String): VNode = (^.asInstanceOf[js.Dynamic].apply(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def apply(sel: Any, text: String): VNode = (^.asInstanceOf[js.Dynamic].apply(sel.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def apply(sel: Node): VNode = ^.asInstanceOf[js.Dynamic].apply(sel.asInstanceOf[js.Any]).asInstanceOf[VNode]
    inline def apply(sel: Node, data: VNodeData): VNode = (^.asInstanceOf[js.Dynamic].apply(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[VNode]
    
    @JSImport("@stencil/core", "h")
    @js.native
    val ^ : js.Any = js.native
    inline def h(sel: Any): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any]).asInstanceOf[VNode]
    inline def h(sel: Any, children: js.Array[js.UndefOr[VNode | Null]]): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def h(sel: Any, data: Null, children: js.Array[js.UndefOr[VNode | Null]]): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def h(sel: Any, data: Null, children: VNode): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def h(sel: Any, data: Null, text: String): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def h(sel: Any, data: VNodeData): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def h(sel: Any, data: VNodeData, children: js.Array[js.UndefOr[VNode | Null]]): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def h(sel: Any, data: VNodeData, children: VNode): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def h(sel: Any, data: VNodeData, text: String): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def h(sel: Any, text: String): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[VNode]
    inline def h(sel: Node): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any]).asInstanceOf[VNode]
    inline def h(sel: Node, data: VNodeData): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[VNode]
  }
  
  inline def readTask(task: RafCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("readTask")(task.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setAssetPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("setAssetPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setErrorHandler(handler: ErrorHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setErrorHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setMode(handler: ResolutionHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMode")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setPlatformHelpers(helpers: Ael): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPlatformHelpers")(helpers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def writeTask(task: RafCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("writeTask")(task.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
