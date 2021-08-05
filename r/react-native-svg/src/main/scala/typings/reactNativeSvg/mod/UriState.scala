package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UriState extends StObject {
  
  var xml: String | Null
}
object UriState {
  
  inline def apply(): UriState = {
    val __obj = js.Dynamic.literal(xml = null)
    __obj.asInstanceOf[UriState]
  }
  
  extension [Self <: UriState](x: Self) {
    
    inline def setXml(value: String): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    inline def setXmlNull: Self = StObject.set(x, "xml", null)
  }
}
