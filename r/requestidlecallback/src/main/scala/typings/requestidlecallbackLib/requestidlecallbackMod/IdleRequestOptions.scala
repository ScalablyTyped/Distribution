package typings
package requestidlecallbackLib.requestidlecallbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdleRequestOptions extends js.Object {
  var timeout: scala.Double
}

object IdleRequestOptions {
  @scala.inline
  def apply(timeout: scala.Double): IdleRequestOptions = {
    val __obj = js.Dynamic.literal(timeout = timeout)
  
    __obj.asInstanceOf[IdleRequestOptions]
  }
}

