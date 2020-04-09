package typings.saxes.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaxesTag
  extends TagForOptions[js.Any] {
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
  @scala.inline
  def apply(
    attributes: Record[String, SaxesAttributeNS | String],
    isSelfClosing: Boolean,
    name: String,
    local: String = null,
    ns: Record[String, String] = null,
    prefix: String = null,
    uri: String = null
  ): SaxesTag = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesTag]
  }
}

