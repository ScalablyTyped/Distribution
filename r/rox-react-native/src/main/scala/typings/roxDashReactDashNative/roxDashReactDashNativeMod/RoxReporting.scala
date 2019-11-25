package typings.roxDashReactDashNative.roxDashReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoxReporting extends js.Object {
  var name: String
  var value: String
}

object RoxReporting {
  @scala.inline
  def apply(name: String, value: String): RoxReporting = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RoxReporting]
  }
}

