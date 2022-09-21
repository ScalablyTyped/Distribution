package typings.ramlTypesystem.typesystemInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConstraint
  extends StObject
     with ITypeFacet {
  
  def composeWith(r: IConstraint): IConstraint
}
object IConstraint {
  
  inline def apply(
    annotations: () => js.Array[IAnnotation],
    composeWith: IConstraint => IConstraint,
    facetName: () => String,
    isConstraint: () => Boolean,
    isInheritable: () => Boolean,
    kind: () => MetaInformationKind,
    owner: () => IParsedType,
    requiredType: () => IParsedType,
    validateSelf: ITypeRegistry => IStatus,
    value: () => Any
  ): IConstraint = {
    val __obj = js.Dynamic.literal(annotations = js.Any.fromFunction0(annotations), composeWith = js.Any.fromFunction1(composeWith), facetName = js.Any.fromFunction0(facetName), isConstraint = js.Any.fromFunction0(isConstraint), isInheritable = js.Any.fromFunction0(isInheritable), kind = js.Any.fromFunction0(kind), owner = js.Any.fromFunction0(owner), requiredType = js.Any.fromFunction0(requiredType), validateSelf = js.Any.fromFunction1(validateSelf), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[IConstraint]
  }
  
  extension [Self <: IConstraint](x: Self) {
    
    inline def setComposeWith(value: IConstraint => IConstraint): Self = StObject.set(x, "composeWith", js.Any.fromFunction1(value))
  }
}
