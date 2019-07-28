package typings.stripeDashV3.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrieveSourceOptions extends js.Object {
  var client_secret: String
  var id: String
}

object RetrieveSourceOptions {
  @scala.inline
  def apply(client_secret: String, id: String): RetrieveSourceOptions = {
    val __obj = js.Dynamic.literal(client_secret = client_secret, id = id)
  
    __obj.asInstanceOf[RetrieveSourceOptions]
  }
}

