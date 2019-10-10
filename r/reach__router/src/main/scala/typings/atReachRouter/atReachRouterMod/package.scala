package typings.atReachRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atReachRouterMod {
  import typings.atReachRouter.Anon_Default
  import typings.atReachRouter.Anon_State
  import typings.atReachRouter.atReachRouterStrings.href
  import typings.history.historyMod.LocationState
  import typings.react.reactMod.AnchorHTMLAttributes
  import typings.react.reactMod.DetailedHTMLProps
  import typings.react.reactMod.ReactNode
  import typings.std.Exclude
  import typings.std.HTMLAnchorElement
  import typings.std.Partial
  import typings.std.Pick

  type AnchorProps = Omit[
    DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
    href
  ]
  type HistoryListener = js.Function1[/* parameter */ HistoryListenerParameter, Unit]
  type HistoryLocation = WindowLocation with Anon_State
  type HistoryUnsubscribe = js.Function0[Unit]
  type LocationProviderRenderFn = js.Function1[/* context */ LocationContext, ReactNode]
  type MatchRenderFn[TParams] = js.Function1[/* props */ MatchRenderProps[TParams], ReactNode]
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type RouteComponentProps[TParams] = Partial[TParams] with Anon_Default
  type WindowLocation = typings.std.Location with typings.history.historyMod.Location[LocationState]
}
