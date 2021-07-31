package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Package extends StObject {
  
  var artifact: js.UndefOr[String] = js.undefined
  
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  var excludeDevDependencies: js.UndefOr[Boolean] = js.undefined
  
  var include: js.UndefOr[js.Array[String]] = js.undefined
  
  var individually: js.UndefOr[Boolean] = js.undefined
}
object Package {
  
  @scala.inline
  def apply(): Package = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Package]
  }
  
  @scala.inline
  implicit class PackageMutableBuilder[Self <: Package] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifact(value: String): Self = StObject.set(x, "artifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactUndefined: Self = StObject.set(x, "artifact", js.undefined)
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeDevDependencies(value: Boolean): Self = StObject.set(x, "excludeDevDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeDevDependenciesUndefined: Self = StObject.set(x, "excludeDevDependencies", js.undefined)
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    @scala.inline
    def setIndividually(value: Boolean): Self = StObject.set(x, "individually", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndividuallyUndefined: Self = StObject.set(x, "individually", js.undefined)
  }
}
