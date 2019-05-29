package typings
package soapLib.libWsdlElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl/elements", "ElementElement")
@js.native
class ElementElement () extends Element {
  @JSName("$lookupType")
  var $lookupType: js.UndefOr[java.lang.String] = js.native
  @JSName("$lookupTypes")
  var $lookupTypes: js.UndefOr[js.Array[_]] = js.native
  @JSName("$maxOccurs")
  var $maxOccurs: js.UndefOr[scala.Double | java.lang.String] = js.native
  @JSName("$minOccurs")
  var $minOccurs: js.UndefOr[scala.Double | java.lang.String] = js.native
  @JSName("$ref")
  var $ref: js.UndefOr[java.lang.String] = js.native
  @JSName("$type")
  var $type: js.UndefOr[java.lang.String] = js.native
  @JSName("allowedChildren")
  val allowedChildren_ElementElement: org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.Instantiable4[
      /* nsName */ java.lang.String, 
      /* attrs */ js.Any, 
      js.UndefOr[/* options */ soapLib.libTypesMod.IWsdlBaseOptions], 
      js.UndefOr[/* schemaAttrs */ js.Any], 
      Element
    ]
  ] = js.native
  var targetNSAlias: js.UndefOr[java.lang.String] = js.native
  var targetNamespace: js.UndefOr[java.lang.String] = js.native
}

