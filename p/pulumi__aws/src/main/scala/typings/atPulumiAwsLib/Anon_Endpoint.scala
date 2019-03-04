package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Endpoint extends js.Object {
  var endpoint: java.lang.String
  var region: java.lang.String
}

object Anon_Endpoint {
  @scala.inline
  def apply(endpoint: java.lang.String, region: java.lang.String): Anon_Endpoint = {
    val __obj = js.Dynamic.literal(endpoint = endpoint, region = region)
  
    __obj.asInstanceOf[Anon_Endpoint]
  }
}

