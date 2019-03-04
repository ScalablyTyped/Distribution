package typings
package soapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Namespace extends js.Object {
  var namespace: java.lang.String
  var xmlnsAttributes: js.UndefOr[js.Array[soapLib.soapMod.IXmlAttribute]] = js.undefined
}

object Anon_Namespace {
  @scala.inline
  def apply(namespace: java.lang.String, xmlnsAttributes: js.Array[soapLib.soapMod.IXmlAttribute] = null): Anon_Namespace = {
    val __obj = js.Dynamic.literal(namespace = namespace)
    if (xmlnsAttributes != null) __obj.updateDynamic("xmlnsAttributes")(xmlnsAttributes)
    __obj.asInstanceOf[Anon_Namespace]
  }
}

