package typings
package soapLib.libWsdlElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl/elements", "InputElement")
@js.native
class InputElement () extends Element {
  @JSName("$lookupType")
  var $lookupType: java.lang.String = js.native
  @JSName("$type")
  var $type: java.lang.String = js.native
  @JSName("allowedChildren")
  val allowedChildren_InputElement: org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.Instantiable4[
      /* nsName */ java.lang.String, 
      /* attrs */ js.Any, 
      js.UndefOr[/* options */ soapLib.libTypesMod.IWsdlBaseOptions], 
      js.UndefOr[/* schemaAttrs */ js.Any], 
      Element
    ]
  ] = js.native
  var encodingStyle: java.lang.String = js.native
  var parts: js.UndefOr[js.Any] = js.native
  var targetNSAlias: js.UndefOr[java.lang.String] = js.native
  var targetNamespace: js.UndefOr[java.lang.String] = js.native
  var use: java.lang.String = js.native
}

