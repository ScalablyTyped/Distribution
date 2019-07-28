package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoConfiguration extends js.Object {
  var skipPermissionRequests: Boolean
}

object GeoConfiguration {
  @scala.inline
  def apply(skipPermissionRequests: Boolean): GeoConfiguration = {
    val __obj = js.Dynamic.literal(skipPermissionRequests = skipPermissionRequests)
  
    __obj.asInstanceOf[GeoConfiguration]
  }
}

