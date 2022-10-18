package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayScalarsAnnotations
  extends StObject
     with ApiScalarsAnnotations {
  
  /**
    * Overlay.extends annotations
    **/
  def `extends`(): js.Array[AnnotationRef]
  
  /**
    * Overlay.usage annotations
    **/
  def usage(): js.Array[AnnotationRef]
}
object OverlayScalarsAnnotations {
  
  inline def apply(
    baseUri: () => js.Array[AnnotationRef],
    description: () => js.Array[AnnotationRef],
    `extends`: () => js.Array[AnnotationRef],
    mediaType: () => js.Array[js.Array[AnnotationRef]],
    protocols: () => js.Array[js.Array[AnnotationRef]],
    securedBy: () => js.Array[js.Array[AnnotationRef]],
    title: () => js.Array[AnnotationRef],
    usage: () => js.Array[AnnotationRef],
    version: () => js.Array[AnnotationRef]
  ): OverlayScalarsAnnotations = {
    val __obj = js.Dynamic.literal(baseUri = js.Any.fromFunction0(baseUri), description = js.Any.fromFunction0(description), mediaType = js.Any.fromFunction0(mediaType), protocols = js.Any.fromFunction0(protocols), securedBy = js.Any.fromFunction0(securedBy), title = js.Any.fromFunction0(title), usage = js.Any.fromFunction0(usage), version = js.Any.fromFunction0(version))
    __obj.updateDynamic("extends")(js.Any.fromFunction0(`extends`))
    __obj.asInstanceOf[OverlayScalarsAnnotations]
  }
  
  extension [Self <: OverlayScalarsAnnotations](x: Self) {
    
    inline def setExtends(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "extends", js.Any.fromFunction0(value))
    
    inline def setUsage(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "usage", js.Any.fromFunction0(value))
  }
}
