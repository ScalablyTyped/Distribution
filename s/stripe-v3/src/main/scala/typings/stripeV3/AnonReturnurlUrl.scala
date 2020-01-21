package typings.stripeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReturnurlUrl extends js.Object {
  /**
    * If the customer does not exit their browser while
    * authenticating, they will be redirected to this
    * specified URL after completion.
    */
  var return_url: String
  /**
    * The URL you must redirect your customer to in
    * order to authenticate.
    */
  var url: String
}

object AnonReturnurlUrl {
  @scala.inline
  def apply(return_url: String, url: String): AnonReturnurlUrl = {
    val __obj = js.Dynamic.literal(return_url = return_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReturnurlUrl]
  }
}

