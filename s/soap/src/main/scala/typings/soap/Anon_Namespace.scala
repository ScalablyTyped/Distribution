package typings.soap

import typings.soap.libTypesMod.IXmlAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Namespace extends js.Object {
  var namespace: String
  var xmlnsAttributes: js.UndefOr[js.Array[IXmlAttribute]] = js.undefined
}

object Anon_Namespace {
  @scala.inline
  def apply(namespace: String, xmlnsAttributes: js.Array[IXmlAttribute] = null): Anon_Namespace = {
    val __obj = js.Dynamic.literal(namespace = namespace)
    if (xmlnsAttributes != null) __obj.updateDynamic("xmlnsAttributes")(xmlnsAttributes)
    __obj.asInstanceOf[Anon_Namespace]
  }
}

