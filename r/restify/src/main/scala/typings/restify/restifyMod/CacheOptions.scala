package typings.restify.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOptions extends js.Object {
  var maxAge: Double
}

object CacheOptions {
  @scala.inline
  def apply(maxAge: Double): CacheOptions = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CacheOptions]
  }
}

