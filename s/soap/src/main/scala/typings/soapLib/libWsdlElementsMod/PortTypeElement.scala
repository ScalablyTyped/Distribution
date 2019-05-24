package typings
package soapLib.libWsdlElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl/elements", "PortTypeElement")
@js.native
class PortTypeElement () extends Element {
  @JSName("allowedChildren")
  val allowedChildren_PortTypeElement: org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.Instantiable4[
      /* nsName */ java.lang.String, 
      /* attrs */ js.Any, 
      /* options */ js.UndefOr[/* options */ soapLib.libTypesMod.IWsdlBaseOptions], 
      /* schemaAttrs */ js.UndefOr[/* schemaAttrs */ js.Any], 
      Element
    ]
  ] = js.native
  var methods: org.scalablytyped.runtime.StringDictionary[OperationElement] = js.native
  def postProcess(definitions: DefinitionsElement): scala.Unit = js.native
}

