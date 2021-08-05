package typings.singleSpaReact

import typings.react.mod.ComponentClass
import typings.react.mod.FunctionComponent
import typings.singleSpaReact.anon.TypeofReact
import typings.singleSpaReact.anon.TypeofReactDOM
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(opts: Options): Lifecycles = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Lifecycles]
  
  @JSImport("single-spa-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Lifecycles extends StObject {
    
    def bootstrap(props: js.Any): js.Promise[Unit]
    
    def mount(props: js.Any): js.Promise[Unit]
    
    def unmount(props: js.Any): js.Promise[Unit]
    
    var update: js.UndefOr[js.Function1[/* props */ js.Any, js.Promise[Unit]]] = js.undefined
  }
  object Lifecycles {
    
    inline def apply(
      bootstrap: js.Any => js.Promise[Unit],
      mount: js.Any => js.Promise[Unit],
      unmount: js.Any => js.Promise[Unit]
    ): Lifecycles = {
      val __obj = js.Dynamic.literal(bootstrap = js.Any.fromFunction1(bootstrap), mount = js.Any.fromFunction1(mount), unmount = js.Any.fromFunction1(unmount))
      __obj.asInstanceOf[Lifecycles]
    }
    
    extension [Self <: Lifecycles](x: Self) {
      
      inline def setBootstrap(value: js.Any => js.Promise[Unit]): Self = StObject.set(x, "bootstrap", js.Any.fromFunction1(value))
      
      inline def setMount(value: js.Any => js.Promise[Unit]): Self = StObject.set(x, "mount", js.Any.fromFunction1(value))
      
      inline def setUnmount(value: js.Any => js.Promise[Unit]): Self = StObject.set(x, "unmount", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: /* props */ js.Any => js.Promise[Unit]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var React: TypeofReact
    
    var ReactDOM: TypeofReactDOM
    
    var domElementGetter: js.UndefOr[js.Function0[Element]] = js.undefined
    
    var loadRootComponent: js.UndefOr[
        js.Function0[js.Promise[(ComponentClass[js.Any, js.Any]) | FunctionComponent[js.Any]]]
      ] = js.undefined
    
    var parcelCanUpdate: js.UndefOr[Boolean] = js.undefined
    
    var rootComponent: js.UndefOr[(ComponentClass[js.Any, js.Any]) | FunctionComponent[js.Any]] = js.undefined
    
    var suppressComponentDidCatchWarning: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(React: TypeofReact, ReactDOM: TypeofReactDOM): Options = {
      val __obj = js.Dynamic.literal(React = React.asInstanceOf[js.Any], ReactDOM = ReactDOM.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDomElementGetter(value: () => Element): Self = StObject.set(x, "domElementGetter", js.Any.fromFunction0(value))
      
      inline def setDomElementGetterUndefined: Self = StObject.set(x, "domElementGetter", js.undefined)
      
      inline def setLoadRootComponent(value: () => js.Promise[(ComponentClass[js.Any, js.Any]) | FunctionComponent[js.Any]]): Self = StObject.set(x, "loadRootComponent", js.Any.fromFunction0(value))
      
      inline def setLoadRootComponentUndefined: Self = StObject.set(x, "loadRootComponent", js.undefined)
      
      inline def setParcelCanUpdate(value: Boolean): Self = StObject.set(x, "parcelCanUpdate", value.asInstanceOf[js.Any])
      
      inline def setParcelCanUpdateUndefined: Self = StObject.set(x, "parcelCanUpdate", js.undefined)
      
      inline def setReact(value: TypeofReact): Self = StObject.set(x, "React", value.asInstanceOf[js.Any])
      
      inline def setReactDOM(value: TypeofReactDOM): Self = StObject.set(x, "ReactDOM", value.asInstanceOf[js.Any])
      
      inline def setRootComponent(value: (ComponentClass[js.Any, js.Any]) | FunctionComponent[js.Any]): Self = StObject.set(x, "rootComponent", value.asInstanceOf[js.Any])
      
      inline def setRootComponentUndefined: Self = StObject.set(x, "rootComponent", js.undefined)
      
      inline def setSuppressComponentDidCatchWarning(value: Boolean): Self = StObject.set(x, "suppressComponentDidCatchWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressComponentDidCatchWarningUndefined: Self = StObject.set(x, "suppressComponentDidCatchWarning", js.undefined)
    }
  }
}
