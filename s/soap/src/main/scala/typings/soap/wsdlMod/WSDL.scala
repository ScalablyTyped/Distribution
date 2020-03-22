package typings.soap.wsdlMod

import typings.soap.elementsMod.DefinitionsElement
import typings.soap.nscontextMod.NamespaceContext
import typings.soap.typesMod.IOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl", "WSDL")
@js.native
class WSDL protected () extends js.Object {
  def this(definition: js.Any, uri: String, options: IOptions) = this()
  var _fromServices: js.Any = js.native
  var _fromXML: js.Any = js.native
  var _includesWsdl: js.Any = js.native
  var _initializeOptions: js.Any = js.native
  var _originalIgnoredNamespaces: js.Any = js.native
  var _parse: js.Any = js.native
  var _processNextInclude: js.Any = js.native
  var _xmlnsMap: js.Any = js.native
  var callback: js.Any = js.native
  var definitions: DefinitionsElement = js.native
  var ignoreBaseNameSpaces: Boolean = js.native
  var ignoredNamespaces: js.Array[String] = js.native
  var options: IInitializedOptions = js.native
  var services: js.Any = js.native
  var uri: String = js.native
  var valueKey: String = js.native
  var xml: js.Any = js.native
  var xmlKey: String = js.native
  var xmlnsInEnvelope: String = js.native
  var xmlnsInHeader: String = js.native
  def describeServices(): js.Object = js.native
  def filterOutIgnoredNameSpace(ns: String): String = js.native
  def findChildSchemaObject(parameterTypeObj: js.Any, childName: js.Any): js.Any = js.native
  def findChildSchemaObject(parameterTypeObj: js.Any, childName: js.Any, backtrace: js.Any): js.Any = js.native
  /**
    * Look up a XSD type or element by namespace URI and name
    * @param {String} nsURI Namespace URI
    * @param {String} qname Local or qualified name
    * @returns {*} The XSD type/element definition
    */
  def findSchemaObject(nsURI: String, qname: String): js.Any = js.native
  /**
    * Look up a schema type definition
    * @param name
    * @param nsURI
    * @returns {*}
    */
  def findSchemaType(name: js.Any, nsURI: js.Any): js.Any = js.native
  def isIgnoredNameSpace(ns: String): Boolean = js.native
  /**
    * Create document style xml string from the parameters
    * @param {String} name
    * @param {*} params
    * @param {String} nsPrefix
    * @param {String} nsURI
    * @param {String} type
    */
  def objectToDocumentXML(name: String, params: js.Any, nsPrefix: String): js.Any = js.native
  def objectToDocumentXML(name: String, params: js.Any, nsPrefix: String, nsURI: String): js.Any = js.native
  def objectToDocumentXML(name: String, params: js.Any, nsPrefix: String, nsURI: String, `type`: String): js.Any = js.native
  /**
    * Create RPC style xml string from the parameters
    * @param {String} name
    * @param {*} params
    * @param {String} nsPrefix
    * @param {String} nsURI
    * @returns {string}
    */
  def objectToRpcXML(name: String, params: js.Any, nsPrefix: String, nsURI: String): String = js.native
  def objectToRpcXML(name: String, params: js.Any, nsPrefix: String, nsURI: String, isParts: Boolean): String = js.native
  /**
    * Convert an object to XML.  This is a recursive method as it calls itself.
    *
    * @param {Object} obj the object to convert.
    * @param {String} name the name of the element (if the object being traversed is
    * an element).
    * @param {String} nsPrefix the namespace prefix of the object I.E. xsd.
    * @param {String} nsURI the full namespace of the object I.E. http://w3.org/schema.
    * @param {Boolean} isFirst whether or not this is the first item being traversed.
    * @param {?} xmlnsAttr
    * @param {?} parameterTypeObject
    * @param {NamespaceContext} nsContext Namespace context
    */
  def objectToXML(obj: js.Any, name: String, nsPrefix: js.Any, nsURI: String): js.Any = js.native
  def objectToXML(obj: js.Any, name: String, nsPrefix: js.Any, nsURI: String, isFirst: Boolean): js.Any = js.native
  def objectToXML(obj: js.Any, name: String, nsPrefix: js.Any, nsURI: String, isFirst: Boolean, xmlnsAttr: js.Any): js.Any = js.native
  def objectToXML(
    obj: js.Any,
    name: String,
    nsPrefix: js.Any,
    nsURI: String,
    isFirst: Boolean,
    xmlnsAttr: js.Any,
    schemaObject: js.Any
  ): js.Any = js.native
  def objectToXML(
    obj: js.Any,
    name: String,
    nsPrefix: js.Any,
    nsURI: String,
    isFirst: Boolean,
    xmlnsAttr: js.Any,
    schemaObject: js.Any,
    nsContext: NamespaceContext
  ): js.Any = js.native
  def onReady(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def processAttributes(child: js.Any, nsContext: NamespaceContext): String = js.native
  def processIncludes(callback: js.Any): Unit = js.native
  def toXML(): String = js.native
  def xmlToObject(xml: js.Any): js.Any = js.native
  def xmlToObject(xml: js.Any, callback: js.Any): js.Any = js.native
}

