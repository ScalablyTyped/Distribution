package typings
package soapLib.libWsdlElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl/elements", "SchemaElement")
@js.native
class SchemaElement () extends Element {
  @JSName("$elementFormDefault")
  var $elementFormDefault: js.Any = js.native
  @JSName("allowedChildren")
  val allowedChildren_SchemaElement: org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.Instantiable4[
      /* nsName */ java.lang.String, 
      /* attrs */ js.Any, 
      /* options */ js.UndefOr[/* options */ soapLib.libTypesMod.IWsdlBaseOptions], 
      /* schemaAttrs */ js.UndefOr[/* schemaAttrs */ js.Any], 
      Element
    ]
  ] = js.native
  var complexTypes: org.scalablytyped.runtime.StringDictionary[ComplexTypeElement] = js.native
  var elements: org.scalablytyped.runtime.StringDictionary[ElementElement] = js.native
  var includes: js.Array[IInclude] = js.native
  var types: org.scalablytyped.runtime.StringDictionary[SimpleTypeElement] = js.native
  def merge(source: SchemaElement): this.type = js.native
}

