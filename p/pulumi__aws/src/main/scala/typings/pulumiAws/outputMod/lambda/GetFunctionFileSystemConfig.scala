package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFunctionFileSystemConfig extends StObject {
  
  /**
    * Unqualified (no `:QUALIFIER` or `:VERSION` suffix) Amazon Resource Name (ARN) identifying your Lambda Function. See also `qualifiedArn`.
    */
  var arn: String = js.native
  
  var localMountPath: String = js.native
}
object GetFunctionFileSystemConfig {
  
  @scala.inline
  def apply(arn: String, localMountPath: String): GetFunctionFileSystemConfig = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], localMountPath = localMountPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionFileSystemConfig]
  }
  
  @scala.inline
  implicit class GetFunctionFileSystemConfigMutableBuilder[Self <: GetFunctionFileSystemConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalMountPath(value: String): Self = StObject.set(x, "localMountPath", value.asInstanceOf[js.Any])
  }
}
