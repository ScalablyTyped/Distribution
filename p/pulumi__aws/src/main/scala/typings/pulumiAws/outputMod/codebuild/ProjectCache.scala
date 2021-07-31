package typings.pulumiAws.outputMod.codebuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectCache extends StObject {
  
  /**
    * The location where the AWS CodeBuild project stores cached resources. For type `S3` the value must be a valid S3 bucket name/prefix.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies settings that AWS CodeBuild uses to store and reuse build dependencies. Valid values:  `LOCAL_SOURCE_CACHE`, `LOCAL_DOCKER_LAYER_CACHE`, and `LOCAL_CUSTOM_CACHE`
    */
  var modes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The type of storage that will be used for the AWS CodeBuild project cache. Valid values: `NO_CACHE`, `LOCAL`, and `S3`. Defaults to `NO_CACHE`.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ProjectCache {
  
  @scala.inline
  def apply(): ProjectCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectCache]
  }
  
  @scala.inline
  implicit class ProjectCacheMutableBuilder[Self <: ProjectCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setModes(value: js.Array[String]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModesUndefined: Self = StObject.set(x, "modes", js.undefined)
    
    @scala.inline
    def setModesVarargs(value: String*): Self = StObject.set(x, "modes", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
