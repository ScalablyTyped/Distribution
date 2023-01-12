package typings.ramlTypesystem.distSrcTypesystemInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITypeFacet extends StObject {
  
  /**
    * Annotations applied to the facet
    */
  def annotations(): js.Array[IAnnotation]
  
  /**
    * name of the facet
    */
  def facetName(): String
  
  def isConstraint(): Boolean
  
  /**
    * return true if this facet is inheritable
    */
  def isInheritable(): Boolean
  
  /**
    * Returns kind of meta-information this instance represents.
    */
  def kind(): MetaInformationKind
  
  /**
    * returns a type to which this facet  belongs
    */
  def owner(): IParsedType
  
  /**
    * broadest type to which this facet can be added
    */
  def requiredType(): IParsedType
  
  /**
    * validates if the facet is configured properly
    * @param registry
    */
  def validateSelf(registry: ITypeRegistry): IStatus
  
  /**
    * returns value associated with the facet
    */
  def value(): Any
}
object ITypeFacet {
  
  inline def apply(
    annotations: () => js.Array[IAnnotation],
    facetName: () => String,
    isConstraint: () => Boolean,
    isInheritable: () => Boolean,
    kind: () => MetaInformationKind,
    owner: () => IParsedType,
    requiredType: () => IParsedType,
    validateSelf: ITypeRegistry => IStatus,
    value: () => Any
  ): ITypeFacet = {
    val __obj = js.Dynamic.literal(annotations = js.Any.fromFunction0(annotations), facetName = js.Any.fromFunction0(facetName), isConstraint = js.Any.fromFunction0(isConstraint), isInheritable = js.Any.fromFunction0(isInheritable), kind = js.Any.fromFunction0(kind), owner = js.Any.fromFunction0(owner), requiredType = js.Any.fromFunction0(requiredType), validateSelf = js.Any.fromFunction1(validateSelf), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[ITypeFacet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITypeFacet] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: () => js.Array[IAnnotation]): Self = StObject.set(x, "annotations", js.Any.fromFunction0(value))
    
    inline def setFacetName(value: () => String): Self = StObject.set(x, "facetName", js.Any.fromFunction0(value))
    
    inline def setIsConstraint(value: () => Boolean): Self = StObject.set(x, "isConstraint", js.Any.fromFunction0(value))
    
    inline def setIsInheritable(value: () => Boolean): Self = StObject.set(x, "isInheritable", js.Any.fromFunction0(value))
    
    inline def setKind(value: () => MetaInformationKind): Self = StObject.set(x, "kind", js.Any.fromFunction0(value))
    
    inline def setOwner(value: () => IParsedType): Self = StObject.set(x, "owner", js.Any.fromFunction0(value))
    
    inline def setRequiredType(value: () => IParsedType): Self = StObject.set(x, "requiredType", js.Any.fromFunction0(value))
    
    inline def setValidateSelf(value: ITypeRegistry => IStatus): Self = StObject.set(x, "validateSelf", js.Any.fromFunction1(value))
    
    inline def setValue(value: () => Any): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
  }
}
