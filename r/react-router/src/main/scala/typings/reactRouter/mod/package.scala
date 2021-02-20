package typings.reactRouter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  @scala.inline
  def RouterContext: typings.react.mod.Context[
    typings.reactRouter.mod.RouteComponentProps[js.Object, typings.reactRouter.mod.StaticContext, typings.history.mod.LocationState]
  ] = typings.reactRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("__RouterContext").asInstanceOf[typings.react.mod.Context[
    typings.reactRouter.mod.RouteComponentProps[js.Object, typings.reactRouter.mod.StaticContext, typings.history.mod.LocationState]
  ]]
  
  type WithRouterProps[C /* <: typings.react.mod.ComponentType[_] */] = js.Object | typings.reactRouter.anon.WrappedComponentRef[C]
  
  @scala.inline
  def generatePath(pattern: java.lang.String): java.lang.String = typings.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(pattern.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def generatePath(
    pattern: java.lang.String,
    params: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]
  ): java.lang.String = (typings.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(pattern.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.matchPath with org.scalablytyped.runtime.TopLevel[js.Any] */](pathname: java.lang.String, props: java.lang.String): typings.reactRouter.mod.`match`[Params] | scala.Null = (typings.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typings.reactRouter.mod.`match`[Params] | scala.Null]
  @scala.inline
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.matchPath with org.scalablytyped.runtime.TopLevel[js.Any] */](
    pathname: java.lang.String,
    props: java.lang.String,
    parent: typings.reactRouter.mod.`match`[Params]
  ): typings.reactRouter.mod.`match`[Params] | scala.Null = (typings.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typings.reactRouter.mod.`match`[Params] | scala.Null]
  @scala.inline
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.matchPath with org.scalablytyped.runtime.TopLevel[js.Any] */](pathname: java.lang.String, props: js.Array[java.lang.String]): typings.reactRouter.mod.`match`[Params] | scala.Null = (typings.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typings.reactRouter.mod.`match`[Params] | scala.Null]
  @scala.inline
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.matchPath with org.scalablytyped.runtime.TopLevel[js.Any] */](
    pathname: java.lang.String,
    props: js.Array[java.lang.String],
    parent: typings.reactRouter.mod.`match`[Params]
  ): typings.reactRouter.mod.`match`[Params] | scala.Null = (typings.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typings.reactRouter.mod.`match`[Params] | scala.Null]
  @scala.inline
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.matchPath with org.scalablytyped.runtime.TopLevel[js.Any] */](pathname: java.lang.String, props: typings.reactRouter.mod.RouteProps): typings.reactRouter.mod.`match`[Params] | scala.Null = (typings.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typings.reactRouter.mod.`match`[Params] | scala.Null]
  @scala.inline
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.matchPath with org.scalablytyped.runtime.TopLevel[js.Any] */](
    pathname: java.lang.String,
    props: typings.reactRouter.mod.RouteProps,
    parent: typings.reactRouter.mod.`match`[Params]
  ): typings.reactRouter.mod.`match`[Params] | scala.Null = (typings.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typings.reactRouter.mod.`match`[Params] | scala.Null]
  
  @scala.inline
  def useHistory[HistoryLocationState](): typings.history.mod.History[HistoryLocationState] = typings.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useHistory")().asInstanceOf[typings.history.mod.History[HistoryLocationState]]
  
  @scala.inline
  def useLocation[S](): typings.history.mod.Location[S] = typings.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[typings.history.mod.Location[S]]
  
  @scala.inline
  def useParams[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.useParams with org.scalablytyped.runtime.TopLevel[js.Any] */](): Params = typings.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useParams")().asInstanceOf[Params]
  
  @scala.inline
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.useRouteMatch with org.scalablytyped.runtime.TopLevel[js.Any] */](): typings.reactRouter.mod.`match`[Params] = typings.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")().asInstanceOf[typings.reactRouter.mod.`match`[Params]]
  @scala.inline
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.useRouteMatch with org.scalablytyped.runtime.TopLevel[js.Any] */](path: java.lang.String): typings.reactRouter.mod.`match`[Params] | scala.Null = typings.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")(path.asInstanceOf[js.Any]).asInstanceOf[typings.reactRouter.mod.`match`[Params] | scala.Null]
  @scala.inline
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.useRouteMatch with org.scalablytyped.runtime.TopLevel[js.Any] */](path: js.Array[java.lang.String]): typings.reactRouter.mod.`match`[Params] | scala.Null = typings.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")(path.asInstanceOf[js.Any]).asInstanceOf[typings.reactRouter.mod.`match`[Params] | scala.Null]
  @scala.inline
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.useRouteMatch with org.scalablytyped.runtime.TopLevel[js.Any] */](path: typings.reactRouter.mod.RouteProps): typings.reactRouter.mod.`match`[Params] | scala.Null = typings.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")(path.asInstanceOf[js.Any]).asInstanceOf[typings.reactRouter.mod.`match`[Params] | scala.Null]
  
  @scala.inline
  def withRouter[P /* <: typings.reactRouter.mod.RouteComponentProps[_, typings.reactRouter.mod.StaticContext, typings.history.mod.LocationState] */, C /* <: typings.react.mod.ComponentType[P] */](component: C with typings.react.mod.ComponentType[P]): (typings.react.mod.ComponentClass[
    (typings.reactRouter.mod.Omit[
      P, 
      /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ typings.reactRouter.reactRouterStrings.history_ | typings.reactRouter.reactRouterStrings.location_ | typings.reactRouter.reactRouterStrings.`match` | typings.reactRouter.reactRouterStrings.staticContext
    ]) with typings.reactRouter.mod.WithRouterProps[C], 
    typings.react.mod.ComponentState
  ]) with typings.reactRouter.mod.WithRouterStatics[C] = typings.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withRouter")(component.asInstanceOf[js.Any]).asInstanceOf[(typings.react.mod.ComponentClass[
    (typings.reactRouter.mod.Omit[
      P, 
      /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ typings.reactRouter.reactRouterStrings.history_ | typings.reactRouter.reactRouterStrings.location_ | typings.reactRouter.reactRouterStrings.`match` | typings.reactRouter.reactRouterStrings.staticContext
    ]) with typings.reactRouter.mod.WithRouterProps[C], 
    typings.react.mod.ComponentState
  ]) with typings.reactRouter.mod.WithRouterStatics[C]]
}
