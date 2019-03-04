package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XsdElementType
  extends XsdTypeBase
     with XsdElement
     with /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  @JSName("$lookupType")
  var $lookupType: java.lang.String
  @JSName("$lookupTypes")
  var $lookupTypes: js.Array[_]
  @JSName("$name")
  var $name: java.lang.String
  @JSName("$type")
  var $type: java.lang.String
  var children: js.Array[XsdElement] | scala.Unit
  var name: java.lang.String
  var nsName: java.lang.String
  var prefix: java.lang.String
  var targetNSAlias: java.lang.String
  var targetNamespace: java.lang.String
}

object XsdElementType {
  @scala.inline
  def apply(
    $lookupType: java.lang.String,
    $lookupTypes: js.Array[_],
    $name: java.lang.String,
    $type: java.lang.String,
    children: js.Array[XsdElement] | scala.Unit,
    ignoredNamespaces: js.Array[java.lang.String],
    name: java.lang.String,
    nsName: java.lang.String,
    prefix: java.lang.String,
    targetNSAlias: java.lang.String,
    targetNamespace: java.lang.String,
    valueKey: java.lang.String,
    xmlKey: java.lang.String,
    StringDictionary: /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    xmlns: WsdlXmlns = null
  ): XsdElementType = {
    val __obj = js.Dynamic.literal($lookupType = $lookupType, $lookupTypes = $lookupTypes, $name = $name, $type = $type, children = children.asInstanceOf[js.Any], ignoredNamespaces = ignoredNamespaces, name = name, nsName = nsName, prefix = prefix, targetNSAlias = targetNSAlias, targetNamespace = targetNamespace, valueKey = valueKey, xmlKey = xmlKey)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (xmlns != null) __obj.updateDynamic("xmlns")(xmlns)
    __obj.asInstanceOf[XsdElementType]
  }
}

