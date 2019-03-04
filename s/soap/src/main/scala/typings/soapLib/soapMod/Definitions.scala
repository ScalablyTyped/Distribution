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
    val __obj = js.Dynamic.literal($name = $name, $targetNamespace = $targetNamespace, bindings = bindings, descriptions = descriptions, ignoredNamespaces = ignoredNamespaces, messages = messages, portTypes = portTypes, schemas = schemas, services = services, valueKey = valueKey, xmlKey = xmlKey, xmlns = xmlns)
  
    __obj.asInstanceOf[Definitions]
  }
}

