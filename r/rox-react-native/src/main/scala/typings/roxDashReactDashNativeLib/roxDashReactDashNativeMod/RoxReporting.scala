package typings
package roxDashReactDashNativeLib.roxDashReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoxReporting extends js.Object {
  var name: java.lang.String
  var value: java.lang.String
}

object RoxReporting {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): RoxReporting = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[RoxReporting]
  }
}

