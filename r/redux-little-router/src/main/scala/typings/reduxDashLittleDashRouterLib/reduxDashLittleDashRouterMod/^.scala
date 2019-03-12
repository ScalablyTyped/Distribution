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
  def block(historyShouldBlock: reduxDashLittleDashRouterLib.BlockCallback): BlockAction = js.native
  def go(index: scala.Double): GoAction = js.native
  def goBack(): GoBackAction = js.native
  def goForward(): GoForwardAction = js.native
  def immutableRouterForBrowser(options: BrowserRouterArgs): Router = js.native
  def immutableRouterForExpress(options: ExpressRouterArgs): Router = js.native
  def immutableRouterForHapi(options: HapiRouterArgs): Router = js.native
  def immutableRouterForHash(options: HashRouterArgs): Router = js.native
  def initializeCurrentLocation(location: Location): LocationChangedAction = js.native
  def push(href: Href): PushAction = js.native
  def push(href: Href, options: LocationOptions): PushAction = js.native
  def replace(href: Href): ReplaceAction = js.native
  def replace(href: Href, options: LocationOptions): ReplaceAction = js.native
  def replaceRoutes(routes: Routes): ReplaceRoutesAction = js.native
  def routerForBrowser(options: BrowserRouterArgs): Router = js.native
  def routerForExpress(options: ExpressRouterArgs): Router = js.native
  def routerForHapi(options: HapiRouterArgs): Router = js.native
  def routerForHash(options: HashRouterArgs): Router = js.native
  def unblock(): UnblockAction = js.native
}

