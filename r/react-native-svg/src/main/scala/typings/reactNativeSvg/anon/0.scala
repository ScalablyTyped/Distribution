package typings.reactNativeSvg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var xml: String | Null
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(xml = null)
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setXml(value: String): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    inline def setXmlNull: Self = StObject.set(x, "xml", null)
  }
}
