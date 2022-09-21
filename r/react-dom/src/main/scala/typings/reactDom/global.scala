package typings.reactDom

import typings.react.mod.CElement
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.ReactPortal
import typings.reactDom.mod.Renderer
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ReactDOM {
    
    @JSGlobal("ReactDOM")
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
    
    @JSGlobal("ReactDOM.hydrate")
    @js.native
    val hydrate: Renderer = js.native
    
    @JSGlobal("ReactDOM.render")
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
    
    @JSGlobal("ReactDOM.version")
    @js.native
    val version: String = js.native
  }
}
