package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypesModule extends StObject {
  
  var component: String
  
  var element: String
  
  var htmlElementName: String
  
  var isDep: Boolean
  
  var jsx: String
  
  var tagName: String
  
  var tagNameAsPascal: String
}
object TypesModule {
  
  inline def apply(
    component: String,
    element: String,
    htmlElementName: String,
    isDep: Boolean,
    jsx: String,
    tagName: String,
    tagNameAsPascal: String
  ): TypesModule = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], htmlElementName = htmlElementName.asInstanceOf[js.Any], isDep = isDep.asInstanceOf[js.Any], jsx = jsx.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], tagNameAsPascal = tagNameAsPascal.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypesModule]
  }
  
  extension [Self <: TypesModule](x: Self) {
    
    inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setHtmlElementName(value: String): Self = StObject.set(x, "htmlElementName", value.asInstanceOf[js.Any])
    
    inline def setIsDep(value: Boolean): Self = StObject.set(x, "isDep", value.asInstanceOf[js.Any])
    
    inline def setJsx(value: String): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameAsPascal(value: String): Self = StObject.set(x, "tagNameAsPascal", value.asInstanceOf[js.Any])
  }
}
