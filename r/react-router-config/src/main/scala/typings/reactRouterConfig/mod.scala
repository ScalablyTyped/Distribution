package typings.reactRouterConfig

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.react.mod.ComponentType
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactRouter.mod.RouteComponentProps
import typings.reactRouter.mod.StaticContext
import typings.reactRouter.mod.SwitchProps
import typings.reactRouter.mod.`match`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-router-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def matchRoutes[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterConfig.reactRouterConfigStrings.matchRoutes & TopLevel[js.Any] */](routes: js.Array[RouteConfig], pathname: String): js.Array[MatchedRoute[Params]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRoutes")(routes.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[js.Array[MatchedRoute[Params]]]
  
  @scala.inline
  def renderRoutes(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("renderRoutes")().asInstanceOf[Element]
  @scala.inline
  def renderRoutes(routes: js.Array[RouteConfig]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("renderRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[Element]
  @scala.inline
  def renderRoutes(routes: js.Array[RouteConfig], extraProps: js.Any): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("renderRoutes")(routes.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any])).asInstanceOf[Element]
  @scala.inline
  def renderRoutes(routes: js.Array[RouteConfig], extraProps: js.Any, switchProps: SwitchProps): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("renderRoutes")(routes.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any], switchProps.asInstanceOf[js.Any])).asInstanceOf[Element]
  @scala.inline
  def renderRoutes(routes: js.Array[RouteConfig], extraProps: Unit, switchProps: SwitchProps): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("renderRoutes")(routes.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any], switchProps.asInstanceOf[js.Any])).asInstanceOf[Element]
  @scala.inline
  def renderRoutes(routes: Unit, extraProps: js.Any): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("renderRoutes")(routes.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any])).asInstanceOf[Element]
  @scala.inline
  def renderRoutes(routes: Unit, extraProps: js.Any, switchProps: SwitchProps): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("renderRoutes")(routes.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any], switchProps.asInstanceOf[js.Any])).asInstanceOf[Element]
  @scala.inline
  def renderRoutes(routes: Unit, extraProps: Unit, switchProps: SwitchProps): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("renderRoutes")(routes.asInstanceOf[js.Any], extraProps.asInstanceOf[js.Any], switchProps.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  trait MatchedRoute[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterConfig.reactRouterConfigStrings.MatchedRoute & TopLevel[js.Any] */] extends StObject {
    
    var `match`: typings.reactRouter.mod.`match`[Params]
    
    var route: RouteConfig
  }
  object MatchedRoute {
    
    @scala.inline
    def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reactRouterConfig.reactRouterConfigStrings.MatchedRoute & TopLevel[js.Any] */](`match`: `match`[Params], route: RouteConfig): MatchedRoute[Params] = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchedRoute[Params]]
    }
    
    @scala.inline
    implicit class MatchedRouteMutableBuilder[Self <: MatchedRoute[?], Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reactRouterConfig.reactRouterConfigStrings.MatchedRoute & TopLevel[js.Any] */] (val x: Self & MatchedRoute[Params]) extends AnyVal {
      
      @scala.inline
      def setMatch(value: `match`[Params]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute(value: RouteConfig): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteConfig
    extends StObject
       with /* propName */ StringDictionary[js.Any] {
    
    var component: js.UndefOr[ComponentType[js.Object | RouteConfigComponentProps[js.Any]]] = js.undefined
    
    var exact: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var location: js.UndefOr[Location[LocationState]] = js.undefined
    
    var path: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* props */ RouteConfigComponentProps[js.Any], ReactNode]] = js.undefined
    
    var routes: js.UndefOr[js.Array[RouteConfig]] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object RouteConfig {
    
    @scala.inline
    def apply(): RouteConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteConfig]
    }
    
    @scala.inline
    implicit class RouteConfigMutableBuilder[Self <: RouteConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: ComponentType[js.Object | RouteConfigComponentProps[js.Any]]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLocation(value: Location[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setPath(value: String | js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setRender(value: /* props */ RouteConfigComponentProps[js.Any] => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setRoutes(value: js.Array[RouteConfig]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      @scala.inline
      def setRoutesVarargs(value: RouteConfig*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait RouteConfigComponentProps[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouterConfig.reactRouterConfigStrings.RouteConfigComponentProps & TopLevel[js.Any] */]
    extends StObject
       with RouteComponentProps[Params, StaticContext, LocationState] {
    
    var route: js.UndefOr[RouteConfig] = js.undefined
  }
  object RouteConfigComponentProps {
    
    @scala.inline
    def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reactRouterConfig.reactRouterConfigStrings.RouteConfigComponentProps & TopLevel[js.Any] */](history: History[LocationState], location: Location[LocationState], `match`: `match`[Params]): RouteConfigComponentProps[Params] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteConfigComponentProps[Params]]
    }
    
    @scala.inline
    implicit class RouteConfigComponentPropsMutableBuilder[Self <: RouteConfigComponentProps[?], Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typings.reactRouterConfig.reactRouterConfigStrings.RouteConfigComponentProps & TopLevel[js.Any] */] (val x: Self & RouteConfigComponentProps[Params]) extends AnyVal {
      
      @scala.inline
      def setRoute(value: RouteConfig): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    }
  }
}
