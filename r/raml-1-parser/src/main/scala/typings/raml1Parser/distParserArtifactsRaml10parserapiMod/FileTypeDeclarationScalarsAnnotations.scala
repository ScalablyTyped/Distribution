package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileTypeDeclarationScalarsAnnotations
  extends StObject
     with TypeDeclarationScalarsAnnotations {
  
  /**
    * FileTypeDeclaration.fileTypes annotations
    **/
  def fileTypes(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * FileTypeDeclaration.maxLength annotations
    **/
  def maxLength(): js.Array[AnnotationRef]
  
  /**
    * FileTypeDeclaration.minLength annotations
    **/
  def minLength(): js.Array[AnnotationRef]
}
object FileTypeDeclarationScalarsAnnotations {
  
  inline def apply(
    allowedTargets: () => js.Array[js.Array[AnnotationRef]],
    default: () => js.Array[AnnotationRef],
    description: () => js.Array[AnnotationRef],
    displayName: () => js.Array[AnnotationRef],
    fileTypes: () => js.Array[js.Array[AnnotationRef]],
    isAnnotation: () => js.Array[AnnotationRef],
    location: () => js.Array[AnnotationRef],
    locationKind: () => js.Array[AnnotationRef],
    maxLength: () => js.Array[AnnotationRef],
    minLength: () => js.Array[AnnotationRef],
    required: () => js.Array[AnnotationRef],
    schema: () => js.Array[js.Array[AnnotationRef]],
    `type`: () => js.Array[js.Array[AnnotationRef]]
  ): FileTypeDeclarationScalarsAnnotations = {
    val __obj = js.Dynamic.literal(allowedTargets = js.Any.fromFunction0(allowedTargets), default = js.Any.fromFunction0(default), description = js.Any.fromFunction0(description), displayName = js.Any.fromFunction0(displayName), fileTypes = js.Any.fromFunction0(fileTypes), isAnnotation = js.Any.fromFunction0(isAnnotation), location = js.Any.fromFunction0(location), locationKind = js.Any.fromFunction0(locationKind), maxLength = js.Any.fromFunction0(maxLength), minLength = js.Any.fromFunction0(minLength), required = js.Any.fromFunction0(required), schema = js.Any.fromFunction0(schema))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[FileTypeDeclarationScalarsAnnotations]
  }
  
  extension [Self <: FileTypeDeclarationScalarsAnnotations](x: Self) {
    
    inline def setFileTypes(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "fileTypes", js.Any.fromFunction0(value))
    
    inline def setMaxLength(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "maxLength", js.Any.fromFunction0(value))
    
    inline def setMinLength(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "minLength", js.Any.fromFunction0(value))
  }
}
