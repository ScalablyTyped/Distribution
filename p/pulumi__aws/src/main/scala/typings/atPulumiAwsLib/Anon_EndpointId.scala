package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointId extends js.Object {
  var endpoint: java.lang.String
  var id: java.lang.String
  var index: java.lang.String
  var roleArn: java.lang.String
  var `type`: java.lang.String
}

object Anon_EndpointId {
  @scala.inline
  def apply(
    endpoint: java.lang.String,
    id: java.lang.String,
    index: java.lang.String,
    roleArn: java.lang.String,
    `type`: java.lang.String
  ): Anon_EndpointId = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("endpoint")(endpoint)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[Anon_EndpointId]
  }
}

