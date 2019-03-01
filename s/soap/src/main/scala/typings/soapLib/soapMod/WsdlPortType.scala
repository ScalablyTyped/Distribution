package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WsdlPortType extends XsdTypeBase {
  var methods: org.scalablytyped.runtime.StringDictionary[XsdElement]
}

object WsdlPortType {
  @scala.inline
  def apply(
    ignoredNamespaces: js.Array[java.lang.String],
    methods: org.scalablytyped.runtime.StringDictionary[XsdElement],
    valueKey: java.lang.String,
    xmlKey: java.lang.String,
    xmlns: WsdlXmlns = null
  ): WsdlPortType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ignoredNamespaces")(ignoredNamespaces)
    __obj.updateDynamic("methods")(methods)
    __obj.updateDynamic("valueKey")(valueKey)
    __obj.updateDynamic("xmlKey")(xmlKey)
    if (xmlns != null) __obj.updateDynamic("xmlns")(xmlns)
    __obj.asInstanceOf[WsdlPortType]
  }
}

