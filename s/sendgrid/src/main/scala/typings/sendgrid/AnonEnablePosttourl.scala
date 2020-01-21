package typings.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnablePosttourl extends js.Object {
  var enable: Boolean
  var post_to_url: String
  var threshold: Double
}

object AnonEnablePosttourl {
  @scala.inline
  def apply(enable: Boolean, post_to_url: String, threshold: Double): AnonEnablePosttourl = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], post_to_url = post_to_url.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnablePosttourl]
  }
}

