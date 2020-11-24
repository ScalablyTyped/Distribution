package typings.soap.elementsMod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.soap.typesMod.IWsdlBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("soap/lib/wsdl/elements", "OutputElement")
@js.native
class OutputElement () extends Element {
  
  @JSName("$lookupTypes")
  var $lookupTypes: js.Any = js.native
  
  @JSName("allowedChildren")
  val allowedChildren_OutputElement: StringDictionary[
    Instantiable4[
      /* nsName */ String, 
      /* attrs */ js.Any, 
      /* options */ js.UndefOr[IWsdlBaseOptions], 
      /* schemaAttrs */ js.UndefOr[js.Any], 
      Element
    ]
  ] = js.native
  
  var encodingStyle: js.UndefOr[String] = js.native
  
  var targetNSAlias: js.UndefOr[String] = js.native
  
  var targetNamespace: js.UndefOr[String] = js.native
  
  var use: js.UndefOr[String] = js.native
}
