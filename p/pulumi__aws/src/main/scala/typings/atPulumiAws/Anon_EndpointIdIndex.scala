package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointIdIndex extends js.Object {
  var endpoint: String
  var id: String
  var index: String
  var roleArn: String
  var `type`: String
}

object Anon_EndpointIdIndex {
  @scala.inline
  def apply(endpoint: String, id: String, index: String, roleArn: String, `type`: String): Anon_EndpointIdIndex = {
    val __obj = js.Dynamic.literal(endpoint = endpoint, id = id, index = index, roleArn = roleArn)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_EndpointIdIndex]
  }
}

