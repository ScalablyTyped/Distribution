package typings.remixRunRouter.distRouterMod

import typings.remixRunRouter.anon.CurrentLocation
import typings.remixRunRouter.distHistoryMod.Location
import typings.remixRunRouter.distRouterMod.^
import typings.remixRunRouter.distUtilsMod.AgnosticDataRouteObject
import typings.remixRunRouter.distUtilsMod.AgnosticRouteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def IDLE_BLOCKER: BlockerUnblocked = ^.asInstanceOf[js.Dynamic].selectDynamic("IDLE_BLOCKER").asInstanceOf[BlockerUnblocked]

inline def UNSAFE_DEFERRED_SYMBOL: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("UNSAFE_DEFERRED_SYMBOL").asInstanceOf[js.Symbol]

inline def createRouter(init: RouterInit): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(init.asInstanceOf[js.Any]).asInstanceOf[Router]

inline def createStaticHandler(routes: js.Array[AgnosticRouteObject]): StaticHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("createStaticHandler")(routes.asInstanceOf[js.Any]).asInstanceOf[StaticHandler]
inline def createStaticHandler(routes: js.Array[AgnosticRouteObject], opts: CreateStaticHandlerOptions): StaticHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("createStaticHandler")(routes.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[StaticHandler]

inline def getStaticContextFromError(routes: js.Array[AgnosticDataRouteObject], context: StaticHandlerContext, error: Any): StaticHandlerContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getStaticContextFromError")(routes.asInstanceOf[js.Any], context.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[StaticHandlerContext]

inline def isDeferredData(value: Any): /* is @remix-run/router.@remix-run/router/dist/utils.DeferredData */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeferredData")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @remix-run/router.@remix-run/router/dist/utils.DeferredData */ Boolean]

type BlockerFunction = js.Function1[/* args */ CurrentLocation, Boolean]

type GetScrollPositionFunction = js.Function0[Double]

type GetScrollRestorationKeyFunction = js.Function2[/* location */ Location, /* matches */ js.Array[UseMatchesMatch], String | Null]

/**
  * Options for a navigate() call for a normal (non-submission) navigation
  */
type LinkNavigateOptions = BaseNavigateOptions

/**
  * Options for a fetch() load
  */
type LoadFetchOptions = BaseNavigateOrFetchOptions

type RouterFetchOptions = LoadFetchOptions | SubmitFetchOptions

type RouterNavigateOptions = LinkNavigateOptions | SubmissionNavigateOptions

type RouterSubscriber = js.Function1[/* state */ RouterState, Unit]

/**
  * Options for a navigate() call for a submission navigation
  */
type SubmissionNavigateOptions = BaseNavigateOptions & BaseSubmissionOptions

/**
  * Options for a fetch() submission
  */
type SubmitFetchOptions = BaseNavigateOrFetchOptions & BaseSubmissionOptions
