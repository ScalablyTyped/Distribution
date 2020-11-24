package typings.saxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaxesAttributeNS extends SaxesAttribute {
  
  /**
    * The attribute's local name. For instance ``a:b="c"`` would have ``"b"`` for
    * ``local``.
    */
  var local: String = js.native
  
  /**
    * The attribute's name. This is the combination of prefix and local name.
    * For instance ``a:b="c"`` would have ``a:b`` for name.
    */
  var name: String = js.native
  
  /**
    * The attribute's prefix. For instance ``a:b="c"`` would have ``"a"`` for
    * ``prefix``.
    */
  var prefix: String = js.native
  
  /** The namespace URI of this attribute. */
  var uri: String = js.native
  
  /** The attribute's value. */
  var value: String = js.native
}
object SaxesAttributeNS {
  
  @scala.inline
  def apply(local: String, name: String, prefix: String, uri: String, value: String): SaxesAttributeNS = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesAttributeNS]
  }
  
  @scala.inline
  implicit class SaxesAttributeNSOps[Self <: SaxesAttributeNS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocal(value: String): Self = this.set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
