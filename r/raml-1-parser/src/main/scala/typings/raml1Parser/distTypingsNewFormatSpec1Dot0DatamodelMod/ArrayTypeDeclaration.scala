package typings.raml1Parser.distTypingsNewFormatSpec1Dot0DatamodelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayTypeDeclaration
  extends StObject
     with TypeDeclaration {
  
  /**
    * Component type
    */
  var items: js.Array[TypeReference10]
  
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
    displayName: String,
    items: js.Array[TypeReference10],
    name: String,
    `type`: js.Array[TypeReference10]
  ): ArrayTypeDeclaration = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayTypeDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayTypeDeclaration] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[TypeReference10]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: TypeReference10*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    inline def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
    
    inline def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
    
    inline def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
    
    inline def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
  }
}
