package typings.soap

import typings.sax.mod.SAXStream
import typings.soap.elementsMod.DefinitionsElement
import typings.soap.nscontextMod.NamespaceContext
import typings.soap.typesMod.IOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wsdlMod {
  
  @JSImport("soap/lib/wsdl", "WSDL")
  @js.native
  class WSDL protected () extends StObject {
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
    
    def getSaxStream(xml: js.Any): SAXStream = js.native
    
    var ignoreBaseNameSpaces: Boolean = js.native
    
    var ignoredNamespaces: js.Array[String] = js.native
    
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
    def objectToDocumentXML(name: String, params: js.Any, nsPrefix: String, nsURI: js.UndefOr[scala.Nothing], `type`: String): js.Any = js.native
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
    def objectToXML(
      obj: js.Any,
      name: String,
      nsPrefix: js.Any,
      nsURI: String,
      isFirst: js.UndefOr[scala.Nothing],
      xmlnsAttr: js.UndefOr[scala.Nothing],
      schemaObject: js.UndefOr[scala.Nothing],
      nsContext: NamespaceContext
    ): js.Any = js.native
    def objectToXML(
      obj: js.Any,
      name: String,
      nsPrefix: js.Any,
      nsURI: String,
      isFirst: js.UndefOr[scala.Nothing],
      xmlnsAttr: js.UndefOr[scala.Nothing],
      schemaObject: js.Any
    ): js.Any = js.native
    def objectToXML(
      obj: js.Any,
      name: String,
      nsPrefix: js.Any,
      nsURI: String,
      isFirst: js.UndefOr[scala.Nothing],
      xmlnsAttr: js.UndefOr[scala.Nothing],
      schemaObject: js.Any,
      nsContext: NamespaceContext
    ): js.Any = js.native
    def objectToXML(
      obj: js.Any,
      name: String,
      nsPrefix: js.Any,
      nsURI: String,
      isFirst: js.UndefOr[scala.Nothing],
      xmlnsAttr: js.Any
    ): js.Any = js.native
    def objectToXML(
      obj: js.Any,
      name: String,
      nsPrefix: js.Any,
      nsURI: String,
      isFirst: js.UndefOr[scala.Nothing],
      xmlnsAttr: js.Any,
      schemaObject: js.UndefOr[scala.Nothing],
      nsContext: NamespaceContext
    ): js.Any = js.native
    def objectToXML(
      obj: js.Any,
      name: String,
      nsPrefix: js.Any,
      nsURI: String,
      isFirst: js.UndefOr[scala.Nothing],
      xmlnsAttr: js.Any,
      schemaObject: js.Any
    ): js.Any = js.native
    def objectToXML(
      obj: js.Any,
      name: String,
      nsPrefix: js.Any,
      nsURI: String,
      isFirst: js.UndefOr[scala.Nothing],
      xmlnsAttr: js.Any,
      schemaObject: js.Any,
      nsContext: NamespaceContext
    ): js.Any = js.native
    def objectToXML(obj: js.Any, name: String, nsPrefix: js.Any, nsURI: String, isFirst: Boolean): js.Any = js.native
    def objectToXML(
      obj: js.Any,
      name: String,
      nsPrefix: js.Any,
      nsURI: String,
      isFirst: Boolean,
      xmlnsAttr: js.UndefOr[scala.Nothing],
      schemaObject: js.UndefOr[scala.Nothing],
      nsContext: NamespaceContext
    ): js.Any = js.native
    def objectToXML(
      obj: js.Any,
      name: String,
      nsPrefix: js.Any,
      nsURI: String,
      isFirst: Boolean,
      xmlnsAttr: js.UndefOr[scala.Nothing],
      schemaObject: js.Any
    ): js.Any = js.native
    def objectToXML(
      obj: js.Any,
      name: String,
      nsPrefix: js.Any,
      nsURI: String,
      isFirst: Boolean,
      xmlnsAttr: js.UndefOr[scala.Nothing],
      schemaObject: js.Any,
      nsContext: NamespaceContext
    ): js.Any = js.native
    def objectToXML(obj: js.Any, name: String, nsPrefix: js.Any, nsURI: String, isFirst: Boolean, xmlnsAttr: js.Any): js.Any = js.native
    def objectToXML(
      obj: js.Any,
      name: String,
      nsPrefix: js.Any,
      nsURI: String,
      isFirst: Boolean,
      xmlnsAttr: js.Any,
      schemaObject: js.UndefOr[scala.Nothing],
      nsContext: NamespaceContext
    ): js.Any = js.native
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
    
    var options: IInitializedOptions = js.native
    
    def processAttributes(child: js.Any, nsContext: NamespaceContext): String = js.native
    
    def processIncludes(callback: js.Any): Unit = js.native
    
    var services: js.Any = js.native
    
    def toXML(): String = js.native
    
    var uri: String = js.native
    
    var valueKey: String = js.native
    
    var xml: js.Any = js.native
    
    var xmlKey: String = js.native
    
    def xmlToObject(xml: js.Any): js.Any = js.native
    def xmlToObject(xml: js.Any, callback: js.Any): js.Any = js.native
    
    var xmlnsInEnvelope: String = js.native
    
    var xmlnsInHeader: String = js.native
  }
  
  @JSImport("soap/lib/wsdl", "open_wsdl")
  @js.native
  def openWsdl(uri: js.Any, callback: WSDLCallback): js.Any = js.native
  @JSImport("soap/lib/wsdl", "open_wsdl")
  @js.native
  def openWsdl(uri: js.Any, options: IOptions, callback: WSDLCallback): js.Any = js.native
  
  @js.native
  trait IInitializedOptions extends IOptions {
    
    @JSName("ignoredNamespaces")
    var ignoredNamespaces_IInitializedOptions: js.UndefOr[js.Array[String]] = js.native
  }
  object IInitializedOptions {
    
    @scala.inline
    def apply(): IInitializedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInitializedOptions]
    }
    
    @scala.inline
    implicit class IInitializedOptionsMutableBuilder[Self <: IInitializedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoredNamespaces(value: js.Array[String]): Self = StObject.set(x, "ignoredNamespaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredNamespacesUndefined: Self = StObject.set(x, "ignoredNamespaces", js.undefined)
      
      @scala.inline
      def setIgnoredNamespacesVarargs(value: String*): Self = StObject.set(x, "ignoredNamespaces", js.Array(value :_*))
    }
  }
  
  type WSDLCallback = js.Function2[/* error */ js.Any, /* result */ js.UndefOr[WSDL], js.Any]
}
