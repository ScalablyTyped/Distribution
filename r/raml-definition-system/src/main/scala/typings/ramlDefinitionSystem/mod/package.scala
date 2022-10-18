package typings.ramlDefinitionSystem.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ramlDefinitionSystem.mod.^
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

inline def getSchemaUtils(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemaUtils")().asInstanceOf[Any]

inline def getUniverse: UniverseProvider = ^.asInstanceOf[js.Dynamic].selectDynamic("getUniverse").asInstanceOf[UniverseProvider]
inline def getUniverse_=(x: UniverseProvider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getUniverse")(x.asInstanceOf[js.Any])

inline def isSourceProvider(`object`: Any): /* is raml-definition-system.raml-definition-system.SourceProvider */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSourceProvider")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is raml-definition-system.raml-definition-system.SourceProvider */ Boolean]

inline def isUserDefinedClass(clazz: Any): /* is raml-definition-system.raml-definition-system.UserDefinedClass */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUserDefinedClass")(clazz.asInstanceOf[js.Any]).asInstanceOf[/* is raml-definition-system.raml-definition-system.UserDefinedClass */ Boolean]

inline def prop(name: String, desc: String, domain: NodeClass, range: IType): Property = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Property]
inline def prop(name: String, desc: String, domain: NodeClass, range: IType, custom: Boolean): Property = (^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], range.asInstanceOf[js.Any], custom.asInstanceOf[js.Any])).asInstanceOf[Property]

type Array = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.Array */ Any

type IHasExtra = typings.ramlTypesystem.mod.IHasExtra

type IHighLevelNode = Any

type IParseResult = Any

type IProperty = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.IProperty */ Any

type IType = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.ITypeDefinition */ Any

type ITypeDefinition = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.ITypeDefinition */ Any

type IUniverseDescriptor = StringDictionary[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.NamedId */ Any]

type IValueDocProvider = js.Function1[/* v */ String, String]

type IValueSuggester = js.Function1[/* node */ IHighLevelNode, Array]

type Named = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify typeSystem.NamedId */ Any
