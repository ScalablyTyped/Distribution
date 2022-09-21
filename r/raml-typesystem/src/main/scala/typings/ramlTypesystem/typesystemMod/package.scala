package typings.ramlTypesystem.typesystemMod

import typings.ramlTypesystem.typesystemInterfacesMod.IAnnotatedElement
import typings.ramlTypesystem.typesystemInterfacesMod.IParsedType
import typings.ramlTypesystem.typesystemInterfacesMod.IStatus
import typings.ramlTypesystem.typesystemInterfacesMod.ITypeRegistry
import typings.ramlTypesystem.typesystemMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ANY: RootType = ^.asInstanceOf[js.Dynamic].selectDynamic("ANY").asInstanceOf[RootType]

inline def ARRAY: InheritedType = ^.asInstanceOf[js.Dynamic].selectDynamic("ARRAY").asInstanceOf[InheritedType]

inline def BOOLEAN: InheritedType = ^.asInstanceOf[js.Dynamic].selectDynamic("BOOLEAN").asInstanceOf[InheritedType]

inline def DATETIME: InheritedType = ^.asInstanceOf[js.Dynamic].selectDynamic("DATETIME").asInstanceOf[InheritedType]

inline def DATETIME_ONLY: InheritedType = ^.asInstanceOf[js.Dynamic].selectDynamic("DATETIME_ONLY").asInstanceOf[InheritedType]

inline def DATE_ONLY: InheritedType = ^.asInstanceOf[js.Dynamic].selectDynamic("DATE_ONLY").asInstanceOf[InheritedType]

inline def EXTERNAL: InheritedType = ^.asInstanceOf[js.Dynamic].selectDynamic("EXTERNAL").asInstanceOf[InheritedType]

inline def FILE: InheritedType = ^.asInstanceOf[js.Dynamic].selectDynamic("FILE").asInstanceOf[InheritedType]

inline def GLOBAL: /* "GLOBAL" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("GLOBAL").asInstanceOf[/* "GLOBAL" */ String]

inline def INTEGER: InheritedType = ^.asInstanceOf[js.Dynamic].selectDynamic("INTEGER").asInstanceOf[InheritedType]

inline def NIL: InheritedType = ^.asInstanceOf[js.Dynamic].selectDynamic("NIL").asInstanceOf[InheritedType]

inline def NOTHING: RootType = ^.asInstanceOf[js.Dynamic].selectDynamic("NOTHING").asInstanceOf[RootType]

inline def NUMBER: InheritedType = ^.asInstanceOf[js.Dynamic].selectDynamic("NUMBER").asInstanceOf[InheritedType]

inline def OBJECT: InheritedType = ^.asInstanceOf[js.Dynamic].selectDynamic("OBJECT").asInstanceOf[InheritedType]

inline def RECURRENT: InheritedType = ^.asInstanceOf[js.Dynamic].selectDynamic("RECURRENT").asInstanceOf[InheritedType]

inline def REFERENCE: InheritedType = ^.asInstanceOf[js.Dynamic].selectDynamic("REFERENCE").asInstanceOf[InheritedType]

inline def SCALAR: InheritedType = ^.asInstanceOf[js.Dynamic].selectDynamic("SCALAR").asInstanceOf[InheritedType]

inline def SCHEMA_AND_TYPE: /* "SCHEMA" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("SCHEMA_AND_TYPE").asInstanceOf[/* "SCHEMA" */ String]

inline def SOURCE_EXTRA: /* "SOURCE" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("SOURCE_EXTRA").asInstanceOf[/* "SOURCE" */ String]

inline def STRING: InheritedType = ^.asInstanceOf[js.Dynamic].selectDynamic("STRING").asInstanceOf[InheritedType]

inline def TIME_ONLY: InheritedType = ^.asInstanceOf[js.Dynamic].selectDynamic("TIME_ONLY").asInstanceOf[InheritedType]

inline def TOPLEVEL: /* "topLevel" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("TOPLEVEL").asInstanceOf[/* "topLevel" */ String]

inline def UNION_ : InheritedType = ^.asInstanceOf[js.Dynamic].selectDynamic("UNION").asInstanceOf[InheritedType]

inline def UNKNOWN: InheritedType = ^.asInstanceOf[js.Dynamic].selectDynamic("UNKNOWN").asInstanceOf[InheritedType]

