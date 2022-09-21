package typings.soap

import typings.sax.mod.SAXStream
import typings.soap.elementsMod.DefinitionsElement
import typings.soap.nscontextMod.NamespaceContext
import typings.soap.typesMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wsdlMod {
  
  @JSImport("soap/lib/wsdl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("soap/lib/wsdl", "WSDL")
  @js.native
  open class WSDL protected () extends StObject {
    def this(definition: Any, uri: String, options: IOptions) = this()
    
    /* private */ var _fromServices: Any = js.native
    
    /* private */ var _fromXML: Any = js.native
    
    /* private */ var _includesWsdl: Any = js.native
    
    /* private */ var _initializeOptions: Any = js.native
    
    /* private */ var _originalIgnoredNamespaces: Any = js.native
    
    /* private */ var _parse: Any = js.native
    
    /* private */ var _processNextInclude: Any = js.native
    
    /* private */ var _xmlnsMap: Any = js.native
    
    /* private */ var callback: Any = js.native
    
    var definitions: DefinitionsElement = js.native
    
    def describeServices(): js.Object = js.native
    
    def filterOutIgnoredNameSpace(ns: String): String = js.native
    
    def findChildSchemaObject(parameterTypeObj: Any, childName: Any): Any = js.native
    def findChildSchemaObject(parameterTypeObj: Any, childName: Any, backtrace: Any): Any = js.native
    
    /**
      * Look up a XSD type or element by namespace URI and name
      * @param {String} nsURI Namespace URI
      * @param {String} qname Local or qualified name
      * @returns {*} The XSD type/element definition
      */
    def findSchemaObject(nsURI: String, qname: String): Any = js.native
    
    /**
      * Look up a schema type definition
      * @param name
      * @param nsURI
      * @returns {*}
      */
    def findSchemaType(name: Any, nsURI: Any): Any = js.native
    
    def getSaxStream(xml: Any): SAXStream = js.native
    
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
    def objectToDocumentXML(name: String, params: Any, nsPrefix: String): Any = js.native
    def objectToDocumentXML(name: String, params: Any, nsPrefix: String, nsURI: String): Any = js.native
    def objectToDocumentXML(name: String, params: Any, nsPrefix: String, nsURI: String, `type`: String): Any = js.native
    def objectToDocumentXML(name: String, params: Any, nsPrefix: String, nsURI: Unit, `type`: String): Any = js.native
    
    /**
      * Create RPC style xml string from the parameters
      * @param {String} name
      * @param {*} params
      * @param {String} nsPrefix
      * @param {String} nsURI
      * @returns {string}
      */
    def objectToRpcXML(name: String, params: Any, nsPrefix: String, nsURI: String): String = js.native
    def objectToRpcXML(name: String, params: Any, nsPrefix: String, nsURI: String, isParts: Boolean): String = js.native
    
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
    def objectToXML(obj: Any, name: String, nsPrefix: Any, nsURI: String): Any = js.native
    def objectToXML(obj: Any, name: String, nsPrefix: Any, nsURI: String, isFirst: Boolean): Any = js.native
    def objectToXML(obj: Any, name: String, nsPrefix: Any, nsURI: String, isFirst: Boolean, xmlnsAttr: Any): Any = js.native
    def objectToXML(
      obj: Any,
      name: String,
      nsPrefix: Any,
      nsURI: String,
      isFirst: Boolean,
      xmlnsAttr: Any,
      schemaObject: Any
    ): Any = js.native
    def objectToXML(
      obj: Any,
      name: String,
      nsPrefix: Any,
      nsURI: String,
      isFirst: Boolean,
      xmlnsAttr: Any,
      schemaObject: Any,
      nsContext: NamespaceContext
    ): Any = js.native
    def objectToXML(
      obj: Any,
      name: String,
      nsPrefix: Any,
      nsURI: String,
      isFirst: Boolean,
      xmlnsAttr: Any,
      schemaObject: Unit,
      nsContext: NamespaceContext
    ): Any = js.native
    def objectToXML(
      obj: Any,
      name: String,
      nsPrefix: Any,
      nsURI: String,
      isFirst: Boolean,
      xmlnsAttr: Unit,
      schemaObject: Any
    ): Any = js.native
    def objectToXML(
      obj: Any,
      name: String,
      nsPrefix: Any,
      nsURI: String,
      isFirst: Boolean,
      xmlnsAttr: Unit,
      schemaObject: Any,
      nsContext: NamespaceContext
    ): Any = js.native
    def objectToXML(
      obj: Any,
      name: String,
      nsPrefix: Any,
      nsURI: String,
      isFirst: Boolean,
      xmlnsAttr: Unit,
      schemaObject: Unit,
      nsContext: NamespaceContext
    ): Any = js.native
    def objectToXML(obj: Any, name: String, nsPrefix: Any, nsURI: String, isFirst: Unit, xmlnsAttr: Any): Any = js.native
    def objectToXML(
      obj: Any,
      name: String,
      nsPrefix: Any,
      nsURI: String,
      isFirst: Unit,
      xmlnsAttr: Any,
      schemaObject: Any
    ): Any = js.native
    def objectToXML(
      obj: Any,
      name: String,
      nsPrefix: Any,
      nsURI: String,
      isFirst: Unit,
      xmlnsAttr: Any,
      schemaObject: Any,
      nsContext: NamespaceContext
    ): Any = js.native
    def objectToXML(
      obj: Any,
      name: String,
      nsPrefix: Any,
      nsURI: String,
      isFirst: Unit,
      xmlnsAttr: Any,
      schemaObject: Unit,
      nsContext: NamespaceContext
    ): Any = js.native
    def objectToXML(
      obj: Any,
      name: String,
      nsPrefix: Any,
      nsURI: String,
      isFirst: Unit,
      xmlnsAttr: Unit,
      schemaObject: Any
    ): Any = js.native
    def objectToXML(
      obj: Any,
      name: String,
      nsPrefix: Any,
      nsURI: String,
      isFirst: Unit,
      xmlnsAttr: Unit,
      schemaObject: Any,
      nsContext: NamespaceContext
    ): Any = js.native
    def objectToXML(
      obj: Any,
      name: String,
      nsPrefix: Any,
      nsURI: String,
      isFirst: Unit,
      xmlnsAttr: Unit,
      schemaObject: Unit,
      nsContext: NamespaceContext
    ): Any = js.native
    
    def onReady(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    var options: IInitializedOptions = js.native
    
    def processAttributes(child: Any, nsContext: NamespaceContext): String = js.native
    
    def processIncludes(callback: Any): Unit = js.native
    
    /* private */ var services: Any = js.native
    
    def toXML(): String = js.native
    
    var uri: String = js.native
    
    var valueKey: String = js.native
    
    /* private */ var xml: Any = js.native
    
    var xmlKey: String = js.native
    
    def xmlToObject(xml: Any): Any = js.native
    def xmlToObject(xml: Any, callback: Any): Any = js.native
    
    var xmlnsInEnvelope: String = js.native
    
    var xmlnsInHeader: String = js.native
  }
  
  inline def openWsdl(uri: Any, callback: WSDLCallback): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("open_wsdl")(uri.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def openWsdl(uri: Any, options: IOptions, callback: WSDLCallback): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("open_wsdl")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait IInitializedOptions
    extends StObject
       with IOptions {
    
    @JSName("ignoredNamespaces")
    var ignoredNamespaces_IInitializedOptions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object IInitializedOptions {
    
    inline def apply(): IInitializedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInitializedOptions]
    }
    
    extension [Self <: IInitializedOptions](x: Self) {
      
      inline def setIgnoredNamespaces(value: js.Array[String]): Self = StObject.set(x, "ignoredNamespaces", value.asInstanceOf[js.Any])
      
      inline def setIgnoredNamespacesUndefined: Self = StObject.set(x, "ignoredNamespaces", js.undefined)
      
      inline def setIgnoredNamespacesVarargs(value: String*): Self = StObject.set(x, "ignoredNamespaces", js.Array(value*))
    }
  }
  
  type WSDLCallback = js.Function2[/* error */ Any, /* result */ js.UndefOr[WSDL], Any]
}
