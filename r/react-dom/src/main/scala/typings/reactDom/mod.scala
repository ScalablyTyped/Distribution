package typings.reactDom

import typings.react.mod.CElement
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.FunctionComponentElement
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.ReactPortal
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPortal(children: ReactNode, container: DocumentFragment): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
  inline def createPortal(children: ReactNode, container: DocumentFragment, key: String): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
  inline def createPortal(children: ReactNode, container: Element): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
  inline def createPortal(children: ReactNode, container: Element, key: String): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
  
  inline def findDOMNode(): Element | Null | Text = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNode")().asInstanceOf[Element | Null | Text]
  inline def findDOMNode(instance: ReactInstance): Element | Null | Text = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNode")(instance.asInstanceOf[js.Any]).asInstanceOf[Element | Null | Text]
  
  inline def flushSync[R](fn: js.Function0[R]): R = ^.asInstanceOf[js.Dynamic].applyDynamic("flushSync")(fn.asInstanceOf[js.Any]).asInstanceOf[R]
  inline def flushSync[A, R](fn: js.Function1[/* a */ A, R], a: A): R = (^.asInstanceOf[js.Dynamic].applyDynamic("flushSync")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[R]
  
  @JSImport("react-dom", "hydrate")
  @js.native
  val hydrate: Renderer = js.native
  
  @JSImport("react-dom", "render")
  @js.native
  val render: Renderer = js.native
  
  inline def unmountComponentAtNode(container: DocumentFragment): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def unmountComponentAtNode(container: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def unstableBatchedUpdates(callback: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unstableBatchedUpdates[A](callback: js.Function1[/* a */ A, Any], a: A): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unstableBatchedUpdates[A, B](callback: js.Function2[/* a */ A, /* b */ B, Any], a: A, b: B): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unstableRenderSubtreeIntoContainer[T /* <: Element */](
    parentComponent: Component[Any, js.Object, Any],
    element: DOMElement[DOMAttributes[T], T],
    container: Element
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def unstableRenderSubtreeIntoContainer[T /* <: Element */](
    parentComponent: Component[Any, js.Object, Any],
    element: DOMElement[DOMAttributes[T], T],
    container: Element,
    callback: js.Function1[/* element */ T, Any]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def unstableRenderSubtreeIntoContainer[P](parentComponent: Component[Any, js.Object, Any], element: ReactElement, container: Element): (Component[P, ComponentState, Any]) | Element | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[(Component[P, ComponentState, Any]) | Element | Unit]
  inline def unstableRenderSubtreeIntoContainer[P](
    parentComponent: Component[Any, js.Object, Any],
    element: ReactElement,
    container: Element,
    callback: js.Function1[/* component */ js.UndefOr[(Component[P, ComponentState, Any]) | Element], Any]
  ): (Component[P, ComponentState, Any]) | Element | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[(Component[P, ComponentState, Any]) | Element | Unit]
  inline def unstableRenderSubtreeIntoContainer[P, T /* <: Component[P, ComponentState, Any] */](parentComponent: Component[Any, js.Object, Any], element: CElement[P, T], container: Element): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def unstableRenderSubtreeIntoContainer[P, T /* <: Component[P, ComponentState, Any] */](
    parentComponent: Component[Any, js.Object, Any],
    element: CElement[P, T],
    container: Element,
    callback: js.Function1[/* component */ T, Any]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("react-dom", "version")
  @js.native
  val version: String = js.native
  
  type Container = Element | Document | DocumentFragment
  
  object PreinitAs {
    
    inline def script: "script" = "script".asInstanceOf["script"]
    
    inline def style: "style" = "style".asInstanceOf["style"]
  }
  type PreinitAs = "script" | "style"
  
  trait PreinitOptions extends StObject {
    
    var as: typings.reactDom.nextMod.reactDomAugmentingMod.PreinitAs
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var integrity: js.UndefOr[String] = js.undefined
    
    var precedence: js.UndefOr[String] = js.undefined
  }
  object PreinitOptions {
    
    inline def apply(as: typings.reactDom.nextMod.reactDomAugmentingMod.PreinitAs): PreinitOptions = {
      val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreinitOptions]
    }
    
    extension [Self <: PreinitOptions](x: Self) {
      
      inline def setAs(value: typings.reactDom.nextMod.reactDomAugmentingMod.PreinitAs): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setPrecedence(value: String): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
      
      inline def setPrecedenceUndefined: Self = StObject.set(x, "precedence", js.undefined)
    }
  }
  
  object PreloadAs {
    
    inline def font: "font" = "font".asInstanceOf["font"]
    
    inline def script: "script" = "script".asInstanceOf["script"]
    
    inline def style: "style" = "style".asInstanceOf["style"]
  }
  type PreloadAs = "font" | "script" | "style"
  
  trait PreloadOptions extends StObject {
    
    var as: typings.reactDom.nextMod.reactDomAugmentingMod.PreloadAs
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var integrity: js.UndefOr[String] = js.undefined
  }
  object PreloadOptions {
    
    inline def apply(as: typings.reactDom.nextMod.reactDomAugmentingMod.PreloadAs): PreloadOptions = {
      val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreloadOptions]
    }
    
    extension [Self <: PreloadOptions](x: Self) {
      
      inline def setAs(value: typings.reactDom.nextMod.reactDomAugmentingMod.PreloadAs): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    }
  }
  
  @js.native
  trait Renderer extends StObject {
    
    def apply(element: js.Array[CElement[Any, Component[Any, ComponentState, Any]]]): Component[Any, ComponentState, Any] = js.native
    def apply(
      element: js.Array[CElement[Any, Component[Any, ComponentState, Any]]],
      container: Null,
      callback: js.Function0[Unit]
    ): Component[Any, ComponentState, Any] = js.native
    def apply(element: js.Array[CElement[Any, Component[Any, ComponentState, Any]]], container: Container): Component[Any, ComponentState, Any] = js.native
    def apply(
      element: js.Array[CElement[Any, Component[Any, ComponentState, Any]]],
      container: Container,
      callback: js.Function0[Unit]
    ): Component[Any, ComponentState, Any] = js.native
    def apply(element: FunctionComponentElement[Any]): Unit = js.native
    def apply(element: FunctionComponentElement[Any], container: Null, callback: js.Function0[Unit]): Unit = js.native
    def apply(element: FunctionComponentElement[Any], container: Container): Unit = js.native
    def apply(element: FunctionComponentElement[Any], container: Container, callback: js.Function0[Unit]): Unit = js.native
    // Deprecated(render): The return value is deprecated.
    // In future releases the render function's return type will be void.
    def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T]): T = js.native
    def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Null, callback: js.Function0[Unit]): T = js.native
    def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Container): T = js.native
    def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Container, callback: js.Function0[Unit]): T = js.native
    def apply[P](element: ReactElement): (Component[P, ComponentState, Any]) | Element | Unit = js.native
    def apply[P](element: ReactElement, container: Null, callback: js.Function0[Unit]): (Component[P, ComponentState, Any]) | Element | Unit = js.native
    def apply[P](element: ReactElement, container: Container): (Component[P, ComponentState, Any]) | Element | Unit = js.native
    def apply[P](element: ReactElement, container: Container, callback: js.Function0[Unit]): (Component[P, ComponentState, Any]) | Element | Unit = js.native
    def apply[P, T /* <: Component[P, ComponentState, Any] */](element: CElement[P, T]): T = js.native
    def apply[P, T /* <: Component[P, ComponentState, Any] */](element: CElement[P, T], container: Null, callback: js.Function0[Unit]): T = js.native
    def apply[P, T /* <: Component[P, ComponentState, Any] */](element: CElement[P, T], container: Container): T = js.native
    def apply[P, T /* <: Component[P, ComponentState, Any] */](element: CElement[P, T], container: Container, callback: js.Function0[Unit]): T = js.native
  }
}
