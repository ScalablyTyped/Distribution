package typings.atPulumiAws.typesInputMod.redshiftNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterLogging extends js.Object {
  /**
    * The name of an existing S3 bucket where the log files are to be stored. Must be in the same region as the cluster and the cluster must have read bucket and put object permissions.
    * For more information on the permissions required for the bucket, please read the AWS [documentation](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
    */
  var bucketName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Enables logging information such as queries and connection attempts, for the specified Amazon Redshift cluster.
    */
  var enable: Input[Boolean]
  /**
    * The prefix applied to the log file names.
    */
  var s3KeyPrefix: js.UndefOr[Input[String]] = js.undefined
}

object ClusterLogging {
  @scala.inline
  def apply(enable: Input[Boolean], bucketName: Input[String] = null, s3KeyPrefix: Input[String] = null): ClusterLogging = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    if (s3KeyPrefix != null) __obj.updateDynamic("s3KeyPrefix")(s3KeyPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLogging]
  }
}

