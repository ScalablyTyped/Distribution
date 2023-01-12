package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OCIRegistryURLComponents extends StObject {
  
  var registryBase: String
  
  var repo: String
  
  var tag: String
}
object OCIRegistryURLComponents {
  
  inline def apply(registryBase: String, repo: String, tag: String): OCIRegistryURLComponents = {
    val __obj = js.Dynamic.literal(registryBase = registryBase.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[OCIRegistryURLComponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OCIRegistryURLComponents] (val x: Self) extends AnyVal {
    
    inline def setRegistryBase(value: String): Self = StObject.set(x, "registryBase", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
