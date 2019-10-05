package typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingMod

import typings.history.createBrowserHistoryMod.BrowserHistoryBuildOptions
import typings.history.historyMod.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-routing", "createBrowserHistory")
@js.native
object createBrowserHistory extends js.Object {
  def apply[S](): History[S] = js.native
  def apply[S](options: BrowserHistoryBuildOptions): History[S] = js.native
}

