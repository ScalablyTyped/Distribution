package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentBucket extends js.Object {
  var blockPublicAccess: js.UndefOr[Boolean] = js.undefined
  var maxPreviousDeploymentArtifacts: js.UndefOr[Double | String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var serverSideEncryption: js.UndefOr[String] = js.undefined
  var sseCustomerAlgorithim: js.UndefOr[String] = js.undefined
  var sseCustomerKey: js.UndefOr[String] = js.undefined
  var sseCustomerKeyMD5: js.UndefOr[String] = js.undefined
  var sseKMSKeyId: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[Tags] = js.undefined
}

object DeploymentBucket {
  @scala.inline
  def apply(
    blockPublicAccess: js.UndefOr[Boolean] = js.undefined,
    maxPreviousDeploymentArtifacts: Double | String = null,
    name: String = null,
    serverSideEncryption: String = null,
    sseCustomerAlgorithim: String = null,
    sseCustomerKey: String = null,
    sseCustomerKeyMD5: String = null,
    sseKMSKeyId: String = null,
    tags: Tags = null
  ): DeploymentBucket = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockPublicAccess)) __obj.updateDynamic("blockPublicAccess")(blockPublicAccess.get.asInstanceOf[js.Any])
    if (maxPreviousDeploymentArtifacts != null) __obj.updateDynamic("maxPreviousDeploymentArtifacts")(maxPreviousDeploymentArtifacts.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (serverSideEncryption != null) __obj.updateDynamic("serverSideEncryption")(serverSideEncryption.asInstanceOf[js.Any])
    if (sseCustomerAlgorithim != null) __obj.updateDynamic("sseCustomerAlgorithim")(sseCustomerAlgorithim.asInstanceOf[js.Any])
    if (sseCustomerKey != null) __obj.updateDynamic("sseCustomerKey")(sseCustomerKey.asInstanceOf[js.Any])
    if (sseCustomerKeyMD5 != null) __obj.updateDynamic("sseCustomerKeyMD5")(sseCustomerKeyMD5.asInstanceOf[js.Any])
    if (sseKMSKeyId != null) __obj.updateDynamic("sseKMSKeyId")(sseKMSKeyId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentBucket]
  }
}

