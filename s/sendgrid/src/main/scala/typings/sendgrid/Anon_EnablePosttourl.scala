package typings.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnablePosttourl extends js.Object {
  var enable: Boolean
  var post_to_url: String
  var threshold: Double
}

object Anon_EnablePosttourl {
  @scala.inline
  def apply(enable: Boolean, post_to_url: String, threshold: Double): Anon_EnablePosttourl = {
    val __obj = js.Dynamic.literal(enable = enable, post_to_url = post_to_url, threshold = threshold)
  
    __obj.asInstanceOf[Anon_EnablePosttourl]
  }
}

