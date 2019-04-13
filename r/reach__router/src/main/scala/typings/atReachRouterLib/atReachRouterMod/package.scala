package typings
package atReachRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atReachRouterMod {
  type AnchorProps = Omit[
    reactLib.reactMod.DetailedHTMLProps[
      reactLib.reactMod.AnchorHTMLAttributes[stdLib.HTMLAnchorElement], 
      stdLib.HTMLAnchorElement
    ], 
    atReachRouterLib.atReachRouterLibStrings.href
  ]
  type HistoryListener = js.Function1[/* parameter */ HistoryListenerParameter, scala.Unit]
  type HistoryLocation = WindowLocation with atReachRouterLib.Anon_State
  type HistoryUnsubscribe = js.Function0[scala.Unit]
  type LocationProviderRenderFn = js.Function1[/* context */ LocationContext, reactLib.reactMod.ReactNode]
  type MatchRenderFn[TParams] = js.Function1[/* props */ MatchRenderProps[TParams], reactLib.reactMod.ReactNode]
  type NavigateFn = js.Function2[
    /* to */ java.lang.String, 
    /* options */ js.UndefOr[NavigateOptions[js.Object]], 
    scala.Unit
  ]
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type RouteComponentProps[TParams] = stdLib.Partial[TParams] with atReachRouterLib.Anon_Default
  type WindowLocation = stdLib.Location with historyLib.historyMod.Location[historyLib.historyMod.LocationState]
}
