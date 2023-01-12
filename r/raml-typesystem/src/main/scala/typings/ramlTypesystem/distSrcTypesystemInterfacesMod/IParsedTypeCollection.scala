package typings.ramlTypesystem.distSrcTypesystemInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IParsedTypeCollection extends StObject {
  
  /**
    * adds a type to collection
    * @param t
    */
  def add(t: IParsedType): Unit
  
  /**
    * adds annotation type
    * @param t
    */
  def addAnnotationType(t: IParsedType): Unit
  
  def addLibrary(namespace: String, lib: IParsedTypeCollection): Unit
  
  /**
    * lists annotation types defined in this collection
    */
  def annotationTypes(): js.Array[IParsedType]
  
  /**
    * returns annotation type for a given name
    * @param name
    */
  def getAnnotationType(name: String): IParsedType
  
  def getAnnotationTypeRegistry(): ITypeRegistry
  
  /**
    * returns a type for a given name
    * @param name
    */
  def getType(name: String): IParsedType
  
  def getTypeRegistry(): ITypeRegistry
  
  def id(): String
  
  def libraries(): StringDictionary[IParsedTypeCollection]
  
  def library(name: String): IParsedTypeCollection
  
  /**
    * lists the types defined in this collection
    */
  def types(): js.Array[IParsedType]
}
object IParsedTypeCollection {
  
  inline def apply(
    add: IParsedType => Unit,
    addAnnotationType: IParsedType => Unit,
    addLibrary: (String, IParsedTypeCollection) => Unit,
    annotationTypes: () => js.Array[IParsedType],
    getAnnotationType: String => IParsedType,
    getAnnotationTypeRegistry: () => ITypeRegistry,
    getType: String => IParsedType,
    getTypeRegistry: () => ITypeRegistry,
    id: () => String,
    libraries: () => StringDictionary[IParsedTypeCollection],
    library: String => IParsedTypeCollection,
    types: () => js.Array[IParsedType]
  ): IParsedTypeCollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAnnotationType = js.Any.fromFunction1(addAnnotationType), addLibrary = js.Any.fromFunction2(addLibrary), annotationTypes = js.Any.fromFunction0(annotationTypes), getAnnotationType = js.Any.fromFunction1(getAnnotationType), getAnnotationTypeRegistry = js.Any.fromFunction0(getAnnotationTypeRegistry), getType = js.Any.fromFunction1(getType), getTypeRegistry = js.Any.fromFunction0(getTypeRegistry), id = js.Any.fromFunction0(id), libraries = js.Any.fromFunction0(libraries), library = js.Any.fromFunction1(library), types = js.Any.fromFunction0(types))
    __obj.asInstanceOf[IParsedTypeCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IParsedTypeCollection] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: IParsedType => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddAnnotationType(value: IParsedType => Unit): Self = StObject.set(x, "addAnnotationType", js.Any.fromFunction1(value))
    
    inline def setAddLibrary(value: (String, IParsedTypeCollection) => Unit): Self = StObject.set(x, "addLibrary", js.Any.fromFunction2(value))
    
    inline def setAnnotationTypes(value: () => js.Array[IParsedType]): Self = StObject.set(x, "annotationTypes", js.Any.fromFunction0(value))
    
    inline def setGetAnnotationType(value: String => IParsedType): Self = StObject.set(x, "getAnnotationType", js.Any.fromFunction1(value))
    
    inline def setGetAnnotationTypeRegistry(value: () => ITypeRegistry): Self = StObject.set(x, "getAnnotationTypeRegistry", js.Any.fromFunction0(value))
    
    inline def setGetType(value: String => IParsedType): Self = StObject.set(x, "getType", js.Any.fromFunction1(value))
    
    inline def setGetTypeRegistry(value: () => ITypeRegistry): Self = StObject.set(x, "getTypeRegistry", js.Any.fromFunction0(value))
    
    inline def setId(value: () => String): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    
    inline def setLibraries(value: () => StringDictionary[IParsedTypeCollection]): Self = StObject.set(x, "libraries", js.Any.fromFunction0(value))
    
    inline def setLibrary(value: String => IParsedTypeCollection): Self = StObject.set(x, "library", js.Any.fromFunction1(value))
    
    inline def setTypes(value: () => js.Array[IParsedType]): Self = StObject.set(x, "types", js.Any.fromFunction0(value))
  }
}
