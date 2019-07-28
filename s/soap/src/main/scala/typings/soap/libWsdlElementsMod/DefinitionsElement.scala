package typings.soap.libWsdlElementsMod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.soap.Anon_Key
import typings.soap.libTypesMod.IWsdlBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl/elements", "DefinitionsElement")
@js.native
class DefinitionsElement () extends Element {
  @JSName("allowedChildren")
  val allowedChildren_DefinitionsElement: StringDictionary[
    Instantiable4[
      /* nsName */ String, 
      /* attrs */ js.Any, 
      js.UndefOr[/* options */ IWsdlBaseOptions], 
      js.UndefOr[/* schemaAttrs */ js.Any], 
      Element
    ]
  ] = js.native
  var bindings: StringDictionary[BindingElement] = js.native
  var complexTypes: js.Any = js.native
  var descriptions: Anon_Key = js.native
  var messages: StringDictionary[MessageElement] = js.native
  var portTypes: StringDictionary[PortTypeElement] = js.native
  var schemas: StringDictionary[SchemaElement] = js.native
  var services: StringDictionary[ServiceElement] = js.native
  def addChild(child: js.Any): Unit = js.native
}

