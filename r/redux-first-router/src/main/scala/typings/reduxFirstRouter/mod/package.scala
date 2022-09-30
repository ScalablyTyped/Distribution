package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.history.mod.History
import typings.redux.mod.Dispatch
import typings.reduxFirstRouter.anon.CapitalizedWords
import typings.reduxFirstRouter.anon.Enhancer
import typings.reduxFirstRouter.anon.Pathname
import typings.reduxFirstRouter.mod.^
import typings.reduxFirstRouter.reduxFirstRouterStrings.`@@redux-first-routerSlashNOT_FOUND`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def NOT_FOUND: `@@redux-first-routerSlashNOT_FOUND` = ^.asInstanceOf[js.Dynamic].selectDynamic("NOT_FOUND").asInstanceOf[`@@redux-first-routerSlashNOT_FOUND`]

inline def actionToPath[TKeys, TState](action: ReceivedAction, routesMap: RoutesMap[TKeys, TState]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("actionToPath")(action.asInstanceOf[js.Any], routesMap.asInstanceOf[js.Any])).asInstanceOf[String]
inline def actionToPath[TKeys, TState](action: ReceivedAction, routesMap: RoutesMap[TKeys, TState], querySerializer: QuerySerializer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("actionToPath")(action.asInstanceOf[js.Any], routesMap.asInstanceOf[js.Any], querySerializer.asInstanceOf[js.Any])).asInstanceOf[String]

inline def back(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("back")().asInstanceOf[Unit]

inline def canGo(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canGo")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def canGoBack(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canGoBack")().asInstanceOf[Boolean]

inline def canGoForward(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canGoForward")().asInstanceOf[Boolean]

inline def connectRoutes[TKeys, TState](routesMap: RoutesMap[TKeys, TState]): Enhancer[TKeys, TState] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectRoutes")(routesMap.asInstanceOf[js.Any]).asInstanceOf[Enhancer[TKeys, TState]]
inline def connectRoutes[TKeys, TState](routesMap: RoutesMap[TKeys, TState], options: Options[TKeys, TState]): Enhancer[TKeys, TState] = (^.asInstanceOf[js.Dynamic].applyDynamic("connectRoutes")(routesMap.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Enhancer[TKeys, TState]]

inline def go(n: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("go")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def history(): History = ^.asInstanceOf[js.Dynamic].applyDynamic("history")().asInstanceOf[History]

inline def isLocationAction(action: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocationAction")(action.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def next(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("next")().asInstanceOf[Unit]

inline def nextPath(): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nextPath")().asInstanceOf[String | Unit]

inline def pathToAction[TKeys, TState](pathname: String, routesMap: RoutesMap[TKeys, TState]): ReceivedAction = (^.asInstanceOf[js.Dynamic].applyDynamic("pathToAction")(pathname.asInstanceOf[js.Any], routesMap.asInstanceOf[js.Any])).asInstanceOf[ReceivedAction]
inline def pathToAction[TKeys, TState](pathname: String, routesMap: RoutesMap[TKeys, TState], querySerializer: QuerySerializer): ReceivedAction = (^.asInstanceOf[js.Dynamic].applyDynamic("pathToAction")(pathname.asInstanceOf[js.Any], routesMap.asInstanceOf[js.Any], querySerializer.asInstanceOf[js.Any])).asInstanceOf[ReceivedAction]

inline def prevPath(): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prevPath")().asInstanceOf[String | Unit]

inline def push(pathname: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(pathname.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def redirect(action: Action): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(action.asInstanceOf[js.Any]).asInstanceOf[Action]

inline def replace(pathname: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(pathname.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def scrollBehavior(): ScrollBehavior_ | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollBehavior")().asInstanceOf[ScrollBehavior_ | Unit]

inline def selectLocationState[TState](state: TState): LocationState[js.Object, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectLocationState")(state.asInstanceOf[js.Any]).asInstanceOf[LocationState[js.Object, Any]]

inline def setKind(action: Action, kind: String): Action = (^.asInstanceOf[js.Dynamic].applyDynamic("setKind")(action.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Action]

inline def updateScroll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateScroll")().asInstanceOf[Unit]

type ConfirmLeave = js.Function2[/* state */ js.Object, /* action */ js.Object, Nullable[String]]

type DisplayConfirmLeave = js.Function2[/* message */ String, /* callback */ js.Function1[/* unblock */ Boolean, Unit], Unit]

type HistoryAction = String

type HistoryEntries = js.Array[Pathname]

type Listener = js.Function2[/* location */ HistoryLocation, /* action */ HistoryAction, Unit]

type Navigators[TState] = StringDictionary[Navigator[TState]]

type Nullable[T] = js.UndefOr[T | Null]

type Params = StringDictionary[Any]

type Query = StringDictionary[String | Any]

type Route[TKeys, TState] = RouteString | (RouteObject[TKeys, TState])

type RouteObject[TKeys, TState] = TKeys & CapitalizedWords[TState]

type RouteString = String

type RouteThunk[TState] = js.Function3[
/* dispatch */ Dispatch[Any], 
/* getState */ StateGetter[TState], 
/* bag */ Bag, 
Any | js.Promise[Any]]

type RoutesMap[TKeys, TState] = StringDictionary[Route[TKeys, TState]]

type ScrollBehavior_ = js.Object

type ScrollUpdater = js.Function1[/* performedByUser */ Boolean, Unit]

type SelectLocationState_[TKeys, TState] = js.Function1[/* state */ TState, LocationState[TKeys, TState]]

type SelectTitleState[TState] = js.Function1[/* state */ TState, String]

type StateGetter[TState] = js.Function0[TState]
