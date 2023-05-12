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
import typings.reactDom.reactDomBooleans.`false`
import typings.reactDom.reactDomBooleans.`true`
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.FormData
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
  
  inline def unstableBatchedUpdates[R](callback: js.Function0[R]): R = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any]).asInstanceOf[R]
  inline def unstableBatchedUpdates[A, R](callback: js.Function1[/* a */ A, R], a: A): R = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[R]
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDom.experimentalMod.reactDomAugmentingMod.FormStatusPending
    - typings.reactDom.experimentalMod.reactDomAugmentingMod.FormStatusNotPending
  */
  trait FormStatus extends StObject
  object FormStatus {
    
    inline def FormStatusNotPending(action: Null, data: Null, method: Null): typings.reactDom.experimentalMod.reactDomAugmentingMod.FormStatusNotPending = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pending = false)
      __obj.asInstanceOf[typings.reactDom.experimentalMod.reactDomAugmentingMod.FormStatusNotPending]
    }
    
    inline def FormStatusPending(
      action: String | (js.Function1[/* formData */ FormData, Unit | js.Promise[Unit]]),
      data: FormData,
      method: String
    ): typings.reactDom.experimentalMod.reactDomAugmentingMod.FormStatusPending = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pending = true)
      __obj.asInstanceOf[typings.reactDom.experimentalMod.reactDomAugmentingMod.FormStatusPending]
    }
  }
  
  trait FormStatusNotPending extends StObject {
    
    var action: Null
    
    var data: Null
    
    var method: Null
    
    var pending: `false`
  }
  object FormStatusNotPending {
    
    inline def apply(action: Null, data: Null, method: Null): FormStatusNotPending = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pending = false)
      __obj.asInstanceOf[FormStatusNotPending]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormStatusNotPending] (val x: Self) extends AnyVal {
      
      inline def setAction(value: Null): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setData(value: Null): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: Null): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPending(value: `false`): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormStatusPending extends StObject {
    
    var action: String | (js.Function1[/* formData */ FormData, Unit | js.Promise[Unit]])
    
    var data: FormData
    
    var method: String
    
    var pending: `true`
  }
  object FormStatusPending {
    
    inline def apply(
      action: String | (js.Function1[/* formData */ FormData, Unit | js.Promise[Unit]]),
      data: FormData,
      method: String
    ): FormStatusPending = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pending = true)
      __obj.asInstanceOf[FormStatusPending]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormStatusPending] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String | (js.Function1[/* formData */ FormData, Unit | js.Promise[Unit]])): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionFunction1(value: /* formData */ FormData => Unit | js.Promise[Unit]): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setData(value: FormData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPending(value: `true`): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDom.reactDomStrings.script
    - typings.reactDom.reactDomStrings.style
  */
  trait PreinitAs extends StObject
  object PreinitAs {
    
    inline def script: typings.reactDom.reactDomStrings.script = "script".asInstanceOf[typings.reactDom.reactDomStrings.script]
    
    inline def style: typings.reactDom.reactDomStrings.style = "style".asInstanceOf[typings.reactDom.reactDomStrings.style]
  }
  
  trait PreinitOptions extends StObject {
    
    var as: typings.reactDom.nextMod.reactDomAugmentingMod.PreinitAs
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var integrity: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var precedence: js.UndefOr[String] = js.undefined
  }
  object PreinitOptions {
    
    inline def apply(as: typings.reactDom.nextMod.reactDomAugmentingMod.PreinitAs): PreinitOptions = {
      val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreinitOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreinitOptions] (val x: Self) extends AnyVal {
      
      inline def setAs(value: typings.reactDom.nextMod.reactDomAugmentingMod.PreinitAs): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPrecedence(value: String): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
      
      inline def setPrecedenceUndefined: Self = StObject.set(x, "precedence", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDom.reactDomStrings.font
    - typings.reactDom.reactDomStrings.script
    - typings.reactDom.reactDomStrings.style
  */
  trait PreloadAs extends StObject
  object PreloadAs {
    
    inline def font: typings.reactDom.reactDomStrings.font = "font".asInstanceOf[typings.reactDom.reactDomStrings.font]
    
    inline def script: typings.reactDom.reactDomStrings.script = "script".asInstanceOf[typings.reactDom.reactDomStrings.script]
    
    inline def style: typings.reactDom.reactDomStrings.style = "style".asInstanceOf[typings.reactDom.reactDomStrings.style]
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreloadOptions] (val x: Self) extends AnyVal {
      
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
