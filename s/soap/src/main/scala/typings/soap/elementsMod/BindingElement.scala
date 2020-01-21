package typings.soap.elementsMod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.soap.typesMod.IWsdlBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl/elements", "BindingElement")
@js.native
class BindingElement () extends Element {
  @JSName("$type")
  var $type: js.UndefOr[String] = js.native
  @JSName("allowedChildren")
  val allowedChildren_BindingElement: StringDictionary[
    Instantiable4[
      /* nsName */ String, 
      /* attrs */ js.Any, 
      js.UndefOr[/* options */ IWsdlBaseOptions], 
      js.UndefOr[/* schemaAttrs */ js.Any], 
      Element
    ]
  ] = js.native
  var methods: StringDictionary[OperationElement] = js.native
  var style: String = js.native
  var topElements: js.UndefOr[ITopElements] = js.native
  var transport: String = js.native
  def addChild(child: js.Any): Unit = js.native
  def postProcess(definitions: DefinitionsElement): Unit = js.native
}

