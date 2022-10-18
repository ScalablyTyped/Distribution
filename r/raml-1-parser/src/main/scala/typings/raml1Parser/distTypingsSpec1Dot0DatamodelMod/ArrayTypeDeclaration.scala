package typings.raml1Parser.distTypingsSpec1Dot0DatamodelMod

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.distTypingsSpec1Dot0CommonMod.AnnotationInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayTypeDeclaration
  extends StObject
     with TypeDeclaration {
  
  /**
    * Component type
    */
  var items: TypeReference10
  
  /**
    * Maximum amount of items in array
    */
  var maxItems: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum amount of items in array
    */
  var minItems: js.UndefOr[Double] = js.undefined
  
  /**
    * Should items in array be unique
    */
  var uniqueItems: js.UndefOr[Boolean] = js.undefined
}
object ArrayTypeDeclaration {
  
  inline def apply(
    __METADATA__ : Any,
    annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
    items: TypeReference10,
    name: String,
    scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]],
    `type`: TypeReference10
  ): ArrayTypeDeclaration = {
    val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayTypeDeclaration]
  }
  
  extension [Self <: ArrayTypeDeclaration](x: Self) {
    
    inline def setItems(value: TypeReference10): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    inline def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
    
    inline def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
    
    inline def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
    
    inline def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
  }
}
