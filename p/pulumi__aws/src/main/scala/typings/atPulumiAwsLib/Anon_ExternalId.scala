package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExternalId extends js.Object {
  var externalId: java.lang.String
  var snsCallerArn: java.lang.String
}

object Anon_ExternalId {
  @scala.inline
  def apply(externalId: java.lang.String, snsCallerArn: java.lang.String): Anon_ExternalId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("externalId")(externalId)
    __obj.updateDynamic("snsCallerArn")(snsCallerArn)
    __obj.asInstanceOf[Anon_ExternalId]
  }
}

