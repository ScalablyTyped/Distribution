package typings.reactDashRouter.reactDashRouterMod

import org.scalablytyped.runtime.StringDictionary
import typings.history.historyMod.LocationState
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val __RouterContext: Context[RouteComponentProps[js.Object, StaticContext, LocationState]] = js.native
  def generatePath(pattern: String): String = js.native
  def generatePath(pattern: String, params: StringDictionary[js.UndefOr[String | Double | Boolean]]): String = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactDashRouter.reactDashRouterStrings.matchPath with js.Any */](pathname: String, props: String): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactDashRouter.reactDashRouterStrings.matchPath with js.Any */](pathname: String, props: String, parent: `match`[Params]): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactDashRouter.reactDashRouterStrings.matchPath with js.Any */](pathname: String, props: RouteProps): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactDashRouter.reactDashRouterStrings.matchPath with js.Any */](pathname: String, props: RouteProps, parent: `match`[Params]): `match`[Params] | Null = js.native
  def withRouter[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ComponentType[P] */](component: C with ComponentType[P]): (ComponentClass[(Omit[P, String]) with WithRouterProps[C], ComponentState]) with WithRouterStatics[C] = js.native
}

