package typings.saxes.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<saxes.saxes.SaxesTag, 'name' | 'attributes' | 'isSelfClosing'> & {  attributes :std.Record<string, string>} */
@js.native
trait SaxesTagPlain
  extends TagForOptions[js.Any] {
  
  var attributes: (Record[String, SaxesAttributeNS | String]) with (Record[String, String]) = js.native
  
  var isSelfClosing: Boolean = js.native
  
  var name: String = js.native
}
object SaxesTagPlain {
  
  @scala.inline
  def apply(
    attributes: (Record[String, SaxesAttributeNS | String]) with (Record[String, String]),
    isSelfClosing: Boolean,
    name: String
  ): SaxesTagPlain = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesTagPlain]
  }
  
  @scala.inline
  implicit class SaxesTagPlainMutableBuilder[Self <: SaxesTagPlain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: (Record[String, SaxesAttributeNS | String]) with (Record[String, String])): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelfClosing(value: Boolean): Self = StObject.set(x, "isSelfClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
