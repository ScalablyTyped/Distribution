package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedshiftIntegration extends js.Object {
  // AWS access key credentials
  var aws_access_key: js.UndefOr[AwsAccessKey] = js.undefined
  // Redshift Cluster host
  var host: String
  // Password associated with Redshift cluster
  var password: String
  // Redshift Cluster port
  var port: Double
  // unload S3 bucket path
  var s3_bucket_path: String
  // Username associated with Redshift cluster
  var username: String
}

object RedshiftIntegration {
  @scala.inline
  def apply(
    host: String,
    password: String,
    port: Double,
    s3_bucket_path: String,
    username: String,
    aws_access_key: AwsAccessKey = null
  ): RedshiftIntegration = {
    val __obj = js.Dynamic.literal(host = host, password = password, port = port, s3_bucket_path = s3_bucket_path, username = username)
    if (aws_access_key != null) __obj.updateDynamic("aws_access_key")(aws_access_key)
    __obj.asInstanceOf[RedshiftIntegration]
  }
}

