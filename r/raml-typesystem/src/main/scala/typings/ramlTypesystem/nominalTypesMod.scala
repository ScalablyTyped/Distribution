package typings.ramlTypesystem

import org.scalablytyped.runtime.StringDictionary
import typings.ramlTypesystem.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nominalTypesMod {
  
  @JSImport("raml-typesystem/dist/src/nominal-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-typesystem/dist/src/nominal-types", "AbstractType")
  @js.native
  open class AbstractType protected ()
    extends Described
       with typings.ramlTypesystem.nominalInterfacesMod.ITypeDefinition {
    def this(_name: String) = this()
    def this(_name: String, _universe: IUniverse) = this()
    def this(_name: String, _universe: Unit, _path: String) = this()
    def this(_name: String, _universe: IUniverse, _path: String) = this()
    
    /* protected */ var _abf: StringDictionary[Any] = js.native
    
    /* protected */ var _af: StringDictionary[Any] = js.native
    
    /* protected */ var _allFacets: Array = js.native
    
    var _allSupers: Array = js.native
    
    var _customProperties: Array = js.native
    
    /* protected */ var _facets: Array = js.native
    
    /* private */ var _fixedBuildInFacets: Any = js.native
    
    /* private */ var _fixedFacets: Any = js.native
    
    var _isCustom: Boolean = js.native
    
    var _key: NamedId = js.native
    
    /* private */ var _nameAtRuntime: Any = js.native
    
    /* private */ var _path: Any = js.native
    
    /* private */ var _props: Any = js.native
    
    var _requirements: Array = js.native
    
    var _subTypes: Array = js.native
    
    var _superTypes: Array = js.native
    
    var _universe: IUniverse = js.native
    
    def _validator(x: Any): Array = js.native
    
    /* InferMemberOverrides */
    override def addAnnotation(a: typings.ramlTypesystem.nominalInterfacesMod.IAnnotation): Unit = js.native
    
    def addFacet(q: IProperty): Unit = js.native
    
    def addRequirement(name: String, value: String): Unit = js.native
    
    def addSuperType(q: AbstractType): Unit = js.native
    
    def allCustomProperties(): Array = js.native
    
    def allFacets(ps: StringDictionary[ITypeDefinition]): Array = js.native
    
    def allProperties(ps: StringDictionary[ITypeDefinition]): Array = js.native
    
    /* private */ var allSuperTypesRecurrent: Any = js.native
    
    /* InferMemberOverrides */
    override def annotations(): js.Array[typings.ramlTypesystem.nominalInterfacesMod.IAnnotation] & Array = js.native
    
    var buildIn: Boolean = js.native
    
    /* protected */ def collectAllFixedFacets(builtIn: Boolean): StringDictionary[Any] = js.native
    
    /* protected */ def collectFixedFacets(builtIn: Boolean): StringDictionary[Any] = js.native
    
    /* protected */ def contributeFacets(x: StringDictionary[Any]): Unit = js.native
    
    def customProperties(): Array = js.native
    
    /* InferMemberOverrides */
    override def description(): String = js.native
    
    def fixFacet(name: String, v: Any): Unit = js.native
    def fixFacet(name: String, v: Any, builtIn: Boolean): Unit = js.native
    
    /* InferMemberOverrides */
    override def getAdapter[T](adapterType: Instantiable[T]): T = js.native
    
    /* InferMemberOverrides */
    override def getAdapters(): js.Array[Any] & Array = js.native
    
    /* CompleteClass */
    override def getExtra(name: String): Any = js.native
    
    /* private */ var getExtraAdapter: Any = js.native
    
    def getNameAtRuntime(): String = js.native
    
    def getPath(): String = js.native
    
    /* private */ var getTypeClassName: Any = js.native
    
    def isCustom(): Boolean = js.native
    
    /* private */ var isStandardSuperclass: Any = js.native
    
    def isTopLevel(): Boolean = js.native
    
    /* InferMemberOverrides */
    override def nameId(): String = js.native
    
    /* CompleteClass */
    override def putExtra(name: String, value: Any): Unit = js.native
    
    def registerCustomProperty(p: IProperty): Unit = js.native
    
    /* InferMemberOverrides */
    override def removeAnnotation(a: typings.ramlTypesystem.nominalInterfacesMod.IAnnotation): Unit = js.native
    
    def setBuiltIn(builtIn: Boolean): Unit = js.native
    
    def setCustom(`val`: Boolean): Unit = js.native
    
    def setNameAtRuntime(name: String): Unit = js.native
    
    def typeId(): String = js.native
    
    var uc: Boolean = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/nominal-types", "Adaptable")
  @js.native
  open class Adaptable () extends StObject {
    
    /* private */ var adapters: Any = js.native
    
    def addAdapter(q: Any): Unit = js.native
    
    def getAdapter[T](adapterType: Instantiable[T]): T = js.native
    
    def getAdapters(): Array = js.native
    
    def getClassIdentifier(): Array = js.native
  }
  /* static members */
  object Adaptable {
    
    @JSImport("raml-typesystem/dist/src/nominal-types", "Adaptable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/nominal-types", "Adaptable.CLASS_IDENTIFIER_Adaptable")
    @js.native
    def CLASS_IDENTIFIER_Adaptable: Any = js.native
    inline def CLASS_IDENTIFIER_Adaptable_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_Adaptable")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/nominal-types.Adaptable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/nominal-types.Adaptable */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/nominal-types", "Annotation")
  @js.native
  open class Annotation protected ()
    extends Described
       with typings.ramlTypesystem.nominalInterfacesMod.IAnnotation {
    def this(`type`: IAnnotationType, parameters: StringDictionary[Any]) = this()
    
    /* InferMemberOverrides */
    override def addAnnotation(a: typings.ramlTypesystem.nominalInterfacesMod.IAnnotation): Unit = js.native
    
    /* InferMemberOverrides */
    override def annotations(): js.Array[typings.ramlTypesystem.nominalInterfacesMod.IAnnotation] & Array = js.native
    
    /* InferMemberOverrides */
    override def description(): String = js.native
    
    /* InferMemberOverrides */
    override def getAdapter[T](adapterType: Instantiable[T]): T = js.native
    
    /* InferMemberOverrides */
    override def getAdapters(): js.Array[Any] & Array = js.native
    
    /* CompleteClass */
    override def getType(): typings.ramlTypesystem.nominalInterfacesMod.ITypeDefinition = js.native
    
    /* InferMemberOverrides */
    override def nameId(): String = js.native
    
    /**
      * value of the parameter with name
      * @param name
      */
    /* CompleteClass */
    override def parameter(name: String): Any = js.native
    
    /***
      * names of the parameters that are specified here
      */
    /* CompleteClass */
    override def parameterNames(): js.Array[String] = js.native
    
    /* private */ var parameters: Any = js.native
    
    /* InferMemberOverrides */
    override def removeAnnotation(a: typings.ramlTypesystem.nominalInterfacesMod.IAnnotation): Unit = js.native
    
    /* private */ var `type`: Any = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/nominal-types", "Array")
  @js.native
  open class Array protected ()
    extends AbstractType
       with typings.ramlTypesystem.nominalInterfacesMod.IArrayType {
    def this(_name: String) = this()
    def this(_name: String, _universe: IUniverse) = this()
    def this(_name: String, _universe: Unit, _path: String) = this()
    def this(_name: String, _universe: IUniverse, _path: String) = this()
    
    /* InferMemberOverrides */
    override def addAnnotation(a: typings.ramlTypesystem.nominalInterfacesMod.IAnnotation): Unit = js.native
    
    /* InferMemberOverrides */
    override def annotations(): js.Array[typings.ramlTypesystem.nominalInterfacesMod.IAnnotation] & Array = js.native
    
    var component: ITypeDefinition = js.native
    
    /* InferMemberOverrides */
    override def description(): String = js.native
    
    var dimensions: Double = js.native
    
    /* InferMemberOverrides */
    override def getAdapter[T](adapterType: Instantiable[T]): T = js.native
    
    /* InferMemberOverrides */
    override def getAdapters(): js.Array[Any] & Array = js.native
    
    /* CompleteClass */
    override def getExtra(name: String): Any = js.native
    
    /* InferMemberOverrides */
    override def nameId(): String = js.native
    
    /* CompleteClass */
    override def putExtra(name: String, value: Any): Unit = js.native
    
    /* InferMemberOverrides */
    override def removeAnnotation(a: typings.ramlTypesystem.nominalInterfacesMod.IAnnotation): Unit = js.native
    
    def setComponent(t: ITypeDefinition): Unit = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/nominal-types", "Described")
  @js.native
  open class Described protected () extends Adaptable {
    def this(_name: String) = this()
    def this(_name: String, _description: String) = this()
    
    /* private */ var _annotations: Any = js.native
    
    /* private */ var _description: Any = js.native
    
    /* private */ var _name: Any = js.native
    
    /* private */ var _tags: Any = js.native
    
    /* private */ var _version: Any = js.native
    
    def addAnnotation(a: IAnnotation): Unit = js.native
    
    def annotations(): Array = js.native
    
    def description(): String = js.native
    
    def nameId(): String = js.native
    
    def removeAnnotation(a: IAnnotation): Unit = js.native
    
    def setName(name: String): Unit = js.native
    
    def tags(): Array = js.native
    
    def withDescription(d: String): this.type = js.native
  }
  /* static members */
  object Described {
    
    @JSImport("raml-typesystem/dist/src/nominal-types", "Described")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/nominal-types", "Described.CLASS_IDENTIFIER_Described")
    @js.native
    def CLASS_IDENTIFIER_Described: Any = js.native
    inline def CLASS_IDENTIFIER_Described_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_Described")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/nominal-types.Described */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/nominal-types.Described */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/nominal-types", "Empty")
  @js.native
  open class Empty () extends StObject
  
  @JSImport("raml-typesystem/dist/src/nominal-types", "ExternalType")
  @js.native
  open class ExternalType protected ()
    extends StructuredType
       with typings.ramlTypesystem.nominalInterfacesMod.IExternalType {
    def this(_name: String) = this()
    def this(_name: String, _universe: IUniverse) = this()
    def this(_name: String, _universe: Unit, _path: String) = this()
    def this(_name: String, _universe: IUniverse, _path: String) = this()
    
    /* InferMemberOverrides */
    override def addAnnotation(a: typings.ramlTypesystem.nominalInterfacesMod.IAnnotation): Unit = js.native
    
    /* InferMemberOverrides */
    override def annotations(): js.Array[typings.ramlTypesystem.nominalInterfacesMod.IAnnotation] & Array = js.native
    
    /* InferMemberOverrides */
    override def description(): String = js.native
    
    /* InferMemberOverrides */
    override def getAdapter[T](adapterType: Instantiable[T]): T = js.native
    
    /* InferMemberOverrides */
    override def getAdapters(): js.Array[Any] & Array = js.native
    
    /* CompleteClass */
    override def getExtra(name: String): Any = js.native
    
    /* InferMemberOverrides */
    override def nameId(): String = js.native
    
    /* CompleteClass */
    override def putExtra(name: String, value: Any): Unit = js.native
    
    /* InferMemberOverrides */
    override def removeAnnotation(a: typings.ramlTypesystem.nominalInterfacesMod.IAnnotation): Unit = js.native
    
    var schemaString: String = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/nominal-types", "Property")
  @js.native
  open class Property protected ()
    extends Described
       with typings.ramlTypesystem.nominalInterfacesMod.IProperty {
    def this(_name: String) = this()
    def this(_name: String, _description: String) = this()
    
    /* private */ var _defaultBooleanValue: Any = js.native
    
    /* private */ var _defaultIntegerValue: Any = js.native
    
    /* private */ var _defaultValue: Any = js.native
    
    /* private */ var _descriminates: Any = js.native
    
    /* protected */ var _enumOptions: Array = js.native
    
    /* protected */ var _groupName: String = js.native
    
    /* private */ var _isMultiValue: Any = js.native
    
    /* private */ var _isRequired: Any = js.native
    
    var _keyRegexp: String = js.native
    
    /* protected */ var _keyShouldStartFrom: String = js.native
    
    /* private */ var _nodeRange: Any = js.native
    
    /* private */ var _ownerClass: Any = js.native
    
    /* InferMemberOverrides */
    override def addAnnotation(a: IAnnotation): Unit = js.native
    
    /* InferMemberOverrides */
    override def annotations(): Array & js.Array[typings.ramlTypesystem.nominalInterfacesMod.IAnnotation] = js.native
    
    /**
      * returns a default value for this property
      */
    /* CompleteClass */
    override def defaultValue(): Any = js.native
    
    /* InferMemberOverrides */
    override def description(): String = js.native
    
    /**
      * domain of the property (basically declaring type)
      */
    /* CompleteClass */
    override def domain(): typings.ramlTypesystem.nominalInterfacesMod.ITypeDefinition = js.native
    
    /**
      * if this property range is constrained to a fixed set of values it will return the values
      */
    /* CompleteClass */
    override def enumOptions(): js.Array[String] = js.native
    
    /* private */ var facetValidator: Any = js.native
    
    /* InferMemberOverrides */
    override def getAdapter[T](adapterType: Instantiable[T]): T = js.native
    
    /* InferMemberOverrides */
    override def getAdapters(): Array & js.Array[Any] = js.native
    
    def getFacetValidator(): typings.ramlTypesystem.nominalInterfacesMod.FacetValidator = js.native
    
    /**
      * return a pattern for a property name - used for pattern properties
      */
    /* CompleteClass */
    override def getKeyRegexp(): String = js.native
    
    /**
      * true if this property is a discriminator
      */
    /* CompleteClass */
    override def isDescriminator(): Boolean = js.native
    
    /**
      * true if this property can have multiple values
      */
    /* CompleteClass */
    override def isMultiValue(): Boolean = js.native
    
    /**
      * true if this property range is one of built in value types
      */
    /* CompleteClass */
    override def isPrimitive(): Boolean = js.native
    
    /**
      * true if this property is required to fill
      */
    /* CompleteClass */
    override def isRequired(): Boolean = js.native
    
    /**
      * true if this property range is a value type
      */
    /* CompleteClass */
    override def isValueProperty(): Boolean = js.native
    
    /**
      * return a prefix for a property name - used for additional properties
      */
    /* CompleteClass */
    override def keyPrefix(): String = js.native
    
    /**
      * returns true if this property matches the a given property name
      * (it is important for additional and pattern properties)
      * @param k
      */
    /* CompleteClass */
    override def matchKey(k: String): Boolean = js.native
    
    /* InferMemberOverrides */
    override def nameId(): String = js.native
    
    /**
      * range of the property (basically it is type)
      */
    /* CompleteClass */
    override def range(): typings.ramlTypesystem.nominalInterfacesMod.ITypeDefinition = js.native
    
    /* InferMemberOverrides */
    override def removeAnnotation(a: IAnnotation): Unit = js.native
    
    def setDefaultBooleanVal(s: Any): this.type = js.native
    
    def setDefaultIntegerVal(s: Any): this.type = js.native
    
    def setDefaultVal(s: Any): this.type = js.native
    
    def setFacetValidator(f: FacetValidator): Unit = js.native
    
    def withDescriminating(b: Boolean): this.type = js.native
    
    def withDomain(d: StructuredType): Property = js.native
    def withDomain(d: StructuredType, custom: Boolean): Property = js.native
    
    def withEnumOptions(op: Array): this.type = js.native
    
    def withKeyRegexp(regexp: String): this.type = js.native
    
    def withKeyRestriction(keyShouldStartFrom: String): this.type = js.native
    
    def withMultiValue(): this.type = js.native
    def withMultiValue(v: Boolean): this.type = js.native
    
    def withRange(t: ITypeDefinition): this.type = js.native
    
    def withRequired(req: Boolean): this.type = js.native
  }
  /* static members */
  object Property {
    
    @JSImport("raml-typesystem/dist/src/nominal-types", "Property")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-typesystem/dist/src/nominal-types", "Property.CLASS_IDENTIFIER_Property")
    @js.native
    def CLASS_IDENTIFIER_Property: Any = js.native
    inline def CLASS_IDENTIFIER_Property_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_Property")(x.asInstanceOf[js.Any])
    
    inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/nominal-types.Property */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/nominal-types.Property */ Boolean]
  }
  
  @JSImport("raml-typesystem/dist/src/nominal-types", "StructuredType")
  @js.native
  open class StructuredType protected () extends AbstractType {
    def this(_name: String) = this()
    def this(_name: String, _universe: IUniverse) = this()
    def this(_name: String, _universe: Unit, _path: String) = this()
    def this(_name: String, _universe: IUniverse, _path: String) = this()
    
    var _properties: Array = js.native
    
    def addProperty(name: String, range: ITypeDefinition): Property = js.native
    
    def allPropertyIndex(name: String): Double = js.native
    
    def propertyIndex(name: String): Double = js.native
    
    def registerProperty(p: IProperty): Unit = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/nominal-types", "Union")
  @js.native
  open class Union protected ()
    extends AbstractType
       with typings.ramlTypesystem.nominalInterfacesMod.IUnionType {
    def this(_name: String) = this()
    def this(_name: String, _universe: IUniverse) = this()
    def this(_name: String, _universe: Unit, _path: String) = this()
    def this(_name: String, _universe: IUniverse, _path: String) = this()
    
    /* InferMemberOverrides */
    override def addAnnotation(a: typings.ramlTypesystem.nominalInterfacesMod.IAnnotation): Unit = js.native
    
    /* InferMemberOverrides */
    override def annotations(): js.Array[typings.ramlTypesystem.nominalInterfacesMod.IAnnotation] & Array = js.native
    
    /* InferMemberOverrides */
    override def description(): String = js.native
    
    /* InferMemberOverrides */
    override def getAdapter[T](adapterType: Instantiable[T]): T = js.native
    
    /* InferMemberOverrides */
    override def getAdapters(): js.Array[Any] & Array = js.native
    
    /* CompleteClass */
    override def getExtra(name: String): Any = js.native
    
    var left: ITypeDefinition = js.native
    
    /* InferMemberOverrides */
    override def nameId(): String = js.native
    
    /* CompleteClass */
    override def putExtra(name: String, value: Any): Unit = js.native
    
    /* InferMemberOverrides */
    override def removeAnnotation(a: typings.ramlTypesystem.nominalInterfacesMod.IAnnotation): Unit = js.native
    
    var right: ITypeDefinition = js.native
  }
  
  @JSImport("raml-typesystem/dist/src/nominal-types", "ValueType")
  @js.native
  open class ValueType protected () extends AbstractType {
    def this(name: String) = this()
    def this(name: String, _universe: IUniverse) = this()
    def this(name: String, _universe: Unit, path: String) = this()
    def this(name: String, _universe: IUniverse, path: String) = this()
    def this(name: String, _universe: Unit, path: String, description: String) = this()
    def this(name: String, _universe: Unit, path: Unit, description: String) = this()
    def this(name: String, _universe: IUniverse, path: String, description: String) = this()
    def this(name: String, _universe: IUniverse, path: Unit, description: String) = this()
    
    def isUnionType(): Boolean = js.native
  }
  
  inline def registerInjector(i: Injector): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerInjector")(i.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type FacetValidator = typings.ramlTypesystem.nominalInterfacesMod.FacetValidator
  
  type IAnnotation = typings.ramlTypesystem.nominalInterfacesMod.IAnnotation
  
  type IAnnotationType = typings.ramlTypesystem.nominalInterfacesMod.IAnnotationType
  
  type IArrayType = typings.ramlTypesystem.nominalInterfacesMod.IArrayType
  
  type IExpandableExample = typings.ramlTypesystem.nominalInterfacesMod.IExpandableExample
  
  type IExternalType = typings.ramlTypesystem.nominalInterfacesMod.IExternalType
  
  type INamedEntity = typings.ramlTypesystem.nominalInterfacesMod.INamedEntity
  
  type IPrintDetailsSettings = typings.ramlTypesystem.nominalInterfacesMod.IPrintDetailsSettings
  
  type IProperty = typings.ramlTypesystem.nominalInterfacesMod.IProperty
  
  type ITypeDefinition = typings.ramlTypesystem.nominalInterfacesMod.ITypeDefinition
  
  type IUnionType = typings.ramlTypesystem.nominalInterfacesMod.IUnionType
  
  type IUniverse = typings.ramlTypesystem.nominalInterfacesMod.IUniverse
  
  trait Injector extends StObject {
    
    def inject(a: Adaptable): Unit
  }
  object Injector {
    
    inline def apply(inject: Adaptable => Unit): Injector = {
      val __obj = js.Dynamic.literal(inject = js.Any.fromFunction1(inject))
      __obj.asInstanceOf[Injector]
    }
    
    extension [Self <: Injector](x: Self) {
      
      inline def setInject(value: Adaptable => Unit): Self = StObject.set(x, "inject", js.Any.fromFunction1(value))
    }
  }
  
  type NamedId = typings.ramlTypesystem.nominalInterfacesMod.NamedId
}
