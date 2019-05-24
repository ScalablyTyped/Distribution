package typings
package soapLib.libWsdlElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl/elements", "DefinitionsElement")
@js.native
class DefinitionsElement () extends Element {
  @JSName("allowedChildren")
  val allowedChildren_DefinitionsElement: org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.Instantiable4[
      /* nsName */ java.lang.String, 
      /* attrs */ js.Any, 
      /* options */ js.UndefOr[/* options */ soapLib.libTypesMod.IWsdlBaseOptions], 
      /* schemaAttrs */ js.UndefOr[/* schemaAttrs */ js.Any], 
      Element
    ]
  ] = js.native
  var bindings: org.scalablytyped.runtime.StringDictionary[BindingElement] = js.native
  var complexTypes: js.Any = js.native
  var descriptions: soapLib.Anon_Key = js.native
  var messages: org.scalablytyped.runtime.StringDictionary[MessageElement] = js.native
  var portTypes: org.scalablytyped.runtime.StringDictionary[PortTypeElement] = js.native
  var schemas: org.scalablytyped.runtime.StringDictionary[SchemaElement] = js.native
  var services: org.scalablytyped.runtime.StringDictionary[ServiceElement] = js.native
  def addChild(child: js.Any): scala.Unit = js.native
}

