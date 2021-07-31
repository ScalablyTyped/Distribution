package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def BLOCK_ : /* "ROUTER_BLOCK" */ java.lang.String = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("BLOCK").asInstanceOf[/* "ROUTER_BLOCK" */ java.lang.String]

@scala.inline
def DID_REPLACE_ROUTES: /* "ROUTER_DID_REPLACE_ROUTES" */ java.lang.String = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DID_REPLACE_ROUTES").asInstanceOf[/* "ROUTER_DID_REPLACE_ROUTES" */ java.lang.String]

@scala.inline
def GO_ : /* "ROUTER_GO" */ java.lang.String = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GO").asInstanceOf[/* "ROUTER_GO" */ java.lang.String]

@scala.inline
def GO_BACK: /* "ROUTER_GO_BACK" */ java.lang.String = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GO_BACK").asInstanceOf[/* "ROUTER_GO_BACK" */ java.lang.String]

@scala.inline
def GO_FORWARD: /* "ROUTER_GO_FORWARD" */ java.lang.String = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GO_FORWARD").asInstanceOf[/* "ROUTER_GO_FORWARD" */ java.lang.String]

@scala.inline
def LOCATION_CHANGED: /* "ROUTER_LOCATION_CHANGED" */ java.lang.String = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("LOCATION_CHANGED").asInstanceOf[/* "ROUTER_LOCATION_CHANGED" */ java.lang.String]

@scala.inline
def POP: /* "ROUTER_POP" */ java.lang.String = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("POP").asInstanceOf[/* "ROUTER_POP" */ java.lang.String]

@scala.inline
def PUSH_ : /* "ROUTER_PUSH" */ java.lang.String = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("PUSH").asInstanceOf[/* "ROUTER_PUSH" */ java.lang.String]

@scala.inline
def REPLACE_ : /* "ROUTER_REPLACE" */ java.lang.String = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("REPLACE").asInstanceOf[/* "ROUTER_REPLACE" */ java.lang.String]

@scala.inline
def REPLACE_ROUTES: /* "ROUTER_REPLACE_ROUTES" */ java.lang.String = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("REPLACE_ROUTES").asInstanceOf[/* "ROUTER_REPLACE_ROUTES" */ java.lang.String]

@scala.inline
def UNBLOCK_ : /* "ROUTER_UNBLOCK" */ java.lang.String = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("UNBLOCK").asInstanceOf[/* "ROUTER_UNBLOCK" */ java.lang.String]

@scala.inline
def block(historyShouldBlock: typings.reduxLittleRouter.mod.BlockCallback): typings.reduxLittleRouter.mod.BlockAction = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("block")(historyShouldBlock.asInstanceOf[js.Any]).asInstanceOf[typings.reduxLittleRouter.mod.BlockAction]

@scala.inline
def go(index: scala.Double): typings.reduxLittleRouter.mod.GoAction = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("go")(index.asInstanceOf[js.Any]).asInstanceOf[typings.reduxLittleRouter.mod.GoAction]

@scala.inline
def goBack(): typings.reduxLittleRouter.mod.GoBackAction = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("goBack")().asInstanceOf[typings.reduxLittleRouter.mod.GoBackAction]

@scala.inline
def goForward(): typings.reduxLittleRouter.mod.GoForwardAction = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("goForward")().asInstanceOf[typings.reduxLittleRouter.mod.GoForwardAction]

@scala.inline
def immutableRouterForBrowser(options: typings.reduxLittleRouter.mod.BrowserRouterArgs): typings.reduxLittleRouter.mod.Router = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("immutableRouterForBrowser")(options.asInstanceOf[js.Any]).asInstanceOf[typings.reduxLittleRouter.mod.Router]

@scala.inline
def immutableRouterForExpress(options: typings.reduxLittleRouter.mod.ExpressRouterArgs): typings.reduxLittleRouter.mod.Router = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("immutableRouterForExpress")(options.asInstanceOf[js.Any]).asInstanceOf[typings.reduxLittleRouter.mod.Router]

@scala.inline
def immutableRouterForHapi(options: typings.reduxLittleRouter.mod.HapiRouterArgs): typings.reduxLittleRouter.mod.Router = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("immutableRouterForHapi")(options.asInstanceOf[js.Any]).asInstanceOf[typings.reduxLittleRouter.mod.Router]

