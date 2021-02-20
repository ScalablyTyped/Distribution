package typings.saxes.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<saxes.saxes.SaxesStartTag> */
@js.native
trait SaxesStartTagNS
  extends StartTagForOptions[js.Any] {
  
  var attributes: Record[String, SaxesAttributeNS | String] = js.native
  
  var name: String = js.native
  
  var ns: Record[String, String] = js.native
}
object SaxesStartTagNS {
  
  @scala.inline
  def apply(attributes: Record[String, SaxesAttributeNS | String], name: String, ns: Record[String, String]): SaxesStartTagNS = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesStartTagNS]
  }
  
  @scala.inline
  implicit class SaxesStartTagNSMutableBuilder[Self <: SaxesStartTagNS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Record[String, SaxesAttributeNS | String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNs(value: Record[String, String]): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
  }
}
