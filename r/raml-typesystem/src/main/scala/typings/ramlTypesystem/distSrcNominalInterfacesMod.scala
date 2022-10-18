package typings.ramlTypesystem

import org.scalablytyped.runtime.StringDictionary
import typings.ramlTypesystem.anon.Instantiable
import typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IHasExtra
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNominalInterfacesMod {
  
  @JSImport("raml-typesystem/dist/src/nominal-interfaces", "ValueRequirement")
  @js.native
  open class ValueRequirement protected () extends StObject {
    /**
      *
      * @param name name of the property to discriminate
      * @param value expected value of discriminating property
      */
    def this(name: String, value: String) = this()
    
    var name: String = js.native
    
    var value: String = js.native
  }
  
  type FacetValidator = js.Function2[/* value */ Any, /* facetValue */ Any, String]
  
  trait IAnnotation
    extends StObject
       with INamedEntity
       with ITyped {
    
    /**
      * value of the parameter with name
      * @param name
      */
    def parameter(name: String): Any
    
    /***
      * names of the parameters that are specified here
      */
    def parameterNames(): js.Array[String]
  }
  object IAnnotation {
    
    inline def apply(
      addAnnotation: IAnnotation => Unit,
      annotations: () => js.Array[IAnnotation],
      description: () => String,
      getAdapter: Instantiable[Any] => Any,
      getAdapters: () => js.Array[Any],
      getType: () => ITypeDefinition,
      nameId: () => String,
      parameter: String => Any,
      parameterNames: () => js.Array[String],
      removeAnnotation: IAnnotation => Unit
    ): IAnnotation = {
      val __obj = js.Dynamic.literal(addAnnotation = js.Any.fromFunction1(addAnnotation), annotations = js.Any.fromFunction0(annotations), description = js.Any.fromFunction0(description), getAdapter = js.Any.fromFunction1(getAdapter), getAdapters = js.Any.fromFunction0(getAdapters), getType = js.Any.fromFunction0(getType), nameId = js.Any.fromFunction0(nameId), parameter = js.Any.fromFunction1(parameter), parameterNames = js.Any.fromFunction0(parameterNames), removeAnnotation = js.Any.fromFunction1(removeAnnotation))
      __obj.asInstanceOf[IAnnotation]
    }
    
    extension [Self <: IAnnotation](x: Self) {
      
      inline def setParameter(value: String => Any): Self = StObject.set(x, "parameter", js.Any.fromFunction1(value))
      
      inline def setParameterNames(value: () => js.Array[String]): Self = StObject.set(x, "parameterNames", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IAnnotationType
    extends StObject
       with ITypeDefinition {
    
    def allowedTargets(): Any = js.native
    
    def parameters(): js.Array[ITypeDefinition] = js.native
  }
  
  @js.native
  trait IArrayType
    extends StObject
       with ITypeDefinition {
    
    def componentType(): ITypeDefinition = js.native
  }
  
  trait IExpandableExample extends StObject {
    
    def annotations(): StringDictionary[typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IAnnotation]
    
    /**
      * Returns representation of this example as JSON object.
      * This works for examples being JSON strings and YAML objects.
      * It -may- work for XML string examples, but is not guaranteed.
      */
    def asJSON(): Any
    
    /**
      * Returns representation of this example as a string.
      * This method works for any type of example.
      */
    def asString(): String
    
    def description(): String
    
    def displayName(): String
    
    /**
      * Expands the example with what its application references can provide.
      * XML examples are not guaranteed to be supported. If supported, XML is convrted into JSON.
      * Returns null or expansion result as JSON object.
      */
    def expandAsJSON(): Any
    
    /**
      * Expands the example with what its application references can provide.
      * XML examples are not guaranteed to be supported. If supported, XML is convrted into JSON.
      * Returns null or expansion result as string.
      */
    def expandAsString(): String
    
    /**
      * Returns true if the application in question does not have an example set directly.
      * It is still possible that while application has no direct example, references may have
      * example pieces, current example may be expanded with.
      */
    def isEmpty(): Boolean
    
    /**
      * Whether the original example is JSON string.
      */
    def isJSONString(): Boolean
    
    def isSingle(): Boolean
    
    /**
      * Whether the original example is XML string.
      */
    def isXMLString(): Boolean
    
    /**
      * Whether original example is set up as YAML.
      */
    def isYAML(): Boolean
    
    def name(): String
    
    /**
      * Returns an original example. It is string for XML and JSON strings,
      * or JSON object for YAML example.
      */
    def original(): Any
    
    def scalarsAnnotations(): StringDictionary[
        StringDictionary[typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IAnnotation]
      ]
    
    def strict(): Boolean
  }
  object IExpandableExample {
    
    inline def apply(
      annotations: () => StringDictionary[typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IAnnotation],
      asJSON: () => Any,
      asString: () => String,
      description: () => String,
      displayName: () => String,
      expandAsJSON: () => Any,
      expandAsString: () => String,
      isEmpty: () => Boolean,
      isJSONString: () => Boolean,
      isSingle: () => Boolean,
      isXMLString: () => Boolean,
      isYAML: () => Boolean,
      name: () => String,
      original: () => Any,
      scalarsAnnotations: () => StringDictionary[
          StringDictionary[typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IAnnotation]
        ],
      strict: () => Boolean
    ): IExpandableExample = {
      val __obj = js.Dynamic.literal(annotations = js.Any.fromFunction0(annotations), asJSON = js.Any.fromFunction0(asJSON), asString = js.Any.fromFunction0(asString), description = js.Any.fromFunction0(description), displayName = js.Any.fromFunction0(displayName), expandAsJSON = js.Any.fromFunction0(expandAsJSON), expandAsString = js.Any.fromFunction0(expandAsString), isEmpty = js.Any.fromFunction0(isEmpty), isJSONString = js.Any.fromFunction0(isJSONString), isSingle = js.Any.fromFunction0(isSingle), isXMLString = js.Any.fromFunction0(isXMLString), isYAML = js.Any.fromFunction0(isYAML), name = js.Any.fromFunction0(name), original = js.Any.fromFunction0(original), scalarsAnnotations = js.Any.fromFunction0(scalarsAnnotations), strict = js.Any.fromFunction0(strict))
      __obj.asInstanceOf[IExpandableExample]
    }
    
    extension [Self <: IExpandableExample](x: Self) {
      
      inline def setAnnotations(value: () => StringDictionary[typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IAnnotation]): Self = StObject.set(x, "annotations", js.Any.fromFunction0(value))
      
      inline def setAsJSON(value: () => Any): Self = StObject.set(x, "asJSON", js.Any.fromFunction0(value))
      
      inline def setAsString(value: () => String): Self = StObject.set(x, "asString", js.Any.fromFunction0(value))
      
      inline def setDescription(value: () => String): Self = StObject.set(x, "description", js.Any.fromFunction0(value))
      
      inline def setDisplayName(value: () => String): Self = StObject.set(x, "displayName", js.Any.fromFunction0(value))
      
      inline def setExpandAsJSON(value: () => Any): Self = StObject.set(x, "expandAsJSON", js.Any.fromFunction0(value))
      
      inline def setExpandAsString(value: () => String): Self = StObject.set(x, "expandAsString", js.Any.fromFunction0(value))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setIsJSONString(value: () => Boolean): Self = StObject.set(x, "isJSONString", js.Any.fromFunction0(value))
      
      inline def setIsSingle(value: () => Boolean): Self = StObject.set(x, "isSingle", js.Any.fromFunction0(value))
      
      inline def setIsXMLString(value: () => Boolean): Self = StObject.set(x, "isXMLString", js.Any.fromFunction0(value))
      
      inline def setIsYAML(value: () => Boolean): Self = StObject.set(x, "isYAML", js.Any.fromFunction0(value))
      
      inline def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
      
      inline def setOriginal(value: () => Any): Self = StObject.set(x, "original", js.Any.fromFunction0(value))
      
      inline def setScalarsAnnotations(
        value: () => StringDictionary[
              StringDictionary[typings.ramlTypesystem.distSrcTypesystemInterfacesMod.IAnnotation]
            ]
      ): Self = StObject.set(x, "scalarsAnnotations", js.Any.fromFunction0(value))
      
      inline def setStrict(value: () => Boolean): Self = StObject.set(x, "strict", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IExternalType
    extends StObject
       with ITypeDefinition {
    
    def schema(): String = js.native
  }
  
  trait INamedEntity extends StObject {
    
    def addAnnotation(a: IAnnotation): Unit
    
    def annotations(): js.Array[IAnnotation]
    
    def description(): String
    
    def getAdapter[T](adapterType: Instantiable[T]): T
    
    def getAdapters(): js.Array[Any]
    
    def nameId(): String
    
    def removeAnnotation(a: IAnnotation): Unit
  }
  object INamedEntity {
    
    inline def apply(
      addAnnotation: IAnnotation => Unit,
      annotations: () => js.Array[IAnnotation],
      description: () => String,
      getAdapter: Instantiable[Any] => Any,
      getAdapters: () => js.Array[Any],
      nameId: () => String,
      removeAnnotation: IAnnotation => Unit
    ): INamedEntity = {
      val __obj = js.Dynamic.literal(addAnnotation = js.Any.fromFunction1(addAnnotation), annotations = js.Any.fromFunction0(annotations), description = js.Any.fromFunction0(description), getAdapter = js.Any.fromFunction1(getAdapter), getAdapters = js.Any.fromFunction0(getAdapters), nameId = js.Any.fromFunction0(nameId), removeAnnotation = js.Any.fromFunction1(removeAnnotation))
      __obj.asInstanceOf[INamedEntity]
    }
    
    extension [Self <: INamedEntity](x: Self) {
      
      inline def setAddAnnotation(value: IAnnotation => Unit): Self = StObject.set(x, "addAnnotation", js.Any.fromFunction1(value))
      
      inline def setAnnotations(value: () => js.Array[IAnnotation]): Self = StObject.set(x, "annotations", js.Any.fromFunction0(value))
      
      inline def setDescription(value: () => String): Self = StObject.set(x, "description", js.Any.fromFunction0(value))
      
      inline def setGetAdapter(value: Instantiable[Any] => Any): Self = StObject.set(x, "getAdapter", js.Any.fromFunction1(value))
      
      inline def setGetAdapters(value: () => js.Array[Any]): Self = StObject.set(x, "getAdapters", js.Any.fromFunction0(value))
      
      inline def setNameId(value: () => String): Self = StObject.set(x, "nameId", js.Any.fromFunction0(value))
      
      inline def setRemoveAnnotation(value: IAnnotation => Unit): Self = StObject.set(x, "removeAnnotation", js.Any.fromFunction1(value))
    }
  }
  
  trait IPrintDetailsSettings extends StObject {
    
    var hideProperties: js.UndefOr[Boolean] = js.undefined
    
    var hideSuperTypeProperties: js.UndefOr[Boolean] = js.undefined
    
    var printStandardSuperclasses: js.UndefOr[Boolean] = js.undefined
  }
  object IPrintDetailsSettings {
    
    inline def apply(): IPrintDetailsSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPrintDetailsSettings]
    }
    
    extension [Self <: IPrintDetailsSettings](x: Self) {
      
      inline def setHideProperties(value: Boolean): Self = StObject.set(x, "hideProperties", value.asInstanceOf[js.Any])
      
      inline def setHidePropertiesUndefined: Self = StObject.set(x, "hideProperties", js.undefined)
      
      inline def setHideSuperTypeProperties(value: Boolean): Self = StObject.set(x, "hideSuperTypeProperties", value.asInstanceOf[js.Any])
      
      inline def setHideSuperTypePropertiesUndefined: Self = StObject.set(x, "hideSuperTypeProperties", js.undefined)
      
      inline def setPrintStandardSuperclasses(value: Boolean): Self = StObject.set(x, "printStandardSuperclasses", value.asInstanceOf[js.Any])
      
      inline def setPrintStandardSuperclassesUndefined: Self = StObject.set(x, "printStandardSuperclasses", js.undefined)
    }
  }
  
  trait IProperty
    extends StObject
       with INamedEntity {
    
    /**
      * returns a default value for this property
      */
    def defaultValue(): Any
    
    /**
      * domain of the property (basically declaring type)
      */
    def domain(): ITypeDefinition
    
    /**
      * if this property range is constrained to a fixed set of values it will return the values
      */
    def enumOptions(): js.Array[String]
    
    /**
      * return a pattern for a property name - used for pattern properties
      */
    def getKeyRegexp(): String
    
    /**
      * true if this property is a discriminator
      */
    def isDescriminator(): Boolean
    
    /**
      * true if this property can have multiple values
      */
    def isMultiValue(): Boolean
    
    /**
      * true if this property range is one of built in value types
      */
    def isPrimitive(): Boolean
    
    /**
      * true if this property is required to fill
      */
    def isRequired(): Boolean
    
    /**
      * true if this property range is a value type
      */
    def isValueProperty(): Boolean
    
    /**
      * return a prefix for a property name - used for additional properties
      */
    def keyPrefix(): String
    
    /**
      * returns true if this property matches the a given property name
      * (it is important for additional and pattern properties)
      * @param k
      */
    def matchKey(k: String): Boolean
    
    /**
      * range of the property (basically it is type)
      */
    def range(): ITypeDefinition
  }
  object IProperty {
    
    inline def apply(
      addAnnotation: IAnnotation => Unit,
      annotations: () => js.Array[IAnnotation],
      defaultValue: () => Any,
      description: () => String,
      domain: () => ITypeDefinition,
      enumOptions: () => js.Array[String],
      getAdapter: Instantiable[Any] => Any,
      getAdapters: () => js.Array[Any],
      getKeyRegexp: () => String,
      isDescriminator: () => Boolean,
      isMultiValue: () => Boolean,
      isPrimitive: () => Boolean,
      isRequired: () => Boolean,
      isValueProperty: () => Boolean,
      keyPrefix: () => String,
      matchKey: String => Boolean,
      nameId: () => String,
      range: () => ITypeDefinition,
      removeAnnotation: IAnnotation => Unit
    ): IProperty = {
      val __obj = js.Dynamic.literal(addAnnotation = js.Any.fromFunction1(addAnnotation), annotations = js.Any.fromFunction0(annotations), defaultValue = js.Any.fromFunction0(defaultValue), description = js.Any.fromFunction0(description), domain = js.Any.fromFunction0(domain), enumOptions = js.Any.fromFunction0(enumOptions), getAdapter = js.Any.fromFunction1(getAdapter), getAdapters = js.Any.fromFunction0(getAdapters), getKeyRegexp = js.Any.fromFunction0(getKeyRegexp), isDescriminator = js.Any.fromFunction0(isDescriminator), isMultiValue = js.Any.fromFunction0(isMultiValue), isPrimitive = js.Any.fromFunction0(isPrimitive), isRequired = js.Any.fromFunction0(isRequired), isValueProperty = js.Any.fromFunction0(isValueProperty), keyPrefix = js.Any.fromFunction0(keyPrefix), matchKey = js.Any.fromFunction1(matchKey), nameId = js.Any.fromFunction0(nameId), range = js.Any.fromFunction0(range), removeAnnotation = js.Any.fromFunction1(removeAnnotation))
      __obj.asInstanceOf[IProperty]
    }
    
    extension [Self <: IProperty](x: Self) {
      
      inline def setDefaultValue(value: () => Any): Self = StObject.set(x, "defaultValue", js.Any.fromFunction0(value))
      
      inline def setDomain(value: () => ITypeDefinition): Self = StObject.set(x, "domain", js.Any.fromFunction0(value))
      
      inline def setEnumOptions(value: () => js.Array[String]): Self = StObject.set(x, "enumOptions", js.Any.fromFunction0(value))
      
      inline def setGetKeyRegexp(value: () => String): Self = StObject.set(x, "getKeyRegexp", js.Any.fromFunction0(value))
      
      inline def setIsDescriminator(value: () => Boolean): Self = StObject.set(x, "isDescriminator", js.Any.fromFunction0(value))
      
      inline def setIsMultiValue(value: () => Boolean): Self = StObject.set(x, "isMultiValue", js.Any.fromFunction0(value))
      
      inline def setIsPrimitive(value: () => Boolean): Self = StObject.set(x, "isPrimitive", js.Any.fromFunction0(value))
      
      inline def setIsRequired(value: () => Boolean): Self = StObject.set(x, "isRequired", js.Any.fromFunction0(value))
      
      inline def setIsValueProperty(value: () => Boolean): Self = StObject.set(x, "isValueProperty", js.Any.fromFunction0(value))
      
      inline def setKeyPrefix(value: () => String): Self = StObject.set(x, "keyPrefix", js.Any.fromFunction0(value))
      
      inline def setMatchKey(value: String => Boolean): Self = StObject.set(x, "matchKey", js.Any.fromFunction1(value))
      
      inline def setRange(value: () => ITypeDefinition): Self = StObject.set(x, "range", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ITypeDefinition
    extends StObject
       with INamedEntity
       with IHasExtra {
    
    /**
      * Facets declared by the type and its supertypes
      */
    def allFacets(): js.Array[IProperty] = js.native
    def allFacets(visited: Any): js.Array[IProperty] = js.native
    
    /**
      * @return map of fixed built-in facet names to their values;
      */
    def allFixedBuiltInFacets(): StringDictionary[Any] = js.native
    
    /**
      * @return map of facets fixed by the type and its supertypes
      */
    def allFixedFacets(): StringDictionary[Any] = js.native
    
    /**
      * List off all properties (declared in this type and super types),
      * did not includes properties fixed to fixed facet use facet for them
      */
    def allProperties(): js.Array[IProperty] = js.native
    def allProperties(visited: Any): js.Array[IProperty] = js.native
    
    /**
      * list of all subtypes not including this type
      */
    def allSubTypes(): js.Array[ITypeDefinition] = js.native
    
    /**
      * List of all super types not including this type
      */
    def allSuperTypes(): js.Array[ITypeDefinition] = js.native
    
    def annotationType(): IAnnotationType = js.native
    
    /**
      * Casts this type to an array. Does not perform a search in super types.
      */
    def array(): IArrayType = js.native
    
    /**
      * casting to nearest array type in hierarchy
      */
    def arrayInHierarchy(): IArrayType = js.native
    
    /**
      * Returns examples for this type.
      * @param collectFromSupertype - whether to get example from supertype if current type is
      * redundant (pure link for the other type, contributing nothing itself).
      * Returned examples should be tested for being empty and being expandable.
      */
    def examples(): js.Array[IExpandableExample] = js.native
    def examples(collectFromSupertype: Boolean): js.Array[IExpandableExample] = js.native
    
    /**
      * Casts this type to an external type. Does not perform a search in super types.
      */
    def external(): IExternalType = js.native
    
    /**
      * Casting to nearest external type in hierarchy
      */
    def externalInHierarchy(): IExternalType = js.native
    
    def facet(n: String): IProperty = js.native
    
    /**
      * Facets declared by the type
      */
    def facets(): js.Array[IProperty] = js.native
    
    /**
      * @return map of built-in facets fixed by the type and its supertypes
      */
    def fixedBuiltInFacets(): StringDictionary[Any] = js.native
    
    /**
      * @return map of fixed facet names to fixed facet values;
      */
    def fixedFacets(): StringDictionary[Any] = js.native
    
    /**
      * Returns nearest genuine user-define type in the hierarchy.
      * Genuine user defined type is a type user intentionally defined and filled with
      * properties or facets, or having user-defined name as opposed to a synthetic user-defined type.
      */
    def genuineUserDefinedTypeInHierarchy(): ITypeDefinition = js.native
    
    /**
      * @return map of fixed facet names to fixed facet values;
      * @deprecated
      */
    def getFixedFacets(): StringDictionary[Any] = js.native
    
    /**
      * true if this type is array or one of its super types is array.
      */
    def hasArrayInHierarchy(): Boolean = js.native
    
    /**
      * true if this type is external type, or one if its super types is an external type.
      */
    def hasExternalInHierarchy(): Boolean = js.native
    
    /**
      * Returns whether this type contain genuine user defined type in its hierarchy.
      * Genuine user defined type is a type user intentionally defined and filled with
      * properties or facets, or having user-defined name as opposed to a synthetic user-defined type.
      */
    def hasGenuineUserDefinedTypeInHierarchy(): Boolean = js.native
    
    /**
      * true if this type values have internal structure
      */
    def hasStructure(): Boolean = js.native
    
    /**
      * true if this type is union or one of its super types is union.
      */
    def hasUnionInHierarchy(): Boolean = js.native
    
    /**
      * true if this type is value type or one of its super types is value type.
      */
    def hasValueTypeInHierarchy(): Boolean = js.native
    
    def isAnnotationType(): Boolean = js.native
    
    /**
      * Whether this type is an array. Does not perform a search in super types.
      */
    def isArray(): Boolean = js.native
    
    /**
      * return true if this type is assignable to a given type
      * @param typeName
      */
    def isAssignableFrom(typeName: String): Boolean = js.native
    
    /**
      * Whether the class is built-in.
      */
    def isBuiltIn(): Boolean = js.native
    
    /**
      * true if this type is external. Does not perform a search in super types.
      */
    def isExternal(): Boolean = js.native
    
    /**
      * Returns whether this type is genuine user defined type.
      * Genuine user defined type is a type user intentionally defined and filled with
      * properties or facets, or having user-defined name as opposed to a synthetic user-defined type.
      */
    def isGenuineUserDefinedType(): Boolean = js.native
    
    /**
      * Whether this type is object. Performs a search in super types.
      */
    def isObject(): Boolean = js.native
    
    /**
      * Whether this type is a union. Does not perform a search in super types.
      */
    def isUnion(): Boolean = js.native
    
    /**
      * Returns whether this type was defined by a user.
      */
    def isUserDefined(): Boolean = js.native
    
    /**
      * Whether this type is value type. Does not perform a search in super types.
      */
    def isValueType(): Boolean = js.native
    
    def key(): NamedId = js.native
    
    def kind(): js.Array[String] = js.native
    
    /**
      * Print details of this type.
      * Used mostly for debug and demosntration purposes.
      * @param indent
      */
    def printDetails(): String = js.native
    def printDetails(indent: String): String = js.native
    def printDetails(indent: String, settings: IPrintDetailsSettings): String = js.native
    def printDetails(indent: Unit, settings: IPrintDetailsSettings): String = js.native
    
    /**
      * Propertis decared in this type
      */
    def properties(): js.Array[IProperty] = js.native
    
    /**
      * return property by it name looks in super classes
      * but will not return anything if property is a fixed with facet
      * @param name
      */
    def property(name: String): IProperty = js.native
    
    /**
      * helper method to get required properties only
      */
    def requiredProperties(): js.Array[IProperty] = js.native
    
    /**
      * list of sub types
      */
    def subTypes(): js.Array[ITypeDefinition] = js.native
    
    /**
      * list os super types
      */
    def superTypes(): js.Array[ITypeDefinition] = js.native
    
    /**
      * Casts this type to a union type. Does not perform a search in super types.
      */
    def union(): IUnionType = js.native
    
    /**
      * Casting to nearest union type in hierarchy
      */
    def unionInHierarchy(): IUnionType = js.native
    
    /**
      * parent universe
      */
    def universe(): IUniverse = js.native
    
    def validate(x: Any): js.Array[Status] = js.native
    
    /**
      * List of value requirements for this type,
      * used to discriminate a type from a list of subtype
      */
    def valueRequirements(): js.Array[ValueRequirement] = js.native
  }
  
  trait ITyped extends StObject {
    
    def getType(): ITypeDefinition
  }
  object ITyped {
    
    inline def apply(getType: () => ITypeDefinition): ITyped = {
      val __obj = js.Dynamic.literal(getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[ITyped]
    }
    
    extension [Self <: ITyped](x: Self) {
      
      inline def setGetType(value: () => ITypeDefinition): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IUnionType
    extends StObject
       with ITypeDefinition {
    
    def leftType(): ITypeDefinition = js.native
    
    def rightType(): ITypeDefinition = js.native
  }
  
  trait IUniverse extends StObject {
    
    /**
      * highlevel information about universe
      */
    def matched(): StringDictionary[NamedId]
    
    /**
      * type for a given name
      * @param name
      */
    def `type`(name: String): ITypeDefinition
    
    /**
      * All types in universe
      */
    def types(): js.Array[ITypeDefinition]
    
    /**
      * version of this universe
      */
    def version(): String
  }
  object IUniverse {
    
    inline def apply(
      matched: () => StringDictionary[NamedId],
      `type`: String => ITypeDefinition,
      types: () => js.Array[ITypeDefinition],
      version: () => String
    ): IUniverse = {
      val __obj = js.Dynamic.literal(matched = js.Any.fromFunction0(matched), types = js.Any.fromFunction0(types), version = js.Any.fromFunction0(version))
      __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
      __obj.asInstanceOf[IUniverse]
    }
    
    extension [Self <: IUniverse](x: Self) {
      
      inline def setMatched(value: () => StringDictionary[NamedId]): Self = StObject.set(x, "matched", js.Any.fromFunction0(value))
      
      inline def setType(value: String => ITypeDefinition): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      inline def setTypes(value: () => js.Array[ITypeDefinition]): Self = StObject.set(x, "types", js.Any.fromFunction0(value))
      
      inline def setVersion(value: () => String): Self = StObject.set(x, "version", js.Any.fromFunction0(value))
    }
  }
  
  type IValueDocProvider = js.Function1[/* v */ String, String]
  
  trait NamedId extends StObject {
    
    var name: String
  }
  object NamedId {
    
    inline def apply(name: String): NamedId = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedId]
    }
    
    extension [Self <: NamedId](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Status extends StObject {
    
    def getMessage(): String
    
    def getSeverity(): Double
    
    def getValidationPathAsString(): String
    
    def isError(): Boolean
  }
  object Status {
    
    inline def apply(
      getMessage: () => String,
      getSeverity: () => Double,
      getValidationPathAsString: () => String,
      isError: () => Boolean
    ): Status = {
      val __obj = js.Dynamic.literal(getMessage = js.Any.fromFunction0(getMessage), getSeverity = js.Any.fromFunction0(getSeverity), getValidationPathAsString = js.Any.fromFunction0(getValidationPathAsString), isError = js.Any.fromFunction0(isError))
      __obj.asInstanceOf[Status]
    }
    
    extension [Self <: Status](x: Self) {
      
      inline def setGetMessage(value: () => String): Self = StObject.set(x, "getMessage", js.Any.fromFunction0(value))
      
      inline def setGetSeverity(value: () => Double): Self = StObject.set(x, "getSeverity", js.Any.fromFunction0(value))
      
      inline def setGetValidationPathAsString(value: () => String): Self = StObject.set(x, "getValidationPathAsString", js.Any.fromFunction0(value))
      
      inline def setIsError(value: () => Boolean): Self = StObject.set(x, "isError", js.Any.fromFunction0(value))
    }
  }
}
