package typings.soap.libWsdlElementsMod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.soap.libTypesMod.IWsdlBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl/elements", "ExtensionElement")
@js.native
class ExtensionElement () extends Element {
  @JSName("$base")
  var $base: String = js.native
  @JSName("allowedChildren")
  val allowedChildren_ExtensionElement: StringDictionary[
    Instantiable4[
      /* nsName */ String, 
      /* attrs */ js.Any, 
      js.UndefOr[/* options */ IWsdlBaseOptions], 
      js.UndefOr[/* schemaAttrs */ js.Any], 
      Element
    ]
  ] = js.native
}

