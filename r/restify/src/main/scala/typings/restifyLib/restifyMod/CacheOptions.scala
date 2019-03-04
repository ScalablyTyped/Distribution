package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOptions extends js.Object {
  var maxAge: scala.Double
}

object CacheOptions {
  @scala.inline
  def apply(maxAge: scala.Double): CacheOptions = {
    val __obj = js.Dynamic.literal(maxAge = maxAge)
  
    __obj.asInstanceOf[CacheOptions]
  }
}

