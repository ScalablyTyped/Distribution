package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Package extends StObject {
  
  var artifact: js.UndefOr[String] = js.undefined
  
  /** @deprecated use `patterns` instead */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  var excludeDevDependencies: js.UndefOr[Boolean] = js.undefined
  
  /** @deprecated use `patterns` instead */
  var include: js.UndefOr[js.Array[String]] = js.undefined
  
  var individually: js.UndefOr[Boolean] = js.undefined
  
  var patterns: js.UndefOr[js.Array[String]] = js.undefined
}
object Package {
  
  inline def apply(): Package = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Package]
  }
  
  extension [Self <: Package](x: Self) {
    
    inline def setArtifact(value: String): Self = StObject.set(x, "artifact", value.asInstanceOf[js.Any])
    
    inline def setArtifactUndefined: Self = StObject.set(x, "artifact", js.undefined)
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeDevDependencies(value: Boolean): Self = StObject.set(x, "excludeDevDependencies", value.asInstanceOf[js.Any])
    
    inline def setExcludeDevDependenciesUndefined: Self = StObject.set(x, "excludeDevDependencies", js.undefined)
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setIndividually(value: Boolean): Self = StObject.set(x, "individually", value.asInstanceOf[js.Any])
    
    inline def setIndividuallyUndefined: Self = StObject.set(x, "individually", js.undefined)
    
    inline def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
    
    inline def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value*))
  }
}
