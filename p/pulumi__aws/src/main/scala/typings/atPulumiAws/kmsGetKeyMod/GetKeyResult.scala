package typings.atPulumiAws.kmsGetKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetKeyResult extends js.Object {
  val arn: String = js.native
  val awsAccountId: String = js.native
  val creationDate: String = js.native
  val deletionDate: String = js.native
  val description: String = js.native
  val enabled: Boolean = js.native
  val expirationModel: String = js.native
  val grantTokens: js.UndefOr[js.Array[String]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val keyId: String = js.native
  val keyManager: String = js.native
  val keyState: String = js.native
  val keyUsage: String = js.native
  val origin: String = js.native
  val validTo: String = js.native
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
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], awsAccountId = awsAccountId.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], deletionDate = deletionDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], expirationModel = expirationModel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], keyManager = keyManager.asInstanceOf[js.Any], keyState = keyState.asInstanceOf[js.Any], keyUsage = keyUsage.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], validTo = validTo.asInstanceOf[js.Any])
    if (grantTokens != null) __obj.updateDynamic("grantTokens")(grantTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyResult]
  }
}

