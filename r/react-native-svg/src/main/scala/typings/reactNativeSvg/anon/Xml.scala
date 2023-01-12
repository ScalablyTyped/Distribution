package typings.reactNativeSvg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xml extends StObject {
  
  var xml: Null
}
object Xml {
  
  inline def apply(xml: Null): Xml = {
    val __obj = js.Dynamic.literal(xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xml]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Xml] (val x: Self) extends AnyVal {
    
    inline def setXml(value: Null): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
