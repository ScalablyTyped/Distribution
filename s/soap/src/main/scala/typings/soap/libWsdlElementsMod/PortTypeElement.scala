package typings.soap.libWsdlElementsMod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.soap.libTypesMod.IWsdlBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl/elements", "PortTypeElement")
@js.native
class PortTypeElement () extends Element {
  @JSName("allowedChildren")
  val allowedChildren_PortTypeElement: StringDictionary[
    Instantiable4[
      /* nsName */ String, 
      /* attrs */ js.Any, 
      js.UndefOr[/* options */ IWsdlBaseOptions], 
      js.UndefOr[/* schemaAttrs */ js.Any], 
      Element
    ]
  ] = js.native
  var methods: StringDictionary[OperationElement] = js.native
  def postProcess(definitions: DefinitionsElement): Unit = js.native
}

