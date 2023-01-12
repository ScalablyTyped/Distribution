package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.distParserHighLevelASTMod.IAttribute
import typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import typings.raml1Parser.distParserHighLevelASTMod.ValidationIssue
import typings.raml1Parser.distParserHighLevelImplMod.StructuredValue
import typings.raml1Parser.distParserLowLevelASTMod.ILowLevelASTNode
import typings.raml1Parser.distParserWrappedAstDefaultCalculatorMod.AttributeDefaultsCalculator
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.AttributeNode
import typings.ramlTypesystem.mod.IParsedType
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserWrappedAstParserCoreMod {
  
  @JSImport("raml-1-parser/dist/parser/wrapped-ast/parserCore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/parser/wrapped-ast/parserCore", "AttributeNodeImpl")
  @js.native
  open class AttributeNodeImpl protected ()
    extends StObject
       with AttributeNode {
    def this(attr: IAttribute) = this()
    
    /**
      * @return RAML version of the node. "RAML10" for RAML 1.0 and "RAML08" for RAML 0.8.
      */
    /* CompleteClass */
    override def RAMLVersion(): String = js.native
    
    /* protected */ var _meta: ValueMetadataImpl = js.native
    
    /**
      * Returns all kinds of this node.
      * @returns {string[]}
      */
    def allKinds(): js.Array[String] = js.native
    
    /**
      * Returns all of implementation class names of this node.
      * @returns {string[]}
      */
    def allWrapperClassNames(): js.Array[String] = js.native
    
    /* protected */ var attr: IAttribute = js.native
    
    def getClassIdentifier(): js.Array[String] = js.native
    
    /**
      * @return Underlying High Level attribute node
      **/
    /* CompleteClass */
    override def highLevel(): IAttribute = js.native
    
    /**
      * @return Actual name of instance interface
      **/
    /* CompleteClass */
    override def kind(): String = js.native
    
    /* CompleteClass */
    override def meta(): typings.raml1Parser.distParserWrappedAstParserCoreApiMod.ValueMetadata = js.native
    
    /**
      * @return Whether the element is an optional sibling of trait or resource type
      **/
    /* CompleteClass */
    override def optional(): Boolean = js.native
    
    /* CompleteClass */
    override def parent(): typings.raml1Parser.distParserWrappedAstParserCoreApiMod.BasicNode = js.native
    
    /**
      * JSON representation of the attribute value
      **/
    /* CompleteClass */
    override def toJSON(): Any = js.native
    def toJSON(serializeOptions: typings.raml1Parser.distUtilJsonSerializerMod.SerializeOptions): Any = js.native
    
    /**
      * @hidden
      **/
    /* CompleteClass */
    override def wrapperClassName(): String = js.native
  }
  /* static members */
  object AttributeNodeImpl {
    
    @JSImport("raml-1-parser/dist/parser/wrapped-ast/parserCore", "AttributeNodeImpl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/wrapped-ast/parserCore", "AttributeNodeImpl.CLASS_IDENTIFIER")
    @js.native
    def CLASS_IDENTIFIER: Any = js.native
    inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("raml-1-parser/dist/parser/wrapped-ast/parserCore", "BasicNodeImpl")
  @js.native
  open class BasicNodeImpl protected ()
    extends StObject
       with typings.raml1Parser.distParserHighLevelASTMod.BasicNode {
    /**
      * @hidden
      **/
    def this(_node: IHighLevelNode) = this()
    def this(_node: IHighLevelNode, setAsWrapper: Boolean) = this()
    
    /**
      * @return RAML version of the node. "RAML10" for RAML 1.0 and "RAML08" for RAML 0.8.
      */
    /* CompleteClass */
    override def RAMLVersion(): String = js.native
    
    var _meta: NodeMetadataImpl = js.native
    
    /* protected */ var _node: IHighLevelNode = js.native
    
    /**
      * Append node as child
      * @param node node to be appended
      **/
    def add(node: BasicNodeImpl): Unit = js.native
    
    /**
      * Append node as property value
      * @param node node to be set as property value
      * @param prop name of property to set value for
      **/
    def addToProp(node: BasicNodeImpl, prop: String): Unit = js.native
    
    /**
      * Returns all kinds of this node.
      * @returns {string[]}
      */
    def allKinds(): js.Array[String] = js.native
    
    /**
      * Returns all of implementation class names of this node.
      * @returns {string[]}
      */
    def allWrapperClassNames(): js.Array[String] = js.native
    
    /**
      * @hidden
      **/
    /* protected */ def attribute(name: String): Any = js.native
    /* protected */ def attribute(name: String, constr: js.Function1[/* attr */ IAttribute, Any]): Any = js.native
    
    def attributeDefaults(): Boolean = js.native
    
    /**
      * @hidden
      **/
    /* protected */ def attributes(name: String): js.Array[Any] = js.native
    /* protected */ def attributes(name: String, constr: js.Function1[/* attr */ IAttribute, Any]): js.Array[Any] = js.native
    
    /* private */ var defaultsCalculator: Any = js.native
    
    /**
      * @return YAML string representing the node
      **/
    def dump(): String = js.native
    
    /**
      * @hidden
      **/
    /* protected */ def element(name: String): Any = js.native
    
    /**
      * @hidden
      **/
    /* protected */ def elements(name: String): js.Array[Any] = js.native
    
    def getClassIdentifier(): js.Array[String] = js.native
    
    /**
      * @hidden
      **/
    def getDefaultsCalculator(): AttributeDefaultsCalculator = js.native
    
    /**
      * @return Actual name of instance interface
      **/
    /* CompleteClass */
    override def kind(): String = js.native
    
    /**
      * @hidden
      * Replace underlying high level node
      **/
    def patchNode(node: IHighLevelNode): Unit = js.native
    
    /**
      * Remove node from children set
      * @param node node to be removed
      **/
    def remove(node: BasicNodeImpl): Unit = js.native
    
    /**
      * @hidden
      **/
    def setAttributeDefaults(attributeDefaults: Boolean): Unit = js.native
    
    def toAny(arg: Any): Any = js.native
    
    def toBoolean(arg: Any): Boolean = js.native
    
    def toJSON(serializeOptions: typings.raml1Parser.distUtilJsonSerializerMod.SerializeOptions): Any = js.native
    
    def toNumber(arg: Any): Any = js.native
    
    def toString(arg: Any): String = js.native
    
    /**
      * @hidden
      **/
    /* CompleteClass */
    override def wrapperClassName(): String = js.native
  }
  /* static members */
  object BasicNodeImpl {
    
    @JSImport("raml-1-parser/dist/parser/wrapped-ast/parserCore", "BasicNodeImpl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/wrapped-ast/parserCore", "BasicNodeImpl.CLASS_IDENTIFIER")
    @js.native
    def CLASS_IDENTIFIER: Any = js.native
    inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("raml-1-parser/dist/parser/wrapped-ast/parserCore", "NodeMetadataImpl")
  @js.native
  open class NodeMetadataImpl ()
    extends ValueMetadataImpl
       with typings.raml1Parser.distParserHighLevelASTMod.NodeMetadata {
    def this(_insertedAsDefault: Boolean) = this()
    def this(_insertedAsDefault: Boolean, _calculated: Boolean) = this()
    def this(_insertedAsDefault: Unit, _calculated: Boolean) = this()
    def this(_insertedAsDefault: Boolean, _calculated: Boolean, _optional: Boolean) = this()
    def this(_insertedAsDefault: Boolean, _calculated: Unit, _optional: Boolean) = this()
    def this(_insertedAsDefault: Unit, _calculated: Boolean, _optional: Boolean) = this()
    def this(_insertedAsDefault: Unit, _calculated: Unit, _optional: Boolean) = this()
    
    /**
      * Returns 'true', if the actual value is missing, and returned value has
      * been obtained from the RAML document by means of some rule.
      * @default false
      */
    /* CompleteClass */
    override def calculated(): Boolean = js.native
    
    /**
      * Returns 'true', if the actual value is missing, and returned value is
      * stated in the RAML spec as default for the property
      * @default false
      */
    /* CompleteClass */
    override def insertedAsDefault(): Boolean = js.native
    
    /**
      * Returns 'true', if all values are default.
      */
    /* CompleteClass */
    override def isDefault(): Boolean = js.native
    
    /**
      * Returns 'true' for optional siblings of traits and resource types
      * @default false
      */
    /* CompleteClass */
    override def optional(): Boolean = js.native
    
    /**
      * Returns metadata for those properties of the node, whose type is primitive or an array of primitive.
      */
    /* CompleteClass */
    override def primitiveValuesMeta(): StringDictionary[typings.raml1Parser.distParserHighLevelASTMod.ValueMetadata] = js.native
    
    def registerCalculatedValue(propName: String): Unit = js.native
    
    def registerInsertedAsDefaultValue(propName: String): Unit = js.native
    
    def registerOptionalValue(propName: String): Unit = js.native
    
    def resetPrimitiveValuesMeta(): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): Any = js.native
    
    var valuesMeta: StringDictionary[ValueMetadata] = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/wrapped-ast/parserCore", "TypeInstanceImpl")
  @js.native
  open class TypeInstanceImpl protected () extends StObject {
    def this(nodes: js.Array[ILowLevelASTNode]) = this()
    def this(nodes: ILowLevelASTNode) = this()
    def this(nodes: js.Array[ILowLevelASTNode], `type`: IParsedType) = this()
    def this(nodes: ILowLevelASTNode, `type`: IParsedType) = this()
    
    /* protected */ var children: js.Array[ILowLevelASTNode] = js.native
    
    /* private */ var getChildren: Any = js.native
    
    def getClassIdentifier(): js.Array[String] = js.native
    
    def isArray(): Boolean = js.native
    
    def isScalar(): Boolean = js.native
    
    def items(): js.Array[TypeInstanceImpl] = js.native
    
    /* protected */ var node: ILowLevelASTNode = js.native
    
    def properties(): js.Array[TypeInstancePropertyImpl] = js.native
    
    def toJSON(): Any = js.native
    
    /* protected */ var `type`: js.UndefOr[IParsedType] = js.native
    
    def value(): Any = js.native
  }
  /* static members */
  object TypeInstanceImpl {
    
    @JSImport("raml-1-parser/dist/parser/wrapped-ast/parserCore", "TypeInstanceImpl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/wrapped-ast/parserCore", "TypeInstanceImpl.CLASS_IDENTIFIER")
    @js.native
    def CLASS_IDENTIFIER: Any = js.native
    inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("raml-1-parser/dist/parser/wrapped-ast/parserCore", "TypeInstancePropertyImpl")
  @js.native
  open class TypeInstancePropertyImpl protected () extends StObject {
    def this(node: ILowLevelASTNode) = this()
    
    def getClassIdentifier(): js.Array[String] = js.native
    
    def isArray(): Boolean = js.native
    
    def name(): String = js.native
    
    /* protected */ var node: ILowLevelASTNode = js.native
    
    def value(): TypeInstanceImpl = js.native
    
    def values(): js.Array[TypeInstanceImpl] = js.native
  }
  /* static members */
  object TypeInstancePropertyImpl {
    
    @JSImport("raml-1-parser/dist/parser/wrapped-ast/parserCore", "TypeInstancePropertyImpl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/wrapped-ast/parserCore", "TypeInstancePropertyImpl.CLASS_IDENTIFIER")
    @js.native
    def CLASS_IDENTIFIER: Any = js.native
    inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("raml-1-parser/dist/parser/wrapped-ast/parserCore", "ValueMetadataImpl")
  @js.native
  open class ValueMetadataImpl ()
    extends StObject
       with typings.raml1Parser.distParserHighLevelASTMod.ValueMetadata {
    def this(_insertedAsDefault: Boolean) = this()
    def this(_insertedAsDefault: Boolean, _calculated: Boolean) = this()
    def this(_insertedAsDefault: Unit, _calculated: Boolean) = this()
    def this(_insertedAsDefault: Boolean, _calculated: Boolean, _optional: Boolean) = this()
    def this(_insertedAsDefault: Boolean, _calculated: Unit, _optional: Boolean) = this()
    def this(_insertedAsDefault: Unit, _calculated: Boolean, _optional: Boolean) = this()
    def this(_insertedAsDefault: Unit, _calculated: Unit, _optional: Boolean) = this()
    
    /* protected */ var _calculated: Boolean = js.native
    
    /* protected */ var _insertedAsDefault: Boolean = js.native
    
    /* protected */ var _optional: Boolean = js.native
    
    /**
      * Returns 'true', if the actual value is missing, and returned value has
      * been obtained from the RAML document by means of some rule.
      * @default false
      */
    /* CompleteClass */
    override def calculated(): Boolean = js.native
    
    /**
      * Returns 'true', if the actual value is missing, and returned value is
      * stated in the RAML spec as default for the property
      * @default false
      */
    /* CompleteClass */
    override def insertedAsDefault(): Boolean = js.native
    
    /**
      * Returns 'true', if all values are default.
      */
    /* CompleteClass */
    override def isDefault(): Boolean = js.native
    
    /**
      * Returns 'true' for optional siblings of traits and resource types
      * @default false
      */
    /* CompleteClass */
    override def optional(): Boolean = js.native
    
    def setCalculated(): Unit = js.native
    
    def setInsertedAsDefault(): Unit = js.native
    
    def setOptional(): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  inline def attributesToValues(attrs: js.Array[IAttribute]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("attributesToValues")(attrs.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def attributesToValues(attrs: js.Array[IAttribute], constr: js.Function1[/* attr */ IAttribute, Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("attributesToValues")(attrs.asInstanceOf[js.Any], constr.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def basicError(_node: IHighLevelNode, x: ValidationIssue): RamlParserError = (^.asInstanceOf[js.Dynamic].applyDynamic("basicError")(_node.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[RamlParserError]
  
  inline def errors(_node: IHighLevelNode): js.Array[RamlParserError] = ^.asInstanceOf[js.Dynamic].applyDynamic("errors")(_node.asInstanceOf[js.Any]).asInstanceOf[js.Array[RamlParserError]]
  
  inline def fillElementMeta(node: BasicNodeImpl): NodeMetadataImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("fillElementMeta")(node.asInstanceOf[js.Any]).asInstanceOf[NodeMetadataImpl]
  
  inline def filterErrors(rawErrors: js.Array[RamlParserError]): js.Array[RamlParserError] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterErrors")(rawErrors.asInstanceOf[js.Any]).asInstanceOf[js.Array[RamlParserError]]
  
  inline def toStructuredValue(node: IAttribute): StructuredValue = ^.asInstanceOf[js.Dynamic].applyDynamic("toStructuredValue")(node.asInstanceOf[js.Any]).asInstanceOf[StructuredValue]
  
  type AbstractWrapperNode = typings.raml1Parser.distParserHighLevelASTMod.AbstractWrapperNode
  
  trait ApiLoadingError
    extends StObject
       with Error {
    
    var parserErrors: js.Array[RamlParserError]
  }
  object ApiLoadingError {
    
    inline def apply(message: String, name: String, parserErrors: js.Array[RamlParserError]): ApiLoadingError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parserErrors = parserErrors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiLoadingError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApiLoadingError] (val x: Self) extends AnyVal {
      
      inline def setParserErrors(value: js.Array[RamlParserError]): Self = StObject.set(x, "parserErrors", value.asInstanceOf[js.Any])
      
      inline def setParserErrorsVarargs(value: RamlParserError*): Self = StObject.set(x, "parserErrors", js.Array(value*))
    }
  }
  
  type BasicNode = typings.raml1Parser.distParserHighLevelASTMod.BasicNode
  
  type NodeMetadata = typings.raml1Parser.distParserHighLevelASTMod.NodeMetadata
  
  type RamlParserError = typings.raml1Parser.distParserHighLevelASTMod.RamlParserError
  
  type SerializeOptions = typings.raml1Parser.distParserHighLevelASTMod.SerializeOptions
  
  type ValueMetaData_ = typings.raml1Parser.distParserHighLevelASTMod.ValueMetadata
  
  type ValueMetadata = typings.raml1Parser.distParserHighLevelASTMod.ValueMetadata
}
