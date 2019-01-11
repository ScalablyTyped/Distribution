package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-little-router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BLOCK: /* ROUTER_BLOCK */ java.lang.String = js.native
  val DID_REPLACE_ROUTES: /* ROUTER_DID_REPLACE_ROUTES */ java.lang.String = js.native
  val GO: /* ROUTER_GO */ java.lang.String = js.native
  val GO_BACK: /* ROUTER_GO_BACK */ java.lang.String = js.native
  val GO_FORWARD: /* ROUTER_GO_FORWARD */ java.lang.String = js.native
  val LOCATION_CHANGED: /* ROUTER_LOCATION_CHANGED */ java.lang.String = js.native
  val POP: /* ROUTER_POP */ java.lang.String = js.native
  val PUSH: /* ROUTER_PUSH */ java.lang.String = js.native
  val REPLACE: /* ROUTER_REPLACE */ java.lang.String = js.native
  val REPLACE_ROUTES: /* ROUTER_REPLACE_ROUTES */ java.lang.String = js.native
  val UNBLOCK: /* ROUTER_UNBLOCK */ java.lang.String = js.native
  def block(historyShouldBlock: reduxDashLittleDashRouterLib.BlockCallback): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.BlockAction = js.native
  def go(index: scala.Double): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.GoAction = js.native
  def goBack(): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.GoBackAction = js.native
  def goForward(): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.GoForwardAction = js.native
  def immutableRouterForBrowser(options: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.BrowserRouterArgs): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.Router = js.native
  def immutableRouterForExpress(options: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.ExpressRouterArgs): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.Router = js.native
  def immutableRouterForHapi(options: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.HapiRouterArgs): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.Router = js.native
  def immutableRouterForHash(options: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.HashRouterArgs): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.Router = js.native
  def initializeCurrentLocation(location: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.Location): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.LocationChangedAction = js.native
  def push(href: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.Href): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.PushAction = js.native
  def push(
    href: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.Href,
    options: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.LocationOptions
  ): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.PushAction = js.native
  def replace(href: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.Href): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.ReplaceAction = js.native
  def replace(
    href: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.Href,
    options: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.LocationOptions
  ): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.ReplaceAction = js.native
  def replaceRoutes(routes: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.Routes): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.ReplaceRoutesAction = js.native
  def routerForBrowser(options: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.BrowserRouterArgs): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.Router = js.native
  def routerForExpress(options: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.ExpressRouterArgs): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.Router = js.native
  def routerForHapi(options: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.HapiRouterArgs): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.Router = js.native
  def routerForHash(options: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.HashRouterArgs): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.Router = js.native
  def unblock(): reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.UnblockAction = js.native
}

