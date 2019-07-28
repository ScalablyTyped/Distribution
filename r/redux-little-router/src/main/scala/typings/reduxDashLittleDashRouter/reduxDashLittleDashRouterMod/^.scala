package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_BLOCK
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_DID_REPLACE_ROUTES
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_GO
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_GO_BACK
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_GO_FORWARD
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_LOCATION_CHANGED
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_POP
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_PUSH
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_REPLACE
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_REPLACE_ROUTES
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_UNBLOCK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-little-router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BLOCK: ROUTER_BLOCK = js.native
  val DID_REPLACE_ROUTES: ROUTER_DID_REPLACE_ROUTES = js.native
  val GO: ROUTER_GO = js.native
  val GO_BACK: ROUTER_GO_BACK = js.native
  val GO_FORWARD: ROUTER_GO_FORWARD = js.native
  val LOCATION_CHANGED: ROUTER_LOCATION_CHANGED = js.native
  val POP: ROUTER_POP = js.native
  val PUSH: ROUTER_PUSH = js.native
  val REPLACE: ROUTER_REPLACE = js.native
  val REPLACE_ROUTES: ROUTER_REPLACE_ROUTES = js.native
  val UNBLOCK: ROUTER_UNBLOCK = js.native
  def block(historyShouldBlock: BlockCallback): BlockAction = js.native
  def go(index: Double): GoAction = js.native
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

