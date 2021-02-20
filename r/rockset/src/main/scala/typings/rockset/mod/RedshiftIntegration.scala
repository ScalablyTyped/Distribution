package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedshiftIntegration extends StObject {
  
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
  implicit class RedshiftIntegrationMutableBuilder[Self <: RedshiftIntegration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAws_access_key(value: AwsAccessKey): Self = StObject.set(x, "aws_access_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAws_access_keyUndefined: Self = StObject.set(x, "aws_access_key", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3_bucket_path(value: String): Self = StObject.set(x, "s3_bucket_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
