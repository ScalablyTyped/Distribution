package typings.soap.elementsMod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.soap.typesMod.IWsdlBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("soap/lib/wsdl/elements", "Element")
@js.native
class Element protected () extends js.Object {
  def this(nsName: String, attrs: js.Any) = this()
  def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
  def this(nsName: String, attrs: js.Any, options: js.UndefOr[scala.Nothing], schemaAttrs: js.Any) = this()
  def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
  
  @JSName("$name")
  var $name: js.UndefOr[String] = js.native
  
  @JSName("$targetNamespace")
  var $targetNamespace: js.UndefOr[js.Any] = js.native
  
  var _initializeOptions: js.Any = js.native
  
  def addChild(child: Element): Unit = js.native
  
  val allowedChildren: js.UndefOr[
    StringDictionary[
      Instantiable4[
        /* nsName */ String, 
        /* attrs */ js.Any, 
        /* options */ js.UndefOr[IWsdlBaseOptions], 
        /* schemaAttrs */ js.UndefOr[js.Any], 
        Element
      ]
    ]
  ] = js.native
  
  var children: js.Array[Element] = js.native
  
  def deleteFixedAttrs(): Unit = js.native
  
  def description(): js.Any = js.native
  def description(definitions: js.UndefOr[scala.Nothing], xmlns: IXmlNs): js.Any = js.native
  def description(definitions: DefinitionsElement): js.Any = js.native
  def description(definitions: DefinitionsElement, xmlns: IXmlNs): js.Any = js.native
  
  def endElement(stack: js.Array[Element], nsName: String): Unit = js.native
  
  var ignoredNamespaces: js.Any = js.native
  
  def init(): Unit = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nsName: js.UndefOr[js.Any] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var schemaXmlns: js.UndefOr[js.Any] = js.native
  
  def startElement(
    stack: js.Array[Element],
    nsName: String,
    attrs: js.Any,
    options: IWsdlBaseOptions,
    schemaXmlns: js.Any
  ): Unit = js.native
  
  def unexpected(name: String): Unit = js.native
  
  var valueKey: String = js.native
  
  var xmlKey: js.Any = js.native
  
  var xmlns: js.UndefOr[IXmlNs] = js.native
}
