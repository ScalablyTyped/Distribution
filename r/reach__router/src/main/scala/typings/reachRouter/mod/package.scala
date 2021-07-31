package typings.reachRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def Link[TState](
  // TODO: Define this as ...params: Parameters<Link<TState>> when only TypeScript >= 3.1 support is needed.
props: typings.react.mod.PropsWithoutRef[typings.reachRouter.mod.LinkProps[TState]] & typings.react.mod.RefAttributes[typings.std.HTMLAnchorElement]
): typings.std.ReturnType[typings.reachRouter.mod.Link[TState]] = typings.reachRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Link")(props.asInstanceOf[js.Any]).asInstanceOf[typings.std.ReturnType[typings.reachRouter.mod.Link[TState]]]
type Link[TState] = typings.react.mod.ForwardRefExoticComponent[
typings.react.mod.PropsWithoutRef[typings.reachRouter.mod.LinkProps[TState]] & typings.react.mod.RefAttributes[typings.std.HTMLAnchorElement]]

@scala.inline
def createHistory(source: typings.reachRouter.mod.HistorySource): typings.reachRouter.mod.History = typings.reachRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createHistory")(source.asInstanceOf[js.Any]).asInstanceOf[typings.reachRouter.mod.History]

@scala.inline
def createMemorySource(initialPath: java.lang.String): typings.reachRouter.mod.HistorySource = typings.reachRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMemorySource")(initialPath.asInstanceOf[js.Any]).asInstanceOf[typings.reachRouter.mod.HistorySource]

@scala.inline
def globalHistory: typings.reachRouter.mod.History = typings.reachRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("globalHistory").asInstanceOf[typings.reachRouter.mod.History]

@scala.inline
def isRedirect(error: js.Any): /* is @reach/router.@reach/router.RedirectRequest */ scala.Boolean = typings.reachRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isRedirect")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @reach/router.@reach/router.RedirectRequest */ scala.Boolean]

@scala.inline
def navigate: typings.reachRouter.mod.NavigateFn = typings.reachRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("navigate").asInstanceOf[typings.reachRouter.mod.NavigateFn]

@scala.inline
def redirectTo(uri: java.lang.String): scala.Unit = typings.reachRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("redirectTo")(uri.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def useLocation(): typings.reachRouter.mod.WindowLocation[typings.history.mod.LocationState] = typings.reachRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[typings.reachRouter.mod.WindowLocation[typings.history.mod.LocationState]]

@scala.inline
def useMatch(pathname: java.lang.String): scala.Null | typings.reachRouter.anon.Dictparam = typings.reachRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useMatch")(pathname.asInstanceOf[js.Any]).asInstanceOf[scala.Null | typings.reachRouter.anon.Dictparam]

@scala.inline
def useNavigate(): typings.reachRouter.mod.NavigateFn = typings.reachRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useNavigate")().asInstanceOf[typings.reachRouter.mod.NavigateFn]

@scala.inline
def useParams(): js.Any = typings.reachRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useParams")().asInstanceOf[js.Any]

type HistoryListener = js.Function1[/* parameter */ typings.reachRouter.mod.HistoryListenerParameter, scala.Unit]

type HistoryLocation = typings.reachRouter.mod.WindowLocation[typings.history.mod.LocationState] & typings.reachRouter.anon.State

type HistoryUnsubscribe = js.Function0[scala.Unit]

type LocationProviderRenderFn = js.Function1[/* context */ typings.reachRouter.mod.LocationContext, typings.react.mod.ReactNode]

type MatchRenderFn[TParams] = js.Function1[
/* props */ typings.reachRouter.mod.MatchRenderProps[TParams], 
typings.react.mod.ReactNode]

type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]

type RouteComponentProps[TParams] = typings.std.Partial[TParams] & typings.reachRouter.anon.Default

type WindowLocation[S] = typings.std.Location & typings.history.mod.Location[S]
