package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WsdlService extends XsdTypeBase {
  var ports: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object WsdlService {
  @scala.inline
  def apply(
    ignoredNamespaces: js.Array[java.lang.String],
    ports: org.scalablytyped.runtime.StringDictionary[js.Any],
    valueKey: java.lang.String,
    xmlKey: java.lang.String,
    xmlns: WsdlXmlns = null
  ): WsdlService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ignoredNamespaces")(ignoredNamespaces)
    __obj.updateDynamic("ports")(ports)
    __obj.updateDynamic("valueKey")(valueKey)
    __obj.updateDynamic("xmlKey")(xmlKey)
    if (xmlns != null) __obj.updateDynamic("xmlns")(xmlns)
    __obj.asInstanceOf[WsdlService]
  }
}

