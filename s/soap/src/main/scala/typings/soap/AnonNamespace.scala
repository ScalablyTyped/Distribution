package typings.soap

import typings.soap.typesMod.IXmlAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNamespace extends js.Object {
  var namespace: String
  var xmlnsAttributes: js.UndefOr[js.Array[IXmlAttribute]] = js.undefined
}

object AnonNamespace {
  @scala.inline
  def apply(namespace: String, xmlnsAttributes: js.Array[IXmlAttribute] = null): AnonNamespace = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    if (xmlnsAttributes != null) __obj.updateDynamic("xmlnsAttributes")(xmlnsAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNamespace]
  }
}

