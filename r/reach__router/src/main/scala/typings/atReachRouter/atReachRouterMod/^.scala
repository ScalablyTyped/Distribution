package typings.atReachRouter.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@reach/router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val globalHistory: History = js.native
  val navigate: NavigateFn = js.native
  def createHistory(source: HistorySource): History = js.native
  def createMemorySource(initialPath: String): HistorySource = js.native
  def isRedirect(error: js.Any): /* is @reach/router.@reach/router.RedirectRequest */ Boolean = js.native
  def redirectTo(uri: String): Unit = js.native
}

