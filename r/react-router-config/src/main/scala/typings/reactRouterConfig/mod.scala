package typings.reactRouterConfig

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.history.mod.Location
import typings.react.mod.ComponentType
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-router-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def matchRoutes[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterConfig.reactRouterConfigStrings.matchRoutes & TopLevel[Any] */, TRouteConfig /* <: RouteConfig */](routes: js.Array[TRouteConfig], pathname: String): js.Array[MatchedRoute[Params, TRouteConfig]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[js.Array[MatchedRoute[Params, TRouteConfig]]]
  
  inline def renderRoutes(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("renderRoutes")().asInstanceOf[Element]
  inline def renderRoutes(routes: js.Array[RouteConfig]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("renderRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def renderRoutes(routes: js.Array[RouteConfig], extraProps: Any): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("renderRoutes")(routes.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def renderRoutes(
    routes: js.Array[RouteConfig],
    extraProps: Any,
    switchProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SwitchProps */ Any
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("renderRoutes")(routes.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any], switchProps.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def renderRoutes(
    routes: js.Array[RouteConfig],
    extraProps: Unit,
    switchProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SwitchProps */ Any
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("renderRoutes")(routes.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any], switchProps.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def renderRoutes(routes: Unit, extraProps: Any): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("renderRoutes")(routes.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def renderRoutes(
    routes: Unit,
    extraProps: Any,
    switchProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SwitchProps */ Any
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("renderRoutes")(routes.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any], switchProps.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def renderRoutes(
    routes: Unit,
    extraProps: Unit,
    switchProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SwitchProps */ Any
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("renderRoutes")(routes.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any], switchProps.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  trait MatchedRoute[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterConfig.reactRouterConfigStrings.MatchedRoute & TopLevel[Any] */, TRouteConfig /* <: RouteConfig */] extends StObject {
    
    var `match`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify match<Params> */ Any
    
    var route: TRouteConfig
  }
  object MatchedRoute {
    
    inline def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reactRouterConfig.reactRouterConfigStrings.MatchedRoute & TopLevel[Any] */, TRouteConfig /* <: RouteConfig */](
      `match`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify match<Params> */ Any,
      route: TRouteConfig
    ): MatchedRoute[Params, TRouteConfig] = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchedRoute[Params, TRouteConfig]]
    }
    
    extension [Self <: MatchedRoute[?, ?], Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reactRouterConfig.reactRouterConfigStrings.MatchedRoute & TopLevel[Any] */, TRouteConfig /* <: RouteConfig */](x: Self & (MatchedRoute[Params, TRouteConfig])) {
      
      inline def setMatch(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify match<Params> */ Any
      ): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: TRouteConfig): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteConfig
    extends StObject
       with /* propName */ StringDictionary[Any] {
    
    var component: js.UndefOr[ComponentType[js.Object | RouteConfigComponentProps[Any]]] = js.undefined
    
    var exact: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var location: js.UndefOr[Location] = js.undefined
    
    var path: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* props */ RouteConfigComponentProps[Any], ReactNode]] = js.undefined
    
    var routes: js.UndefOr[js.Array[RouteConfig]] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object RouteConfig {
    
    inline def apply(): RouteConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteConfig]
    }
    
    extension [Self <: RouteConfig](x: Self) {
      
      inline def setComponent(value: ComponentType[js.Object | RouteConfigComponentProps[Any]]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setPath(value: String | js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setRender(value: /* props */ RouteConfigComponentProps[Any] => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setRoutes(value: js.Array[RouteConfig]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setRoutesVarargs(value: RouteConfig*): Self = StObject.set(x, "routes", js.Array(value*))
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RouteComponentProps<Params> * / any */ trait RouteConfigComponentProps[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterConfig.reactRouterConfigStrings.RouteConfigComponentProps & TopLevel[Any] */] extends StObject {
    
    var route: js.UndefOr[RouteConfig] = js.undefined
  }
  object RouteConfigComponentProps {
    
    inline def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reactRouterConfig.reactRouterConfigStrings.RouteConfigComponentProps & TopLevel[Any] */](): RouteConfigComponentProps[Params] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteConfigComponentProps[Params]]
    }
    
    extension [Self <: RouteConfigComponentProps[?], Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reactRouterConfig.reactRouterConfigStrings.RouteConfigComponentProps & TopLevel[Any] */](x: Self & RouteConfigComponentProps[Params]) {
      
      inline def setRoute(value: RouteConfig): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    }
  }
}