inline def VALIDATED_TYPE: AbstractType = ^.asInstanceOf[js.Dynamic].selectDynamic("VALIDATED_TYPE").asInstanceOf[AbstractType]
inline def VALIDATED_TYPE_=(x: AbstractType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALIDATED_TYPE")(x.asInstanceOf[js.Any])

inline def applyAnnotationValidationPlugins(e: IAnnotatedElement): js.Array[Status] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyAnnotationValidationPlugins")(e.asInstanceOf[js.Any]).asInstanceOf[js.Array[Status]]

inline def applyTypeValidationPlugins(t: IParsedType, reg: ITypeRegistry): js.Array[Status] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTypeValidationPlugins")(t.asInstanceOf[js.Any], reg.asInstanceOf[js.Any])).asInstanceOf[js.Array[Status]]

inline def autoCloseFlag: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("autoCloseFlag").asInstanceOf[Boolean]
inline def autoCloseFlag_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoCloseFlag")(x.asInstanceOf[js.Any])

inline def builtInRegistry(): TypeRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("builtInRegistry")().asInstanceOf[TypeRegistry]

inline def derive(name: String, t: js.Array[AbstractType]): InheritedType = (^.asInstanceOf[js.Dynamic].applyDynamic("derive")(name.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[InheritedType]

inline def deriveObjectType(name: String): InheritedType = ^.asInstanceOf[js.Dynamic].applyDynamic("deriveObjectType")(name.asInstanceOf[js.Any]).asInstanceOf[InheritedType]

inline def error(messageEntry: Any, source: Any): Status = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(messageEntry.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Status]
inline def error(messageEntry: Any, source: Any, params: Any): Status = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(messageEntry.asInstanceOf[js.Any], source.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Status]
inline def error(messageEntry: Any, source: Any, params: Any, severity: Double): Status = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(messageEntry.asInstanceOf[js.Any], source.asInstanceOf[js.Any], params.asInstanceOf[js.Any], severity.asInstanceOf[js.Any])).asInstanceOf[Status]
inline def error(messageEntry: Any, source: Any, params: Any, severity: Double, takeNodeFromSource: Boolean): Status = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(messageEntry.asInstanceOf[js.Any], source.asInstanceOf[js.Any], params.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], takeNodeFromSource.asInstanceOf[js.Any])).asInstanceOf[Status]
inline def error(messageEntry: Any, source: Any, params: Any, severity: Unit, takeNodeFromSource: Boolean): Status = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(messageEntry.asInstanceOf[js.Any], source.asInstanceOf[js.Any], params.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], takeNodeFromSource.asInstanceOf[js.Any])).asInstanceOf[Status]
inline def error(messageEntry: Any, source: Any, params: Unit, severity: Double): Status = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(messageEntry.asInstanceOf[js.Any], source.asInstanceOf[js.Any], params.asInstanceOf[js.Any], severity.asInstanceOf[js.Any])).asInstanceOf[Status]
inline def error(messageEntry: Any, source: Any, params: Unit, severity: Double, takeNodeFromSource: Boolean): Status = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(messageEntry.asInstanceOf[js.Any], source.asInstanceOf[js.Any], params.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], takeNodeFromSource.asInstanceOf[js.Any])).asInstanceOf[Status]
inline def error(messageEntry: Any, source: Any, params: Unit, severity: Unit, takeNodeFromSource: Boolean): Status = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(messageEntry.asInstanceOf[js.Any], source.asInstanceOf[js.Any], params.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], takeNodeFromSource.asInstanceOf[js.Any])).asInstanceOf[Status]

inline def intersect(name: String, t: js.Array[AbstractType]): IntersectionType = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(name.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[IntersectionType]

inline def isUnknown(t: AbstractType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnknown")(t.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def messageRegistry: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("messageRegistry").asInstanceOf[Any]
inline def messageRegistry_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messageRegistry")(x.asInstanceOf[js.Any])

inline def ok(): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")().asInstanceOf[Status]

inline def patchPath(p: typings.ramlTypesystem.typesystemInterfacesMod.IValidationPath): typings.ramlTypesystem.typesystemInterfacesMod.IValidationPath = ^.asInstanceOf[js.Dynamic].applyDynamic("patchPath")(p.asInstanceOf[js.Any]).asInstanceOf[typings.ramlTypesystem.typesystemInterfacesMod.IValidationPath]

inline def setValidationPath(_s: IStatus, _c: typings.ramlTypesystem.typesystemInterfacesMod.IValidationPath): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setValidationPath")(_s.asInstanceOf[js.Any], _c.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def toValidationPath(p: String): typings.ramlTypesystem.typesystemInterfacesMod.IValidationPath = ^.asInstanceOf[js.Dynamic].applyDynamic("toValidationPath")(p.asInstanceOf[js.Any]).asInstanceOf[typings.ramlTypesystem.typesystemInterfacesMod.IValidationPath]

inline def typePath(t: AbstractType): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("typePath")(t.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def union(name: String, t: js.Array[AbstractType]): UnionType = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(name.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[UnionType]

type IValidationPath = typings.ramlTypesystem.typesystemInterfacesMod.IValidationPath
