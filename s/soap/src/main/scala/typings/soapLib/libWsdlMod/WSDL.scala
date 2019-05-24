package typings
package soapLib.libWsdlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/wsdl", "WSDL")
@js.native
class WSDL protected () extends js.Object {
  def this(definition: js.Any, uri: java.lang.String, options: soapLib.libTypesMod.IOptions) = this()
  var _fromServices: js.Any = js.native
  var _fromXML: js.Any = js.native
  var _includesWsdl: js.Any = js.native
  var _initializeOptions: js.Any = js.native
  var _originalIgnoredNamespaces: js.Any = js.native
  var _parse: js.Any = js.native
  var _processNextInclude: js.Any = js.native
  var _xmlnsMap: js.Any = js.native
  var callback: js.Any = js.native
  var definitions: soapLib.libWsdlElementsMod.DefinitionsElement = js.native
  var ignoreBaseNameSpaces: scala.Boolean = js.native
  var ignoredNamespaces: js.Array[java.lang.String] = js.native
  var options: IInitializedOptions = js.native
  var services: js.Any = js.native
  var uri: java.lang.String = js.native
  var valueKey: java.lang.String = js.native
  var xml: js.Any = js.native
  var xmlKey: java.lang.String = js.native
  var xmlnsInEnvelope: java.lang.String = js.native
  def describeServices(): js.Object = js.native
  def filterOutIgnoredNameSpace(ns: java.lang.String): java.lang.String = js.native
  def findChildSchemaObject(parameterTypeObj: js.Any, childName: js.Any): js.Any = js.native
  def findChildSchemaObject(parameterTypeObj: js.Any, childName: js.Any, backtrace: js.Any): js.Any = js.native
  /**
    * Look up a XSD type or element by namespace URI and name
    * @param {String} nsURI Namespace URI
    * @param {String} qname Local or qualified name
    * @returns {*} The XSD type/element definition
    */
  def findSchemaObject(nsURI: java.lang.String, qname: java.lang.String): js.Any = js.native
  /**
    * Look up a schema type definition
    * @param name
    * @param nsURI
    * @returns {*}
    */
  def findSchemaType(name: js.Any, nsURI: js.Any): js.Any = js.native
  def isIgnoredNameSpace(ns: java.lang.String): scala.Boolean = js.native
  /**
    * Create document style xml string from the parameters
    * @param {String} name
    * @param {*} params
    * @param {String} nsPrefix
    * @param {String} nsURI
    * @param {String} type
    */
  def objectToDocumentXML(name: java.lang.String, params: js.Any, nsPrefix: java.lang.String): js.Any = js.native
  def objectToDocumentXML(name: java.lang.String, params: js.Any, nsPrefix: java.lang.String, nsURI: java.lang.String): js.Any = js.native
  def objectToDocumentXML(
    name: java.lang.String,
    params: js.Any,
    nsPrefix: java.lang.String,
    nsURI: java.lang.String,
    `type`: java.lang.String
  ): js.Any = js.native
  /**
    * Create RPC style xml string from the parameters
    * @param {String} name
    * @param {*} params
    * @param {String} nsPrefix
    * @param {String} nsURI
    * @returns {string}
    */
  def objectToRpcXML(name: java.lang.String, params: js.Any, nsPrefix: java.lang.String, nsURI: java.lang.String): java.lang.String = js.native
  def objectToRpcXML(
    name: java.lang.String,
    params: js.Any,
    nsPrefix: java.lang.String,
    nsURI: java.lang.String,
    isParts: scala.Boolean
  ): java.lang.String = js.native
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
  def objectToXML(obj: js.Any, name: java.lang.String, nsPrefix: js.Any, nsURI: java.lang.String): js.Any = js.native
  def objectToXML(
    obj: js.Any,
    name: java.lang.String,
    nsPrefix: js.Any,
    nsURI: java.lang.String,
    isFirst: scala.Boolean
  ): js.Any = js.native
  def objectToXML(
    obj: js.Any,
    name: java.lang.String,
    nsPrefix: js.Any,
    nsURI: java.lang.String,
    isFirst: scala.Boolean,
    xmlnsAttr: js.Any
  ): js.Any = js.native
  def objectToXML(
    obj: js.Any,
    name: java.lang.String,
    nsPrefix: js.Any,
    nsURI: java.lang.String,
    isFirst: scala.Boolean,
    xmlnsAttr: js.Any,
    schemaObject: js.Any
  ): js.Any = js.native
  def objectToXML(
    obj: js.Any,
    name: java.lang.String,
    nsPrefix: js.Any,
    nsURI: java.lang.String,
    isFirst: scala.Boolean,
    xmlnsAttr: js.Any,
    schemaObject: js.Any,
    nsContext: soapLib.libNscontextMod.NamespaceContext
  ): js.Any = js.native
  def onReady(callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def processAttributes(child: js.Any, nsContext: soapLib.libNscontextMod.NamespaceContext): java.lang.String = js.native
  def processIncludes(callback: js.Any): scala.Unit = js.native
  def toXML(): java.lang.String = js.native
  def xmlToObject(xml: js.Any): js.Any = js.native
  def xmlToObject(xml: js.Any, callback: js.Any): js.Any = js.native
}

