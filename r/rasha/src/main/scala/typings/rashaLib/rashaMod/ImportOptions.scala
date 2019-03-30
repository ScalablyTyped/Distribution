package typings
package rashaLib.rashaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportOptions extends js.Object {
  var pem: java.lang.String
  var public: scala.Boolean
}

object ImportOptions {
  @scala.inline
  def apply(pem: java.lang.String, public: scala.Boolean): ImportOptions = {
    val __obj = js.Dynamic.literal(pem = pem, public = public)
  
    __obj.asInstanceOf[ImportOptions]
  }
}

