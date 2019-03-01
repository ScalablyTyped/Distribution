package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WsdlSchema extends XsdTypeBase {
  var children: js.Array[_]
  var complexTypes: js.UndefOr[WsdlElements] = js.undefined
  var elements: js.UndefOr[WsdlElements] = js.undefined
  var includes: js.Array[_]
  var name: java.lang.String
  var nsName: java.lang.String
  var prefix: java.lang.String
  var types: js.UndefOr[WsdlElements] = js.undefined
  @JSName("xmlns")
  var xmlns_WsdlSchema: WsdlXmlns
}

object WsdlSchema {
  @scala.inline
  def apply(
    children: js.Array[_],
    ignoredNamespaces: js.Array[java.lang.String],
    includes: js.Array[_],
    name: java.lang.String,
    nsName: java.lang.String,
    prefix: java.lang.String,
    valueKey: java.lang.String,
    xmlKey: java.lang.String,
    xmlns: WsdlXmlns,
    complexTypes: WsdlElements = null,
    elements: WsdlElements = null,
    types: WsdlElements = null
  ): WsdlSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("ignoredNamespaces")(ignoredNamespaces)
    __obj.updateDynamic("includes")(includes)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nsName")(nsName)
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("valueKey")(valueKey)
    __obj.updateDynamic("xmlKey")(xmlKey)
    __obj.updateDynamic("xmlns")(xmlns)
    if (complexTypes != null) __obj.updateDynamic("complexTypes")(complexTypes)
    if (elements != null) __obj.updateDynamic("elements")(elements)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[WsdlSchema]
  }
}

