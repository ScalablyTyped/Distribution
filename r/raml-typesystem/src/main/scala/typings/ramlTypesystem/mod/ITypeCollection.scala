package typings.ramlTypesystem.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITypeCollection extends StObject {
  
  /**
    * map of annotation type name to annotation type description
    */
  var annotationTypes: js.UndefOr[StringDictionary[IType]] = js.undefined
  
  /**
    * map of normal type name to type description
    */
  var types: js.UndefOr[StringDictionary[IType]] = js.undefined
}
object ITypeCollection {
  
  inline def apply(): ITypeCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITypeCollection]
  }
  
  extension [Self <: ITypeCollection](x: Self) {
    
    inline def setAnnotationTypes(value: StringDictionary[IType]): Self = StObject.set(x, "annotationTypes", value.asInstanceOf[js.Any])
    
    inline def setAnnotationTypesUndefined: Self = StObject.set(x, "annotationTypes", js.undefined)
    
    inline def setTypes(value: StringDictionary[IType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
  }
}
