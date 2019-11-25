package typings.requestidlecallback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdleRequestOptions extends js.Object {
  var timeout: Double
}

object IdleRequestOptions {
  @scala.inline
  def apply(timeout: Double): IdleRequestOptions = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IdleRequestOptions]
  }
}

