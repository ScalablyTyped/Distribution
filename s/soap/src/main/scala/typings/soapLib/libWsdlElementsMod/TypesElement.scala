package typings
package soapLib.libWsdlElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl/elements", "TypesElement")
@js.native
class TypesElement () extends Element {
  @JSName("allowedChildren")
  val allowedChildren_TypesElement: org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.Instantiable4[
      /* nsName */ java.lang.String, 
      /* attrs */ js.Any, 
      js.UndefOr[/* options */ soapLib.libTypesMod.IWsdlBaseOptions], 
      js.UndefOr[/* schemaAttrs */ js.Any], 
      Element
    ]
  ] = js.native
  var schemas: org.scalablytyped.runtime.StringDictionary[SchemaElement] = js.native
  def addChild(child: js.Any): scala.Unit = js.native
}

