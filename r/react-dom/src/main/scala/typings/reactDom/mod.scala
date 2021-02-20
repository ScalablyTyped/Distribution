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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dom", "createPortal")
  @js.native
  def createPortal(children: ReactNode, container: Element): ReactPortal = js.native
  @JSImport("react-dom", "createPortal")
  @js.native
  def createPortal(children: ReactNode, container: Element, key: String): ReactPortal = js.native
  
  @JSImport("react-dom", "findDOMNode")
  @js.native
  def findDOMNode(): Element | Null | Text = js.native
  @JSImport("react-dom", "findDOMNode")
  @js.native
  def findDOMNode(instance: ReactInstance): Element | Null | Text = js.native
  
  @JSImport("react-dom", "hydrate")
  @js.native
  val hydrate: Renderer = js.native
  
  @JSImport("react-dom", "render")
  @js.native
  val render: Renderer = js.native
  
  @JSImport("react-dom", "unmountComponentAtNode")
  @js.native
  def unmountComponentAtNode(container: DocumentFragment): Boolean = js.native
  @JSImport("react-dom", "unmountComponentAtNode")
  @js.native
  def unmountComponentAtNode(container: Element): Boolean = js.native
  
  @JSImport("react-dom", "unstable_batchedUpdates")
  @js.native
  def unstableBatchedUpdates(callback: js.Function0[_]): Unit = js.native
  @JSImport("react-dom", "unstable_batchedUpdates")
  @js.native
  def unstableBatchedUpdates[A](callback: js.Function1[/* a */ A, _], a: A): Unit = js.native
  @JSImport("react-dom", "unstable_batchedUpdates")
  @js.native
  def unstableBatchedUpdates[A, B](callback: js.Function2[/* a */ A, /* b */ B, _], a: A, b: B): Unit = js.native
  
  @JSImport("react-dom", "unstable_renderSubtreeIntoContainer")
  @js.native
  def unstableRenderSubtreeIntoContainer[T /* <: Element */](
    parentComponent: Component[_, js.Object, _],
    element: DOMElement[DOMAttributes[T], T],
    container: Element
  ): T = js.native
  @JSImport("react-dom", "unstable_renderSubtreeIntoContainer")
  @js.native
  def unstableRenderSubtreeIntoContainer[T /* <: Element */](
    parentComponent: Component[_, js.Object, _],
    element: DOMElement[DOMAttributes[T], T],
    container: Element,
    callback: js.Function1[/* element */ T, _]
  ): T = js.native
  @JSImport("react-dom", "unstable_renderSubtreeIntoContainer")
  @js.native
  def unstableRenderSubtreeIntoContainer[P](parentComponent: Component[_, js.Object, _], element: ReactElement, container: Element): (Component[P, ComponentState, _]) | Element | Unit = js.native
  @JSImport("react-dom", "unstable_renderSubtreeIntoContainer")
  @js.native
  def unstableRenderSubtreeIntoContainer[P](
    parentComponent: Component[_, js.Object, _],
    element: ReactElement,
    container: Element,
    callback: js.Function1[/* component */ js.UndefOr[(Component[P, ComponentState, _]) | Element], _]
  ): (Component[P, ComponentState, _]) | Element | Unit = js.native
  @JSImport("react-dom", "unstable_renderSubtreeIntoContainer")
  @js.native
  def unstableRenderSubtreeIntoContainer[P, T /* <: Component[P, ComponentState, _] */](parentComponent: Component[_, js.Object, _], element: CElement[P, T], container: Element): T = js.native
  @JSImport("react-dom", "unstable_renderSubtreeIntoContainer")
  @js.native
  def unstableRenderSubtreeIntoContainer[P, T /* <: Component[P, ComponentState, _] */](
    parentComponent: Component[_, js.Object, _],
    element: CElement[P, T],
    container: Element,
    callback: js.Function1[/* component */ T, _]
  ): T = js.native
  
  @JSImport("react-dom", "version")
  @js.native
  val version: String = js.native
  
  // enableSuspenseServerRenderer feature
  @js.native
  trait HydrationOptions extends StObject {
    
    var onDeleted: js.UndefOr[js.Function1[/* suspenseInstance */ Comment, Unit]] = js.native
    
    var onHydrated: js.UndefOr[js.Function1[/* suspenseInstance */ Comment, Unit]] = js.native
  }
  object HydrationOptions {
    
    @scala.inline
    def apply(): HydrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HydrationOptions]
    }
    
    @scala.inline
    implicit class HydrationOptionsMutableBuilder[Self <: HydrationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnDeleted(value: /* suspenseInstance */ Comment => Unit): Self = StObject.set(x, "onDeleted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDeletedUndefined: Self = StObject.set(x, "onDeleted", js.undefined)
      
      @scala.inline
      def setOnHydrated(value: /* suspenseInstance */ Comment => Unit): Self = StObject.set(x, "onHydrated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHydratedUndefined: Self = StObject.set(x, "onHydrated", js.undefined)
    }
  }
  
  @js.native
  trait Renderer extends StObject {
    
    def apply(element: js.Array[CElement[_, Component[_, ComponentState, _]]]): Component[_, ComponentState, _] = js.native
    def apply(
      element: js.Array[CElement[_, Component[_, ComponentState, _]]],
      container: Null,
      callback: js.Function0[Unit]
    ): Component[_, ComponentState, _] = js.native
    def apply(element: js.Array[CElement[_, Component[_, ComponentState, _]]], container: DocumentFragment): Component[_, ComponentState, _] = js.native
    def apply(
      element: js.Array[CElement[_, Component[_, ComponentState, _]]],
      container: DocumentFragment,
      callback: js.Function0[Unit]
    ): Component[_, ComponentState, _] = js.native
    def apply(element: js.Array[CElement[_, Component[_, ComponentState, _]]], container: Element): Component[_, ComponentState, _] = js.native
    def apply(
      element: js.Array[CElement[_, Component[_, ComponentState, _]]],
      container: Element,
      callback: js.Function0[Unit]
    ): Component[_, ComponentState, _] = js.native
    def apply(element: SFCElement[_]): Unit = js.native
    def apply(element: SFCElement[_], container: Null, callback: js.Function0[Unit]): Unit = js.native
    def apply(element: SFCElement[_], container: DocumentFragment): Unit = js.native
    def apply(element: SFCElement[_], container: DocumentFragment, callback: js.Function0[Unit]): Unit = js.native
    def apply(element: SFCElement[_], container: Element): Unit = js.native
    def apply(element: SFCElement[_], container: Element, callback: js.Function0[Unit]): Unit = js.native
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
    def apply[P](element: ReactElement): (Component[P, ComponentState, _]) | Element | Unit = js.native
    def apply[P](element: ReactElement, container: Null, callback: js.Function0[Unit]): (Component[P, ComponentState, _]) | Element | Unit = js.native
    def apply[P](element: ReactElement, container: DocumentFragment): (Component[P, ComponentState, _]) | Element | Unit = js.native
    def apply[P](element: ReactElement, container: DocumentFragment, callback: js.Function0[Unit]): (Component[P, ComponentState, _]) | Element | Unit = js.native
    def apply[P](element: ReactElement, container: Element): (Component[P, ComponentState, _]) | Element | Unit = js.native
    def apply[P](element: ReactElement, container: Element, callback: js.Function0[Unit]): (Component[P, ComponentState, _]) | Element | Unit = js.native
    def apply[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T]): T = js.native
    def apply[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], container: Null, callback: js.Function0[Unit]): T = js.native
    def apply[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], container: DocumentFragment): T = js.native
    def apply[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], container: DocumentFragment, callback: js.Function0[Unit]): T = js.native
    def apply[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], container: Element): T = js.native
    def apply[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], container: Element, callback: js.Function0[Unit]): T = js.native
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
  @js.native
  trait RootOptions extends StObject {
    
    var hydrate: js.UndefOr[Boolean] = js.native
    
    var hydrationOptions: js.UndefOr[typings.reactDom.experimentalMod.reactDomAugmentingMod.HydrationOptions] = js.native
  }
  object RootOptions {
    
    @scala.inline
    def apply(): RootOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootOptions]
    }
    
    @scala.inline
    implicit class RootOptionsMutableBuilder[Self <: RootOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHydrate(value: Boolean): Self = StObject.set(x, "hydrate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHydrateUndefined: Self = StObject.set(x, "hydrate", js.undefined)
      
      @scala.inline
      def setHydrationOptions(value: typings.reactDom.experimentalMod.reactDomAugmentingMod.HydrationOptions): Self = StObject.set(x, "hydrationOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHydrationOptionsUndefined: Self = StObject.set(x, "hydrationOptions", js.undefined)
    }
  }
}
