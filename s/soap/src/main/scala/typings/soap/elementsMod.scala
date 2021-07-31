package typings.soap

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.soap.anon.Types
import typings.soap.typesMod.IWsdlBaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementsMod {
  
  @JSImport("soap/lib/wsdl/elements", "AllElement")
  @js.native
  class AllElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("allowedChildren")
    val allowedChildren_AllElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
          Element
        ]
      ] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "AnyElement")
  @js.native
  class AnyElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
  }
  
  @JSImport("soap/lib/wsdl/elements", "BindingElement")
  @js.native
  class BindingElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("$type")
    var $type: js.UndefOr[String] = js.native
    
    def addChild(child: js.Any): Unit = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_BindingElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
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
  class BodyElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("$encodingStyle")
    var $encodingStyle: js.UndefOr[String] = js.native
    
    @JSName("$use")
    var $use: js.UndefOr[String] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "ChoiceElement")
  @js.native
  class ChoiceElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("allowedChildren")
    val allowedChildren_ChoiceElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
          Element
        ]
      ] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "ComplexContentElement")
  @js.native
  class ComplexContentElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("allowedChildren")
    val allowedChildren_ComplexContentElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
          Element
        ]
      ] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "ComplexTypeElement")
  @js.native
  class ComplexTypeElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("allowedChildren")
    val allowedChildren_ComplexTypeElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
          Element
        ]
      ] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "DefinitionsElement")
  @js.native
  class DefinitionsElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    def addChild(child: js.Any): Unit = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_DefinitionsElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
          Element
        ]
      ] = js.native
    
    var bindings: StringDictionary[BindingElement] = js.native
    
    var complexTypes: js.Any = js.native
    
    var descriptions: Types = js.native
    
    var messages: StringDictionary[MessageElement] = js.native
    
    var portTypes: StringDictionary[PortTypeElement] = js.native
    
    var schemas: StringDictionary[SchemaElement] = js.native
    
    var services: StringDictionary[ServiceElement] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "DocumentationElement")
  @js.native
  class DocumentationElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
  }
  
  @JSImport("soap/lib/wsdl/elements", "Element")
  @js.native
  class Element protected () extends StObject {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
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
    def description(definitions: Unit, xmlns: IXmlNs): js.Any = js.native
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
  
  @JSImport("soap/lib/wsdl/elements", "ElementElement")
  @js.native
  class ElementElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("$lookupType")
    var $lookupType: js.UndefOr[String] = js.native
    
    @JSName("$lookupTypes")
    var $lookupTypes: js.UndefOr[js.Array[js.Any]] = js.native
    
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
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
          Element
        ]
      ] = js.native
    
    var targetNSAlias: js.UndefOr[String] = js.native
    
    var targetNamespace: js.UndefOr[String] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "EnumerationElement")
  @js.native
  class EnumerationElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
  }
  
  @JSImport("soap/lib/wsdl/elements", "ExtensionElement")
  @js.native
  class ExtensionElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("$base")
    var $base: String = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_ExtensionElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
          Element
        ]
      ] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "ImportElement")
  @js.native
  class ImportElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("$location")
    var $location: js.UndefOr[js.Any] = js.native
    
    @JSName("$namespace")
    var $namespace: js.UndefOr[js.Any] = js.native
    
    @JSName("$schemaLocation")
    var $schemaLocation: js.UndefOr[js.Any] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "IncludeElement")
  @js.native
  class IncludeElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("$location")
    var $location: js.UndefOr[js.Any] = js.native
    
    @JSName("$namespace")
    var $namespace: js.UndefOr[js.Any] = js.native
    
    @JSName("$schemaLocation")
    var $schemaLocation: js.UndefOr[js.Any] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "InputElement")
  @js.native
  class InputElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("$lookupType")
    var $lookupType: String = js.native
    
    @JSName("$type")
    var $type: String = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_InputElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
          Element
        ]
      ] = js.native
    
    var encodingStyle: String = js.native
    
    var parts: js.UndefOr[js.Any] = js.native
    
    var targetNSAlias: js.UndefOr[String] = js.native
    
    var targetNamespace: js.UndefOr[String] = js.native
    
    var use: String = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "MessageElement")
  @js.native
  class MessageElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
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
    var _createLookupTypeObject: js.Any = js.native
    
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
    var _getNestedLookupTypeString: js.Any = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_MessageElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
          Element
        ]
      ] = js.native
    
    var element: ElementElement = js.native
    
    var parts: js.Any = js.native
    
    def postProcess(definitions: DefinitionsElement): Unit = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "OperationElement")
  @js.native
  class OperationElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("$soapAction")
    var $soapAction: js.UndefOr[String] = js.native
    
    @JSName("$style")
    var $style: js.UndefOr[String] = js.native
    
    def addChild(child: js.Any): Unit = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_OperationElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
          Element
        ]
      ] = js.native
    
    var input: InputElement = js.native
    
    var inputSoap: js.Any = js.native
    
    var output: OutputElement = js.native
    
    var outputSoap: js.Any = js.native
    
    def postProcess(definitions: DefinitionsElement, tag: String): Unit = js.native
    
    var soapAction: String = js.native
    
    var style: String = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "OutputElement")
  @js.native
  class OutputElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("$lookupTypes")
    var $lookupTypes: js.Any = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_OutputElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
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
  class PortElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    def addChild(child: js.Any): Unit = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_PortElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
          Element
        ]
      ] = js.native
    
    var location: js.Any = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "PortTypeElement")
  @js.native
  class PortTypeElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("allowedChildren")
    val allowedChildren_PortTypeElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
          Element
        ]
      ] = js.native
    
    var methods: StringDictionary[OperationElement] = js.native
    
    def postProcess(definitions: DefinitionsElement): Unit = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "RestrictionElement")
  @js.native
  class RestrictionElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("$base")
    var $base: String = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_RestrictionElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
          Element
        ]
      ] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "SchemaElement")
  @js.native
  class SchemaElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
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
  
  @JSImport("soap/lib/wsdl/elements", "SequenceElement")
  @js.native
  class SequenceElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("allowedChildren")
    val allowedChildren_SequenceElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
          Element
        ]
      ] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "ServiceElement")
  @js.native
  class ServiceElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("allowedChildren")
    val allowedChildren_ServiceElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
          Element
        ]
      ] = js.native
    
    var ports: StringDictionary[IPort] = js.native
    
    def postProcess(definitions: DefinitionsElement): Unit = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "SimpleContentElement")
  @js.native
  class SimpleContentElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("allowedChildren")
    val allowedChildren_SimpleContentElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
          Element
        ]
      ] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "SimpleTypeElement")
  @js.native
  class SimpleTypeElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    @JSName("allowedChildren")
    val allowedChildren_SimpleTypeElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
          Element
        ]
      ] = js.native
  }
  
  @JSImport("soap/lib/wsdl/elements", "TypesElement")
  @js.native
  class TypesElement protected () extends Element {
    def this(nsName: String, attrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions) = this()
    def this(nsName: String, attrs: js.Any, options: Unit, schemaAttrs: js.Any) = this()
    def this(nsName: String, attrs: js.Any, options: IWsdlBaseOptions, schemaAttrs: js.Any) = this()
    
    def addChild(child: js.Any): Unit = js.native
    
    @JSName("allowedChildren")
    val allowedChildren_TypesElement: StringDictionary[
        Instantiable4[
          /* nsName */ String, 
          /* attrs */ js.Any, 
          /* options */ js.UndefOr[IWsdlBaseOptions], 
          /* schemaAttrs */ js.UndefOr[js.Any], 
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
    
    @scala.inline
    def apply(location: String, namespace: String): IInclude = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInclude]
    }
    
    @scala.inline
    implicit class IIncludeMutableBuilder[Self <: IInclude] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPort extends StObject {
    
    var binding: BindingElement
    
    var location: String
  }
  object IPort {
    
    @scala.inline
    def apply(binding: BindingElement, location: String): IPort = {
      val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPort]
    }
    
    @scala.inline
    implicit class IPortMutableBuilder[Self <: IPort] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinding(value: BindingElement): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITopElement extends StObject {
    
    var methodName: String
    
    var outputName: String
  }
  object ITopElement {
    
    @scala.inline
    def apply(methodName: String, outputName: String): ITopElement = {
      val __obj = js.Dynamic.literal(methodName = methodName.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITopElement]
    }
    
    @scala.inline
    implicit class ITopElementMutableBuilder[Self <: ITopElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputName(value: String): Self = StObject.set(x, "outputName", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): IWsdlXmlns = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWsdlXmlns]
    }
    
    @scala.inline
    implicit class IWsdlXmlnsMutableBuilder[Self <: IWsdlXmlns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSoap(value: String): Self = StObject.set(x, "soap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoapUndefined: Self = StObject.set(x, "soap", js.undefined)
      
      @scala.inline
      def setTns(value: String): Self = StObject.set(x, "tns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTnsUndefined: Self = StObject.set(x, "tns", js.undefined)
      
      @scala.inline
      def setWsam(value: String): Self = StObject.set(x, "wsam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsamUndefined: Self = StObject.set(x, "wsam", js.undefined)
      
      @scala.inline
      def setWsp(value: String): Self = StObject.set(x, "wsp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWspUndefined: Self = StObject.set(x, "wsp", js.undefined)
      
      @scala.inline
      def setWsu(value: String): Self = StObject.set(x, "wsu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsuUndefined: Self = StObject.set(x, "wsu", js.undefined)
      
      @scala.inline
      def setXsd(value: String): Self = StObject.set(x, "xsd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsdUndefined: Self = StObject.set(x, "xsd", js.undefined)
      
      @scala.inline
      def set__tns__(value: String): Self = StObject.set(x, "__tns__", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__tns__Undefined: Self = StObject.set(x, "__tns__", js.undefined)
    }
  }
  
  type IXmlNs = StringDictionary[String]
}
