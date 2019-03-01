package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definitions extends js.Object {
  @JSName("$name")
  var $name: java.lang.String
  @JSName("$targetNamespace")
  var $targetNamespace: java.lang.String
  var bindings: WsdlBindings
  var descriptions: js.Object
  var ignoredNamespaces: js.Array[java.lang.String]
  var messages: WsdlMessages
  var portTypes: WsdlPortTypes
  var schemas: WsdlSchemas
  var services: WsdlServices
  var valueKey: java.lang.String
  var xmlKey: java.lang.String
  var xmlns: WsdlXmlns
}

object Definitions {
  @scala.inline
  def apply(
    $name: java.lang.String,
    $targetNamespace: java.lang.String,
    bindings: WsdlBindings,
    descriptions: js.Object,
    ignoredNamespaces: js.Array[java.lang.String],
    messages: WsdlMessages,
    portTypes: WsdlPortTypes,
    schemas: WsdlSchemas,
    services: WsdlServices,
    valueKey: java.lang.String,
    xmlKey: java.lang.String,
    xmlns: WsdlXmlns
  ): Definitions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$name")($name)
    __obj.updateDynamic("$targetNamespace")($targetNamespace)
    __obj.updateDynamic("bindings")(bindings)
    __obj.updateDynamic("descriptions")(descriptions)
    __obj.updateDynamic("ignoredNamespaces")(ignoredNamespaces)
    __obj.updateDynamic("messages")(messages)
    __obj.updateDynamic("portTypes")(portTypes)
    __obj.updateDynamic("schemas")(schemas)
    __obj.updateDynamic("services")(services)
    __obj.updateDynamic("valueKey")(valueKey)
    __obj.updateDynamic("xmlKey")(xmlKey)
    __obj.updateDynamic("xmlns")(xmlns)
    __obj.asInstanceOf[Definitions]
  }
}

