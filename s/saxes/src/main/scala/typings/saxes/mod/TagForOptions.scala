package typings.saxes.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.saxes.mod.SaxesTag
  - typings.saxes.mod.SaxesTagPlain
  - typings.saxes.mod.SaxesTagNS
*/
trait TagForOptions[O /* <: SaxesOptions */] extends StObject
object TagForOptions {
  
  @scala.inline
  def SaxesTag(attributes: Record[String, SaxesAttributeNS | String], isSelfClosing: Boolean, name: String): typings.saxes.mod.SaxesTag = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.saxes.mod.SaxesTag]
  }
  
  @scala.inline
  def SaxesTagNS(
    attributes: (Record[String, SaxesAttributeNS | String]) & (Record[String, SaxesAttributeNS]),
    isSelfClosing: Boolean,
    local: String,
    name: String,
    ns: Record[String, String],
    prefix: String,
    uri: String
  ): typings.saxes.mod.SaxesTagNS = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.saxes.mod.SaxesTagNS]
  }
  
  @scala.inline
  def SaxesTagPlain(
    attributes: (Record[String, SaxesAttributeNS | String]) & (Record[String, String]),
    isSelfClosing: Boolean,
    name: String
  ): typings.saxes.mod.SaxesTagPlain = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.saxes.mod.SaxesTagPlain]
  }
}
