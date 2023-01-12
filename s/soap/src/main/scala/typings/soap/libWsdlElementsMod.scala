package typings.soap

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.soap.anon.Elements
import typings.soap.libTypesMod.IWsdlBaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWsdlElementsMod {
  
  @JSImport("soap/lib/wsdl/elements", "AllElement")
  @js.native
  open class AllElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("allowedChildren")
    val allowedChildren_AllElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "AnyElement")
  @js.native
  open class AnyElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
  }
  
  @JSImport("soap/lib/wsdl/elements", "BindingElement")
  @js.native
  open class BindingElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("$type")
    var $type: js.UndefOr[String] = js.native
    
    def addChild(child: Any): Unit = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_BindingElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
    
    var methods: StringDictionary[OperationElement] = js.native
    
    def postProcess(definitions: DefinitionsElement): Unit = js.native
    
    var style: String = js.native
    
    var topElements: js.UndefOr[ITopElements] = js.native
    
    var transport: String = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "BodyElement")
  @js.native
  open class BodyElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("$encodingStyle")
    var $encodingStyle: js.UndefOr[String] = js.native
    
    @JSName("$use")
    var $use: js.UndefOr[String] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "ChoiceElement")
  @js.native
  open class ChoiceElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("allowedChildren")
    val allowedChildren_ChoiceElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "ComplexContentElement")
  @js.native
  open class ComplexContentElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("allowedChildren")
    val allowedChildren_ComplexContentElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "ComplexTypeElement")
  @js.native
  open class ComplexTypeElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("allowedChildren")
    val allowedChildren_ComplexTypeElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "DefinitionsElement")
  @js.native
  open class DefinitionsElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    def addChild(child: Any): Unit = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_DefinitionsElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
    
    var bindings: StringDictionary[BindingElement] = js.native
    
    var complexTypes: Any = js.native
    
    var descriptions: Elements = js.native
    
    var messages: StringDictionary[MessageElement] = js.native
    
    var portTypes: StringDictionary[PortTypeElement] = js.native
    
    var schemas: StringDictionary[SchemaElement] = js.native
    
    var services: StringDictionary[ServiceElement] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "DocumentationElement")
  @js.native
  open class DocumentationElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
  }
  
  @JSImport("soap/lib/wsdl/elements", "Element")
  @js.native
  open class Element protected () extends StObject {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("$name")
    var $name: js.UndefOr[String] = js.native
    
    @JSName("$targetNamespace")
    var $targetNamespace: js.UndefOr[Any] = js.native
    
    /* private */ var _initializeOptions: Any = js.native
    
    def addChild(child: Element): Unit = js.native
    
    val allowedChildren: js.UndefOr[
        StringDictionary[
          Instantiable4[
            /* nsName */ String, 
            /* attrs */ Any, 
            /* options */ js.UndefOr[IWsdlBaseOptions], 
            /* schemaAttrs */ js.UndefOr[Any], 
            Element
          ]
        ]
      ] = js.native
    
    var children: js.Array[Element] = js.native
    
    def deleteFixedAttrs(): Unit = js.native
    
    def description(): Any = js.native
    def description(definitions: Unit, xmlns: IXmlNs): Any = js.native
    def description(definitions: DefinitionsElement): Any = js.native
    def description(definitions: DefinitionsElement, xmlns: IXmlNs): Any = js.native
    
    def endElement(stack: js.Array[Element], nsName: String): Unit = js.native
    
    var ignoredNamespaces: Any = js.native
    
    def init(): Unit = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nsName: js.UndefOr[Any] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var schemaXmlns: js.UndefOr[Any] = js.native
    
    def startElement(stack: js.Array[Element], nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaXmlns: Any): Unit = js.native
    
    def unexpected(name: String): Unit = js.native
    
    var valueKey: String = js.native
    
    var xmlKey: Any = js.native
    
    var xmlns: js.UndefOr[IXmlNs] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "ElementElement")
  @js.native
  open class ElementElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("$lookupType")
    var $lookupType: js.UndefOr[String] = js.native
    
    @JSName("$lookupTypes")
    var $lookupTypes: js.UndefOr[js.Array[Any]] = js.native
    
    @JSName("$maxOccurs")
    var $maxOccurs: js.UndefOr[String] = js.native
    
    @JSName("$minOccurs")
    var $minOccurs: js.UndefOr[String] = js.native
    
    @JSName("$ref")
    var $ref: js.UndefOr[String] = js.native
    
    @JSName("$type")
    var $type: js.UndefOr[String] = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_ElementElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
    
    var targetNSAlias: js.UndefOr[String] = js.native
    
    var targetNamespace: js.UndefOr[String] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "EnumerationElement")
  @js.native
  open class EnumerationElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
  }
  
  @JSImport("soap/lib/wsdl/elements", "ExtensionElement")
  @js.native
  open class ExtensionElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("$base")
    var $base: String = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_ExtensionElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "ImportElement")
  @js.native
  open class ImportElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("$location")
    var $location: js.UndefOr[Any] = js.native
    
    @JSName("$namespace")
    var $namespace: js.UndefOr[Any] = js.native
    
    @JSName("$schemaLocation")
    var $schemaLocation: js.UndefOr[Any] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "IncludeElement")
  @js.native
  open class IncludeElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("$location")
    var $location: js.UndefOr[Any] = js.native
    
    @JSName("$namespace")
    var $namespace: js.UndefOr[Any] = js.native
    
    @JSName("$schemaLocation")
    var $schemaLocation: js.UndefOr[Any] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "InputElement")
  @js.native
  open class InputElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("$lookupType")
    var $lookupType: String = js.native
    
    @JSName("$type")
    var $type: String = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_InputElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
    
    var encodingStyle: String = js.native
    
    var parts: js.UndefOr[Any] = js.native
    
    var targetNSAlias: js.UndefOr[String] = js.native
    
    var targetNamespace: js.UndefOr[String] = js.native
    
    var use: String = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "MessageElement")
  @js.native
  open class MessageElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    /**
      * Takes a given namespaced String(for example: 'alias:property') and creates a lookupType
      * object for further use in as first (lookup) `parameterTypeObj` within the `objectToXML`
      * method and provides an entry point for the already existing code in `findChildSchemaObject`.
      *
      * @method _createLookupTypeObject
      * @param {String}            nsString          The NS String (for example "alias:type").
      * @param {Object}            xmlns       The fully parsed `wsdl` definitions object (including all schemas).
      * @returns {Object}
      * @private
      */
    /* private */ var _createLookupTypeObject: Any = js.native
    
    /**
      * Iterates through the element and every nested child to find any defined `$type`
      * property and returns it in a underscore ('_') separated String (using '^' as default
      * value if no `$type` property was found).
      *
      * @method _getNestedLookupTypeString
      * @param {Object}            element         The element which (probably) contains nested `$type` values.
      * @returns {String}
      * @private
      */
    /* private */ var _getNestedLookupTypeString: Any = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_MessageElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
    
    var element: ElementElement = js.native
    
    var parts: Any = js.native
    
    def postProcess(definitions: DefinitionsElement): Unit = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "OperationElement")
  @js.native
  open class OperationElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("$soapAction")
    var $soapAction: js.UndefOr[String] = js.native
    
    @JSName("$style")
    var $style: js.UndefOr[String] = js.native
    
    def addChild(child: Any): Unit = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_OperationElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
    
    var input: InputElement = js.native
    
    var inputSoap: Any = js.native
    
    var output: OutputElement = js.native
    
    var outputSoap: Any = js.native
    
    def postProcess(definitions: DefinitionsElement, tag: String): Unit = js.native
    
    var soapAction: String = js.native
    
    var style: String = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "OutputElement")
  @js.native
  open class OutputElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("$lookupTypes")
    var $lookupTypes: Any = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_OutputElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
    
    var encodingStyle: js.UndefOr[String] = js.native
    
    var targetNSAlias: js.UndefOr[String] = js.native
    
    var targetNamespace: js.UndefOr[String] = js.native
    
    var use: js.UndefOr[String] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "PortElement")
  @js.native
  open class PortElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    def addChild(child: Any): Unit = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_PortElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
    
    var location: Any = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "PortTypeElement")
  @js.native
  open class PortTypeElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("allowedChildren")
    val allowedChildren_PortTypeElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
    
    var methods: StringDictionary[OperationElement] = js.native
    
    def postProcess(definitions: DefinitionsElement): Unit = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "RestrictionElement")
  @js.native
  open class RestrictionElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("$base")
    var $base: String = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_RestrictionElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "SchemaElement")
  @js.native
  open class SchemaElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("$elementFormDefault")
    var $elementFormDefault: Any = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_SchemaElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
    
    var complexTypes: StringDictionary[ComplexTypeElement] = js.native
    
    var elements: StringDictionary[ElementElement] = js.native
    
    var includes: js.Array[IInclude] = js.native
    
    def merge(source: SchemaElement): this.type = js.native
    
    var types: StringDictionary[SimpleTypeElement] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "SequenceElement")
  @js.native
  open class SequenceElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("allowedChildren")
    val allowedChildren_SequenceElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "ServiceElement")
  @js.native
  open class ServiceElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("allowedChildren")
    val allowedChildren_ServiceElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
    
    var ports: StringDictionary[IPort] = js.native
    
    def postProcess(definitions: DefinitionsElement): Unit = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "SimpleContentElement")
  @js.native
  open class SimpleContentElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("allowedChildren")
    val allowedChildren_SimpleContentElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "SimpleTypeElement")
  @js.native
  open class SimpleTypeElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    @JSName("allowedChildren")
    val allowedChildren_SimpleTypeElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "TypesElement")
  @js.native
  open class TypesElement protected () extends Element {
    def this(nsName: String, attrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: Any, options: Unit, schemaAttrs: Any) = this()
    def this(nsName: String, attrs: Any, options: IWsdlBaseOptions, schemaAttrs: Any) = this()
    
    def addChild(child: Any): Unit = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_TypesElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[Any], 
          Element
        ]
      ] = js.native
    
    var schemas: StringDictionary[SchemaElement] = js.native
  }
  
  trait IInclude extends StObject {
    
    var location: String
    
    var namespace: String
  }
  object IInclude {
    
    inline def apply(location: String, namespace: String): IInclude = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInclude]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IInclude] (val x: Self) extends AnyVal {
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPort extends StObject {
    
    var binding: BindingElement
    
    var location: String
  }
  object IPort {
    
    inline def apply(binding: BindingElement, location: String): IPort = {
      val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPort]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPort] (val x: Self) extends AnyVal {
      
      inline def setBinding(value: BindingElement): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITopElement extends StObject {
    
    var methodName: String
    
    var outputName: String
  }
  object ITopElement {
    
    inline def apply(methodName: String, outputName: String): ITopElement = {
      val __obj = js.Dynamic.literal(methodName = methodName.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITopElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITopElement] (val x: Self) extends AnyVal {
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      inline def setOutputName(value: String): Self = StObject.set(x, "outputName", value.asInstanceOf[js.Any])
    }
  }
  
  type ITopElements = StringDictionary[ITopElement]
  
  trait IWsdlXmlns
    extends StObject
       with /* prop */ StringDictionary[String | Unit] {
    
    var __tns__ : js.UndefOr[String] = js.undefined
    
    var soap: js.UndefOr[String] = js.undefined
    
    var tns: js.UndefOr[String] = js.undefined
    
    var wsam: js.UndefOr[String] = js.undefined
    
    var wsp: js.UndefOr[String] = js.undefined
    
    var wsu: js.UndefOr[String] = js.undefined
    
    var xsd: js.UndefOr[String] = js.undefined
  }
  object IWsdlXmlns {
    
    inline def apply(): IWsdlXmlns = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWsdlXmlns]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWsdlXmlns] (val x: Self) extends AnyVal {
      
      inline def setSoap(value: String): Self = StObject.set(x, "soap", value.asInstanceOf[js.Any])
      
      inline def setSoapUndefined: Self = StObject.set(x, "soap", js.undefined)
      
      inline def setTns(value: String): Self = StObject.set(x, "tns", value.asInstanceOf[js.Any])
      
      inline def setTnsUndefined: Self = StObject.set(x, "tns", js.undefined)
      
      inline def setWsam(value: String): Self = StObject.set(x, "wsam", value.asInstanceOf[js.Any])
      
      inline def setWsamUndefined: Self = StObject.set(x, "wsam", js.undefined)
      
      inline def setWsp(value: String): Self = StObject.set(x, "wsp", value.asInstanceOf[js.Any])
      
      inline def setWspUndefined: Self = StObject.set(x, "wsp", js.undefined)
      
      inline def setWsu(value: String): Self = StObject.set(x, "wsu", value.asInstanceOf[js.Any])
      
      inline def setWsuUndefined: Self = StObject.set(x, "wsu", js.undefined)
      
      inline def setXsd(value: String): Self = StObject.set(x, "xsd", value.asInstanceOf[js.Any])
      
      inline def setXsdUndefined: Self = StObject.set(x, "xsd", js.undefined)
      
      inline def set__tns__(value: String): Self = StObject.set(x, "__tns__", value.asInstanceOf[js.Any])
      
      inline def set__tns__Undefined: Self = StObject.set(x, "__tns__", js.undefined)
    }
  }
  
  type IXmlNs = StringDictionary[String]
}
