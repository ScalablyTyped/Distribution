package typings.saxes.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaxesTag
  extends TagForOptions[js.Any] {
  
  /**
    * A map of attribute name to attributes. If namespaces are tracked, the
    * values in the map are attribute objects. Otherwise, they are strings.
    */
  var attributes: Record[String, SaxesAttributeNS | String] = js.native
  
  /** Whether the tag is self-closing (e.g. ``<foo/>``). */
  var isSelfClosing: Boolean = js.native
  
  /**
    * The tag's local name. For instance ``<a:b>`` would
    * have ``"b"`` for ``local``. Undefined if we do not track namespaces.
    */
  var local: js.UndefOr[String] = js.native
  
  /**
    * The tag's name. This is the combination of prefix and global name. For
    * instance ``<a:b>`` would have ``"a:b"`` for ``name``.
    */
  var name: String = js.native
  
  /**
    * The namespace bindings in effect.
    */
  var ns: js.UndefOr[Record[String, String]] = js.native
  
  /**
    * The tag's prefix. For instance ``<a:b>`` would have ``"a"`` for
    * ``prefix``. Undefined if we do not track namespaces.
    */
  var prefix: js.UndefOr[String] = js.native
  
  /**
    * The namespace URI of this tag. Undefined if we do not track namespaces.
    */
  var uri: js.UndefOr[String] = js.native
}
object SaxesTag {
  
  @scala.inline
  def apply(attributes: Record[String, SaxesAttributeNS | String], isSelfClosing: Boolean, name: String): SaxesTag = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesTag]
  }
  
  @scala.inline
  implicit class SaxesTagMutableBuilder[Self <: SaxesTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Record[String, SaxesAttributeNS | String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelfClosing(value: Boolean): Self = StObject.set(x, "isSelfClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNs(value: Record[String, String]): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
