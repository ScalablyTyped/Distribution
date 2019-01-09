package typings
package atReachRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routerMod {
  type AnchorProps = Omit[
    reactLib.reactMod.ReactNs.DetailedHTMLProps[
      reactLib.reactMod.ReactNs.AnchorHTMLAttributes[reactLib.HTMLAnchorElement], 
      reactLib.HTMLAnchorElement
    ], 
    atReachRouterLib.atReachRouterLibStrings.href
  ]
  type HistoryActionType = atReachRouterLib.atReachRouterLibStrings.PUSH | atReachRouterLib.atReachRouterLibStrings.POP
  type HistoryListener = js.Function1[/* parameter */ HistoryListenerParameter, scala.Unit]
  type HistoryLocation = WindowLocation with atReachRouterLib.Anon_State
  type HistoryUnsubscribe = js.Function0[scala.Unit]
  type LocationProviderRenderFn = js.Function1[/* context */ LocationContext, reactLib.reactMod.ReactNs.ReactNode]
  type MatchRenderFn[TParams] = js.Function1[/* props */ MatchRenderProps[TParams], reactLib.reactMod.ReactNs.ReactNode]
  type NavigateFn = js.Function2[
    /* to */ java.lang.String, 
    /* options */ js.UndefOr[NavigateOptions[js.Object]], 
    scala.Unit
  ]
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type RouteComponentProps[TParams] = stdLib.Partial[TParams] with atReachRouterLib.Anon_Default
  type WindowLocation = stdLib.Location with historyLib.historyMod.Location[historyLib.historyMod.LocationState]
}
