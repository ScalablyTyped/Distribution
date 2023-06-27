package typings.reactRouter

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactRouter.anon.PartialLocation
import typings.reactRouter.distLibContextMod.IndexRouteObject
import typings.reactRouter.distLibContextMod.Navigator
import typings.reactRouter.distLibContextMod.NonIndexRouteObject
import typings.reactRouter.distLibContextMod.RouteMatch
import typings.reactRouter.distLibContextMod.RouteObject
import typings.reactRouter.reactRouterBooleans.`false`
import typings.reactRouter.reactRouterBooleans.`true`
import typings.remixRunRouter.distHistoryMod.Action
import typings.remixRunRouter.distHistoryMod.InitialEntry
import typings.remixRunRouter.distHistoryMod.To
import typings.remixRunRouter.distRouterMod.RelativeRoutingType
import typings.remixRunRouter.distRouterMod.Router
import typings.remixRunRouter.distUtilsMod.ImmutableRouteKey
import typings.remixRunRouter.distUtilsMod.LazyRouteFunction
import typings.remixRunRouter.distUtilsMod.TrackedPromise
import typings.std.Awaited
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibComponentsMod {
  
  @JSImport("react-router/dist/lib/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Await(param0: AwaitProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Await")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MemoryRouter(param0: MemoryRouterProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MemoryRouter")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def Navigate(param0: NavigateProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Navigate")(param0.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  inline def Outlet(props: OutletProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Outlet")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def Route(_props: RouteProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Route")(_props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def Router(param0: RouterProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def RouterProvider(param0: RouterProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("RouterProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def Routes(param0: RoutesProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Routes")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def createRoutesFromChildren(children: ReactNode): js.Array[RouteObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromChildren")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteObject]]
  inline def createRoutesFromChildren(children: ReactNode, parentPath: js.Array[Double]): js.Array[RouteObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutesFromChildren")(children.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[RouteObject]]
  
  inline def renderMatches(): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("renderMatches")().asInstanceOf[ReactElement | Null]
  inline def renderMatches(matches: js.Array[RouteMatch[String, RouteObject]]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("renderMatches")(matches.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  trait AwaitProps extends StObject {
    
    var children: ReactNode | AwaitResolveRenderFunction
    
    var errorElement: js.UndefOr[ReactNode] = js.undefined
    
    var resolve: TrackedPromise | Any
  }
  object AwaitProps {
    
    inline def apply(resolve: TrackedPromise | Any): AwaitProps = {
      val __obj = js.Dynamic.literal(resolve = resolve.asInstanceOf[js.Any])
      __obj.asInstanceOf[AwaitProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AwaitProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode | AwaitResolveRenderFunction): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* data */ Awaited[Any] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setErrorElement(value: ReactNode): Self = StObject.set(x, "errorElement", value.asInstanceOf[js.Any])
      
      inline def setErrorElementUndefined: Self = StObject.set(x, "errorElement", js.undefined)
      
      inline def setResolve(value: TrackedPromise | Any): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    }
  }
  
  type AwaitResolveRenderFunction = js.Function1[/* data */ Awaited[Any], ReactNode]
  
  trait FutureConfig extends StObject {
    
    var v7_startTransition: Boolean
  }
  object FutureConfig {
    
    inline def apply(v7_startTransition: Boolean): FutureConfig = {
      val __obj = js.Dynamic.literal(v7_startTransition = v7_startTransition.asInstanceOf[js.Any])
      __obj.asInstanceOf[FutureConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FutureConfig] (val x: Self) extends AnyVal {
      
      inline def setV7_startTransition(value: Boolean): Self = StObject.set(x, "v7_startTransition", value.asInstanceOf[js.Any])
    }
  }
  
  trait IndexRouteProps
    extends StObject
       with _RouteProps {
    
    var Component: js.UndefOr[ComponentType[js.Object] | Null] = js.undefined
    
    var ErrorBoundary: js.UndefOr[ComponentType[js.Object] | Null] = js.undefined
    
    var action: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['action'] */ js.Any
      ] = js.undefined
    
    var caseSensitive: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['caseSensitive'] */ js.Any
      ] = js.undefined
    
    var children: Unit
    
    var element: js.UndefOr[ReactNode | Null] = js.undefined
    
    var errorElement: js.UndefOr[ReactNode | Null] = js.undefined
    
    var handle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['handle'] */ js.Any
      ] = js.undefined
    
    var hasErrorBoundary: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['hasErrorBoundary'] */ js.Any
      ] = js.undefined
    
    var id: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['id'] */ js.Any
      ] = js.undefined
    
    var index: `true`
    
    var `lazy`: js.UndefOr[LazyRouteFunction[IndexRouteObject]] = js.undefined
    
    var loader: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['loader'] */ js.Any
      ] = js.undefined
    
    var path: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['path'] */ js.Any
      ] = js.undefined
    
    var shouldRevalidate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['shouldRevalidate'] */ js.Any
      ] = js.undefined
  }
  object IndexRouteProps {
    
    inline def apply(children: Unit): IndexRouteProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], index = true)
      __obj.asInstanceOf[IndexRouteProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndexRouteProps] (val x: Self) extends AnyVal {
      
      inline def setAction(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['action'] */ js.Any
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setCaseSensitive(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['caseSensitive'] */ js.Any
      ): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setChildren(value: Unit): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setComponentNull: Self = StObject.set(x, "Component", null)
      
      inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
      
      inline def setElement(value: ReactNode): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setErrorBoundary(value: ComponentType[js.Object]): Self = StObject.set(x, "ErrorBoundary", value.asInstanceOf[js.Any])
      
      inline def setErrorBoundaryNull: Self = StObject.set(x, "ErrorBoundary", null)
      
      inline def setErrorBoundaryUndefined: Self = StObject.set(x, "ErrorBoundary", js.undefined)
      
      inline def setErrorElement(value: ReactNode): Self = StObject.set(x, "errorElement", value.asInstanceOf[js.Any])
      
      inline def setErrorElementNull: Self = StObject.set(x, "errorElement", null)
      
      inline def setErrorElementUndefined: Self = StObject.set(x, "errorElement", js.undefined)
      
      inline def setHandle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['handle'] */ js.Any
      ): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setHasErrorBoundary(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['hasErrorBoundary'] */ js.Any
      ): Self = StObject.set(x, "hasErrorBoundary", value.asInstanceOf[js.Any])
      
      inline def setHasErrorBoundaryUndefined: Self = StObject.set(x, "hasErrorBoundary", js.undefined)
      
      inline def setId(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['id'] */ js.Any
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndex(value: `true`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLazy(value: () => js.Promise[Omit[IndexRouteObject, ImmutableRouteKey]]): Self = StObject.set(x, "lazy", js.Any.fromFunction0(value))
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setLoader(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['loader'] */ js.Any
      ): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setPath(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['path'] */ js.Any
      ): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setShouldRevalidate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['shouldRevalidate'] */ js.Any
      ): Self = StObject.set(x, "shouldRevalidate", value.asInstanceOf[js.Any])
      
      inline def setShouldRevalidateUndefined: Self = StObject.set(x, "shouldRevalidate", js.undefined)
    }
  }
  
  type LayoutRouteProps = PathRouteProps
  
  trait MemoryRouterProps extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var future: js.UndefOr[FutureConfig] = js.undefined
    
    var initialEntries: js.UndefOr[js.Array[InitialEntry]] = js.undefined
    
    var initialIndex: js.UndefOr[Double] = js.undefined
  }
  object MemoryRouterProps {
    
    inline def apply(): MemoryRouterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemoryRouterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MemoryRouterProps] (val x: Self) extends AnyVal {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFuture(value: FutureConfig): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      inline def setFutureUndefined: Self = StObject.set(x, "future", js.undefined)
      
      inline def setInitialEntries(value: js.Array[InitialEntry]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
      
      inline def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
      
      inline def setInitialEntriesVarargs(value: InitialEntry*): Self = StObject.set(x, "initialEntries", js.Array(value*))
      
      inline def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
    }
  }
  
  trait NavigateProps extends StObject {
    
    var relative: js.UndefOr[RelativeRoutingType] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
    
    var to: To
  }
  object NavigateProps {
    
    inline def apply(to: To): NavigateProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigateProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigateProps] (val x: Self) extends AnyVal {
      
      inline def setRelative(value: RelativeRoutingType): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTo(value: To): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutletProps extends StObject {
    
    var context: js.UndefOr[Any] = js.undefined
  }
  object OutletProps {
    
    inline def apply(): OutletProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutletProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OutletProps] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  trait PathRouteProps
    extends StObject
       with _RouteProps {
    
    var Component: js.UndefOr[ComponentType[js.Object] | Null] = js.undefined
    
    var ErrorBoundary: js.UndefOr[ComponentType[js.Object] | Null] = js.undefined
    
    var action: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['action'] */ js.Any
      ] = js.undefined
    
    var caseSensitive: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['caseSensitive'] */ js.Any
      ] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var element: js.UndefOr[ReactNode | Null] = js.undefined
    
    var errorElement: js.UndefOr[ReactNode | Null] = js.undefined
    
    var handle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['handle'] */ js.Any
      ] = js.undefined
    
    var hasErrorBoundary: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['hasErrorBoundary'] */ js.Any
      ] = js.undefined
    
    var id: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['id'] */ js.Any
      ] = js.undefined
    
    var index: js.UndefOr[`false`] = js.undefined
    
    var `lazy`: js.UndefOr[LazyRouteFunction[NonIndexRouteObject]] = js.undefined
    
    var loader: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['loader'] */ js.Any
      ] = js.undefined
    
    var path: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['path'] */ js.Any
      ] = js.undefined
    
    var shouldRevalidate: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['shouldRevalidate'] */ js.Any
      ] = js.undefined
  }
  object PathRouteProps {
    
    inline def apply(): PathRouteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathRouteProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathRouteProps] (val x: Self) extends AnyVal {
      
      inline def setAction(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['action'] */ js.Any
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setCaseSensitive(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['caseSensitive'] */ js.Any
      ): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setComponentNull: Self = StObject.set(x, "Component", null)
      
      inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
      
      inline def setElement(value: ReactNode): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setErrorBoundary(value: ComponentType[js.Object]): Self = StObject.set(x, "ErrorBoundary", value.asInstanceOf[js.Any])
      
      inline def setErrorBoundaryNull: Self = StObject.set(x, "ErrorBoundary", null)
      
      inline def setErrorBoundaryUndefined: Self = StObject.set(x, "ErrorBoundary", js.undefined)
      
      inline def setErrorElement(value: ReactNode): Self = StObject.set(x, "errorElement", value.asInstanceOf[js.Any])
      
      inline def setErrorElementNull: Self = StObject.set(x, "errorElement", null)
      
      inline def setErrorElementUndefined: Self = StObject.set(x, "errorElement", js.undefined)
      
      inline def setHandle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['handle'] */ js.Any
      ): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setHasErrorBoundary(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['hasErrorBoundary'] */ js.Any
      ): Self = StObject.set(x, "hasErrorBoundary", value.asInstanceOf[js.Any])
      
      inline def setHasErrorBoundaryUndefined: Self = StObject.set(x, "hasErrorBoundary", js.undefined)
      
      inline def setId(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['id'] */ js.Any
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndex(value: `false`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setLazy(value: () => js.Promise[Omit[NonIndexRouteObject, ImmutableRouteKey]]): Self = StObject.set(x, "lazy", js.Any.fromFunction0(value))
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setLoader(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['loader'] */ js.Any
      ): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setPath(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['path'] */ js.Any
      ): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setShouldRevalidate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['shouldRevalidate'] */ js.Any
      ): Self = StObject.set(x, "shouldRevalidate", value.asInstanceOf[js.Any])
      
      inline def setShouldRevalidateUndefined: Self = StObject.set(x, "shouldRevalidate", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactRouter.distLibComponentsMod.PathRouteProps
    - typings.reactRouter.distLibComponentsMod.LayoutRouteProps
    - typings.reactRouter.distLibComponentsMod.IndexRouteProps
  */
  type RouteProps = _RouteProps | LayoutRouteProps
  
  trait RouterProps extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var location: PartialLocation | String
    
    var navigationType: js.UndefOr[Action] = js.undefined
    
    var navigator: Navigator
    
    var static: js.UndefOr[Boolean] = js.undefined
  }
  object RouterProps {
    
    inline def apply(location: PartialLocation | String, navigator: Navigator): RouterProps = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouterProps] (val x: Self) extends AnyVal {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLocation(value: PartialLocation | String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setNavigationType(value: Action): Self = StObject.set(x, "navigationType", value.asInstanceOf[js.Any])
      
      inline def setNavigationTypeUndefined: Self = StObject.set(x, "navigationType", js.undefined)
      
      inline def setNavigator(value: Navigator): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
      
      inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    }
  }
  
  trait RouterProviderProps extends StObject {
    
    var fallbackElement: js.UndefOr[ReactNode] = js.undefined
    
    var future: js.UndefOr[FutureConfig] = js.undefined
    
    var router: Router
  }
  object RouterProviderProps {
    
    inline def apply(router: Router): RouterProviderProps = {
      val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouterProviderProps] (val x: Self) extends AnyVal {
      
      inline def setFallbackElement(value: ReactNode): Self = StObject.set(x, "fallbackElement", value.asInstanceOf[js.Any])
      
      inline def setFallbackElementUndefined: Self = StObject.set(x, "fallbackElement", js.undefined)
      
      inline def setFuture(value: FutureConfig): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      inline def setFutureUndefined: Self = StObject.set(x, "future", js.undefined)
      
      inline def setRouter(value: Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoutesProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var location: js.UndefOr[PartialLocation | String] = js.undefined
  }
  object RoutesProps {
    
    inline def apply(): RoutesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoutesProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoutesProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLocation(value: PartialLocation | String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
  
  trait _RouteProps extends StObject
  object _RouteProps {
    
    inline def IndexRouteProps(children: Unit): typings.reactRouter.distLibComponentsMod.IndexRouteProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], index = true)
      __obj.asInstanceOf[typings.reactRouter.distLibComponentsMod.IndexRouteProps]
    }
    
    inline def PathRouteProps(): typings.reactRouter.distLibComponentsMod.PathRouteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactRouter.distLibComponentsMod.PathRouteProps]
    }
  }
}
