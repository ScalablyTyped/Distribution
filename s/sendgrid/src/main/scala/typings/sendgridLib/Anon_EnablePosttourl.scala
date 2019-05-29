package typings
package sendgridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnablePosttourl extends js.Object {
  var enable: scala.Boolean
  var post_to_url: java.lang.String
  var threshold: scala.Double
}

object Anon_EnablePosttourl {
  @scala.inline
  def apply(enable: scala.Boolean, post_to_url: java.lang.String, threshold: scala.Double): Anon_EnablePosttourl = {
    val __obj = js.Dynamic.literal(enable = enable, post_to_url = post_to_url, threshold = threshold)
  
    __obj.asInstanceOf[Anon_EnablePosttourl]
  }
}

