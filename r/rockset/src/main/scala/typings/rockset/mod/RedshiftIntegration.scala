package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedshiftIntegration extends js.Object {
  
  // AWS access key credentials
  var aws_access_key: js.UndefOr[AwsAccessKey] = js.native
  
  // Redshift Cluster host
  var host: String = js.native
  
  // Password associated with Redshift cluster
  var password: String = js.native
  
  // Redshift Cluster port
  var port: Double = js.native
  
  // unload S3 bucket path
  var s3_bucket_path: String = js.native
  
  // Username associated with Redshift cluster
  var username: String = js.native
}
object RedshiftIntegration {
  
  @scala.inline
  def apply(host: String, password: String, port: Double, s3_bucket_path: String, username: String): RedshiftIntegration = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], s3_bucket_path = s3_bucket_path.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftIntegration]
  }
  
  @scala.inline
  implicit class RedshiftIntegrationOps[Self <: RedshiftIntegration] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3_bucket_path(value: String): Self = this.set("s3_bucket_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAws_access_key(value: AwsAccessKey): Self = this.set("aws_access_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAws_access_key: Self = this.set("aws_access_key", js.undefined)
  }
}
