package typings.saxes.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaxesTag extends StObject {
  
  /**
    * A map of attribute name to attributes. If namespaces are tracked, the
    * values in the map are attribute objects. Otherwise, they are strings.
    */
  var attributes: Record[String, SaxesAttributeNS | String]
  
  /** Whether the tag is self-closing (e.g. ``<foo/>``). */
  var isSelfClosing: Boolean
  
  /**
    * The tag's local name. For instance ``<a:b>`` would
    * have ``"b"`` for ``local``. Undefined if we do not track namespaces.
    */
  var local: js.UndefOr[String] = js.undefined
  
  /**
    * The tag's name. This is the combination of prefix and global name. For
    * instance ``<a:b>`` would have ``"a:b"`` for ``name``.
    */
  var name: String
  
  /**
    * The namespace bindings in effect.
    */
  var ns: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * The tag's prefix. For instance ``<a:b>`` would have ``"a"`` for
    * ``prefix``. Undefined if we do not track namespaces.
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * The namespace URI of this tag. Undefined if we do not track namespaces.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object SaxesTag {
  
  inline def apply(attributes: Record[String, SaxesAttributeNS | String], isSelfClosing: Boolean, name: String): SaxesTag = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaxesTag] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, SaxesAttributeNS | String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setIsSelfClosing(value: Boolean): Self = StObject.set(x, "isSelfClosing", value.asInstanceOf[js.Any])
    
    inline def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNs(value: Record[String, String]): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
