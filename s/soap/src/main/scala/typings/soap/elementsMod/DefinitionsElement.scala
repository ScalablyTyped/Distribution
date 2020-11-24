package typings.soap.elementsMod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.soap.anon.Types
import typings.soap.typesMod.IWsdlBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("soap/lib/wsdl/elements", "DefinitionsElement")
@js.native
class DefinitionsElement () extends Element {
  
  def addChild(child: js.Any): Unit = js.native
  
  @JSName("allowedChildren")
  val allowedChildren_DefinitionsElement: StringDictionary[
    Instantiable4[
      /* nsName */ String, 
      /* attrs */ js.Any, 
      /* options */ js.UndefOr[IWsdlBaseOptions], 
      /* schemaAttrs */ js.UndefOr[js.Any], 
      Element
    ]
  ] = js.native
  
  var bindings: StringDictionary[BindingElement] = js.native
  
  var complexTypes: js.Any = js.native
  
  var descriptions: Types = js.native
  
  var messages: StringDictionary[MessageElement] = js.native
  
  var portTypes: StringDictionary[PortTypeElement] = js.native
  
  var schemas: StringDictionary[SchemaElement] = js.native
  
  var services: StringDictionary[ServiceElement] = js.native
}
