package typings
package reduxDashRouterLib.libReduxRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-router/lib/ReduxRouter", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  @js.native
  class MemoryRouter ()
    extends reactDashRouterLib.reactDashRouterMod.MemoryRouter
  
  @js.native
  class Prompt ()
    extends reactDashRouterLib.reactDashRouterMod.Prompt
  
  @js.native
  class Redirect ()
    extends reactDashRouterLib.reactDashRouterMod.Redirect
  
  @js.native
  class Route[T /* <: reactDashRouterLib.reactDashRouterMod.RouteProps */] ()
    extends reactDashRouterLib.reactDashRouterMod.Route[T]
  
  @js.native
  class Router ()
    extends reactDashRouterLib.reactDashRouterMod.Router
  
  @js.native
  class StaticRouter ()
    extends reactDashRouterLib.reactDashRouterMod.StaticRouter
  
  @js.native
  class Switch ()
    extends reactDashRouterLib.reactDashRouterMod.Switch
  
  val __RouterContext: reactLib.reactMod.Context[
    reactDashRouterLib.reactDashRouterMod.RouteComponentProps[
      js.Object, 
      reactDashRouterLib.reactDashRouterMod.StaticContext, 
      historyLib.historyMod.LocationState
    ]
  ] = js.native
  def generatePath(pattern: java.lang.String): java.lang.String = js.native
  def generatePath(
    pattern: java.lang.String,
    params: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]
  ): java.lang.String = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reduxDashRouterLib.reduxDashRouterLibStrings.matchPath with js.Any */](pathname: java.lang.String, props: java.lang.String): reactDashRouterLib.reactDashRouterMod.`match`[Params] | scala.Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reduxDashRouterLib.reduxDashRouterLibStrings.matchPath with js.Any */](
    pathname: java.lang.String,
    props: java.lang.String,
    parent: reactDashRouterLib.reactDashRouterMod.`match`[Params]
  ): reactDashRouterLib.reactDashRouterMod.`match`[Params] | scala.Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reduxDashRouterLib.reduxDashRouterLibStrings.matchPath with js.Any */](pathname: java.lang.String, props: reactDashRouterLib.reactDashRouterMod.RouteProps): reactDashRouterLib.reactDashRouterMod.`match`[Params] | scala.Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reduxDashRouterLib.reduxDashRouterLibStrings.matchPath with js.Any */](
    pathname: java.lang.String,
    props: reactDashRouterLib.reactDashRouterMod.RouteProps,
    parent: reactDashRouterLib.reactDashRouterMod.`match`[Params]
  ): reactDashRouterLib.reactDashRouterMod.`match`[Params] | scala.Null = js.native
  def withRouter[P /* <: reactDashRouterLib.reactDashRouterMod.RouteComponentProps[
    _, 
    reactDashRouterLib.reactDashRouterMod.StaticContext, 
    historyLib.historyMod.LocationState
  ] */, C /* <: reactLib.reactMod.ComponentType[P] */](component: C with reactLib.reactMod.ComponentType[P]): (reactLib.reactMod.ComponentClass[
    (reactDashRouterLib.reactDashRouterMod.Omit[P, java.lang.String]) with reactDashRouterLib.reactDashRouterMod.WithRouterProps[C], 
    reactLib.reactMod.ComponentState
  ]) with reactDashRouterLib.reactDashRouterMod.WithRouterStatics[C] = js.native
}

