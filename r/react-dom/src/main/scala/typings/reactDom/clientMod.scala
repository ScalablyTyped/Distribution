package typings.reactDom

import typings.react.mod.ReactNode
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("react-dom/client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRoot(container: DocumentFragment): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(container.asInstanceOf[js.Any]).asInstanceOf[Root]
  inline def createRoot(container: DocumentFragment, options: RootOptions): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(container.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def createRoot(container: Element): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(container.asInstanceOf[js.Any]).asInstanceOf[Root]
  inline def createRoot(container: Element, options: RootOptions): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(container.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  
  inline def hydrateRoot(container: Document, initialChildren: ReactNode): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrateRoot")(container.asInstanceOf[js.Any], initialChildren.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def hydrateRoot(container: Document, initialChildren: ReactNode, options: HydrationOptions): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrateRoot")(container.asInstanceOf[js.Any], initialChildren.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def hydrateRoot(container: Element, initialChildren: ReactNode): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrateRoot")(container.asInstanceOf[js.Any], initialChildren.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def hydrateRoot(container: Element, initialChildren: ReactNode, options: HydrationOptions): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrateRoot")(container.asInstanceOf[js.Any], initialChildren.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  
  trait HydrationOptions extends StObject {
    
    /**
      * Prefix for `useId`.
      */
    var identifierPrefix: js.UndefOr[String] = js.undefined
    
    var onRecoverableError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
  }
  object HydrationOptions {
    
    inline def apply(): HydrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HydrationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HydrationOptions] (val x: Self) extends AnyVal {
      
      inline def setIdentifierPrefix(value: String): Self = StObject.set(x, "identifierPrefix", value.asInstanceOf[js.Any])
      
      inline def setIdentifierPrefixUndefined: Self = StObject.set(x, "identifierPrefix", js.undefined)
      
      inline def setOnRecoverableError(value: /* error */ Any => Unit): Self = StObject.set(x, "onRecoverableError", js.Any.fromFunction1(value))
      
      inline def setOnRecoverableErrorUndefined: Self = StObject.set(x, "onRecoverableError", js.undefined)
    }
  }
  
  trait Root extends StObject {
    
    def render(children: ReactNode): Unit
    
    def unmount(): Unit
  }
  object Root {
    
    inline def apply(render: ReactNode => Unit, unmount: () => Unit): Root = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), unmount = js.Any.fromFunction0(unmount))
      __obj.asInstanceOf[Root]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Root] (val x: Self) extends AnyVal {
      
      inline def setRender(value: ReactNode => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setUnmount(value: () => Unit): Self = StObject.set(x, "unmount", js.Any.fromFunction0(value))
    }
  }
  
  trait RootOptions extends StObject {
    
    /**
      * Prefix for `useId`.
      */
    var identifierPrefix: js.UndefOr[String] = js.undefined
    
    var onRecoverableError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
  }
  object RootOptions {
    
    inline def apply(): RootOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RootOptions] (val x: Self) extends AnyVal {
      
      inline def setIdentifierPrefix(value: String): Self = StObject.set(x, "identifierPrefix", value.asInstanceOf[js.Any])
      
      inline def setIdentifierPrefixUndefined: Self = StObject.set(x, "identifierPrefix", js.undefined)
      
      inline def setOnRecoverableError(value: /* error */ Any => Unit): Self = StObject.set(x, "onRecoverableError", js.Any.fromFunction1(value))
      
      inline def setOnRecoverableErrorUndefined: Self = StObject.set(x, "onRecoverableError", js.undefined)
    }
  }
}
