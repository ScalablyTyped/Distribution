package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReturnurlUrl extends js.Object {
  /**
    * If the customer does not exit their browser while
    * authenticating, they will be redirected to this
    * specified URL after completion.
    */
  var return_url: java.lang.String
  /**
    * The URL you must redirect your customer to in
    * order to authenticate the payment.
    */
  var url: java.lang.String
}

object Anon_ReturnurlUrl {
  @scala.inline
  def apply(return_url: java.lang.String, url: java.lang.String): Anon_ReturnurlUrl = {
    val __obj = js.Dynamic.literal(return_url = return_url, url = url)
  
    __obj.asInstanceOf[Anon_ReturnurlUrl]
  }
}

