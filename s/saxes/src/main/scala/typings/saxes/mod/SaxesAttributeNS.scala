package typings.saxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaxesAttributeNS extends SaxesAttribute {
  /**
    * The attribute's local name. For instance ``a:b="c"`` would have ``"b"`` for
    * ``local``.
    */
  var local: String
  /**
    * The attribute's name. This is the combination of prefix and local name.
    * For instance ``a:b="c"`` would have ``a:b`` for name.
    */
  var name: String
  /**
    * The attribute's prefix. For instance ``a:b="c"`` would have ``"a"`` for
    * ``prefix``.
    */
  var prefix: String
  /** The namespace URI of this attribute. */
  var uri: String
  /** The attribute's value. */
  var value: String
}

object SaxesAttributeNS {
  @scala.inline
  def apply(local: String, name: String, prefix: String, uri: String, value: String): SaxesAttributeNS = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SaxesAttributeNS]
  }
}

