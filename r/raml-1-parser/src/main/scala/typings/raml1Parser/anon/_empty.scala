package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _empty extends StObject {
  
  @JSName("/\\(.+\\)/")
  var SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash: java.lang.String
  
  @JSName("//.+/")
  var SlashSlashDotPlussignSlash: java.lang.String
  
  var annotationTypes: Action
  
  var baseUriParameters: Action
  
  var resourceTypes: Action
  
  var securedBy: java.lang.String
  
  var traits: Action
  
  var types: Action
}
object _empty {
  
  inline def apply(
    SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash: java.lang.String,
    SlashSlashDotPlussignSlash: java.lang.String,
    annotationTypes: Action,
    baseUriParameters: Action,
    resourceTypes: Action,
    securedBy: java.lang.String,
    traits: Action,
    types: Action
  ): _empty = {
    val __obj = js.Dynamic.literal(annotationTypes = annotationTypes.asInstanceOf[js.Any], baseUriParameters = baseUriParameters.asInstanceOf[js.Any], resourceTypes = resourceTypes.asInstanceOf[js.Any], securedBy = securedBy.asInstanceOf[js.Any], traits = traits.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("/\\(.+\\)/")(SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash.asInstanceOf[js.Any])
    __obj.updateDynamic("//.+/")(SlashSlashDotPlussignSlash.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
    
    inline def setAnnotationTypes(value: Action): Self = StObject.set(x, "annotationTypes", value.asInstanceOf[js.Any])
    
    inline def setBaseUriParameters(value: Action): Self = StObject.set(x, "baseUriParameters", value.asInstanceOf[js.Any])
    
    inline def setResourceTypes(value: Action): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
    
    inline def setSecuredBy(value: java.lang.String): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
    
    inline def setSlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash(value: java.lang.String): Self = StObject.set(x, "/\\(.+\\)/", value.asInstanceOf[js.Any])
    
    inline def setSlashSlashDotPlussignSlash(value: java.lang.String): Self = StObject.set(x, "//.+/", value.asInstanceOf[js.Any])
    
    inline def setTraits(value: Action): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: Action): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
  }
}
