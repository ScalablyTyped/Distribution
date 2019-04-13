package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-little-router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BLOCK: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_BLOCK = js.native
  val DID_REPLACE_ROUTES: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_DID_REPLACE_ROUTES = js.native
  val GO: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_GO = js.native
  val GO_BACK: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_GO_BACK = js.native
  val GO_FORWARD: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_GO_FORWARD = js.native
  val LOCATION_CHANGED: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_LOCATION_CHANGED = js.native
  val POP: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_POP = js.native
  val PUSH: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_PUSH = js.native
  val REPLACE: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_REPLACE = js.native
  val REPLACE_ROUTES: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_REPLACE_ROUTES = js.native
  val UNBLOCK: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_UNBLOCK = js.native
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

