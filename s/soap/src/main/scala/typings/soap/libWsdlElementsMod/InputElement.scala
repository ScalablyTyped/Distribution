package typings.soap.libWsdlElementsMod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.soap.libTypesMod.IWsdlBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl/elements", "InputElement")
@js.native
class InputElement () extends Element {
  @JSName("$lookupType")
  var $lookupType: String = js.native
  @JSName("$type")
  var $type: String = js.native
  @JSName("allowedChildren")
  val allowedChildren_InputElement: StringDictionary[
    Instantiable4[
      /* nsName */ String, 
      /* attrs */ js.Any, 
      js.UndefOr[/* options */ IWsdlBaseOptions], 
      js.UndefOr[/* schemaAttrs */ js.Any], 
      Element
    ]
  ] = js.native
  var encodingStyle: String = js.native
  var parts: js.UndefOr[js.Any] = js.native
  var targetNSAlias: js.UndefOr[String] = js.native
  var targetNamespace: js.UndefOr[String] = js.native
  var use: String = js.native
}

