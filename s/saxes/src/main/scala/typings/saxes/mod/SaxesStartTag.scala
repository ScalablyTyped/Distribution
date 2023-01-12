package typings.saxes.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<saxes.saxes.SaxesTag, 'name' | 'attributes' | 'ns'> */
trait SaxesStartTag extends StObject {
  
  var attributes: Record[String, SaxesAttributeNS | String]
  
  var name: String
  
  var ns: js.UndefOr[Record[String, String]] = js.undefined
}
object SaxesStartTag {
  
  inline def apply(attributes: Record[String, SaxesAttributeNS | String], name: String): SaxesStartTag = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesStartTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaxesStartTag] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, SaxesAttributeNS | String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNs(value: Record[String, String]): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
  }
}
