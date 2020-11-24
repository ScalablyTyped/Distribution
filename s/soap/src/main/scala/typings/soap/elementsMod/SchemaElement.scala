package typings.soap.elementsMod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.soap.typesMod.IWsdlBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("soap/lib/wsdl/elements", "SchemaElement")
@js.native
class SchemaElement () extends Element {
  
  @JSName("$elementFormDefault")
  var $elementFormDefault: js.Any = js.native
  
  @JSName("allowedChildren")
  val allowedChildren_SchemaElement: StringDictionary[
    Instantiable4[
      /* nsName */ String, 
      /* attrs */ js.Any, 
      /* options */ js.UndefOr[IWsdlBaseOptions], 
      /* schemaAttrs */ js.UndefOr[js.Any], 
      Element
    ]
  ] = js.native
  
  var complexTypes: StringDictionary[ComplexTypeElement] = js.native
  
  var elements: StringDictionary[ElementElement] = js.native
  
  var includes: js.Array[IInclude] = js.native
  
  def merge(source: SchemaElement): this.type = js.native
  
  var types: StringDictionary[SimpleTypeElement] = js.native
}
