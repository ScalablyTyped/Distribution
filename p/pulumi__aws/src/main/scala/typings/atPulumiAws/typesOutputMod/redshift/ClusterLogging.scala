package typings.atPulumiAws.typesOutputMod.redshift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterLogging extends js.Object {
  /**
    * The name of an existing S3 bucket where the log files are to be stored. Must be in the same region as the cluster and the cluster must have read bucket and put object permissions.
    * For more information on the permissions required for the bucket, please read the AWS [documentation](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
    */
  var bucketName: String
  /**
    * Enables logging information such as queries and connection attempts, for the specified Amazon Redshift cluster.
    */
  var enable: Boolean
  /**
    * The prefix applied to the log file names.
    */
  var s3KeyPrefix: String
}

object ClusterLogging {
  @scala.inline
  def apply(bucketName: String, enable: Boolean, s3KeyPrefix: String): ClusterLogging = {
    val __obj = js.Dynamic.literal(bucketName = bucketName, enable = enable, s3KeyPrefix = s3KeyPrefix)
  
    __obj.asInstanceOf[ClusterLogging]
  }
}

