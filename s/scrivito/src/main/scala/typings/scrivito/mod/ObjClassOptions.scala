package typings.scrivito.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjClassOptions extends StObject {
  
  var attributes: Record[String, Attribute | AttributeWithOptions]
  
  var extend: js.UndefOr[ObjClass] = js.undefined
  
  var extractTextAttributes: js.UndefOr[js.Array[String]] = js.undefined
}
object ObjClassOptions {
  
  @scala.inline
  def apply(attributes: Record[String, Attribute | AttributeWithOptions]): ObjClassOptions = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjClassOptions]
  }
  
  @scala.inline
  implicit class ObjClassOptionsMutableBuilder[Self <: ObjClassOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Record[String, Attribute | AttributeWithOptions]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtend(value: ObjClass): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setExtractTextAttributes(value: js.Array[String]): Self = StObject.set(x, "extractTextAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractTextAttributesUndefined: Self = StObject.set(x, "extractTextAttributes", js.undefined)
    
    @scala.inline
    def setExtractTextAttributesVarargs(value: String*): Self = StObject.set(x, "extractTextAttributes", js.Array(value :_*))
  }
}
