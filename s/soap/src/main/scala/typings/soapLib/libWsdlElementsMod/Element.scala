package typings
package soapLib.libWsdlElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl/elements", "Element")
@js.native
class Element protected () extends js.Object {
  def this(nsName: java.lang.String, attrs: js.Any) = this()
  def this(nsName: java.lang.String, attrs: js.Any, options: soapLib.libTypesMod.IWsdlBaseOptions) = this()
  def this(nsName: java.lang.String, attrs: js.Any, options: soapLib.libTypesMod.IWsdlBaseOptions, schemaAttrs: js.Any) = this()
  @JSName("$name")
  var $name: js.UndefOr[java.lang.String] = js.native
  @JSName("$targetNamespace")
  var $targetNamespace: js.UndefOr[js.Any] = js.native
  var _initializeOptions: js.Any = js.native
  val allowedChildren: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.Instantiable4[
        /* nsName */ java.lang.String, 
        /* attrs */ js.Any, 
        /* options */ js.UndefOr[/* options */ soapLib.libTypesMod.IWsdlBaseOptions], 
        /* schemaAttrs */ js.UndefOr[/* schemaAttrs */ js.Any], 
        Element
      ]
    ]
  ] = js.native
  var children: js.Array[Element] = js.native
  var ignoredNamespaces: js.Any = js.native
  var name: js.UndefOr[java.lang.String] = js.native
  var nsName: js.UndefOr[js.Any] = js.native
  var prefix: js.UndefOr[java.lang.String] = js.native
  var schemaXmlns: js.UndefOr[js.Any] = js.native
  var valueKey: java.lang.String = js.native
  var xmlKey: js.Any = js.native
  var xmlns: js.UndefOr[IXmlNs] = js.native
  def addChild(child: Element): scala.Unit = js.native
  def deleteFixedAttrs(): scala.Unit = js.native
  def description(): js.Any = js.native
  def description(definitions: DefinitionsElement): js.Any = js.native
  def description(definitions: DefinitionsElement, xmlns: IXmlNs): js.Any = js.native
  def endElement(stack: js.Array[Element], nsName: java.lang.String): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def startElement(
    stack: js.Array[Element],
    nsName: java.lang.String,
    attrs: js.Any,
    options: soapLib.libTypesMod.IWsdlBaseOptions,
    schemaXmlns: js.Any
  ): scala.Unit = js.native
  def unexpected(name: java.lang.String): scala.Unit = js.native
}

