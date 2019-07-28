package typings.rasha.rashaMod

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
    val __obj = js.Dynamic.literal(pem = pem, public = public)
  
    __obj.asInstanceOf[ImportOptions]
  }
}

