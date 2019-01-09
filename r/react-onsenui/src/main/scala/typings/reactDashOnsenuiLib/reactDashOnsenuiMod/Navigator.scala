package typings
package reactDashOnsenuiLib.reactDashOnsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-onsenui", "Navigator")
@js.native
class Navigator ()
  extends Component[reactDashOnsenuiLib.Anon_AnimationAnimationOptions, js.Any] {
  var pages: js.Array[_] = js.native
  var routes: js.Array[_] = js.native
  def popPage(): js.Promise[reactLib.HTMLElement] = js.native
  def popPage(options: PageTransitionOptions): js.Promise[reactLib.HTMLElement] = js.native
  def pushPage(route: js.Any): js.Promise[reactLib.HTMLElement] = js.native
  def pushPage(route: js.Any, options: PageTransitionOptions): js.Promise[reactLib.HTMLElement] = js.native
  def resetPage(route: js.Any): js.Promise[reactLib.HTMLElement] = js.native
  def resetPage(route: js.Any, options: PageTransitionOptions): js.Promise[reactLib.HTMLElement] = js.native
  def resetPageStack(route: js.Any): js.Promise[reactLib.HTMLElement] = js.native
  def resetPageStack(route: js.Any, options: PageTransitionOptions): js.Promise[reactLib.HTMLElement] = js.native
}

