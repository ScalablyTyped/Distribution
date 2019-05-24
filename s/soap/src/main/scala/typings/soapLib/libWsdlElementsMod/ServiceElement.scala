package typings
package soapLib.libWsdlElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl/elements", "ServiceElement")
@js.native
class ServiceElement () extends Element {
  @JSName("allowedChildren")
  val allowedChildren_ServiceElement: org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.Instantiable4[
      /* nsName */ java.lang.String, 
      /* attrs */ js.Any, 
      /* options */ js.UndefOr[/* options */ soapLib.libTypesMod.IWsdlBaseOptions], 
      /* schemaAttrs */ js.UndefOr[/* schemaAttrs */ js.Any], 
      Element
    ]
  ] = js.native
  var ports: org.scalablytyped.runtime.StringDictionary[IPort] = js.native
  def postProcess(definitions: DefinitionsElement): scala.Unit = js.native
}

