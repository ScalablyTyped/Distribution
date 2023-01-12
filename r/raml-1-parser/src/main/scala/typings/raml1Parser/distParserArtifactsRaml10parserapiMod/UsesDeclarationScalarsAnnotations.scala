package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsesDeclarationScalarsAnnotations extends StObject {
  
  /**
    * UsesDeclaration.value annotations
    **/
  def value(): js.Array[AnnotationRef]
}
object UsesDeclarationScalarsAnnotations {
  
  inline def apply(value: () => js.Array[AnnotationRef]): UsesDeclarationScalarsAnnotations = {
    val __obj = js.Dynamic.literal(value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[UsesDeclarationScalarsAnnotations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsesDeclarationScalarsAnnotations] (val x: Self) extends AnyVal {
    
    inline def setValue(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
  }
}
