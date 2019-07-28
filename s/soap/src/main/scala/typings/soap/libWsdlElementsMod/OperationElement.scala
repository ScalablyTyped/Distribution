package typings.soap.libWsdlElementsMod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.soap.libTypesMod.IWsdlBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl/elements", "OperationElement")
@js.native
class OperationElement () extends Element {
  @JSName("$soapAction")
  var $soapAction: js.UndefOr[String] = js.native
  @JSName("$style")
  var $style: js.UndefOr[String] = js.native
  @JSName("allowedChildren")
  val allowedChildren_OperationElement: StringDictionary[
    Instantiable4[
      /* nsName */ String, 
      /* attrs */ js.Any, 
      js.UndefOr[/* options */ IWsdlBaseOptions], 
      js.UndefOr[/* schemaAttrs */ js.Any], 
      Element
    ]
  ] = js.native
  var input: InputElement = js.native
  var inputSoap: js.Any = js.native
  var output: OutputElement = js.native
  var outputSoap: js.Any = js.native
  var soapAction: String = js.native
  var style: String = js.native
  def addChild(child: js.Any): Unit = js.native
  def postProcess(definitions: DefinitionsElement, tag: String): Unit = js.native
}

