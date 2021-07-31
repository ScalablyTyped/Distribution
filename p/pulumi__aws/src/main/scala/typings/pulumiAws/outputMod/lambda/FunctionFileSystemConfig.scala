package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionFileSystemConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon EFS Access Point that provides access to the file system.
    */
  var arn: String
  
  /**
    * The path where the function can access the file system, starting with /mnt/.
    */
  var localMountPath: String
}
object FunctionFileSystemConfig {
  
  @scala.inline
  def apply(arn: String, localMountPath: String): FunctionFileSystemConfig = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], localMountPath = localMountPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionFileSystemConfig]
  }
  
  @scala.inline
  implicit class FunctionFileSystemConfigMutableBuilder[Self <: FunctionFileSystemConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalMountPath(value: String): Self = StObject.set(x, "localMountPath", value.asInstanceOf[js.Any])
  }
}