@scala.inline
def immutableRouterForHash(options: typings.reduxLittleRouter.mod.HashRouterArgs): typings.reduxLittleRouter.mod.Router = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("immutableRouterForHash")(options.asInstanceOf[js.Any]).asInstanceOf[typings.reduxLittleRouter.mod.Router]

@scala.inline
def initializeCurrentLocation(location: typings.reduxLittleRouter.mod.Location): typings.reduxLittleRouter.mod.LocationChangedAction = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("initializeCurrentLocation")(location.asInstanceOf[js.Any]).asInstanceOf[typings.reduxLittleRouter.mod.LocationChangedAction]

@scala.inline
def push(href: typings.reduxLittleRouter.mod.Href): typings.reduxLittleRouter.mod.PushAction = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("push")(href.asInstanceOf[js.Any]).asInstanceOf[typings.reduxLittleRouter.mod.PushAction]
@scala.inline
def push(href: typings.reduxLittleRouter.mod.Href, options: typings.reduxLittleRouter.mod.LocationOptions): typings.reduxLittleRouter.mod.PushAction = (typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("push")(href.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.reduxLittleRouter.mod.PushAction]

@scala.inline
def replace(href: typings.reduxLittleRouter.mod.Href): typings.reduxLittleRouter.mod.ReplaceAction = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("replace")(href.asInstanceOf[js.Any]).asInstanceOf[typings.reduxLittleRouter.mod.ReplaceAction]
@scala.inline
def replace(href: typings.reduxLittleRouter.mod.Href, options: typings.reduxLittleRouter.mod.LocationOptions): typings.reduxLittleRouter.mod.ReplaceAction = (typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("replace")(href.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.reduxLittleRouter.mod.ReplaceAction]

@scala.inline
def replaceRoutes(routes: typings.reduxLittleRouter.mod.Routes): typings.reduxLittleRouter.mod.ReplaceRoutesAction = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("replaceRoutes")(routes.asInstanceOf[js.Any]).asInstanceOf[typings.reduxLittleRouter.mod.ReplaceRoutesAction]

@scala.inline
def routerForBrowser(options: typings.reduxLittleRouter.mod.BrowserRouterArgs): typings.reduxLittleRouter.mod.Router = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("routerForBrowser")(options.asInstanceOf[js.Any]).asInstanceOf[typings.reduxLittleRouter.mod.Router]

@scala.inline
def routerForExpress(options: typings.reduxLittleRouter.mod.ExpressRouterArgs): typings.reduxLittleRouter.mod.Router = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("routerForExpress")(options.asInstanceOf[js.Any]).asInstanceOf[typings.reduxLittleRouter.mod.Router]

@scala.inline
def routerForHapi(options: typings.reduxLittleRouter.mod.HapiRouterArgs): typings.reduxLittleRouter.mod.Router = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("routerForHapi")(options.asInstanceOf[js.Any]).asInstanceOf[typings.reduxLittleRouter.mod.Router]

@scala.inline
def routerForHash(options: typings.reduxLittleRouter.mod.HashRouterArgs): typings.reduxLittleRouter.mod.Router = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("routerForHash")(options.asInstanceOf[js.Any]).asInstanceOf[typings.reduxLittleRouter.mod.Router]

@scala.inline
def unblock(): typings.reduxLittleRouter.mod.UnblockAction = typings.reduxLittleRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unblock")().asInstanceOf[typings.reduxLittleRouter.mod.UnblockAction]

type BlockCallback = js.Function2[
/* location */ typings.reduxLittleRouter.mod.Location, 
/* action */ js.UndefOr[typings.reduxLittleRouter.mod.HistoryAction], 
java.lang.String]

type Href = java.lang.String | typings.reduxLittleRouter.mod.Location

type ListenCallback = js.Function2[
/* location */ typings.reduxLittleRouter.mod.Location, 
/* action */ js.UndefOr[typings.reduxLittleRouter.mod.HistoryAction], 
scala.Unit]

type ObjectLiteral[T] = org.scalablytyped.runtime.StringDictionary[T]

type Params = typings.reduxLittleRouter.mod.ObjectLiteral[java.lang.String]

type Query = typings.reduxLittleRouter.mod.ObjectLiteral[java.lang.String]

type Routes = typings.reduxLittleRouter.mod.ObjectLiteral[typings.reduxLittleRouter.mod.ObjectLiteral[js.Any]]

type Unsubscribe = js.Function0[scala.Unit]
