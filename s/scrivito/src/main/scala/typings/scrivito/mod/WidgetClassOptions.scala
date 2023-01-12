package typings.scrivito.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidgetClassOptions extends StObject {
  
  var attributes: Record[String, Attribute | AttributeWithOptions]
  
  var extend: js.UndefOr[WidgetClass] = js.undefined
  
  var extractTextAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  var onlyInside: js.UndefOr[String | js.Array[String]] = js.undefined
}
object WidgetClassOptions {
  
  inline def apply(attributes: Record[String, Attribute | AttributeWithOptions]): WidgetClassOptions = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetClassOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WidgetClassOptions] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, Attribute | AttributeWithOptions]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setExtend(value: WidgetClass): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setExtractTextAttributes(value: js.Array[String]): Self = StObject.set(x, "extractTextAttributes", value.asInstanceOf[js.Any])
    
    inline def setExtractTextAttributesUndefined: Self = StObject.set(x, "extractTextAttributes", js.undefined)
    
    inline def setExtractTextAttributesVarargs(value: String*): Self = StObject.set(x, "extractTextAttributes", js.Array(value*))
    
    inline def setOnlyInside(value: String | js.Array[String]): Self = StObject.set(x, "onlyInside", value.asInstanceOf[js.Any])
    
    inline def setOnlyInsideUndefined: Self = StObject.set(x, "onlyInside", js.undefined)
    
    inline def setOnlyInsideVarargs(value: String*): Self = StObject.set(x, "onlyInside", js.Array(value*))
  }
}
