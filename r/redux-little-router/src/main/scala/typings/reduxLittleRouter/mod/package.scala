package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reduxLittleRouter.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def BLOCK_ : /* "ROUTER_BLOCK" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("BLOCK").asInstanceOf[/* "ROUTER_BLOCK" */ String]

inline def DID_REPLACE_ROUTES: /* "ROUTER_DID_REPLACE_ROUTES" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("DID_REPLACE_ROUTES").asInstanceOf[/* "ROUTER_DID_REPLACE_ROUTES" */ String]

inline def GO_ : /* "ROUTER_GO" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("GO").asInstanceOf[/* "ROUTER_GO" */ String]

inline def GO_BACK: /* "ROUTER_GO_BACK" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("GO_BACK").asInstanceOf[/* "ROUTER_GO_BACK" */ String]

inline def GO_FORWARD: /* "ROUTER_GO_FORWARD" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("GO_FORWARD").asInstanceOf[/* "ROUTER_GO_FORWARD" */ String]

inline def LOCATION_CHANGED: /* "ROUTER_LOCATION_CHANGED" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("LOCATION_CHANGED").asInstanceOf[/* "ROUTER_LOCATION_CHANGED" */ String]

inline def POP: /* "ROUTER_POP" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("POP").asInstanceOf[/* "ROUTER_POP" */ String]

inline def PUSH_ : /* "ROUTER_PUSH" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("PUSH").asInstanceOf[/* "ROUTER_PUSH" */ String]

inline def REPLACE_ : /* "ROUTER_REPLACE" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("REPLACE").asInstanceOf[/* "ROUTER_REPLACE" */ String]

inline def REPLACE_ROUTES: /* "ROUTER_REPLACE_ROUTES" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("REPLACE_ROUTES").asInstanceOf[/* "ROUTER_REPLACE_ROUTES" */ String]

inline def UNBLOCK_ : /* "ROUTER_UNBLOCK" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("UNBLOCK").asInstanceOf[/* "ROUTER_UNBLOCK" */ String]

inline def block(historyShouldBlock: BlockCallback): BlockAction = ^.asInstanceOf[js.Dynamic].applyDynamic("block")(historyShouldBlock.asInstanceOf[js.Any]).asInstanceOf[BlockAction]

inline def go(index: Double): GoAction = ^.asInstanceOf[js.Dynamic].applyDynamic("go")(index.asInstanceOf[js.Any]).asInstanceOf[GoAction]

inline def goBack(): GoBackAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")().asInstanceOf[GoBackAction]

inline def goForward(): GoForwardAction = ^.asInstanceOf[js.Dynamic].applyDynamic("goForward")().asInstanceOf[GoForwardAction]

inline def immutableRouterForBrowser(options: BrowserRouterArgs): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("immutableRouterForBrowser")(options.asInstanceOf[js.Any]).asInstanceOf[Router]

inline def immutableRouterForExpress(options: ExpressRouterArgs): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("immutableRouterForExpress")(options.asInstanceOf[js.Any]).asInstanceOf[Router]

inline def immutableRouterForHapi(options: HapiRouterArgs): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("immutableRouterForHapi")(options.asInstanceOf[js.Any]).asInstanceOf[Router]

inline def immutableRouterForHash(options: HashRouterArgs): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("immutableRouterForHash")(options.asInstanceOf[js.Any]).asInstanceOf[Router]

inline def initializeCurrentLocation(location: Location): LocationChangedAction = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeCurrentLocation")(location.asInstanceOf[js.Any]).asInstanceOf[LocationChangedAction]

inline def push(href: Href): PushAction = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(href.asInstanceOf[js.Any]).asInstanceOf[PushAction]
inline def push(href: Href, options: LocationOptions): PushAction = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(href.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PushAction]

inline def replace(href: Href): ReplaceAction = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(href.asInstanceOf[js.Any]).asInstanceOf[ReplaceAction]
inline def replace(href: Href, options: LocationOptions): ReplaceAction = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(href.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReplaceAction]

inline def replaceRoutes(routes: Routes): ReplaceRoutesAction = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[ReplaceRoutesAction]

inline def routerForBrowser(options: BrowserRouterArgs): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("routerForBrowser")(options.asInstanceOf[js.Any]).asInstanceOf[Router]

inline def routerForExpress(options: ExpressRouterArgs): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("routerForExpress")(options.asInstanceOf[js.Any]).asInstanceOf[Router]

inline def routerForHapi(options: HapiRouterArgs): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("routerForHapi")(options.asInstanceOf[js.Any]).asInstanceOf[Router]

inline def routerForHash(options: HashRouterArgs): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("routerForHash")(options.asInstanceOf[js.Any]).asInstanceOf[Router]

inline def unblock(): UnblockAction = ^.asInstanceOf[js.Dynamic].applyDynamic("unblock")().asInstanceOf[UnblockAction]

type BlockCallback = js.Function2[/* location */ Location, /* action */ js.UndefOr[HistoryAction], String]

type Href = String | Location

type ListenCallback = js.Function2[/* location */ Location, /* action */ js.UndefOr[HistoryAction], Unit]

type ObjectLiteral[T] = StringDictionary[T]

type Params = ObjectLiteral[String]

type Query = ObjectLiteral[String]

type Routes = ObjectLiteral[ObjectLiteral[Any]]

type Unsubscribe = js.Function0[Unit]
