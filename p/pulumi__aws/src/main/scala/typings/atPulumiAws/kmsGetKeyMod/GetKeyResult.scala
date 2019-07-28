package typings.atPulumiAws.kmsGetKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetKeyResult extends js.Object {
  val arn: String
  val awsAccountId: String
  val creationDate: String
  val deletionDate: String
  val description: String
  val enabled: Boolean
  val expirationModel: String
  val grantTokens: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val keyId: String
  val keyManager: String
  val keyState: String
  val keyUsage: String
  val origin: String
  val validTo: String
}

object GetKeyResult {
  @scala.inline
  def apply(
    arn: String,
    awsAccountId: String,
    creationDate: String,
    deletionDate: String,
    description: String,
    enabled: Boolean,
    expirationModel: String,
    id: String,
    keyId: String,
    keyManager: String,
    keyState: String,
    keyUsage: String,
    origin: String,
    validTo: String,
    grantTokens: js.Array[String] = null
  ): GetKeyResult = {
    val __obj = js.Dynamic.literal(arn = arn, awsAccountId = awsAccountId, creationDate = creationDate, deletionDate = deletionDate, description = description, enabled = enabled, expirationModel = expirationModel, id = id, keyId = keyId, keyManager = keyManager, keyState = keyState, keyUsage = keyUsage, origin = origin, validTo = validTo)
    if (grantTokens != null) __obj.updateDynamic("grantTokens")(grantTokens)
    __obj.asInstanceOf[GetKeyResult]
  }
}

