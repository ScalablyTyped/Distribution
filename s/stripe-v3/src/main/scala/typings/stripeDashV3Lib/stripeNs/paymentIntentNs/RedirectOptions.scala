package typings
package stripeDashV3Lib.stripeNs.paymentIntentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectOptions extends js.Object {
  var return_url: java.lang.String
  var url: java.lang.String
}

object RedirectOptions {
  @scala.inline
  def apply(return_url: java.lang.String, url: java.lang.String): RedirectOptions = {
    val __obj = js.Dynamic.literal(return_url = return_url, url = url)
  
    __obj.asInstanceOf[RedirectOptions]
  }
}

