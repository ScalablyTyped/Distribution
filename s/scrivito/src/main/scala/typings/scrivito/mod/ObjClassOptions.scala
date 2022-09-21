package typings.scrivito.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjClassOptions extends StObject {
  
  var attributes: Record[String, Attribute | AttributeWithOptions]
  
  var extend: js.UndefOr[ObjClass] = js.undefined
  
  var extractTextAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  var onlyChildren: String | js.Array[String]
  
  var onlyInside: String | js.Array[String]
}
object ObjClassOptions {
  
  inline def apply(
    attributes: Record[String, Attribute | AttributeWithOptions],
    onlyChildren: String | js.Array[String],
    onlyInside: String | js.Array[String]
  ): ObjClassOptions = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], onlyChildren = onlyChildren.asInstanceOf[js.Any], onlyInside = onlyInside.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjClassOptions]
  }
  
  extension [Self <: ObjClassOptions](x: Self) {
    
    inline def setAttributes(value: Record[String, Attribute | AttributeWithOptions]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setExtend(value: ObjClass): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setExtractTextAttributes(value: js.Array[String]): Self = StObject.set(x, "extractTextAttributes", value.asInstanceOf[js.Any])
    
    inline def setExtractTextAttributesUndefined: Self = StObject.set(x, "extractTextAttributes", js.undefined)
    
    inline def setExtractTextAttributesVarargs(value: String*): Self = StObject.set(x, "extractTextAttributes", js.Array(value*))
    
    inline def setOnlyChildren(value: String | js.Array[String]): Self = StObject.set(x, "onlyChildren", value.asInstanceOf[js.Any])
    
    inline def setOnlyChildrenVarargs(value: String*): Self = StObject.set(x, "onlyChildren", js.Array(value*))
    
    inline def setOnlyInside(value: String | js.Array[String]): Self = StObject.set(x, "onlyInside", value.asInstanceOf[js.Any])
    
    inline def setOnlyInsideVarargs(value: String*): Self = StObject.set(x, "onlyInside", js.Array(value*))
  }
}
