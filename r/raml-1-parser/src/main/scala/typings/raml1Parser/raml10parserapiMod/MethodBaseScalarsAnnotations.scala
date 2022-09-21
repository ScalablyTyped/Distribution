package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodBaseScalarsAnnotations extends StObject {
  
  /**
    * MethodBase.description annotations
    **/
  def description(): js.Array[AnnotationRef]
  
  /**
    * MethodBase.displayName annotations
    **/
  def displayName(): js.Array[AnnotationRef]
  
  /**
    * MethodBase.is annotations
    **/
  def is(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * MethodBase.protocols annotations
    **/
  def protocols(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * MethodBase.securedBy annotations
    **/
  def securedBy(): js.Array[js.Array[AnnotationRef]]
}
object MethodBaseScalarsAnnotations {
  
  inline def apply(
    description: () => js.Array[AnnotationRef],
    displayName: () => js.Array[AnnotationRef],
    is: () => js.Array[js.Array[AnnotationRef]],
    protocols: () => js.Array[js.Array[AnnotationRef]],
    securedBy: () => js.Array[js.Array[AnnotationRef]]
  ): MethodBaseScalarsAnnotations = {
    val __obj = js.Dynamic.literal(description = js.Any.fromFunction0(description), displayName = js.Any.fromFunction0(displayName), is = js.Any.fromFunction0(is), protocols = js.Any.fromFunction0(protocols), securedBy = js.Any.fromFunction0(securedBy))
    __obj.asInstanceOf[MethodBaseScalarsAnnotations]
  }
  
  extension [Self <: MethodBaseScalarsAnnotations](x: Self) {
    
    inline def setDescription(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "description", js.Any.fromFunction0(value))
    
    inline def setDisplayName(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "displayName", js.Any.fromFunction0(value))
    
    inline def setIs(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "is", js.Any.fromFunction0(value))
    
    inline def setProtocols(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "protocols", js.Any.fromFunction0(value))
    
    inline def setSecuredBy(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "securedBy", js.Any.fromFunction0(value))
  }
}
