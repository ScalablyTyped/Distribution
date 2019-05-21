package typings
package atReachRouterLib.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationContext extends js.Object {
  var location: WindowLocation
  var navigate: NavigateFn
}

object LocationContext {
  @scala.inline
  def apply(location: WindowLocation, navigate: NavigateFn): LocationContext = {
    val __obj = js.Dynamic.literal(location = location, navigate = navigate)
  
    __obj.asInstanceOf[LocationContext]
  }
}

