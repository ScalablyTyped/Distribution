package typings.atPulumiAws.typesOutputMod.athena

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkgroupConfigurationResultConfiguration extends js.Object {
  /**
    * Configuration block with encryption settings. Documented below.
    */
  var encryptionConfiguration: js.UndefOr[WorkgroupConfigurationResultConfigurationEncryptionConfiguration] = js.undefined
  /**
    * The location in Amazon S3 where your query results are stored, such as `s3://path/to/query/bucket/`. For more information, see [Queries and Query Result Files](https://docs.aws.amazon.com/athena/latest/ug/querying.html).
    */
  var outputLocation: js.UndefOr[String] = js.undefined
}

object WorkgroupConfigurationResultConfiguration {
  @scala.inline
  def apply(
    encryptionConfiguration: WorkgroupConfigurationResultConfigurationEncryptionConfiguration = null,
    outputLocation: String = null
  ): WorkgroupConfigurationResultConfiguration = {
    val __obj = js.Dynamic.literal()
    if (encryptionConfiguration != null) __obj.updateDynamic("encryptionConfiguration")(encryptionConfiguration)
    if (outputLocation != null) __obj.updateDynamic("outputLocation")(outputLocation)
    __obj.asInstanceOf[WorkgroupConfigurationResultConfiguration]
  }
}

