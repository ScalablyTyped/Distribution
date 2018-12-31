package typings
package atReachRouterLib.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@reach/router", JSImport.Namespace)
@js.native
object routerModMembers extends js.Object {
  val globalHistory: History = js.native
  val navigate: NavigateFn = js.native
  def createHistory(source: HistorySource): History = js.native
  def createMemorySource(initialPath: java.lang.String): HistorySource = js.native
  def isRedirect(error: js.Any): /* is @reach/router.@reach/router.RedirectRequest */ scala.Boolean = js.native
  def redirectTo(uri: java.lang.String): scala.Unit = js.native
}

