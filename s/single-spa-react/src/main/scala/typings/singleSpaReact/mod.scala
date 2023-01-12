package typings.singleSpaReact

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.ElementType
import typings.react.mod.ErrorInfo
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.singleSpaReact.anon.TinLegacyRenderTypeany
import typings.singleSpaReact.anon.TinRenderTypeany
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("single-spa-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ExtraProps](
    opts: SingleSpaReactOpts[
      ExtraProps & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppProps */ Any)
    ]
  ): ReactAppOrParcel[ExtraProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[ReactAppOrParcel[ExtraProps]]
  
  @JSImport("single-spa-react", "SingleSpaContext")
  @js.native
  val SingleSpaContext: Context[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomProps */ Any
  ] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.singleSpaReact.singleSpaReactStrings.createBlockingRoot
    - typings.singleSpaReact.singleSpaReactStrings.unstable_createRoot
    - typings.singleSpaReact.singleSpaReactStrings.unstable_createBlockingRoot
  */
  trait DeprecatedRenderTypes extends StObject
  object DeprecatedRenderTypes {
    
    inline def createBlockingRoot: typings.singleSpaReact.singleSpaReactStrings.createBlockingRoot = "createBlockingRoot".asInstanceOf[typings.singleSpaReact.singleSpaReactStrings.createBlockingRoot]
    
    inline def unstable_createBlockingRoot: typings.singleSpaReact.singleSpaReactStrings.unstable_createBlockingRoot = "unstable_createBlockingRoot".asInstanceOf[typings.singleSpaReact.singleSpaReactStrings.unstable_createBlockingRoot]
    
    inline def unstable_createRoot: typings.singleSpaReact.singleSpaReactStrings.unstable_createRoot = "unstable_createRoot".asInstanceOf[typings.singleSpaReact.singleSpaReactStrings.unstable_createRoot]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.singleSpaReact.singleSpaReactStrings.hydrate
    - typings.singleSpaReact.singleSpaReactStrings.render
  */
  trait LegacyRenderType extends StObject
  object LegacyRenderType {
    
    inline def hydrate: typings.singleSpaReact.singleSpaReactStrings.hydrate = "hydrate".asInstanceOf[typings.singleSpaReact.singleSpaReactStrings.hydrate]
    
    inline def render: typings.singleSpaReact.singleSpaReactStrings.render = "render".asInstanceOf[typings.singleSpaReact.singleSpaReactStrings.render]
  }
  
  trait ReactAppOrParcel[ExtraProps] extends StObject {
    
    var bootstrap: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LifeCycleFn<ExtraProps> */ Any
    
    var mount: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LifeCycleFn<ExtraProps> */ Any
    
    var unmount: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LifeCycleFn<ExtraProps> */ Any
    
    var update: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LifeCycleFn<ExtraProps> */ Any
      ] = js.undefined
  }
  object ReactAppOrParcel {
    
    inline def apply[ExtraProps](
      bootstrap: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LifeCycleFn<ExtraProps> */ Any,
      mount: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LifeCycleFn<ExtraProps> */ Any,
      unmount: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LifeCycleFn<ExtraProps> */ Any
    ): ReactAppOrParcel[ExtraProps] = {
      val __obj = js.Dynamic.literal(bootstrap = bootstrap.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], unmount = unmount.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactAppOrParcel[ExtraProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactAppOrParcel[?], ExtraProps] (val x: Self & ReactAppOrParcel[ExtraProps]) extends AnyVal {
      
      inline def setBootstrap(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LifeCycleFn<ExtraProps> */ Any
      ): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
      
      inline def setMount(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LifeCycleFn<ExtraProps> */ Any
      ): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
      
      inline def setUnmount(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LifeCycleFn<ExtraProps> */ Any
      ): Self = StObject.set(x, "unmount", value.asInstanceOf[js.Any])
      
      inline def setUpdate(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LifeCycleFn<ExtraProps> */ Any
      ): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.singleSpaReact.singleSpaReactStrings.createRoot
    - typings.singleSpaReact.singleSpaReactStrings.hydrateRoot
    - typings.singleSpaReact.singleSpaReactStrings.hydrate
    - typings.singleSpaReact.singleSpaReactStrings.render
  */
  trait RenderType extends StObject
  object RenderType {
    
    inline def createRoot: typings.singleSpaReact.singleSpaReactStrings.createRoot = "createRoot".asInstanceOf[typings.singleSpaReact.singleSpaReactStrings.createRoot]
    
    inline def hydrate: typings.singleSpaReact.singleSpaReactStrings.hydrate = "hydrate".asInstanceOf[typings.singleSpaReact.singleSpaReactStrings.hydrate]
    
    inline def hydrateRoot: typings.singleSpaReact.singleSpaReactStrings.hydrateRoot = "hydrateRoot".asInstanceOf[typings.singleSpaReact.singleSpaReactStrings.hydrateRoot]
    
    inline def render: typings.singleSpaReact.singleSpaReactStrings.render = "render".asInstanceOf[typings.singleSpaReact.singleSpaReactStrings.render]
  }
  
  trait SingleSpaReactOpts[RootComponentProps] extends StObject {
    
    var React: Any
    
    var ReactDOM: js.UndefOr[TinLegacyRenderTypeany] = js.undefined
    
    var ReactDOMClient: js.UndefOr[TinRenderTypeany] = js.undefined
    
    var domElementGetter: js.UndefOr[js.Function1[/* props */ RootComponentProps, HTMLElement]] = js.undefined
    
    var errorBoundary: js.UndefOr[
        js.Function3[
          /* err */ js.Error, 
          /* errInfo */ ErrorInfo, 
          /* props */ RootComponentProps, 
          ReactElement
        ]
      ] = js.undefined
    
    var errorBoundaryClass: js.UndefOr[ComponentClass[RootComponentProps, ComponentState]] = js.undefined
    
    var loadRootComponent: js.UndefOr[
        js.Function1[
          /* props */ js.UndefOr[RootComponentProps], 
          js.Promise[
            ElementType[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof props */ Any
            ]
          ]
        ]
      ] = js.undefined
    
    var parcelCanUpdate: js.UndefOr[Boolean] = js.undefined
    
    var renderType: js.UndefOr[RenderType | js.Function0[RenderType]] = js.undefined
    
    var rootComponent: js.UndefOr[
        (ComponentClass[RootComponentProps, Any]) | FunctionComponent[RootComponentProps]
      ] = js.undefined
    
    var suppressComponentDidCatchWarning: js.UndefOr[Boolean] = js.undefined
  }
  object SingleSpaReactOpts {
    
    inline def apply[RootComponentProps](React: Any): SingleSpaReactOpts[RootComponentProps] = {
      val __obj = js.Dynamic.literal(React = React.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleSpaReactOpts[RootComponentProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SingleSpaReactOpts[?], RootComponentProps] (val x: Self & SingleSpaReactOpts[RootComponentProps]) extends AnyVal {
      
      inline def setDomElementGetter(value: /* props */ RootComponentProps => HTMLElement): Self = StObject.set(x, "domElementGetter", js.Any.fromFunction1(value))
      
      inline def setDomElementGetterUndefined: Self = StObject.set(x, "domElementGetter", js.undefined)
      
      inline def setErrorBoundary(
        value: (/* err */ js.Error, /* errInfo */ ErrorInfo, /* props */ RootComponentProps) => ReactElement
      ): Self = StObject.set(x, "errorBoundary", js.Any.fromFunction3(value))
      
      inline def setErrorBoundaryClass(value: ComponentClass[RootComponentProps, ComponentState]): Self = StObject.set(x, "errorBoundaryClass", value.asInstanceOf[js.Any])
      
      inline def setErrorBoundaryClassUndefined: Self = StObject.set(x, "errorBoundaryClass", js.undefined)
      
      inline def setErrorBoundaryUndefined: Self = StObject.set(x, "errorBoundary", js.undefined)
      
      inline def setLoadRootComponent(
        value: /* props */ js.UndefOr[RootComponentProps] => js.Promise[
              ElementType[
                /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof props */ Any
              ]
            ]
      ): Self = StObject.set(x, "loadRootComponent", js.Any.fromFunction1(value))
      
      inline def setLoadRootComponentUndefined: Self = StObject.set(x, "loadRootComponent", js.undefined)
      
      inline def setParcelCanUpdate(value: Boolean): Self = StObject.set(x, "parcelCanUpdate", value.asInstanceOf[js.Any])
      
      inline def setParcelCanUpdateUndefined: Self = StObject.set(x, "parcelCanUpdate", js.undefined)
      
      inline def setReact(value: Any): Self = StObject.set(x, "React", value.asInstanceOf[js.Any])
      
      inline def setReactDOM(value: TinLegacyRenderTypeany): Self = StObject.set(x, "ReactDOM", value.asInstanceOf[js.Any])
      
      inline def setReactDOMClient(value: TinRenderTypeany): Self = StObject.set(x, "ReactDOMClient", value.asInstanceOf[js.Any])
      
      inline def setReactDOMClientUndefined: Self = StObject.set(x, "ReactDOMClient", js.undefined)
      
      inline def setReactDOMUndefined: Self = StObject.set(x, "ReactDOM", js.undefined)
      
      inline def setRenderType(value: RenderType | js.Function0[RenderType]): Self = StObject.set(x, "renderType", value.asInstanceOf[js.Any])
      
      inline def setRenderTypeFunction0(value: () => RenderType): Self = StObject.set(x, "renderType", js.Any.fromFunction0(value))
      
      inline def setRenderTypeUndefined: Self = StObject.set(x, "renderType", js.undefined)
      
      inline def setRootComponent(value: (ComponentClass[RootComponentProps, Any]) | FunctionComponent[RootComponentProps]): Self = StObject.set(x, "rootComponent", value.asInstanceOf[js.Any])
      
      inline def setRootComponentUndefined: Self = StObject.set(x, "rootComponent", js.undefined)
      
      inline def setSuppressComponentDidCatchWarning(value: Boolean): Self = StObject.set(x, "suppressComponentDidCatchWarning", value.asInstanceOf[js.Any])
      
      inline def setSuppressComponentDidCatchWarningUndefined: Self = StObject.set(x, "suppressComponentDidCatchWarning", js.undefined)
    }
  }
}
