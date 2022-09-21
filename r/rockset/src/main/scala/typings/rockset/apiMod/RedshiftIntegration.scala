package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftIntegration extends StObject {
  
  /**
    * AWS access key credentials
    * @type {AwsAccessKey}
    * @memberof RedshiftIntegration
    */
  var aws_access_key: js.UndefOr[AwsAccessKey] = js.undefined
  
  /**
    * Redshift Cluster host
    * @type {string}
    * @memberof RedshiftIntegration
    */
  var host: String
  
  /**
    * Password associated with Redshift cluster
    * @type {string}
    * @memberof RedshiftIntegration
    */
  var password: String
  
  /**
    * Redshift Cluster port
    * @type {number}
    * @memberof RedshiftIntegration
    */
  var port: Double
  
  /**
    * unload S3 bucket path
    * @type {string}
    * @memberof RedshiftIntegration
    */
  var s3_bucket_path: String
  
  /**
    * Username associated with Redshift cluster
    * @type {string}
    * @memberof RedshiftIntegration
    */
  var username: String
}
object RedshiftIntegration {
  
  inline def apply(host: String, password: String, port: Double, s3_bucket_path: String, username: String): RedshiftIntegration = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], s3_bucket_path = s3_bucket_path.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftIntegration]
  }
  
  extension [Self <: RedshiftIntegration](x: Self) {
    
    inline def setAws_access_key(value: AwsAccessKey): Self = StObject.set(x, "aws_access_key", value.asInstanceOf[js.Any])
    
    inline def setAws_access_keyUndefined: Self = StObject.set(x, "aws_access_key", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setS3_bucket_path(value: String): Self = StObject.set(x, "s3_bucket_path", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
