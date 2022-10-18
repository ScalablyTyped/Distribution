package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.distParserAstDotcoreReferencePatcherMod.EscapeData
import typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import typings.ramlTypesystem.distSrcTypeExpressionUtilMod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilTypeExpanderMod {
  
  @JSImport("raml-1-parser/dist/util/typeExpander", "AbstractTypeEntry")
  @js.native
  open class AbstractTypeEntry protected ()
    extends StObject
       with TypeEntry {
    def this(_original: IParsedType, _superTypes: js.Array[TypeEntry]) = this()
    
    /* protected */ var _branchingRegistry: BranchingRegistry = js.native
    
    /* private */ var _id: Any = js.native
    
    /* protected */ var _original: IParsedType = js.native
    
    /* protected */ var _superTypes: js.Array[TypeEntry] = js.native
    
    /* protected */ var _typeAttrVal: String = js.native
    
    /* CompleteClass */
    override def addSuperType(`type`: TypeEntry): Unit = js.native
    
    /* CompleteClass */
    override def allFacets(): js.Array[ITypeFacet] = js.native
    
    /* CompleteClass */
    override def append(te: GeneralTypeEntry, bd: BranchingData): Unit = js.native
    
    /* CompleteClass */
    override def branchingRegistry(): BranchingRegistry = js.native
    
    def declaredExampleFacets(): js.Array[typings.ramlTypesystem.distSrcTypesystemInterfacesMod.ITypeFacet] = js.native
    
    /* CompleteClass */
    override def declaredFacets(): js.Array[ITypeFacet] = js.native
    
    /* CompleteClass */
    override def displayName(): String = js.native
    
    /* CompleteClass */
    override def examples(expand: Boolean): js.Array[IExample] = js.native
    
    /* private */ var getOneMetaValue: Any = js.native
    
    /* CompleteClass */
    override def id(): String = js.native
    
    /* CompleteClass */
    override def isBuiltIn(): Boolean = js.native
    
    /* CompleteClass */
    override def isExternal(): Boolean = js.native
    
    /* CompleteClass */
    override def isIntersection(): Boolean = js.native
    
    /* CompleteClass */
    override def isRecursionPoint(): Boolean = js.native
    
    /* CompleteClass */
    override def isUnion(): Boolean = js.native
    
    /* CompleteClass */
    override def isUnknown(): Boolean = js.native
    
    /* CompleteClass */
    override def meta(): js.Array[ITypeFacet] = js.native
    
    /* CompleteClass */
    override def name(): String = js.native
    
    /* CompleteClass */
    override def original(): IParsedType = js.native
    
    def possibleBuiltInTypes(): js.Array[String] = js.native
    /* CompleteClass */
    override def possibleBuiltInTypes(occured: StringDictionary[Boolean]): js.Array[String] = js.native
    
    /* CompleteClass */
    override def schema(): String = js.native
    
    /* CompleteClass */
    override def schemaPath(): String = js.native
    
    def setBranchingRegistry(value: BranchingRegistry): Unit = js.native
    
    def setTypeAttributeValue(`val`: String): Unit = js.native
    
    def sourceMap(): ElementSourceInfo = js.native
    
    /* CompleteClass */
    override def superTypes(): js.Array[TypeEntry] = js.native
    
    /* CompleteClass */
    override def typeAttributeValue(): Any = js.native
  }
  
  @JSImport("raml-1-parser/dist/util/typeExpander", "BasicTypeMap")
  @js.native
  open class BasicTypeMap ()
    extends StObject
       with TypeMap {
    
    /* CompleteClass */
    override def addProperty(typeName: String, propName: String, prop: Entry): Any = js.native
    def addProperty(typeName: String, propName: String, prop: PropertyEntry): Unit = js.native
    
    def addType(t: AbstractTypeEntry): Unit = js.native
    /* CompleteClass */
    override def addType(t: TypeEntry): Unit = js.native
    
    def hasType(t: AbstractTypeEntry): Boolean = js.native
    /* CompleteClass */
    override def hasType(t: TypeEntry): Boolean = js.native
    
    /* CompleteClass */
    override def hasTypeByName(name: String): Boolean = js.native
    
    /* private */ var propKey: Any = js.native
    
    /* private */ var propertiesMap: Any = js.native
    
    /* CompleteClass */
    override def property(typeName: String, propName: String): Entry = js.native
    
    def removeType(t: AbstractTypeEntry): Unit = js.native
    /* CompleteClass */
    override def removeType(t: TypeEntry): Unit = js.native
    
    /* CompleteClass */
    override def typeByName(name: String): TypeEntry = js.native
    
    /* private */ var typeMapById: Any = js.native
    
    /* private */ var typeMapByName: Any = js.native
  }
  
  @JSImport("raml-1-parser/dist/util/typeExpander", "BuiltInTypeEntry")
  @js.native
  open class BuiltInTypeEntry protected () extends AbstractTypeEntry {
    def this(_original: IParsedType) = this()
  }
  
  @JSImport("raml-1-parser/dist/util/typeExpander", "GeneralTypeEntry")
  @js.native
  open class GeneralTypeEntry protected () extends AbstractTypeEntry {
    def this(
      _original: IParsedType,
      _superTypes: js.Array[TypeEntry],
      _componentType: TypeEntry,
      _properties: js.Array[PropertyEntry],
      _facets: js.Array[PropertyEntry],
      _name: String
    ) = this()
    
    /* protected */ var _componentType: TypeEntry = js.native
    
    /* private */ var _depth: Any = js.native
    
    /* protected */ var _facets: js.Array[PropertyEntry] = js.native
    
    /* private */ var _isRecursionPoint: Any = js.native
    
    /* protected */ var _name: String = js.native
    
    /* protected */ var _properties: js.Array[PropertyEntry] = js.native
    
    def addFacet(propertyEntry: PropertyEntry): Unit = js.native
    
    def addProperty(propertyEntry: PropertyEntry): Unit = js.native
    
    def clone(ct: TypeEntry): GeneralTypeEntry = js.native
    
    def componentType(): TypeEntry = js.native
    
    def definedFacets(): js.Array[PropertyEntry] = js.native
    
    def depth(): Double = js.native
    
    /* protected */ var facets: js.Array[PropertyEntry] = js.native
    
    /* private */ var metadataSource: Any = js.native
    
    def properties(): js.Array[PropertyEntry] = js.native
    
    def setComponentType(componentType: TypeEntry): Unit = js.native
    
    def setDepth(d: Double): Unit = js.native
    
    def setIsRecursionPoint(): Unit = js.native
    def setIsRecursionPoint(`val`: Boolean): Unit = js.native
    
    def setName(n: String): String = js.native
  }
  
  @JSImport("raml-1-parser/dist/util/typeExpander", "IntersectionTypeEntry")
  @js.native
  open class IntersectionTypeEntry protected () extends AbstractTypeEntry {
    def this(original: IParsedType, options: js.Array[TypeEntry]) = this()
    
    def append(te: TypeEntry, bd: BranchingData): Unit = js.native
    
    /* protected */ var options: js.Array[TypeEntry] = js.native
  }
  
  @JSImport("raml-1-parser/dist/util/typeExpander", "PropertyEntry")
  @js.native
  open class PropertyEntry protected ()
    extends StObject
       with Entry {
    def this(
      _original: IPropertyInfo,
      _name: String,
      _type: TypeEntry,
      _required: Boolean,
      isFacet: Boolean,
      _metadata: Any
    ) = this()
    def this(
      _original: IPropertyInfo,
      _name: String,
      _type: TypeEntry,
      _required: Boolean,
      isFacet: Boolean,
      _metadata: Any,
      _src: IPropertyInfo
    ) = this()
    
    /* protected */ var _metadata: Any = js.native
    
    /* protected */ var _name: String = js.native
    
    /* protected */ var _original: IPropertyInfo = js.native
    
    /* protected */ var _required: Boolean = js.native
    
    /* protected */ var _src: IPropertyInfo = js.native
    
    /* protected */ var _type: TypeEntry = js.native
    
    def annotations(): js.Array[typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IAnnotation] = js.native
    
    /* CompleteClass */
    override def append(te: GeneralTypeEntry, bd: BranchingData): Unit = js.native
    
    /* protected */ var isFacet: Boolean = js.native
    
    def metadata(): Any = js.native
    
    def name(): String = js.native
    
    def original(): typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IPropertyInfo = js.native
    
    def required(): Boolean = js.native
    
    def setType(t: TypeEntry): Unit = js.native
    
    def source(): GeneralTypeEntry = js.native
    
    def `type`(): TypeEntry = js.native
  }
  
  @JSImport("raml-1-parser/dist/util/typeExpander", "TypeExpander")
  @js.native
  open class TypeExpander () extends StObject {
    def this(options: Options) = this()
    
    /* protected */ def appendMeta(obj: Any, field: String, kind: String): Unit = js.native
    
    /* protected */ def appendSourceFromExtras(result: Any, te: TypeEntry): Unit = js.native
    
    /* private */ var checkIfPropertyTypeIsCalculated: Any = js.native
    
    /* protected */ def checkIfTypePropertyIsDefault(te: TypeEntry, result: Any): Unit = js.native
    
    /* protected */ def createHierarchyEntry(t: IParsedType, typeExpansionRecursionDepth: Double): AbstractTypeEntry = js.native
    /* protected */ def createHierarchyEntry(
      t: IParsedType,
      typeExpansionRecursionDepth: Double,
      occured: Unit,
      branchingRegistry: BranchingRegistry
    ): AbstractTypeEntry = js.native
    /* protected */ def createHierarchyEntry(t: IParsedType, typeExpansionRecursionDepth: Double, occured: BasicTypeMap): AbstractTypeEntry = js.native
    /* protected */ def createHierarchyEntry(
      t: IParsedType,
      typeExpansionRecursionDepth: Double,
      occured: BasicTypeMap,
      branchingRegistry: BranchingRegistry
    ): AbstractTypeEntry = js.native
    
    /* protected */ def doCreateHierarchyEntry(
      t: IParsedType,
      typeExpansionRecursionDepth: Double,
      occured: BasicTypeMap,
      branchingRegistry: BranchingRegistry
    ): AbstractTypeEntry = js.native
    
    /* protected */ def dump(te: TypeEntry, expand: Boolean): Any = js.native
    
    /* protected */ def dumpAnnotations(annotations: js.Array[IAnnotation], obj: Any): Unit = js.native
    
    /* protected */ def dumpFacets(te: TypeEntry, result: Any, expand: Boolean): Unit = js.native
    
    /* protected */ def dumpMeta(te: TypeEntry, result: Any, expand: Boolean): Unit = js.native
    
    /* protected */ def dumpProperty(p: PropertyEntry, gte: GeneralTypeEntry, expand: Boolean): Any = js.native
    /* protected */ def dumpProperty(p: PropertyEntry, gte: GeneralTypeEntry, expand: Boolean, isFacet: Boolean): Any = js.native
    
    /* private */ var dumpScalarsAnnotations: Any = js.native
    
    def expandHierarchy(e: TypeEntry, reg: BranchingRegistry): TypeEntry = js.native
    def expandHierarchy(e: TypeEntry, reg: BranchingRegistry, typeMap: TypeMap): TypeEntry = js.native
    
    /* protected */ def expressionToObject(
      expr: BaseNode,
      escapeData: EscapeData,
      typeExpansionRecursionDepth: Double,
      occured: BasicTypeMap,
      branchingRegistry: BranchingRegistry
    ): AbstractTypeEntry = js.native
    /* protected */ def expressionToObject(
      expr: BaseNode,
      escapeData: EscapeData,
      typeExpansionRecursionDepth: Double,
      occured: BasicTypeMap,
      branchingRegistry: BranchingRegistry,
      original: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tsInterfaces.IParsedType */ Any
    ): AbstractTypeEntry = js.native
    
    /* protected */ def extractParserMetadata(pt: IParsedType): Any = js.native
    
    /* protected */ def mergeFacetValues(arr: js.Array[ITypeFacet]): Any = js.native
    
    /* protected */ var options: Options = js.native
    
    def patchDisplayName(te: TypeEntry, result: Any): Unit = js.native
    
    /* private */ var processExample: Any = js.native
    
    /* protected */ def processExpression(
      expression: String,
      typeExpansionRecursionDepth: Double,
      occured: BasicTypeMap,
      branchingRegistry: BranchingRegistry
    ): AbstractTypeEntry = js.native
    /* protected */ def processExpression(
      expression: String,
      typeExpansionRecursionDepth: Double,
      occured: BasicTypeMap,
      branchingRegistry: BranchingRegistry,
      original: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tsInterfaces.IParsedType */ Any
    ): AbstractTypeEntry = js.native
    
    /* protected */ def processPropertyHierarchy(
      p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tsInterfaces.IPropertyInfo */ Any,
      typeExpansionRecursionDepth: Double,
      t: IParsedType,
      occured: BasicTypeMap,
      branchingRegistry: BranchingRegistry
    ): PropertyEntry = js.native
    /* protected */ def processPropertyHierarchy(
      p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tsInterfaces.IPropertyInfo */ Any,
      typeExpansionRecursionDepth: Double,
      t: IParsedType,
      occured: BasicTypeMap,
      branchingRegistry: BranchingRegistry,
      isFacet: Boolean
    ): PropertyEntry = js.native
    
    /* protected */ def removeMeta(obj: Any, field: String): Unit = js.native
    
    def serializeType(t: IParsedType): Any = js.native
    
    /* protected */ def sourceHasKey(te: TypeEntry, key: String): Boolean = js.native
    
    def spreadSources(result: Any, src: Any): Unit = js.native
  }
  
  @JSImport("raml-1-parser/dist/util/typeExpander", "UnionTypeEntry")
  @js.native
  open class UnionTypeEntry protected () extends AbstractTypeEntry {
    def this(original: IParsedType, _options: js.Array[TypeEntry], _branchId: Double) = this()
    
    /* protected */ var _branchId: Double = js.native
    
    /* protected */ var _options: js.Array[TypeEntry] = js.native
    
    def branchId(): Double = js.native
    
    def options(): js.Array[TypeEntry] = js.native
  }
  
  trait BranchingData extends StObject {
    
    def branchingOption(branchId: Double): Double
    
    def expander(): TypeExpander
    
    def typeMap(): TypeMap
  }
  object BranchingData {
    
    inline def apply(branchingOption: Double => Double, expander: () => TypeExpander, typeMap: () => TypeMap): BranchingData = {
      val __obj = js.Dynamic.literal(branchingOption = js.Any.fromFunction1(branchingOption), expander = js.Any.fromFunction0(expander), typeMap = js.Any.fromFunction0(typeMap))
      __obj.asInstanceOf[BranchingData]
    }
    
    extension [Self <: BranchingData](x: Self) {
      
      inline def setBranchingOption(value: Double => Double): Self = StObject.set(x, "branchingOption", js.Any.fromFunction1(value))
      
      inline def setExpander(value: () => TypeExpander): Self = StObject.set(x, "expander", js.Any.fromFunction0(value))
      
      inline def setTypeMap(value: () => TypeMap): Self = StObject.set(x, "typeMap", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait BranchingRegistry extends StObject {
    
    def expander(): TypeExpander = js.native
    
    def nextBranchId(optionsCount: Double): Double = js.native
    
    def possibleBranches(): js.Array[BranchingData] = js.native
    def possibleBranches(tm: TypeMap): js.Array[BranchingData] = js.native
  }
  
  type ElementSourceInfo = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tsInterfaces.ElementSourceInfo */ Any
  
  trait Entry extends StObject {
    
    def append(te: GeneralTypeEntry, bd: BranchingData): Unit
  }
  object Entry {
    
    inline def apply(append: (GeneralTypeEntry, BranchingData) => Unit): Entry = {
      val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append))
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setAppend(value: (GeneralTypeEntry, BranchingData) => Unit): Self = StObject.set(x, "append", js.Any.fromFunction2(value))
    }
  }
  
  type IAnnotation = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tsInterfaces.IAnnotation */ Any
  
  type IConstraint = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tsInterfaces.IConstraint */ Any
  
  type IExample = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tsInterfaces.IExample */ Any
  
  type IParsedType = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tsInterfaces.IParsedType */ Any
  
  type IPropertyInfo = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tsInterfaces.IPropertyInfo */ Any
  
  type ITypeFacet = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tsInterfaces.ITypeFacet */ Any
  
  trait Options extends StObject {
    
    var isAnnotationType: js.UndefOr[Boolean] = js.undefined
    
    var isInsideTemplate: js.UndefOr[Boolean] = js.undefined
    
    var node: js.UndefOr[IHighLevelNode] = js.undefined
    
    var serializeMetadata: js.UndefOr[Boolean] = js.undefined
    
    var sourceMap: js.UndefOr[Boolean] = js.undefined
    
    var typeCollection: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tsInterfaces.IParsedTypeCollection */ Any
      ] = js.undefined
    
    var typeExpansionRecursionDepth: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIsAnnotationType(value: Boolean): Self = StObject.set(x, "isAnnotationType", value.asInstanceOf[js.Any])
      
      inline def setIsAnnotationTypeUndefined: Self = StObject.set(x, "isAnnotationType", js.undefined)
      
      inline def setIsInsideTemplate(value: Boolean): Self = StObject.set(x, "isInsideTemplate", value.asInstanceOf[js.Any])
      
      inline def setIsInsideTemplateUndefined: Self = StObject.set(x, "isInsideTemplate", js.undefined)
      
      inline def setNode(value: IHighLevelNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setSerializeMetadata(value: Boolean): Self = StObject.set(x, "serializeMetadata", value.asInstanceOf[js.Any])
      
      inline def setSerializeMetadataUndefined: Self = StObject.set(x, "serializeMetadata", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setTypeCollection(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tsInterfaces.IParsedTypeCollection */ Any
      ): Self = StObject.set(x, "typeCollection", value.asInstanceOf[js.Any])
      
      inline def setTypeCollectionUndefined: Self = StObject.set(x, "typeCollection", js.undefined)
      
      inline def setTypeExpansionRecursionDepth(value: Double): Self = StObject.set(x, "typeExpansionRecursionDepth", value.asInstanceOf[js.Any])
      
      inline def setTypeExpansionRecursionDepthUndefined: Self = StObject.set(x, "typeExpansionRecursionDepth", js.undefined)
    }
  }
  
  trait TypeEntry
    extends StObject
       with Entry {
    
    def addSuperType(`type`: TypeEntry): Unit
    
    def allFacets(): js.Array[ITypeFacet]
    
    def branchingRegistry(): BranchingRegistry
    
    def declaredFacets(): js.Array[ITypeFacet]
    
    def displayName(): String
    
    def examples(expand: Boolean): js.Array[IExample]
    
    def id(): String
    
    def isBuiltIn(): Boolean
    
    def isExternal(): Boolean
    
    def isIntersection(): Boolean
    
    def isRecursionPoint(): Boolean
    
    def isUnion(): Boolean
    
    def isUnknown(): Boolean
    
    def meta(): js.Array[ITypeFacet]
    
    def name(): String
    
    def original(): IParsedType
    
    def possibleBuiltInTypes(occured: StringDictionary[Boolean]): js.Array[String]
    
    def schema(): String
    
    def schemaPath(): String
    
    def superTypes(): js.Array[TypeEntry]
    
    def typeAttributeValue(): Any
  }
  object TypeEntry {
    
    inline def apply(
      addSuperType: TypeEntry => Unit,
      allFacets: () => js.Array[ITypeFacet],
      append: (GeneralTypeEntry, BranchingData) => Unit,
      branchingRegistry: () => BranchingRegistry,
      declaredFacets: () => js.Array[ITypeFacet],
      displayName: () => String,
      examples: Boolean => js.Array[IExample],
      id: () => String,
      isBuiltIn: () => Boolean,
      isExternal: () => Boolean,
      isIntersection: () => Boolean,
      isRecursionPoint: () => Boolean,
      isUnion: () => Boolean,
      isUnknown: () => Boolean,
      meta: () => js.Array[ITypeFacet],
      name: () => String,
      original: () => IParsedType,
      possibleBuiltInTypes: StringDictionary[Boolean] => js.Array[String],
      schema: () => String,
      schemaPath: () => String,
      superTypes: () => js.Array[TypeEntry],
      typeAttributeValue: () => Any
    ): TypeEntry = {
      val __obj = js.Dynamic.literal(addSuperType = js.Any.fromFunction1(addSuperType), allFacets = js.Any.fromFunction0(allFacets), append = js.Any.fromFunction2(append), branchingRegistry = js.Any.fromFunction0(branchingRegistry), declaredFacets = js.Any.fromFunction0(declaredFacets), displayName = js.Any.fromFunction0(displayName), examples = js.Any.fromFunction1(examples), id = js.Any.fromFunction0(id), isBuiltIn = js.Any.fromFunction0(isBuiltIn), isExternal = js.Any.fromFunction0(isExternal), isIntersection = js.Any.fromFunction0(isIntersection), isRecursionPoint = js.Any.fromFunction0(isRecursionPoint), isUnion = js.Any.fromFunction0(isUnion), isUnknown = js.Any.fromFunction0(isUnknown), meta = js.Any.fromFunction0(meta), name = js.Any.fromFunction0(name), original = js.Any.fromFunction0(original), possibleBuiltInTypes = js.Any.fromFunction1(possibleBuiltInTypes), schema = js.Any.fromFunction0(schema), schemaPath = js.Any.fromFunction0(schemaPath), superTypes = js.Any.fromFunction0(superTypes), typeAttributeValue = js.Any.fromFunction0(typeAttributeValue))
      __obj.asInstanceOf[TypeEntry]
    }
    
    extension [Self <: TypeEntry](x: Self) {
      
      inline def setAddSuperType(value: TypeEntry => Unit): Self = StObject.set(x, "addSuperType", js.Any.fromFunction1(value))
      
      inline def setAllFacets(value: () => js.Array[ITypeFacet]): Self = StObject.set(x, "allFacets", js.Any.fromFunction0(value))
      
      inline def setBranchingRegistry(value: () => BranchingRegistry): Self = StObject.set(x, "branchingRegistry", js.Any.fromFunction0(value))
      
      inline def setDeclaredFacets(value: () => js.Array[ITypeFacet]): Self = StObject.set(x, "declaredFacets", js.Any.fromFunction0(value))
      
      inline def setDisplayName(value: () => String): Self = StObject.set(x, "displayName", js.Any.fromFunction0(value))
      
      inline def setExamples(value: Boolean => js.Array[IExample]): Self = StObject.set(x, "examples", js.Any.fromFunction1(value))
      
      inline def setId(value: () => String): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
      
      inline def setIsBuiltIn(value: () => Boolean): Self = StObject.set(x, "isBuiltIn", js.Any.fromFunction0(value))
      
      inline def setIsExternal(value: () => Boolean): Self = StObject.set(x, "isExternal", js.Any.fromFunction0(value))
      
      inline def setIsIntersection(value: () => Boolean): Self = StObject.set(x, "isIntersection", js.Any.fromFunction0(value))
      
      inline def setIsRecursionPoint(value: () => Boolean): Self = StObject.set(x, "isRecursionPoint", js.Any.fromFunction0(value))
      
      inline def setIsUnion(value: () => Boolean): Self = StObject.set(x, "isUnion", js.Any.fromFunction0(value))
      
      inline def setIsUnknown(value: () => Boolean): Self = StObject.set(x, "isUnknown", js.Any.fromFunction0(value))
      
      inline def setMeta(value: () => js.Array[ITypeFacet]): Self = StObject.set(x, "meta", js.Any.fromFunction0(value))
      
      inline def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
      
      inline def setOriginal(value: () => IParsedType): Self = StObject.set(x, "original", js.Any.fromFunction0(value))
      
      inline def setPossibleBuiltInTypes(value: StringDictionary[Boolean] => js.Array[String]): Self = StObject.set(x, "possibleBuiltInTypes", js.Any.fromFunction1(value))
      
      inline def setSchema(value: () => String): Self = StObject.set(x, "schema", js.Any.fromFunction0(value))
      
      inline def setSchemaPath(value: () => String): Self = StObject.set(x, "schemaPath", js.Any.fromFunction0(value))
      
      inline def setSuperTypes(value: () => js.Array[TypeEntry]): Self = StObject.set(x, "superTypes", js.Any.fromFunction0(value))
      
      inline def setTypeAttributeValue(value: () => Any): Self = StObject.set(x, "typeAttributeValue", js.Any.fromFunction0(value))
    }
  }
  
  trait TypeMap extends StObject {
    
    def addProperty(typeName: String, propName: String, prop: Entry): Any
    
    def addType(t: TypeEntry): Unit
    
    def hasType(t: TypeEntry): Boolean
    
    def hasTypeByName(name: String): Boolean
    
    def property(typeName: String, propName: String): Entry
    
    def removeType(t: TypeEntry): Unit
    
    def typeByName(name: String): TypeEntry
  }
  object TypeMap {
    
    inline def apply(
      addProperty: (String, String, Entry) => Any,
      addType: TypeEntry => Unit,
      hasType: TypeEntry => Boolean,
      hasTypeByName: String => Boolean,
      property: (String, String) => Entry,
      removeType: TypeEntry => Unit,
      typeByName: String => TypeEntry
    ): TypeMap = {
      val __obj = js.Dynamic.literal(addProperty = js.Any.fromFunction3(addProperty), addType = js.Any.fromFunction1(addType), hasType = js.Any.fromFunction1(hasType), hasTypeByName = js.Any.fromFunction1(hasTypeByName), property = js.Any.fromFunction2(property), removeType = js.Any.fromFunction1(removeType), typeByName = js.Any.fromFunction1(typeByName))
      __obj.asInstanceOf[TypeMap]
    }
    
    extension [Self <: TypeMap](x: Self) {
      
      inline def setAddProperty(value: (String, String, Entry) => Any): Self = StObject.set(x, "addProperty", js.Any.fromFunction3(value))
      
      inline def setAddType(value: TypeEntry => Unit): Self = StObject.set(x, "addType", js.Any.fromFunction1(value))
      
      inline def setHasType(value: TypeEntry => Boolean): Self = StObject.set(x, "hasType", js.Any.fromFunction1(value))
      
      inline def setHasTypeByName(value: String => Boolean): Self = StObject.set(x, "hasTypeByName", js.Any.fromFunction1(value))
      
      inline def setProperty(value: (String, String) => Entry): Self = StObject.set(x, "property", js.Any.fromFunction2(value))
      
      inline def setRemoveType(value: TypeEntry => Unit): Self = StObject.set(x, "removeType", js.Any.fromFunction1(value))
      
      inline def setTypeByName(value: String => TypeEntry): Self = StObject.set(x, "typeByName", js.Any.fromFunction1(value))
    }
  }
}
