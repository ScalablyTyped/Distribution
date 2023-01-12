package typings.ramlTypesystem.distSrcTypesystemInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnnotation
  extends StObject
     with ITypeFacet {
  
  /**
    * Annotation definition type
    */
  def definition(): IParsedType
  
  /**
    * Annotation name
    */
  def name(): String
  
  /**
    * Returns owner facet for annotations applied to facets
    */
  def ownerFacet(): ITypeFacet
}
object IAnnotation {
  
  inline def apply(
    annotations: () => js.Array[IAnnotation],
    definition: () => IParsedType,
    facetName: () => String,
    isConstraint: () => Boolean,
    isInheritable: () => Boolean,
    kind: () => MetaInformationKind,
    name: () => String,
    owner: () => IParsedType,
    ownerFacet: () => ITypeFacet,
    requiredType: () => IParsedType,
    validateSelf: ITypeRegistry => IStatus,
    value: () => Any
  ): IAnnotation = {
    val __obj = js.Dynamic.literal(annotations = js.Any.fromFunction0(annotations), definition = js.Any.fromFunction0(definition), facetName = js.Any.fromFunction0(facetName), isConstraint = js.Any.fromFunction0(isConstraint), isInheritable = js.Any.fromFunction0(isInheritable), kind = js.Any.fromFunction0(kind), name = js.Any.fromFunction0(name), owner = js.Any.fromFunction0(owner), ownerFacet = js.Any.fromFunction0(ownerFacet), requiredType = js.Any.fromFunction0(requiredType), validateSelf = js.Any.fromFunction1(validateSelf), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[IAnnotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAnnotation] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: () => IParsedType): Self = StObject.set(x, "definition", js.Any.fromFunction0(value))
    
    inline def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
    
    inline def setOwnerFacet(value: () => ITypeFacet): Self = StObject.set(x, "ownerFacet", js.Any.fromFunction0(value))
  }
}
