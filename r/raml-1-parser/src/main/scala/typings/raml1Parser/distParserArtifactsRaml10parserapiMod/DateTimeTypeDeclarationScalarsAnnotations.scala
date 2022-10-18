package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeTypeDeclarationScalarsAnnotations
  extends StObject
     with TypeDeclarationScalarsAnnotations {
  
  /**
    * DateTimeTypeDeclaration.format annotations
    **/
  def format(): js.Array[AnnotationRef]
}
object DateTimeTypeDeclarationScalarsAnnotations {
  
  inline def apply(
    allowedTargets: () => js.Array[js.Array[AnnotationRef]],
    default: () => js.Array[AnnotationRef],
    description: () => js.Array[AnnotationRef],
    displayName: () => js.Array[AnnotationRef],
    format: () => js.Array[AnnotationRef],
    isAnnotation: () => js.Array[AnnotationRef],
    location: () => js.Array[AnnotationRef],
    locationKind: () => js.Array[AnnotationRef],
    required: () => js.Array[AnnotationRef],
    schema: () => js.Array[js.Array[AnnotationRef]],
    `type`: () => js.Array[js.Array[AnnotationRef]]
  ): DateTimeTypeDeclarationScalarsAnnotations = {
    val __obj = js.Dynamic.literal(allowedTargets = js.Any.fromFunction0(allowedTargets), default = js.Any.fromFunction0(default), description = js.Any.fromFunction0(description), displayName = js.Any.fromFunction0(displayName), format = js.Any.fromFunction0(format), isAnnotation = js.Any.fromFunction0(isAnnotation), location = js.Any.fromFunction0(location), locationKind = js.Any.fromFunction0(locationKind), required = js.Any.fromFunction0(required), schema = js.Any.fromFunction0(schema))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[DateTimeTypeDeclarationScalarsAnnotations]
  }
  
  extension [Self <: DateTimeTypeDeclarationScalarsAnnotations](x: Self) {
    
    inline def setFormat(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "format", js.Any.fromFunction0(value))
  }
}
