package typings.atPulumiAws.typesInputMod.athenaNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkgroupConfigurationResultConfiguration extends js.Object {
  /**
    * Configuration block with encryption settings. Documented below.
    */
  var encryptionConfiguration: js.UndefOr[Input[WorkgroupConfigurationResultConfigurationEncryptionConfiguration]] = js.undefined
  /**
    * The location in Amazon S3 where your query results are stored, such as `s3://path/to/query/bucket/`. For more information, see [Queries and Query Result Files](https://docs.aws.amazon.com/athena/latest/ug/querying.html).
    */
  var outputLocation: js.UndefOr[Input[String]] = js.undefined
}

object WorkgroupConfigurationResultConfiguration {
  @scala.inline
  def apply(
    encryptionConfiguration: Input[WorkgroupConfigurationResultConfigurationEncryptionConfiguration] = null,
    outputLocation: Input[String] = null
  ): WorkgroupConfigurationResultConfiguration = {
    val __obj = js.Dynamic.literal()
    if (encryptionConfiguration != null) __obj.updateDynamic("encryptionConfiguration")(encryptionConfiguration.asInstanceOf[js.Any])
    if (outputLocation != null) __obj.updateDynamic("outputLocation")(outputLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkgroupConfigurationResultConfiguration]
  }
}

