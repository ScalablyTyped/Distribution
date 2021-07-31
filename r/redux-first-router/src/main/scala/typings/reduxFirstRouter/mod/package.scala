package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def NOT_FOUND: typings.reduxFirstRouter.reduxFirstRouterStrings.`@@redux-first-routerSlashNOT_FOUND` = typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NOT_FOUND").asInstanceOf[typings.reduxFirstRouter.reduxFirstRouterStrings.`@@redux-first-routerSlashNOT_FOUND`]

@scala.inline
def actionToPath[TKeys, TState](
  action: typings.reduxFirstRouter.mod.ReceivedAction,
  routesMap: typings.reduxFirstRouter.mod.RoutesMap[TKeys, TState]
): java.lang.String = (typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("actionToPath")(action.asInstanceOf[js.Any], routesMap.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def actionToPath[TKeys, TState](
  action: typings.reduxFirstRouter.mod.ReceivedAction,
  routesMap: typings.reduxFirstRouter.mod.RoutesMap[TKeys, TState],
  querySerializer: typings.reduxFirstRouter.mod.QuerySerializer
): java.lang.String = (typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("actionToPath")(action.asInstanceOf[js.Any], routesMap.asInstanceOf[js.Any], querySerializer.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

@scala.inline
def back(): scala.Unit = typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("back")().asInstanceOf[scala.Unit]

@scala.inline
def canGo(n: scala.Double): scala.Boolean = typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("canGo")(n.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

@scala.inline
def canGoBack(): scala.Boolean = typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("canGoBack")().asInstanceOf[scala.Boolean]

@scala.inline
def canGoForward(): scala.Boolean = typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("canGoForward")().asInstanceOf[scala.Boolean]

@scala.inline
def connectRoutes[TKeys, TState](routesMap: typings.reduxFirstRouter.mod.RoutesMap[TKeys, TState]): typings.reduxFirstRouter.anon.Enhancer[TKeys, TState] = typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectRoutes")(routesMap.asInstanceOf[js.Any]).asInstanceOf[typings.reduxFirstRouter.anon.Enhancer[TKeys, TState]]
@scala.inline
def connectRoutes[TKeys, TState](
  routesMap: typings.reduxFirstRouter.mod.RoutesMap[TKeys, TState],
  options: typings.reduxFirstRouter.mod.Options[TKeys, TState]
): typings.reduxFirstRouter.anon.Enhancer[TKeys, TState] = (typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectRoutes")(routesMap.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.reduxFirstRouter.anon.Enhancer[TKeys, TState]]

@scala.inline
def go(n: scala.Double): scala.Unit = typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("go")(n.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def history(): typings.history.mod.History[typings.history.mod.LocationState] = typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("history")().asInstanceOf[typings.history.mod.History[typings.history.mod.LocationState]]

@scala.inline
def isLocationAction(action: js.Any): scala.Boolean = typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isLocationAction")(action.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

@scala.inline
def next(): scala.Unit = typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("next")().asInstanceOf[scala.Unit]

@scala.inline
def nextPath(): java.lang.String | scala.Unit = typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("nextPath")().asInstanceOf[java.lang.String | scala.Unit]

@scala.inline
def pathToAction[TKeys, TState](pathname: java.lang.String, routesMap: typings.reduxFirstRouter.mod.RoutesMap[TKeys, TState]): typings.reduxFirstRouter.mod.ReceivedAction = (typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pathToAction")(pathname.asInstanceOf[js.Any], routesMap.asInstanceOf[js.Any])).asInstanceOf[typings.reduxFirstRouter.mod.ReceivedAction]
@scala.inline
def pathToAction[TKeys, TState](
  pathname: java.lang.String,
  routesMap: typings.reduxFirstRouter.mod.RoutesMap[TKeys, TState],
  querySerializer: typings.reduxFirstRouter.mod.QuerySerializer
): typings.reduxFirstRouter.mod.ReceivedAction = (typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pathToAction")(pathname.asInstanceOf[js.Any], routesMap.asInstanceOf[js.Any], querySerializer.asInstanceOf[js.Any])).asInstanceOf[typings.reduxFirstRouter.mod.ReceivedAction]

@scala.inline
def prevPath(): java.lang.String | scala.Unit = typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("prevPath")().asInstanceOf[java.lang.String | scala.Unit]

@scala.inline
def push(pathname: java.lang.String): scala.Unit = typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("push")(pathname.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def redirect(action: typings.reduxFirstRouter.mod.Action): typings.reduxFirstRouter.mod.Action = typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(action.asInstanceOf[js.Any]).asInstanceOf[typings.reduxFirstRouter.mod.Action]

@scala.inline
def replace(pathname: java.lang.String): scala.Unit = typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("replace")(pathname.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def scrollBehavior(): typings.reduxFirstRouter.mod.ScrollBehavior_ | scala.Unit = typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("scrollBehavior")().asInstanceOf[typings.reduxFirstRouter.mod.ScrollBehavior_ | scala.Unit]

@scala.inline
def selectLocationState[TState](state: TState): typings.reduxFirstRouter.mod.LocationState[js.Object, js.Any] = typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("selectLocationState")(state.asInstanceOf[js.Any]).asInstanceOf[typings.reduxFirstRouter.mod.LocationState[js.Object, js.Any]]

@scala.inline
def setKind(action: typings.reduxFirstRouter.mod.Action, kind: java.lang.String): typings.reduxFirstRouter.mod.Action = (typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setKind")(action.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typings.reduxFirstRouter.mod.Action]

@scala.inline
def updateScroll(): scala.Unit = typings.reduxFirstRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateScroll")().asInstanceOf[scala.Unit]

type ConfirmLeave = js.Function2[
/* state */ js.Object, 
/* action */ js.Object, 
typings.reduxFirstRouter.mod.Nullable[java.lang.String]]

type DisplayConfirmLeave = js.Function2[
/* message */ java.lang.String, 
/* callback */ js.Function1[/* unblock */ scala.Boolean, scala.Unit], 
scala.Unit]

type HistoryAction = java.lang.String

type HistoryEntries = js.Array[typings.reduxFirstRouter.anon.Pathname]

type Listener = js.Function2[
/* location */ typings.reduxFirstRouter.mod.HistoryLocation, 
/* action */ typings.reduxFirstRouter.mod.HistoryAction, 
scala.Unit]

type Navigators[TState] = org.scalablytyped.runtime.StringDictionary[typings.reduxFirstRouter.mod.Navigator[TState]]

type Nullable[T] = js.UndefOr[T | scala.Null]

type Params = org.scalablytyped.runtime.StringDictionary[js.Any]

type Query = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]

type Route[TKeys, TState] = typings.reduxFirstRouter.mod.RouteString | (typings.reduxFirstRouter.mod.RouteObject[TKeys, TState])

type RouteObject[TKeys, TState] = TKeys & typings.reduxFirstRouter.anon.CapitalizedWords[TState]

type RouteString = java.lang.String

type RouteThunk[TState] = js.Function2[
/* dispatch */ typings.redux.mod.Dispatch[js.Any], 
/* getState */ typings.reduxFirstRouter.mod.StateGetter[TState], 
js.Any | js.Promise[js.Any]]

type RoutesMap[TKeys, TState] = org.scalablytyped.runtime.StringDictionary[typings.reduxFirstRouter.mod.Route[TKeys, TState]]

type ScrollBehavior_ = js.Object

type ScrollUpdater = js.Function1[/* performedByUser */ scala.Boolean, scala.Unit]

type SelectLocationState_[TKeys, TState] = js.Function1[/* state */ TState, typings.reduxFirstRouter.mod.LocationState[TKeys, TState]]

type SelectTitleState[TState] = js.Function1[/* state */ TState, java.lang.String]

type StateGetter[TState] = js.Function0[TState]
