package typings
package atReachRouterLib.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationContext extends js.Object {
  var location: WindowLocation = js.native
  @JSName("navigate")
  var navigate_Original: NavigateFn = js.native
  def navigate(to: java.lang.String): scala.Unit = js.native
  def navigate(to: java.lang.String, options: NavigateOptions[js.Object]): scala.Unit = js.native
}

