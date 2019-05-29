package typings
package soapLib.libWsdlElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl/elements", "OperationElement")
@js.native
class OperationElement () extends Element {
  @JSName("$soapAction")
  var $soapAction: js.UndefOr[java.lang.String] = js.native
  @JSName("$style")
  var $style: js.UndefOr[java.lang.String] = js.native
  @JSName("allowedChildren")
  val allowedChildren_OperationElement: org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.Instantiable4[
      /* nsName */ java.lang.String, 
      /* attrs */ js.Any, 
      js.UndefOr[/* options */ soapLib.libTypesMod.IWsdlBaseOptions], 
      js.UndefOr[/* schemaAttrs */ js.Any], 
      Element
    ]
  ] = js.native
  var input: InputElement = js.native
  var inputSoap: js.Any = js.native
  var output: OutputElement = js.native
  var outputSoap: js.Any = js.native
  var soapAction: java.lang.String = js.native
  var style: java.lang.String = js.native
  def addChild(child: js.Any): scala.Unit = js.native
  def postProcess(definitions: DefinitionsElement, tag: java.lang.String): scala.Unit = js.native
}

