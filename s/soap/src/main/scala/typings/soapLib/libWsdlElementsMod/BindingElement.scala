package typings
package soapLib.libWsdlElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl/elements", "BindingElement")
@js.native
class BindingElement () extends Element {
  @JSName("$type")
  var $type: js.UndefOr[java.lang.String] = js.native
  @JSName("allowedChildren")
  val allowedChildren_BindingElement: org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.Instantiable4[
      /* nsName */ java.lang.String, 
      /* attrs */ js.Any, 
      js.UndefOr[/* options */ soapLib.libTypesMod.IWsdlBaseOptions], 
      js.UndefOr[/* schemaAttrs */ js.Any], 
      Element
    ]
  ] = js.native
  var methods: org.scalablytyped.runtime.StringDictionary[OperationElement] = js.native
  var style: java.lang.String = js.native
  var topElements: js.UndefOr[ITopElements] = js.native
  var transport: java.lang.String = js.native
  def addChild(child: js.Any): scala.Unit = js.native
  def postProcess(definitions: DefinitionsElement): scala.Unit = js.native
}

