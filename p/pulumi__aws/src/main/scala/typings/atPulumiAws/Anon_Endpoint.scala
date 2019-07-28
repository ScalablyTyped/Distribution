package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Endpoint extends js.Object {
  var endpoint: String
  var region: String
}

object Anon_Endpoint {
  @scala.inline
  def apply(endpoint: String, region: String): Anon_Endpoint = {
    val __obj = js.Dynamic.literal(endpoint = endpoint, region = region)
  
    __obj.asInstanceOf[Anon_Endpoint]
  }
}

