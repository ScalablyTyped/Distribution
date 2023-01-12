package typings.roslib.anon

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xml extends StObject {
  
  var xml: Node
}
object Xml {
  
  inline def apply(xml: Node): Xml = {
    val __obj = js.Dynamic.literal(xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xml]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Xml] (val x: Self) extends AnyVal {
    
    inline def setXml(value: Node): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
