package typings
package soapLib.libWsdlElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl/elements", "OutputElement")
@js.native
class OutputElement () extends Element {
  @JSName("$lookupTypes")
  var $lookupTypes: js.Any = js.native
  @JSName("allowedChildren")
  val allowedChildren_OutputElement: org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.Instantiable4[
      /* nsName */ java.lang.String, 
      /* attrs */ js.Any, 
      js.UndefOr[/* options */ soapLib.libTypesMod.IWsdlBaseOptions], 
      js.UndefOr[/* schemaAttrs */ js.Any], 
      Element
    ]
  ] = js.native
  var encodingStyle: js.UndefOr[java.lang.String] = js.native
  var targetNSAlias: js.UndefOr[java.lang.String] = js.native
  var targetNamespace: js.UndefOr[java.lang.String] = js.native
  var use: js.UndefOr[java.lang.String] = js.native
}

