package typings.soap.anon

import typings.soap.typesMod.IXmlAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Namespace extends js.Object {
  var namespace: String
  var xmlnsAttributes: js.UndefOr[js.Array[IXmlAttribute]] = js.undefined
}

object Namespace {
  @scala.inline
  def apply(namespace: String, xmlnsAttributes: js.Array[IXmlAttribute] = null): Namespace = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    if (xmlnsAttributes != null) __obj.updateDynamic("xmlnsAttributes")(xmlnsAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace]
  }
}

