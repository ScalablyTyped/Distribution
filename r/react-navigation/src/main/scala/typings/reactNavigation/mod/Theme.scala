package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme extends StObject {
  
  var body: String
  
  var bodyBorder: String
  
  var bodyContent: String
  
  var bodyContentBorder: String
  
  var header: String
  
  var headerBorder: String
  
  var label: String
}
object Theme {
  
  inline def apply(
    body: String,
    bodyBorder: String,
    bodyContent: String,
    bodyContentBorder: String,
    header: String,
    headerBorder: String,
    label: String
  ): Theme = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], bodyBorder = bodyBorder.asInstanceOf[js.Any], bodyContent = bodyContent.asInstanceOf[js.Any], bodyContentBorder = bodyContentBorder.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerBorder = headerBorder.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyBorder(value: String): Self = StObject.set(x, "bodyBorder", value.asInstanceOf[js.Any])
    
    inline def setBodyContent(value: String): Self = StObject.set(x, "bodyContent", value.asInstanceOf[js.Any])
    
    inline def setBodyContentBorder(value: String): Self = StObject.set(x, "bodyContentBorder", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderBorder(value: String): Self = StObject.set(x, "headerBorder", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
