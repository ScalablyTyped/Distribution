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

