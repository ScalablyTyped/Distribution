package typings.pulumiAws.kmsGetKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetKeyResult extends js.Object {
  val arn: String = js.native
  val awsAccountId: String = js.native
  val creationDate: String = js.native
  val customerMasterKeySpec: String = js.native
  val deletionDate: String = js.native
  val description: String = js.native
  val enabled: Boolean = js.native
  val expirationModel: String = js.native
  val grantTokens: js.UndefOr[js.Array[String]] = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
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
    customerMasterKeySpec: String,
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
    validTo: String
  ): GetKeyResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], awsAccountId = awsAccountId.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], customerMasterKeySpec = customerMasterKeySpec.asInstanceOf[js.Any], deletionDate = deletionDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], expirationModel = expirationModel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], keyManager = keyManager.asInstanceOf[js.Any], keyState = keyState.asInstanceOf[js.Any], keyUsage = keyUsage.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], validTo = validTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyResult]
  }
  @scala.inline
  implicit class GetKeyResultOps[Self <: GetKeyResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAwsAccountId(value: String): Self = this.set("awsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationDate(value: String): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomerMasterKeySpec(value: String): Self = this.set("customerMasterKeySpec", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletionDate(value: String): Self = this.set("deletionDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationModel(value: String): Self = this.set("expirationModel", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyManager(value: String): Self = this.set("keyManager", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyState(value: String): Self = this.set("keyState", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyUsage(value: String): Self = this.set("keyUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidTo(value: String): Self = this.set("validTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrantTokensVarargs(value: String*): Self = this.set("grantTokens", js.Array(value :_*))
    @scala.inline
    def setGrantTokens(value: js.Array[String]): Self = this.set("grantTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantTokens: Self = this.set("grantTokens", js.undefined)
  }
  
}

