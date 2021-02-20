package typings.saxes.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<saxes.saxes.SaxesTag> & {  attributes :std.Record<string, saxes.saxes.SaxesAttributeNS>} */
@js.native
trait SaxesTagNS
  extends TagForOptions[js.Any] {
  
  var attributes: (Record[String, SaxesAttributeNS | String]) with (Record[String, SaxesAttributeNS]) = js.native
  
  var isSelfClosing: Boolean = js.native
  
  var local: String = js.native
  
  var name: String = js.native
  
  var ns: Record[String, String] = js.native
  
  var prefix: String = js.native
  
  var uri: String = js.native
}
object SaxesTagNS {
  
  @scala.inline
  def apply(
    attributes: (Record[String, SaxesAttributeNS | String]) with (Record[String, SaxesAttributeNS]),
    isSelfClosing: Boolean,
    local: String,
    name: String,
    ns: Record[String, String],
    prefix: String,
    uri: String
  ): SaxesTagNS = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesTagNS]
  }
  
  @scala.inline
  implicit class SaxesTagNSMutableBuilder[Self <: SaxesTagNS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: (Record[String, SaxesAttributeNS | String]) with (Record[String, SaxesAttributeNS])): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelfClosing(value: Boolean): Self = StObject.set(x, "isSelfClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNs(value: Record[String, String]): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
