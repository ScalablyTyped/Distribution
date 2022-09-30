package typings.raml1Parser.mod.ds

import org.scalablytyped.runtime.StringDictionary
import typings.ramlTypesystem.mod.IFacetPrototype
import typings.ramlTypesystem.mod.IParseNode
import typings.ramlTypesystem.mod.IParsedType
import typings.ramlTypesystem.mod.IParsedTypeCollection
import typings.ramlTypesystem.mod.IStatus
import typings.ramlTypesystem.mod.IType
import typings.ramlTypesystem.mod.ITypeCollection
import typings.ramlTypesystem.mod.ITypeRegistry
import typings.ramlTypesystem.nominalTypesMod.IAnnotationType
import typings.ramlTypesystem.nominalTypesMod.ITypeDefinition
import typings.ramlTypesystem.nominalTypesMod.IUniverse
import typings.ramlTypesystem.nominalTypesMod.Injector
import typings.ramlTypesystem.typeExpressionUtilMod.BaseNode
import typings.ramlTypesystem.typesystemInterfacesMod.IAnnotationValidationPlugin
import typings.ramlTypesystem.typesystemInterfacesMod.ITypeValidationPlugin
import typings.ramlTypesystem.typesystemInterfacesMod.IValidationPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rt {
  
  @JSImport("raml-1-parser", "ds.rt")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser", "ds.rt.DEFINED_IN_TYPES_EXTRA")
  @js.native
  def DEFINED_IN_TYPES_EXTRA: String = js.native
  inline def DEFINED_IN_TYPES_EXTRA_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFINED_IN_TYPES_EXTRA")(x.asInstanceOf[js.Any])
  
  @JSImport("raml-1-parser", "ds.rt.NodeKind")
  @js.native
  object NodeKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ramlTypesystem.mod.NodeKind & Double] = js.native
    
    /* 1 */ val ARRAY: typings.ramlTypesystem.mod.NodeKind.ARRAY & Double = js.native
    
    /* 2 */ val MAP: typings.ramlTypesystem.mod.NodeKind.MAP & Double = js.native
    
    /* 0 */ val SCALAR: typings.ramlTypesystem.mod.NodeKind.SCALAR & Double = js.native
  }
  
  @JSImport("raml-1-parser", "ds.rt.SOURCE_EXTRA")
  @js.native
  def SOURCE_EXTRA: String = js.native
  inline def SOURCE_EXTRA_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SOURCE_EXTRA")(x.asInstanceOf[js.Any])
  
  @JSImport("raml-1-parser", "ds.rt.TOP_LEVEL_EXTRA")
  @js.native
  def TOP_LEVEL_EXTRA: String = js.native
  inline def TOP_LEVEL_EXTRA_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_LEVEL_EXTRA")(x.asInstanceOf[js.Any])
  
  @JSImport("raml-1-parser", "ds.rt.TypeConstructor")
  @js.native
  open class TypeConstructor protected ()
    extends typings.ramlDefinitionSystem.ramlDefinitionSystemMod.rt.TypeConstructor {
    def this(target: IParsedType) = this()
  }
  
  @JSImport("raml-1-parser", "ds.rt.USER_DEFINED_EXTRA")
  @js.native
  def USER_DEFINED_EXTRA: String = js.native
  inline def USER_DEFINED_EXTRA_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_DEFINED_EXTRA")(x.asInstanceOf[js.Any])
  
  inline def builtInFacets(): js.Array[IFacetPrototype] = ^.asInstanceOf[js.Dynamic].applyDynamic("builtInFacets")().asInstanceOf[js.Array[IFacetPrototype]]
  
  inline def builtInTypes(): ITypeRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("builtInTypes")().asInstanceOf[ITypeRegistry]
  
  inline def checkACStatus(t: IParsedType): IStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("checkACStatus")(t.asInstanceOf[js.Any]).asInstanceOf[IStatus]
  
  inline def derive(name: String, types: IParsedType*): IParsedType = ^.asInstanceOf[js.Dynamic].applyDynamic("derive")(scala.List(name.asInstanceOf[js.Any]).`++`(types.asInstanceOf[Seq[js.Any]])*).asInstanceOf[IParsedType]
  
  inline def dump(ts: IParsedType): ITypeCollection | IType = ^.asInstanceOf[js.Dynamic].applyDynamic("dump")(ts.asInstanceOf[js.Any]).asInstanceOf[ITypeCollection | IType]
  inline def dump(ts: IParsedTypeCollection): ITypeCollection | IType = ^.asInstanceOf[js.Dynamic].applyDynamic("dump")(ts.asInstanceOf[js.Any]).asInstanceOf[ITypeCollection | IType]
  
  inline def getSchemaUtils(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemaUtils")().asInstanceOf[Any]
  
  inline def isParsedType(`object`: Any): /* is raml-typesystem.raml-typesystem.IParsedType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParsedType")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem.IParsedType */ Boolean]
  
  inline def loadType(data: IType): IParsedType = ^.asInstanceOf[js.Dynamic].applyDynamic("loadType")(data.asInstanceOf[js.Any]).asInstanceOf[IParsedType]
  
  inline def loadTypeCollection(data: ITypeCollection): IParsedTypeCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTypeCollection")(data.asInstanceOf[js.Any]).asInstanceOf[IParsedTypeCollection]
  inline def loadTypeCollection(data: ITypeCollection, registry: ITypeRegistry): IParsedTypeCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTypeCollection")(data.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[IParsedTypeCollection]
  
  @JSImport("raml-1-parser", "ds.rt.messageRegistry")
  @js.native
  def messageRegistry: Any = js.native
  inline def messageRegistry_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messageRegistry")(x.asInstanceOf[js.Any])
  
  object nominalInterfaces {
    
    @JSImport("raml-1-parser", "ds.rt.nominalInterfaces.ValueRequirement")
    @js.native
    open class ValueRequirement protected ()
      extends typings.ramlDefinitionSystem.ramlDefinitionSystemMod.rt.nominalInterfaces.ValueRequirement {
      /**
        *
        * @param name name of the property to discriminate
        * @param value expected value of discriminating property
        */
      def this(name: String, value: String) = this()
    }
  }
  
  object nominalTypes {
    
    @JSImport("raml-1-parser", "ds.rt.nominalTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser", "ds.rt.nominalTypes.AbstractType")
    @js.native
    open class AbstractType protected ()
      extends typings.ramlDefinitionSystem.ramlDefinitionSystemMod.rt.nominalTypes.AbstractType {
      def this(_name: String) = this()
      def this(_name: String, _universe: IUniverse) = this()
      def this(_name: String, _universe: Unit, _path: String) = this()
      def this(_name: String, _universe: IUniverse, _path: String) = this()
    }
    
    @JSImport("raml-1-parser", "ds.rt.nominalTypes.Adaptable")
    @js.native
    open class Adaptable ()
      extends typings.ramlDefinitionSystem.ramlDefinitionSystemMod.rt.nominalTypes.Adaptable
    /* static members */
    object Adaptable {
      
      @JSImport("raml-1-parser", "ds.rt.nominalTypes.Adaptable")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("raml-1-parser", "ds.rt.nominalTypes.Adaptable.CLASS_IDENTIFIER_Adaptable")
      @js.native
      def CLASS_IDENTIFIER_Adaptable: Any = js.native
      inline def CLASS_IDENTIFIER_Adaptable_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_Adaptable")(x.asInstanceOf[js.Any])
      
      inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/nominal-types.Adaptable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/nominal-types.Adaptable */ Boolean]
    }
    
    @JSImport("raml-1-parser", "ds.rt.nominalTypes.Annotation")
    @js.native
    open class Annotation protected ()
      extends typings.ramlDefinitionSystem.ramlDefinitionSystemMod.rt.nominalTypes.Annotation {
      def this(`type`: IAnnotationType, parameters: StringDictionary[Any]) = this()
    }
    
    @JSImport("raml-1-parser", "ds.rt.nominalTypes.Array")
    @js.native
    open class Array protected ()
      extends typings.ramlDefinitionSystem.ramlDefinitionSystemMod.rt.nominalTypes.Array {
      def this(_name: String) = this()
      def this(_name: String, _universe: IUniverse) = this()
      def this(_name: String, _universe: Unit, _path: String) = this()
      def this(_name: String, _universe: IUniverse, _path: String) = this()
    }
    
    @JSImport("raml-1-parser", "ds.rt.nominalTypes.Described")
    @js.native
    open class Described protected ()
      extends typings.ramlDefinitionSystem.ramlDefinitionSystemMod.rt.nominalTypes.Described {
      def this(_name: String) = this()
      def this(_name: String, _description: String) = this()
    }
    /* static members */
    object Described {
      
      @JSImport("raml-1-parser", "ds.rt.nominalTypes.Described")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("raml-1-parser", "ds.rt.nominalTypes.Described.CLASS_IDENTIFIER_Described")
      @js.native
      def CLASS_IDENTIFIER_Described: Any = js.native
      inline def CLASS_IDENTIFIER_Described_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_Described")(x.asInstanceOf[js.Any])
      
      inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/nominal-types.Described */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/nominal-types.Described */ Boolean]
    }
    
    @JSImport("raml-1-parser", "ds.rt.nominalTypes.Empty")
    @js.native
    open class Empty ()
      extends typings.ramlDefinitionSystem.ramlDefinitionSystemMod.rt.nominalTypes.Empty
    
    @JSImport("raml-1-parser", "ds.rt.nominalTypes.ExternalType")
    @js.native
    open class ExternalType protected ()
      extends typings.ramlDefinitionSystem.ramlDefinitionSystemMod.rt.nominalTypes.ExternalType {
      def this(_name: String) = this()
      def this(_name: String, _universe: IUniverse) = this()
      def this(_name: String, _universe: Unit, _path: String) = this()
      def this(_name: String, _universe: IUniverse, _path: String) = this()
    }
    
    @JSImport("raml-1-parser", "ds.rt.nominalTypes.Property")
    @js.native
    open class Property protected ()
      extends typings.ramlDefinitionSystem.ramlDefinitionSystemMod.rt.nominalTypes.Property {
      def this(_name: String) = this()
      def this(_name: String, _description: String) = this()
    }
    /* static members */
    object Property {
      
      @JSImport("raml-1-parser", "ds.rt.nominalTypes.Property")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("raml-1-parser", "ds.rt.nominalTypes.Property.CLASS_IDENTIFIER_Property")
      @js.native
      def CLASS_IDENTIFIER_Property: Any = js.native
      inline def CLASS_IDENTIFIER_Property_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_Property")(x.asInstanceOf[js.Any])
      
      inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/nominal-types.Property */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/nominal-types.Property */ Boolean]
    }
    
    @JSImport("raml-1-parser", "ds.rt.nominalTypes.StructuredType")
    @js.native
    open class StructuredType protected ()
      extends typings.ramlDefinitionSystem.ramlDefinitionSystemMod.rt.nominalTypes.StructuredType {
      def this(_name: String) = this()
      def this(_name: String, _universe: IUniverse) = this()
      def this(_name: String, _universe: Unit, _path: String) = this()
      def this(_name: String, _universe: IUniverse, _path: String) = this()
    }
    
    @JSImport("raml-1-parser", "ds.rt.nominalTypes.Union")
    @js.native
    open class Union protected ()
      extends typings.ramlDefinitionSystem.ramlDefinitionSystemMod.rt.nominalTypes.Union {
      def this(_name: String) = this()
      def this(_name: String, _universe: IUniverse) = this()
      def this(_name: String, _universe: Unit, _path: String) = this()
      def this(_name: String, _universe: IUniverse, _path: String) = this()
    }
    
    @JSImport("raml-1-parser", "ds.rt.nominalTypes.ValueType")
    @js.native
    open class ValueType protected ()
      extends typings.ramlDefinitionSystem.ramlDefinitionSystemMod.rt.nominalTypes.ValueType {
      def this(name: String) = this()
      def this(name: String, _universe: IUniverse) = this()
      def this(name: String, _universe: Unit, path: String) = this()
      def this(name: String, _universe: IUniverse, path: String) = this()
      def this(name: String, _universe: Unit, path: String, description: String) = this()
      def this(name: String, _universe: Unit, path: Unit, description: String) = this()
      def this(name: String, _universe: IUniverse, path: String, description: String) = this()
      def this(name: String, _universe: IUniverse, path: Unit, description: String) = this()
    }
    
    inline def registerInjector(i: Injector): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerInjector")(i.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def parse(data: IType): IParsedType | IParsedTypeCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[IParsedType | IParsedTypeCollection]
  inline def parse(data: ITypeCollection): IParsedType | IParsedTypeCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[IParsedType | IParsedTypeCollection]
  
  inline def parseFromAST(data: IParseNode): IParsedTypeCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFromAST")(data.asInstanceOf[js.Any]).asInstanceOf[IParsedTypeCollection]
  inline def parseFromAST(data: IParseNode, ignoreUses: Boolean): IParsedTypeCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFromAST")(data.asInstanceOf[js.Any], ignoreUses.asInstanceOf[js.Any])).asInstanceOf[IParsedTypeCollection]
  
  inline def parseType(data: IType, collection: IParsedTypeCollection): IParsedType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseType")(data.asInstanceOf[js.Any], collection.asInstanceOf[js.Any])).asInstanceOf[IParsedType]
  
  inline def parseTypeFromAST(name: String, data: IParseNode, collection: IParsedTypeCollection): IParsedType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeFromAST")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], collection.asInstanceOf[js.Any])).asInstanceOf[IParsedType]
  inline def parseTypeFromAST(name: String, data: IParseNode, collection: IParsedTypeCollection, defaultsToAny: Boolean): IParsedType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeFromAST")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], defaultsToAny.asInstanceOf[js.Any])).asInstanceOf[IParsedType]
  inline def parseTypeFromAST(
    name: String,
    data: IParseNode,
    collection: IParsedTypeCollection,
    defaultsToAny: Boolean,
    annotation: Boolean
  ): IParsedType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeFromAST")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], defaultsToAny.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[IParsedType]
  inline def parseTypeFromAST(
    name: String,
    data: IParseNode,
    collection: IParsedTypeCollection,
    defaultsToAny: Boolean,
    annotation: Boolean,
    global: Boolean
  ): IParsedType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeFromAST")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], defaultsToAny.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any], global.asInstanceOf[js.Any])).asInstanceOf[IParsedType]
  inline def parseTypeFromAST(
    name: String,
    data: IParseNode,
    collection: IParsedTypeCollection,
    defaultsToAny: Boolean,
    annotation: Boolean,
    global: Boolean,
    ignoreTypeAttr: Boolean
  ): IParsedType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeFromAST")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], defaultsToAny.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any], global.asInstanceOf[js.Any], ignoreTypeAttr.asInstanceOf[js.Any])).asInstanceOf[IParsedType]
  inline def parseTypeFromAST(
    name: String,
    data: IParseNode,
    collection: IParsedTypeCollection,
    defaultsToAny: Boolean,
    annotation: Boolean,
    global: Unit,
    ignoreTypeAttr: Boolean
  ): IParsedType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeFromAST")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], defaultsToAny.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any], global.asInstanceOf[js.Any], ignoreTypeAttr.asInstanceOf[js.Any])).asInstanceOf[IParsedType]
  inline def parseTypeFromAST(
    name: String,
    data: IParseNode,
    collection: IParsedTypeCollection,
    defaultsToAny: Boolean,
    annotation: Unit,
    global: Boolean
  ): IParsedType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeFromAST")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], defaultsToAny.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any], global.asInstanceOf[js.Any])).asInstanceOf[IParsedType]
  inline def parseTypeFromAST(
    name: String,
    data: IParseNode,
    collection: IParsedTypeCollection,
    defaultsToAny: Boolean,
    annotation: Unit,
    global: Boolean,
    ignoreTypeAttr: Boolean
  ): IParsedType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeFromAST")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], defaultsToAny.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any], global.asInstanceOf[js.Any], ignoreTypeAttr.asInstanceOf[js.Any])).asInstanceOf[IParsedType]
  inline def parseTypeFromAST(
    name: String,
    data: IParseNode,
    collection: IParsedTypeCollection,
    defaultsToAny: Boolean,
    annotation: Unit,
    global: Unit,
    ignoreTypeAttr: Boolean
  ): IParsedType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeFromAST")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], defaultsToAny.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any], global.asInstanceOf[js.Any], ignoreTypeAttr.asInstanceOf[js.Any])).asInstanceOf[IParsedType]
  inline def parseTypeFromAST(
    name: String,
    data: IParseNode,
    collection: IParsedTypeCollection,
    defaultsToAny: Unit,
    annotation: Boolean
  ): IParsedType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeFromAST")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], defaultsToAny.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[IParsedType]
  inline def parseTypeFromAST(
    name: String,
    data: IParseNode,
    collection: IParsedTypeCollection,
    defaultsToAny: Unit,
    annotation: Boolean,
    global: Boolean
  ): IParsedType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeFromAST")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], defaultsToAny.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any], global.asInstanceOf[js.Any])).asInstanceOf[IParsedType]
  inline def parseTypeFromAST(
    name: String,
    data: IParseNode,
    collection: IParsedTypeCollection,
    defaultsToAny: Unit,
    annotation: Boolean,
    global: Boolean,
    ignoreTypeAttr: Boolean
  ): IParsedType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeFromAST")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], defaultsToAny.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any], global.asInstanceOf[js.Any], ignoreTypeAttr.asInstanceOf[js.Any])).asInstanceOf[IParsedType]
  inline def parseTypeFromAST(
    name: String,
    data: IParseNode,
    collection: IParsedTypeCollection,
    defaultsToAny: Unit,
    annotation: Boolean,
    global: Unit,
    ignoreTypeAttr: Boolean
  ): IParsedType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeFromAST")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], defaultsToAny.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any], global.asInstanceOf[js.Any], ignoreTypeAttr.asInstanceOf[js.Any])).asInstanceOf[IParsedType]
  inline def parseTypeFromAST(
    name: String,
    data: IParseNode,
    collection: IParsedTypeCollection,
    defaultsToAny: Unit,
    annotation: Unit,
    global: Boolean
  ): IParsedType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeFromAST")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], defaultsToAny.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any], global.asInstanceOf[js.Any])).asInstanceOf[IParsedType]
  inline def parseTypeFromAST(
    name: String,
    data: IParseNode,
    collection: IParsedTypeCollection,
    defaultsToAny: Unit,
    annotation: Unit,
    global: Boolean,
    ignoreTypeAttr: Boolean
  ): IParsedType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeFromAST")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], defaultsToAny.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any], global.asInstanceOf[js.Any], ignoreTypeAttr.asInstanceOf[js.Any])).asInstanceOf[IParsedType]
  inline def parseTypeFromAST(
    name: String,
    data: IParseNode,
    collection: IParsedTypeCollection,
    defaultsToAny: Unit,
    annotation: Unit,
    global: Unit,
    ignoreTypeAttr: Boolean
  ): IParsedType = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTypeFromAST")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], defaultsToAny.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any], global.asInstanceOf[js.Any], ignoreTypeAttr.asInstanceOf[js.Any])).asInstanceOf[IParsedType]
  
  inline def performAC(i: Any, t: IParsedType): IParsedType = (^.asInstanceOf[js.Dynamic].applyDynamic("performAC")(i.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[IParsedType]
  
  inline def setPropertyConstructor(c: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPropertyConstructor")(c.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toNominal(t: IParsedType, bt: js.Function1[/* name */ String, ITypeDefinition]): ITypeDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("toNominal")(t.asInstanceOf[js.Any], bt.asInstanceOf[js.Any])).asInstanceOf[ITypeDefinition]
  
  inline def toValidationPath(p: String): IValidationPath = ^.asInstanceOf[js.Dynamic].applyDynamic("toValidationPath")(p.asInstanceOf[js.Any]).asInstanceOf[IValidationPath]
  
  object tsInterfaces {
    
    @JSImport("raml-1-parser", "ds.rt.tsInterfaces")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser", "ds.rt.tsInterfaces.DEFINED_IN_TYPES_EXTRA")
    @js.native
    val DEFINED_IN_TYPES_EXTRA: /* "definedInTypes" */ String = js.native
    
    @JSImport("raml-1-parser", "ds.rt.tsInterfaces.GLOBAL_EXTRA")
    @js.native
    val GLOBAL_EXTRA: /* "GLOBAL" */ String = js.native
    
    @JSImport("raml-1-parser", "ds.rt.tsInterfaces.HAS_FACETS")
    @js.native
    val HAS_FACETS: /* "HAS_FACETS" */ String = js.native
    
    @JSImport("raml-1-parser", "ds.rt.tsInterfaces.HAS_ITEMS")
    @js.native
    val HAS_ITEMS: /* "HAS_ITEMS" */ String = js.native
    
    @JSImport("raml-1-parser", "ds.rt.tsInterfaces.MetaInformationKind")
    @js.native
    object MetaInformationKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind & Double] = js.native
      
      /* 22 */ val AcceptAllScalarsAsStrings: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.AcceptAllScalarsAsStrings & Double = js.native
      
      /* 10 */ val AllowedTargets: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.AllowedTargets & Double = js.native
      
      /* 4 */ val Annotation: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.Annotation & Double = js.native
      
      /* 14 */ val Constraint: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.Constraint & Double = js.native
      
      /* 6 */ val CustomFacet: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.CustomFacet & Double = js.native
      
      /* 13 */ val Default: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.Default & Double = js.native
      
      /* 0 */ val Description: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.Description & Double = js.native
      
      /* 16 */ val Discriminator: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.Discriminator & Double = js.native
      
      /* 17 */ val DiscriminatorValue: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.DiscriminatorValue & Double = js.native
      
      /* 2 */ val DisplayName: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.DisplayName & Double = js.native
      
      /* 7 */ val Example: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.Example & Double = js.native
      
      /* 11 */ val Examples: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.Examples & Double = js.native
      
      /* 5 */ val FacetDeclaration: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.FacetDeclaration & Double = js.native
      
      /* 9 */ val HasPropertiesFacet: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.HasPropertiesFacet & Double = js.native
      
      /* 21 */ val ImportedByChain: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.ImportedByChain & Double = js.native
      
      /* 15 */ val Modifier: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.Modifier & Double = js.native
      
      /* 1 */ val NotScalar: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.NotScalar & Double = js.native
      
      /* 20 */ val ParserMetadata: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.ParserMetadata & Double = js.native
      
      /* 8 */ val Required: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.Required & Double = js.native
      
      /* 18 */ val SchemaPath: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.SchemaPath & Double = js.native
      
      /* 23 */ val SkipValidation: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.SkipValidation & Double = js.native
      
      /* 19 */ val SourceMap: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.SourceMap & Double = js.native
      
      /* 24 */ val TypeAttributeValue: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.TypeAttributeValue & Double = js.native
      
      /* 3 */ val Usage: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.Usage & Double = js.native
      
      /* 12 */ val XMLInfo: typings.ramlTypesystem.typesystemInterfacesMod.MetaInformationKind.XMLInfo & Double = js.native
    }
    
    @JSImport("raml-1-parser", "ds.rt.tsInterfaces.PARSE_ERROR")
    @js.native
    val PARSE_ERROR: /* "parseError" */ String = js.native
    
    @JSImport("raml-1-parser", "ds.rt.tsInterfaces.REPEAT")
    @js.native
    val REPEAT: /* "repeat" */ String = js.native
    
    @JSImport("raml-1-parser", "ds.rt.tsInterfaces.SCHEMA_AND_TYPE_EXTRA")
    @js.native
    val SCHEMA_AND_TYPE_EXTRA: /* "SCHEMA" */ String = js.native
    
    @JSImport("raml-1-parser", "ds.rt.tsInterfaces.SOURCE_EXTRA")
    @js.native
    val SOURCE_EXTRA: /* "SOURCE" */ String = js.native
    
    @JSImport("raml-1-parser", "ds.rt.tsInterfaces.TOP_LEVEL_EXTRA")
    @js.native
    val TOP_LEVEL_EXTRA: /* "topLevel" */ String = js.native
    
    @JSImport("raml-1-parser", "ds.rt.tsInterfaces.USER_DEFINED_EXTRA")
    @js.native
    val USER_DEFINED_EXTRA: /* "USER_DEFINED" */ String = js.native
    
    inline def getAnnotationValidationPlugins(): js.Array[IAnnotationValidationPlugin] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnnotationValidationPlugins")().asInstanceOf[js.Array[IAnnotationValidationPlugin]]
    
    inline def getTypeValidationPlugins(): js.Array[ITypeValidationPlugin] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeValidationPlugins")().asInstanceOf[js.Array[ITypeValidationPlugin]]
  }
  
  object typeExpressions {
    
    @JSImport("raml-1-parser", "ds.rt.typeExpressions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(str: String): BaseNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[BaseNode]
    
    inline def serializeToString(node: BaseNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeToString")(node.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def visit(node: BaseNode, action: js.Function1[/* n */ BaseNode, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(node.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def unify(name: String, types: IParsedType*): IParsedType = ^.asInstanceOf[js.Dynamic].applyDynamic("unify")(scala.List(name.asInstanceOf[js.Any]).`++`(types.asInstanceOf[Seq[js.Any]])*).asInstanceOf[IParsedType]
  
  inline def validate(i: Any, t: IParsedType): IStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(i.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[IStatus]
  inline def validate(i: Any, t: IParsedType, autoClose: Boolean): IStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(i.asInstanceOf[js.Any], t.asInstanceOf[js.Any], autoClose.asInstanceOf[js.Any])).asInstanceOf[IStatus]
  
  inline def validateTypeDefinition(t: IParsedType, collection: IParsedTypeCollection): IStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("validateTypeDefinition")(t.asInstanceOf[js.Any], collection.asInstanceOf[js.Any])).asInstanceOf[IStatus]
}
