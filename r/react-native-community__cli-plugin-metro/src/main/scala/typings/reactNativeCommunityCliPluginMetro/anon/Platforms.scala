package typings.reactNativeCommunityCliPluginMetro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Platforms extends StObject {
  
  var platforms: js.Array[String]
  
  var resolveRequest: js.UndefOr[
    js.Function4[
      /* context */ Any, 
      /* realModuleName */ String, 
      /* platform */ String, 
      /* moduleName */ String, 
      Any
    ]
  ] = js.undefined
  
  var resolverMainFields: js.Array[String]
}
object Platforms {
  
  inline def apply(platforms: js.Array[String], resolverMainFields: js.Array[String]): Platforms = {
    val __obj = js.Dynamic.literal(platforms = platforms.asInstanceOf[js.Any], resolverMainFields = resolverMainFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Platforms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Platforms] (val x: Self) extends AnyVal {
    
    inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value*))
    
    inline def setResolveRequest(
      value: (/* context */ Any, /* realModuleName */ String, /* platform */ String, /* moduleName */ String) => Any
    ): Self = StObject.set(x, "resolveRequest", js.Any.fromFunction4(value))
    
    inline def setResolveRequestUndefined: Self = StObject.set(x, "resolveRequest", js.undefined)
    
    inline def setResolverMainFields(value: js.Array[String]): Self = StObject.set(x, "resolverMainFields", value.asInstanceOf[js.Any])
    
    inline def setResolverMainFieldsVarargs(value: String*): Self = StObject.set(x, "resolverMainFields", js.Array(value*))
  }
}
