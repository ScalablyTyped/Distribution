package typings.ramlTypesystem.typesystemMod

import org.scalablytyped.runtime.StringDictionary
import typings.ramlTypesystem.parseMod.TypeCollection
import typings.ramlTypesystem.typesystemInterfacesMod.IParsedType
import typings.ramlTypesystem.typesystemInterfacesMod.ITypeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-typesystem/dist/src/typesystem", "TypeRegistry")
@js.native
open class TypeRegistry ()
  extends StObject
     with ITypeRegistry {
  def this(_parent: TypeRegistry) = this()
  def this(_parent: Unit, _c: TypeCollection) = this()
  def this(_parent: TypeRegistry, _c: TypeCollection) = this()
  def this(_parent: Unit, _c: Unit, isAnnotationsReg: Boolean) = this()
  def this(_parent: Unit, _c: TypeCollection, isAnnotationsReg: Boolean) = this()
  def this(_parent: TypeRegistry, _c: Unit, isAnnotationsReg: Boolean) = this()
  def this(_parent: TypeRegistry, _c: TypeCollection, isAnnotationsReg: Boolean) = this()
  
  /* protected */ var _c: js.UndefOr[TypeCollection] = js.native
  
  /* private */ var _parent: Any = js.native
  
  /* private */ var _types: Any = js.native
  
  def addType(t: AbstractType): Unit = js.native
  
  /* private */ var chainedTypes: Any = js.native
  
  /**
    * returns a type associated with a given name
    * @param name
    */
  /* CompleteClass */
  override def get(name: String): IParsedType = js.native
  
  /**
    * Retrieve type if it is available through a library chain
    * @param name type name
    */
  /* CompleteClass */
  override def getByChain(name: String): IParsedType = js.native
  
  def getClassIdentifier(): js.Array[String] = js.native
  
  /* private */ var getTypeByChainFromCollection: Any = js.native
  
  /* protected */ var isAnnotationsReg: Boolean = js.native
  
  def parent(): TypeRegistry = js.native
  
  def put(alias: String, t: AbstractType): Unit = js.native
  
  /* private */ var typeList: Any = js.native
  
  def typeMap(): StringDictionary[AbstractType] = js.native
  
  /**
    * list all types stored in this registry
    */
  /* CompleteClass */
  override def types(): js.Array[IParsedType] = js.native
}
/* static members */
object TypeRegistry {
  
  @JSImport("raml-typesystem/dist/src/typesystem", "TypeRegistry")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-typesystem/dist/src/typesystem", "TypeRegistry.CLASS_IDENTIFIER_TypeRegistry")
  @js.native
  def CLASS_IDENTIFIER_TypeRegistry: Any = js.native
  inline def CLASS_IDENTIFIER_TypeRegistry_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_TypeRegistry")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/typesystem.TypeRegistry */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/typesystem.TypeRegistry */ Boolean]
}
