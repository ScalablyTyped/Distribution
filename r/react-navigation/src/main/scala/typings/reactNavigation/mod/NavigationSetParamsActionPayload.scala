package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationSetParamsActionPayload extends js.Object {
  // The key of the route where the params should be set
  var key: String
  // The new params to merge into the existing route params
  var params: NavigationParams
}

object NavigationSetParamsActionPayload {
  @scala.inline
  def apply(key: String, params: NavigationParams): NavigationSetParamsActionPayload = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigationSetParamsActionPayload]
  }
}

