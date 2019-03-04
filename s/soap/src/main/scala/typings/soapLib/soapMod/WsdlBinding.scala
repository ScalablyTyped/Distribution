package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WsdlBinding extends XsdTypeBase {
  var methods: WsdlElements
  var style: java.lang.String
  var topElements: org.scalablytyped.runtime.StringDictionary[js.Any]
  var transport: java.lang.String
}

object WsdlBinding {
  @scala.inline
  def apply(
    ignoredNamespaces: js.Array[java.lang.String],
    methods: WsdlElements,
    style: java.lang.String,
    topElements: org.scalablytyped.runtime.StringDictionary[js.Any],
    transport: java.lang.String,
    valueKey: java.lang.String,
    xmlKey: java.lang.String,
    xmlns: WsdlXmlns = null
  ): WsdlBinding = {
    val __obj = js.Dynamic.literal(ignoredNamespaces = ignoredNamespaces, methods = methods, style = style, topElements = topElements, transport = transport, valueKey = valueKey, xmlKey = xmlKey)
    if (xmlns != null) __obj.updateDynamic("xmlns")(xmlns)
    __obj.asInstanceOf[WsdlBinding]
  }
}

