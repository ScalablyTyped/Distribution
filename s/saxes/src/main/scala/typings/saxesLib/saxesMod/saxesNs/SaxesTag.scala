package typings
package saxesLib.saxesMod.saxesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaxesTag extends js.Object {
  var attributes: (stdLib.Record[java.lang.String, SaxesAttribute]) | (stdLib.Record[java.lang.String, java.lang.String])
  var isSelfClosing: scala.Boolean
  var local: java.lang.String
  var name: java.lang.String
  var ns: stdLib.Record[java.lang.String, java.lang.String]
  var prefix: java.lang.String
  var uri: java.lang.String
}

object SaxesTag {
  @scala.inline
  def apply(
    attributes: (stdLib.Record[java.lang.String, SaxesAttribute]) | (stdLib.Record[java.lang.String, java.lang.String]),
    isSelfClosing: scala.Boolean,
    local: java.lang.String,
    name: java.lang.String,
    ns: stdLib.Record[java.lang.String, java.lang.String],
    prefix: java.lang.String,
    uri: java.lang.String
  ): SaxesTag = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], isSelfClosing = isSelfClosing, local = local, name = name, ns = ns, prefix = prefix, uri = uri)
  
    __obj.asInstanceOf[SaxesTag]
  }
}

