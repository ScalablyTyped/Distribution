package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFunctionFileSystemConfig extends StObject {
  
  /**
    * Unqualified (no `:QUALIFIER` or `:VERSION` suffix) Amazon Resource Name (ARN) identifying your Lambda Function. See also `qualifiedArn`.
    */
  var arn: String
  
  var localMountPath: String
}
object GetFunctionFileSystemConfig {
  
  inline def apply(arn: String, localMountPath: String): GetFunctionFileSystemConfig = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], localMountPath = localMountPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionFileSystemConfig]
  }
  
  extension [Self <: GetFunctionFileSystemConfig](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setLocalMountPath(value: String): Self = StObject.set(x, "localMountPath", value.asInstanceOf[js.Any])
  }
}
