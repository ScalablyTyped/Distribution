package typings.ramlTypesystem.typesystemInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITypeRegistry extends StObject {
  
  /**
    * returns a type associated with a given name
    * @param name
    */
  def get(name: String): IParsedType
  
  /**
    * Retrieve type if it is available through a library chain
    * @param name type name
    */
  def getByChain(name: String): IParsedType
  
  /**
    * list all types stored in this registry
    */
  def types(): js.Array[IParsedType]
}
object ITypeRegistry {
  
  inline def apply(get: String => IParsedType, getByChain: String => IParsedType, types: () => js.Array[IParsedType]): ITypeRegistry = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getByChain = js.Any.fromFunction1(getByChain), types = js.Any.fromFunction0(types))
    __obj.asInstanceOf[ITypeRegistry]
  }
  
  extension [Self <: ITypeRegistry](x: Self) {
    
    inline def setGet(value: String => IParsedType): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetByChain(value: String => IParsedType): Self = StObject.set(x, "getByChain", js.Any.fromFunction1(value))
    
    inline def setTypes(value: () => js.Array[IParsedType]): Self = StObject.set(x, "types", js.Any.fromFunction0(value))
  }
}
