package typings
package reactDashRouterLib.reactDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def generatePath(pattern: java.lang.String): java.lang.String = js.native
  def generatePath(
    pattern: java.lang.String,
    params: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]
  ): java.lang.String = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterLib.reactDashRouterLibStrings.matchPath with js.Any */](pathname: java.lang.String, props: java.lang.String): `match`[Params] | scala.Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterLib.reactDashRouterLibStrings.matchPath with js.Any */](pathname: java.lang.String, props: java.lang.String, parent: `match`[Params]): `match`[Params] | scala.Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterLib.reactDashRouterLibStrings.matchPath with js.Any */](pathname: java.lang.String, props: RouteProps): `match`[Params] | scala.Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterLib.reactDashRouterLibStrings.matchPath with js.Any */](pathname: java.lang.String, props: RouteProps, parent: `match`[Params]): `match`[Params] | scala.Null = js.native
  def withRouter[P /* <: RouteComponentProps[_, StaticContext, historyLib.historyMod.LocationState] */](component: reactLib.reactMod.ReactNs.ComponentType[P]): reactLib.reactMod.ReactNs.ComponentClass[Omit[P, java.lang.String], reactLib.reactMod.ReactNs.ComponentState] = js.native
}

