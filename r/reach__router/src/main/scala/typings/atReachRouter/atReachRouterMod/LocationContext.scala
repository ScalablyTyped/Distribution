package typings.atReachRouter.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationContext extends js.Object {
  var location: WindowLocation
  var navigate: NavigateFn
}

object LocationContext {
  @scala.inline
  def apply(
    location: WindowLocation,
    navigate: (/* to */ String, /* options */ js.UndefOr[NavigateOptions[js.Object]]) => Unit
  ): LocationContext = {
    val __obj = js.Dynamic.literal(location = location, navigate = js.Any.fromFunction2(navigate))
  
    __obj.asInstanceOf[LocationContext]
  }
}

