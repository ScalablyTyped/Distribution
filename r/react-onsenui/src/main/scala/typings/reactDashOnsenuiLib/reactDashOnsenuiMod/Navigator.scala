package typings
package reactDashOnsenuiLib.reactDashOnsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-onsenui", "Navigator")
@js.native
class Navigator ()
  extends Component[reactDashOnsenuiLib.Anon_OnPostPop, js.Any] {
  var pages: js.Array[_] = js.native
  var routes: js.Array[_] = js.native
  def popPage(): stdLib.Promise[reactLib.HTMLElement] = js.native
  def popPage(options: PageTransitionOptions): stdLib.Promise[reactLib.HTMLElement] = js.native
  def pushPage(route: js.Any): stdLib.Promise[reactLib.HTMLElement] = js.native
  def pushPage(route: js.Any, options: PageTransitionOptions): stdLib.Promise[reactLib.HTMLElement] = js.native
  def resetPage(route: js.Any): stdLib.Promise[reactLib.HTMLElement] = js.native
  def resetPage(route: js.Any, options: PageTransitionOptions): stdLib.Promise[reactLib.HTMLElement] = js.native
  def resetPageStack(route: js.Any): stdLib.Promise[reactLib.HTMLElement] = js.native
  def resetPageStack(route: js.Any, options: PageTransitionOptions): stdLib.Promise[reactLib.HTMLElement] = js.native
}

