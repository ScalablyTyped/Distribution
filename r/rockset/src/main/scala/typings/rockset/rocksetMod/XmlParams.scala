package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlParams extends js.Object {
  // tag to differentiate between attributes and elements
  var attribute_prefix: js.UndefOr[String] = js.undefined
  // tags with which documents are identified
  var doc_tag: js.UndefOr[String] = js.undefined
  // encoding in which data source is encoded
  var encoding: js.UndefOr[String] = js.undefined
  // tag until which xml is ignored
  var root_tag: js.UndefOr[String] = js.undefined
  // tag used for the value when there are attributes in the element having no child
  var value_tag: js.UndefOr[String] = js.undefined
}

object XmlParams {
  @scala.inline
  def apply(
    attribute_prefix: String = null,
    doc_tag: String = null,
    encoding: String = null,
    root_tag: String = null,
    value_tag: String = null
  ): XmlParams = {
    val __obj = js.Dynamic.literal()
    if (attribute_prefix != null) __obj.updateDynamic("attribute_prefix")(attribute_prefix.asInstanceOf[js.Any])
    if (doc_tag != null) __obj.updateDynamic("doc_tag")(doc_tag.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (root_tag != null) __obj.updateDynamic("root_tag")(root_tag.asInstanceOf[js.Any])
    if (value_tag != null) __obj.updateDynamic("value_tag")(value_tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlParams]
  }
}

