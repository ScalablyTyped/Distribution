package typings
package atPulumiAwsLib.kmsGetKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetKeyResult extends js.Object {
  val arn: java.lang.String
  val awsAccountId: java.lang.String
  val creationDate: java.lang.String
  val deletionDate: java.lang.String
  val description: java.lang.String
  val enabled: scala.Boolean
  val expirationModel: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val keyManager: java.lang.String
  val keyState: java.lang.String
  val keyUsage: java.lang.String
  val origin: java.lang.String
  val validTo: java.lang.String
}

object GetKeyResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    awsAccountId: java.lang.String,
    creationDate: java.lang.String,
    deletionDate: java.lang.String,
    description: java.lang.String,
    enabled: scala.Boolean,
    expirationModel: java.lang.String,
    id: java.lang.String,
    keyManager: java.lang.String,
    keyState: java.lang.String,
    keyUsage: java.lang.String,
    origin: java.lang.String,
    validTo: java.lang.String
  ): GetKeyResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("awsAccountId")(awsAccountId)
    __obj.updateDynamic("creationDate")(creationDate)
    __obj.updateDynamic("deletionDate")(deletionDate)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("expirationModel")(expirationModel)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("keyManager")(keyManager)
    __obj.updateDynamic("keyState")(keyState)
    __obj.updateDynamic("keyUsage")(keyUsage)
    __obj.updateDynamic("origin")(origin)
    __obj.updateDynamic("validTo")(validTo)
    __obj.asInstanceOf[GetKeyResult]
  }
}

