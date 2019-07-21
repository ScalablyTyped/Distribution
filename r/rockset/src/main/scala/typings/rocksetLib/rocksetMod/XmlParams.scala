package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlParams extends js.Object {
  // tag to differentiate between attributes and elements
  var attribute_prefix: js.UndefOr[java.lang.String] = js.undefined
  // tags with which documents are identified
  var doc_tag: js.UndefOr[java.lang.String] = js.undefined
  // encoding in which data source is encoded
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  // tag until which xml is ignored
  var root_tag: js.UndefOr[java.lang.String] = js.undefined
  // tag used for the value when there are attributes in the element having no child
  var value_tag: js.UndefOr[java.lang.String] = js.undefined
}

object XmlParams {
  @scala.inline
  def apply(
    attribute_prefix: java.lang.String = null,
    doc_tag: java.lang.String = null,
    encoding: java.lang.String = null,
    root_tag: java.lang.String = null,
    value_tag: java.lang.String = null
  ): XmlParams = {
    val __obj = js.Dynamic.literal()
    if (attribute_prefix != null) __obj.updateDynamic("attribute_prefix")(attribute_prefix)
    if (doc_tag != null) __obj.updateDynamic("doc_tag")(doc_tag)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (root_tag != null) __obj.updateDynamic("root_tag")(root_tag)
    if (value_tag != null) __obj.updateDynamic("value_tag")(value_tag)
    __obj.asInstanceOf[XmlParams]
  }
}

