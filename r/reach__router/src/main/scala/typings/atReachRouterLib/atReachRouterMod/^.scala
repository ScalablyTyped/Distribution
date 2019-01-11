package typings
package atReachRouterLib.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@reach/router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val globalHistory: atReachRouterLib.atReachRouterMod.History = js.native
  val navigate: atReachRouterLib.atReachRouterMod.NavigateFn = js.native
  def createHistory(source: atReachRouterLib.atReachRouterMod.HistorySource): atReachRouterLib.atReachRouterMod.History = js.native
  def createMemorySource(initialPath: java.lang.String): atReachRouterLib.atReachRouterMod.HistorySource = js.native
  def isRedirect(error: js.Any): /* is @reach/router.@reach/router.RedirectRequest */ scala.Boolean = js.native
  def redirectTo(uri: java.lang.String): scala.Unit = js.native
}

