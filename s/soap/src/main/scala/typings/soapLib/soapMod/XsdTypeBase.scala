package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XsdTypeBase extends js.Object {
  var ignoredNamespaces: js.Array[java.lang.String]
  var valueKey: java.lang.String
  var xmlKey: java.lang.String
  var xmlns: js.UndefOr[WsdlXmlns] = js.undefined
}

object XsdTypeBase {
  @scala.inline
  def apply(
    ignoredNamespaces: js.Array[java.lang.String],
    valueKey: java.lang.String,
    xmlKey: java.lang.String,
    xmlns: WsdlXmlns = null
  ): XsdTypeBase = {
    val __obj = js.Dynamic.literal(ignoredNamespaces = ignoredNamespaces, valueKey = valueKey, xmlKey = xmlKey)
    if (xmlns != null) __obj.updateDynamic("xmlns")(xmlns)
    __obj.asInstanceOf[XsdTypeBase]
  }
}

