package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectCache extends StObject {
  
  /**
    * The location where the AWS CodeBuild project stores cached resources. For type `S3` the value must be a valid S3 bucket name/prefix.
    */
  var location: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Specifies settings that AWS CodeBuild uses to store and reuse build dependencies. Valid values:  `LOCAL_SOURCE_CACHE`, `LOCAL_DOCKER_LAYER_CACHE`, and `LOCAL_CUSTOM_CACHE`
    */
  var modes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * The type of storage that will be used for the AWS CodeBuild project cache. Valid values: `NO_CACHE`, `LOCAL`, and `S3`. Defaults to `NO_CACHE`.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object ProjectCache {
  
  inline def apply(): ProjectCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectCache]
  }
  
  extension [Self <: ProjectCache](x: Self) {
    
    inline def setLocation(value: Input[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setModes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    inline def setModesUndefined: Self = StObject.set(x, "modes", js.undefined)
    
    inline def setModesVarargs(value: Input[String]*): Self = StObject.set(x, "modes", js.Array(value :_*))
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
