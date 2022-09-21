package typings.ramlTypesystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFacetPrototype extends StObject {
  
  /**
    * creates a facet filled with a passed value
    * @param v
    */
  def createWithValue(v: Any): ITypeFacet
  
  /**
    * checks if the facet represented by this prototype can be added to the given type
    * @param t
    */
  def isApplicable(t: IParsedType): Boolean
  
  /**
    * returns true if this facet is a constraint
    */
  def isConstraint(): Boolean
  
  /**
    * returns true if this facet is inheritable
    */
  def isInheritable(): Boolean
  
  /**
    * returns true if this facet describes a metadata
    */
  def isMeta(): Boolean
  
  /**
    * returns the name of the facet represented by this prototype
    */
  def name(): String
  
  /**
    *creates brand new instance of facet filled with default values
    */
  def newInstance(): ITypeFacet
}
object IFacetPrototype {
  
  inline def apply(
    createWithValue: Any => ITypeFacet,
    isApplicable: IParsedType => Boolean,
    isConstraint: () => Boolean,
    isInheritable: () => Boolean,
    isMeta: () => Boolean,
    name: () => String,
    newInstance: () => ITypeFacet
  ): IFacetPrototype = {
    val __obj = js.Dynamic.literal(createWithValue = js.Any.fromFunction1(createWithValue), isApplicable = js.Any.fromFunction1(isApplicable), isConstraint = js.Any.fromFunction0(isConstraint), isInheritable = js.Any.fromFunction0(isInheritable), isMeta = js.Any.fromFunction0(isMeta), name = js.Any.fromFunction0(name), newInstance = js.Any.fromFunction0(newInstance))
    __obj.asInstanceOf[IFacetPrototype]
  }
  
  extension [Self <: IFacetPrototype](x: Self) {
    
    inline def setCreateWithValue(value: Any => ITypeFacet): Self = StObject.set(x, "createWithValue", js.Any.fromFunction1(value))
    
    inline def setIsApplicable(value: IParsedType => Boolean): Self = StObject.set(x, "isApplicable", js.Any.fromFunction1(value))
    
    inline def setIsConstraint(value: () => Boolean): Self = StObject.set(x, "isConstraint", js.Any.fromFunction0(value))
    
    inline def setIsInheritable(value: () => Boolean): Self = StObject.set(x, "isInheritable", js.Any.fromFunction0(value))
    
    inline def setIsMeta(value: () => Boolean): Self = StObject.set(x, "isMeta", js.Any.fromFunction0(value))
    
    inline def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
    
    inline def setNewInstance(value: () => ITypeFacet): Self = StObject.set(x, "newInstance", js.Any.fromFunction0(value))
  }
}
