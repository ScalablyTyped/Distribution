package typings
package reduxDashRouterLib.reduxDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-router", "ReduxRouter")
@js.native
object ReduxRouterNs extends js.Object {
  @js.native
  class MemoryRouter ()
    extends reduxDashRouterLib.libReduxRouterMod.defaultNs.MemoryRouter
  
  @js.native
  class Prompt ()
    extends reduxDashRouterLib.libReduxRouterMod.defaultNs.Prompt
  
  @js.native
  class Redirect ()
    extends reduxDashRouterLib.libReduxRouterMod.defaultNs.Redirect
  
  @js.native
  class Route[T /* <: reactDashRouterLib.reactDashRouterMod.RouteProps */] ()
    extends reduxDashRouterLib.libReduxRouterMod.defaultNs.Route[T]
  
  @js.native
  class Router ()
    extends reduxDashRouterLib.libReduxRouterMod.defaultNs.Router
  
  @js.native
  class StaticRouter ()
    extends reduxDashRouterLib.libReduxRouterMod.defaultNs.StaticRouter
  
  @js.native
  class Switch ()
    extends reduxDashRouterLib.libReduxRouterMod.defaultNs.Switch
  
  def generatePath(pattern: java.lang.String): java.lang.String = js.native
  def generatePath(
    pattern: java.lang.String,
    params: ScalablyTyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean]
  ): java.lang.String = js.native
  def matchPath[Params /* <: reduxDashRouterLib.reduxDashRouterLibStrings.matchPath with js.Any */](pathname: java.lang.String, props: java.lang.String): reactDashRouterLib.reactDashRouterMod.`match`[Params] | scala.Null = js.native
  def matchPath[Params /* <: reduxDashRouterLib.reduxDashRouterLibStrings.matchPath with js.Any */](
    pathname: java.lang.String,
    props: java.lang.String,
    parent: reactDashRouterLib.reactDashRouterMod.`match`[Params]
  ): reactDashRouterLib.reactDashRouterMod.`match`[Params] | scala.Null = js.native
  def matchPath[Params /* <: reduxDashRouterLib.reduxDashRouterLibStrings.matchPath with js.Any */](pathname: java.lang.String, props: reactDashRouterLib.reactDashRouterMod.RouteProps): reactDashRouterLib.reactDashRouterMod.`match`[Params] | scala.Null = js.native
  def matchPath[Params /* <: reduxDashRouterLib.reduxDashRouterLibStrings.matchPath with js.Any */](
    pathname: java.lang.String,
    props: reactDashRouterLib.reactDashRouterMod.RouteProps,
    parent: reactDashRouterLib.reactDashRouterMod.`match`[Params]
  ): reactDashRouterLib.reactDashRouterMod.`match`[Params] | scala.Null = js.native
  def withRouter[P /* <: reactDashRouterLib.reactDashRouterMod.RouteComponentProps[
    _, 
    reactDashRouterLib.reactDashRouterMod.StaticContext, 
    historyLib.historyMod.LocationState
  ] */](component: reactLib.reactMod.ReactNs.ComponentType[P]): reactLib.reactMod.ReactNs.ComponentClass[
    reactDashRouterLib.reactDashRouterMod.Omit[reactDashRouterLib.reactDashRouterMod.Omit[P, java.lang.String], java.lang.String], 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
}

