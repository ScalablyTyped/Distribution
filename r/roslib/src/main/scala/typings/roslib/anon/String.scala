package typings.roslib.anon

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait String extends StObject {
  
  var string: js.UndefOr[java.lang.String | Null] = js.undefined
  
  var xml: Node
}
object String {
  
  inline def apply(xml: Node): String = {
    val __obj = js.Dynamic.literal(xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: String] (val x: Self) extends AnyVal {
    
    inline def setString(value: java.lang.String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringNull: Self = StObject.set(x, "string", null)
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    inline def setXml(value: Node): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
