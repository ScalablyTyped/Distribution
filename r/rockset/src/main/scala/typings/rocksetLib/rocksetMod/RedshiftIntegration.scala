package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedshiftIntegration extends js.Object {
  // AWS access key credentials
  var aws_access_key: js.UndefOr[AwsAccessKey] = js.undefined
  // Redshift Cluster host
  var host: java.lang.String
  // Password associated with Redshift cluster
  var password: java.lang.String
  // Redshift Cluster port
  var port: scala.Double
  // unload S3 bucket path
  var s3_bucket_path: java.lang.String
  // Username associated with Redshift cluster
  var username: java.lang.String
}

object RedshiftIntegration {
  @scala.inline
  def apply(
    host: java.lang.String,
    password: java.lang.String,
    port: scala.Double,
    s3_bucket_path: java.lang.String,
    username: java.lang.String,
    aws_access_key: AwsAccessKey = null
  ): RedshiftIntegration = {
    val __obj = js.Dynamic.literal(host = host, password = password, port = port, s3_bucket_path = s3_bucket_path, username = username)
    if (aws_access_key != null) __obj.updateDynamic("aws_access_key")(aws_access_key)
    __obj.asInstanceOf[RedshiftIntegration]
  }
}

