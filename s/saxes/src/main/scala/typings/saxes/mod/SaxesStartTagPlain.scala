package typings.saxes.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<saxes.saxes.SaxesStartTag, 'name' | 'attributes'> */
trait SaxesStartTagPlain extends StObject {
  
  var attributes: Record[String, SaxesAttributeNS | String]
  
  var name: String
}
object SaxesStartTagPlain {
  
  inline def apply(attributes: Record[String, SaxesAttributeNS | String], name: String): SaxesStartTagPlain = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesStartTagPlain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaxesStartTagPlain] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, SaxesAttributeNS | String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
