package typings.storybookRouter.mod

import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.storybookRouter.anon.PartialLocation
import typings.storybookRouter.anon.PartialPath
import typings.storybookRouter.distUtilsMod.Args
import typings.storybookRouter.distUtilsMod.Query
import typings.storybookRouter.distUtilsMod.StoryData
import typings.storybookRouter.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Provides location context for the rest of the app.
  *
  * Note: You usually won't render a <Router> directly. Instead, you'll render a
  * router that is more specific to your environment such as a <BrowserRouter>
  * in web browsers or a <StaticRouter> for server rendering.
  *
  * @see https://reactrouter.com/docs/en/v6/api#router
  */
/* was `typeof Router` */
inline def BaseLocationProvider(param0: RouterProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("BaseLocationProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]

inline def DEEPLY_EQUAL: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("DEEPLY_EQUAL").asInstanceOf[js.Symbol]

/**
  * A <Router> for use in web browsers. Provides the cleanest URLs.
  */
/* was `typeof BrowserRouter` */
inline def LocationProvider(param0: BrowserRouterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("LocationProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def buildArgsParam(initialArgs: Unit, args: Args): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildArgsParam")(initialArgs.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildArgsParam(initialArgs: Args, args: Args): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildArgsParam")(initialArgs.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]

inline def deepDiff(value: Any, update: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deepDiff")(value.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def getMatch(current: String, target: String): typings.storybookRouter.distUtilsMod.Match | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatch")(current.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[typings.storybookRouter.distUtilsMod.Match | Null]
inline def getMatch(current: String, target: String, startsWith: Any): typings.storybookRouter.distUtilsMod.Match | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatch")(current.asInstanceOf[js.Any], target.asInstanceOf[js.Any], startsWith.asInstanceOf[js.Any])).asInstanceOf[typings.storybookRouter.distUtilsMod.Match | Null]

inline def parsePath(): StoryData = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")().asInstanceOf[StoryData]
inline def parsePath(path: String): StoryData = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[StoryData]

inline def queryFromLocation(location: PartialLocation): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("queryFromLocation")(location.asInstanceOf[js.Any]).asInstanceOf[Query]

inline def queryFromString(): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("queryFromString")().asInstanceOf[Query]
inline def queryFromString(s: String): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("queryFromString")(s.asInstanceOf[js.Any]).asInstanceOf[Query]

inline def stringifyQuery(query: Query): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyQuery")(query.asInstanceOf[js.Any]).asInstanceOf[String]

inline def useNavigate(): js.Function2[/* to */ To | Double, /* param1 */ js.UndefOr[Any], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigate")().asInstanceOf[js.Function2[/* to */ To | Double, /* param1 */ js.UndefOr[Any], Unit]]

/**
  * A function that receives transitions when navigation is blocked.
  */
type Blocker = js.Function1[/* tx */ Transition, Unit]

/**
  * A URL fragment identifier, beginning with a #.
  *
  * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.hash
  */
type Hash = String

/**
  * A unique string associated with a location. May be used to safely store
  * and retrieve data in some other storage API, like `localStorage`.
  *
  * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.key
  */
type Key = String

/**
  * A function that receives notifications about location changes.
  */
type Listener = js.Function1[/* update */ Update, Unit]

type NavigateFunction = js.Function2[/* to */ To | Double, /* options */ js.UndefOr[NavigateOptions], Unit]

/**
  * A URL pathname, beginning with a /.
  *
  * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.pathname
  */
type Pathname = String

/**
  * A URL search string, beginning with a ?.
  *
  * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#location.search
  */
type Search = String

/**
  * Describes a location that is the destination of some navigation, either via
  * `history.push` or `history.replace`. May be either a URL or the pieces of a
  * URL path.
  */
type To = String | PartialPath
