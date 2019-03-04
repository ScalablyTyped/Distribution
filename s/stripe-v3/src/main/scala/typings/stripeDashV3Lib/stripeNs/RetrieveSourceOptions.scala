package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrieveSourceOptions extends js.Object {
  var client_secret: java.lang.String
  var id: java.lang.String
}

object RetrieveSourceOptions {
  @scala.inline
  def apply(client_secret: java.lang.String, id: java.lang.String): RetrieveSourceOptions = {
    val __obj = js.Dynamic.literal(client_secret = client_secret, id = id)
  
    __obj.asInstanceOf[RetrieveSourceOptions]
  }
}

