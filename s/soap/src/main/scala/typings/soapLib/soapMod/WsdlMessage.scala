package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WsdlMessage extends XsdTypeBase {
  @JSName("$name")
  var $name: java.lang.String
  var element: XsdElement
  var parts: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object WsdlMessage {
  @scala.inline
  def apply(
    $name: java.lang.String,
    element: XsdElement,
    ignoredNamespaces: js.Array[java.lang.String],
    parts: org.scalablytyped.runtime.StringDictionary[js.Any],
    valueKey: java.lang.String,
    xmlKey: java.lang.String,
    xmlns: WsdlXmlns = null
  ): WsdlMessage = {
    val __obj = js.Dynamic.literal($name = $name, element = element, ignoredNamespaces = ignoredNamespaces, parts = parts, valueKey = valueKey, xmlKey = xmlKey)
    if (xmlns != null) __obj.updateDynamic("xmlns")(xmlns)
    __obj.asInstanceOf[WsdlMessage]
  }
}

