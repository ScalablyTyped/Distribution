package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XsdComplexType
  extends XsdTypeBase
     with XsdElement
     with /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  @JSName("$name")
  var $name: java.lang.String
  var children: js.Array[XsdElement] | scala.Unit
  var name: java.lang.String
  var nsName: java.lang.String
  var prefix: java.lang.String
}

object XsdComplexType {
  @scala.inline
  def apply(
    $name: java.lang.String,
    children: js.Array[XsdElement] | scala.Unit,
    ignoredNamespaces: js.Array[java.lang.String],
    name: java.lang.String,
    nsName: java.lang.String,
    prefix: java.lang.String,
    valueKey: java.lang.String,
    xmlKey: java.lang.String,
    StringDictionary: /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    xmlns: WsdlXmlns = null
  ): XsdComplexType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$name")($name)
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.updateDynamic("ignoredNamespaces")(ignoredNamespaces)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nsName")(nsName)
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("valueKey")(valueKey)
    __obj.updateDynamic("xmlKey")(xmlKey)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (xmlns != null) __obj.updateDynamic("xmlns")(xmlns)
    __obj.asInstanceOf[XsdComplexType]
  }
}

