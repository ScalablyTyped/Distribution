package typings.reactDom

import typings.react.mod.CElement
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.ReactChild
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactPortal
import typings.react.mod.SFCElement
import typings.std.Comment
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
  
  inline def createPortal(children: ReactNode, container: Element): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
  inline def createPortal(children: ReactNode, container: Element, key: String): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
  
  inline def findDOMNode(): Element | Null | Text = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNode")().asInstanceOf[Element | Null | Text]
  inline def findDOMNode(instance: ReactInstance): Element | Null | Text = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNode")(instance.asInstanceOf[js.Any]).asInstanceOf[Element | Null | Text]
  
  @JSImport("react-dom", "hydrate")
  @js.native
  val hydrate: Renderer = js.native
  
  @JSImport("react-dom", "render")
  @js.native
  val render: Renderer = js.native
  
  inline def unmountComponentAtNode(container: DocumentFragment): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def unmountComponentAtNode(container: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def unstableBatchedUpdates(callback: js.Function0[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unstableBatchedUpdates[A](callback: js.Function1[/* a */ A, js.Any], a: A): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unstableBatchedUpdates[A, B](callback: js.Function2[/* a */ A, /* b */ B, js.Any], a: A, b: B): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unstableRenderSubtreeIntoContainer[T /* <: Element */](
    parentComponent: Component[js.Any, js.Object, js.Any],
    element: DOMElement[DOMAttributes[T], T],
    container: Element
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def unstableRenderSubtreeIntoContainer[T /* <: Element */](
    parentComponent: Component[js.Any, js.Object, js.Any],
    element: DOMElement[DOMAttributes[T], T],
    container: Element,
    callback: js.Function1[/* element */ T, js.Any]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def unstableRenderSubtreeIntoContainer[P](parentComponent: Component[js.Any, js.Object, js.Any], element: ReactElement, container: Element): (Component[P, ComponentState, js.Any]) | Element | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[(Component[P, ComponentState, js.Any]) | Element | Unit]
  inline def unstableRenderSubtreeIntoContainer[P](
    parentComponent: Component[js.Any, js.Object, js.Any],
    element: ReactElement,
    container: Element,
    callback: js.Function1[
      /* component */ js.UndefOr[(Component[P, ComponentState, js.Any]) | Element], 
      js.Any
    ]
  ): (Component[P, ComponentState, js.Any]) | Element | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[(Component[P, ComponentState, js.Any]) | Element | Unit]
  inline def unstableRenderSubtreeIntoContainer[P, T /* <: Component[P, ComponentState, js.Any] */](parentComponent: Component[js.Any, js.Object, js.Any], element: CElement[P, T], container: Element): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def unstableRenderSubtreeIntoContainer[P, T /* <: Component[P, ComponentState, js.Any] */](
    parentComponent: Component[js.Any, js.Object, js.Any],
    element: CElement[P, T],
    container: Element,
    callback: js.Function1[/* component */ T, js.Any]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("react-dom", "version")
  @js.native
  val version: String = js.native
  
  // enableSuspenseServerRenderer feature
  trait HydrationOptions extends StObject {
    
    var onDeleted: js.UndefOr[js.Function1[/* suspenseInstance */ Comment, Unit]] = js.undefined
    
    var onHydrated: js.UndefOr[js.Function1[/* suspenseInstance */ Comment, Unit]] = js.undefined
  }
  object HydrationOptions {
    
    inline def apply(): HydrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HydrationOptions]
    }
    
    extension [Self <: HydrationOptions](x: Self) {
      
      inline def setOnDeleted(value: /* suspenseInstance */ Comment => Unit): Self = StObject.set(x, "onDeleted", js.Any.fromFunction1(value))
      
      inline def setOnDeletedUndefined: Self = StObject.set(x, "onDeleted", js.undefined)
      
      inline def setOnHydrated(value: /* suspenseInstance */ Comment => Unit): Self = StObject.set(x, "onHydrated", js.Any.fromFunction1(value))
      
      inline def setOnHydratedUndefined: Self = StObject.set(x, "onHydrated", js.undefined)
    }
  }
  
  @js.native
  trait Renderer extends StObject {
    
    def apply(element: js.Array[CElement[js.Any, Component[js.Any, ComponentState, js.Any]]]): Component[js.Any, ComponentState, js.Any] = js.native
    def apply(
      element: js.Array[CElement[js.Any, Component[js.Any, ComponentState, js.Any]]],
      container: Null,
      callback: js.Function0[Unit]
    ): Component[js.Any, ComponentState, js.Any] = js.native
    def apply(
      element: js.Array[CElement[js.Any, Component[js.Any, ComponentState, js.Any]]],
      container: DocumentFragment
    ): Component[js.Any, ComponentState, js.Any] = js.native
    def apply(
      element: js.Array[CElement[js.Any, Component[js.Any, ComponentState, js.Any]]],
      container: DocumentFragment,
      callback: js.Function0[Unit]
    ): Component[js.Any, ComponentState, js.Any] = js.native
    def apply(element: js.Array[CElement[js.Any, Component[js.Any, ComponentState, js.Any]]], container: Element): Component[js.Any, ComponentState, js.Any] = js.native
    def apply(
      element: js.Array[CElement[js.Any, Component[js.Any, ComponentState, js.Any]]],
      container: Element,
      callback: js.Function0[Unit]
    ): Component[js.Any, ComponentState, js.Any] = js.native
    def apply(element: SFCElement[js.Any]): Unit = js.native
    def apply(element: SFCElement[js.Any], container: Null, callback: js.Function0[Unit]): Unit = js.native
    def apply(element: SFCElement[js.Any], container: DocumentFragment): Unit = js.native
    def apply(element: SFCElement[js.Any], container: DocumentFragment, callback: js.Function0[Unit]): Unit = js.native
    def apply(element: SFCElement[js.Any], container: Element): Unit = js.native
    def apply(element: SFCElement[js.Any], container: Element, callback: js.Function0[Unit]): Unit = js.native
    // Deprecated(render): The return value is deprecated.
    // In future releases the render function's return type will be void.
    def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T]): T = js.native
    def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Null, callback: js.Function0[Unit]): T = js.native
    def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: DocumentFragment): T = js.native
    def apply[T /* <: Element */](
      element: DOMElement[DOMAttributes[T], T],
      container: DocumentFragment,
      callback: js.Function0[Unit]
    ): T = js.native
    def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Element): T = js.native
    def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Element, callback: js.Function0[Unit]): T = js.native
    def apply[P](element: ReactElement): (Component[P, ComponentState, js.Any]) | Element | Unit = js.native
    def apply[P](element: ReactElement, container: Null, callback: js.Function0[Unit]): (Component[P, ComponentState, js.Any]) | Element | Unit = js.native
    def apply[P](element: ReactElement, container: DocumentFragment): (Component[P, ComponentState, js.Any]) | Element | Unit = js.native
    def apply[P](element: ReactElement, container: DocumentFragment, callback: js.Function0[Unit]): (Component[P, ComponentState, js.Any]) | Element | Unit = js.native
    def apply[P](element: ReactElement, container: Element): (Component[P, ComponentState, js.Any]) | Element | Unit = js.native
    def apply[P](element: ReactElement, container: Element, callback: js.Function0[Unit]): (Component[P, ComponentState, js.Any]) | Element | Unit = js.native
    def apply[P, T /* <: Component[P, ComponentState, js.Any] */](element: CElement[P, T]): T = js.native
    def apply[P, T /* <: Component[P, ComponentState, js.Any] */](element: CElement[P, T], container: Null, callback: js.Function0[Unit]): T = js.native
    def apply[P, T /* <: Component[P, ComponentState, js.Any] */](element: CElement[P, T], container: DocumentFragment): T = js.native
    def apply[P, T /* <: Component[P, ComponentState, js.Any] */](element: CElement[P, T], container: DocumentFragment, callback: js.Function0[Unit]): T = js.native
    def apply[P, T /* <: Component[P, ComponentState, js.Any] */](element: CElement[P, T], container: Element): T = js.native
    def apply[P, T /* <: Component[P, ComponentState, js.Any] */](element: CElement[P, T], container: Element, callback: js.Function0[Unit]): T = js.native
  }
  
  @js.native
  trait Root extends StObject {
    
    def render(children: ReactChild): Unit = js.native
    def render(children: ReactChild, callback: js.Function0[Unit]): Unit = js.native
    def render(children: ReactNodeArray): Unit = js.native
    def render(children: ReactNodeArray, callback: js.Function0[Unit]): Unit = js.native
    
    def unmount(): Unit = js.native
    def unmount(callback: js.Function0[Unit]): Unit = js.native
  }
  
  // exposeConcurrentModeAPIs features
  trait RootOptions extends StObject {
    
    var hydrate: js.UndefOr[Boolean] = js.undefined
    
    var hydrationOptions: js.UndefOr[typings.reactDom.experimentalMod.reactDomAugmentingMod.HydrationOptions] = js.undefined
  }
  object RootOptions {
    
    inline def apply(): RootOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootOptions]
    }
    
    extension [Self <: RootOptions](x: Self) {
      
      inline def setHydrate(value: Boolean): Self = StObject.set(x, "hydrate", value.asInstanceOf[js.Any])
      
      inline def setHydrateUndefined: Self = StObject.set(x, "hydrate", js.undefined)
      
      inline def setHydrationOptions(value: typings.reactDom.experimentalMod.reactDomAugmentingMod.HydrationOptions): Self = StObject.set(x, "hydrationOptions", value.asInstanceOf[js.Any])
      
      inline def setHydrationOptionsUndefined: Self = StObject.set(x, "hydrationOptions", js.undefined)
    }
  }
}
