package typings.rasha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportOptions extends js.Object {
  var pem: String
  var public: Boolean
}

object ImportOptions {
  @scala.inline
  def apply(pem: String, public: Boolean): ImportOptions = {
    val __obj = js.Dynamic.literal(pem = pem.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImportOptions]
  }
}

