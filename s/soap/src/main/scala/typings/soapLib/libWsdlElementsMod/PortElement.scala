package typings
package soapLib.libWsdlElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl/elements", "PortElement")
@js.native
class PortElement () extends Element {
  @JSName("allowedChildren")
  val allowedChildren_PortElement: org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.Instantiable4[
      /* nsName */ java.lang.String, 
      /* attrs */ js.Any, 
      /* options */ js.UndefOr[/* options */ soapLib.libTypesMod.IWsdlBaseOptions], 
      /* schemaAttrs */ js.UndefOr[/* schemaAttrs */ js.Any], 
      Element
    ]
  ] = js.native
  var location: js.Any = js.native
  def addChild(child: js.Any): scala.Unit = js.native
}

