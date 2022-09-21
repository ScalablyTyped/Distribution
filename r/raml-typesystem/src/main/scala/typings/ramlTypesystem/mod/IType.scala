package typings.ramlTypesystem.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IType
  extends StObject
     with Open {
  
  /**
    * default value for the type
    */
  var default: js.UndefOr[Any] = js.undefined
  
  /**
    * human readable description of the type (GitHub Markdown)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * human readable short name of the type
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * enumeration of possible valid instances for the type
    */
  var `enum`: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * example for the type
    */
  var example: js.UndefOr[Any] = js.undefined
  
  /**
    * map of custom facets declarations
    */
  var facets: js.UndefOr[StringDictionary[IType]] = js.undefined
  
  /**
    * type expression describing super types or in case of multiple inheritance array of type expressions
    */
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
}
object IType {
  
  inline def apply(): IType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IType]
  }
  
  extension [Self <: IType](x: Self) {
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnum(value: js.Array[Any]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    inline def setEnumVarargs(value: Any*): Self = StObject.set(x, "enum", js.Array(value*))
    
    inline def setExample(value: Any): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    inline def setFacets(value: StringDictionary[IType]): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    inline def setFacetsUndefined: Self = StObject.set(x, "facets", js.undefined)
    
    inline def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
