package typings.ramlTypesystem.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ramlTypesystem.mod.^
import typings.ramlTypesystem.nominalTypesMod.ITypeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DEFINED_IN_TYPES_EXTRA: String = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFINED_IN_TYPES_EXTRA").asInstanceOf[String]
inline def DEFINED_IN_TYPES_EXTRA_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFINED_IN_TYPES_EXTRA")(x.asInstanceOf[js.Any])

inline def SOURCE_EXTRA: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SOURCE_EXTRA").asInstanceOf[String]
inline def SOURCE_EXTRA_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SOURCE_EXTRA")(x.asInstanceOf[js.Any])

inline def TOP_LEVEL_EXTRA: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TOP_LEVEL_EXTRA").asInstanceOf[String]
inline def TOP_LEVEL_EXTRA_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_LEVEL_EXTRA")(x.asInstanceOf[js.Any])

inline def USER_DEFINED_EXTRA: String = ^.asInstanceOf[js.Dynamic].selectDynamic("USER_DEFINED_EXTRA").asInstanceOf[String]
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

inline def messageRegistry: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("messageRegistry").asInstanceOf[Any]
inline def messageRegistry_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messageRegistry")(x.asInstanceOf[js.Any])

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

inline def toValidationPath(p: String): typings.ramlTypesystem.typesystemInterfacesMod.IValidationPath = ^.asInstanceOf[js.Dynamic].applyDynamic("toValidationPath")(p.asInstanceOf[js.Any]).asInstanceOf[typings.ramlTypesystem.typesystemInterfacesMod.IValidationPath]

inline def unify(name: String, types: IParsedType*): IParsedType = ^.asInstanceOf[js.Dynamic].applyDynamic("unify")(scala.List(name.asInstanceOf[js.Any]).`++`(types.asInstanceOf[Seq[js.Any]])*).asInstanceOf[IParsedType]

inline def validate(i: Any, t: IParsedType): IStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(i.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[IStatus]
inline def validate(i: Any, t: IParsedType, autoClose: Boolean): IStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(i.asInstanceOf[js.Any], t.asInstanceOf[js.Any], autoClose.asInstanceOf[js.Any])).asInstanceOf[IStatus]

inline def validateTypeDefinition(t: IParsedType, collection: IParsedTypeCollection): IStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("validateTypeDefinition")(t.asInstanceOf[js.Any], collection.asInstanceOf[js.Any])).asInstanceOf[IStatus]

type ElementSourceInfo = typings.ramlTypesystem.typesystemInterfacesMod.IHasExtra

type IAnnotation = typings.ramlTypesystem.typesystemInterfacesMod.IAnnotation

type IConstraint = typings.ramlTypesystem.typesystemInterfacesMod.IConstraint

type IExample = typings.ramlTypesystem.typesystemInterfacesMod.IExample

type IHasExtra = typings.ramlTypesystem.typesystemInterfacesMod.IHasExtra

type IParsedType = typings.ramlTypesystem.typesystemInterfacesMod.IParsedType

type IParsedTypeCollection = typings.ramlTypesystem.typesystemInterfacesMod.IParsedTypeCollection

type IPropertyInfo = typings.ramlTypesystem.typesystemInterfacesMod.IPropertyInfo

type IStatus = typings.ramlTypesystem.typesystemInterfacesMod.IStatus

type ITypeFacet = typings.ramlTypesystem.typesystemInterfacesMod.ITypeFacet

type ITypeRegistry = typings.ramlTypesystem.typesystemInterfacesMod.ITypeRegistry

type IValidationPath = typings.ramlTypesystem.typesystemInterfacesMod.IValidationPath

type Open = /**
  * this index signature is here to specify that IType can contain unknown user defined facets and annotations
  */
StringDictionary[Any]
