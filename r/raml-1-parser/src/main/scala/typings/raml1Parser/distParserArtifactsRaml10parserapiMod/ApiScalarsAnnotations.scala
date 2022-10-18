package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiScalarsAnnotations extends StObject {
  
  /**
    * Api.baseUri annotations
    **/
  def baseUri(): js.Array[AnnotationRef]
  
  /**
    * Api.description annotations
    **/
  def description(): js.Array[AnnotationRef]
  
  /**
    * Api.mediaType annotations
    **/
  def mediaType(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * Api.protocols annotations
    **/
  def protocols(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * Api.securedBy annotations
    **/
  def securedBy(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * Api.title annotations
    **/
  def title(): js.Array[AnnotationRef]
  
  /**
    * Api.version annotations
    **/
  def version(): js.Array[AnnotationRef]
}
object ApiScalarsAnnotations {
  
  inline def apply(
    baseUri: () => js.Array[AnnotationRef],
    description: () => js.Array[AnnotationRef],
    mediaType: () => js.Array[js.Array[AnnotationRef]],
    protocols: () => js.Array[js.Array[AnnotationRef]],
    securedBy: () => js.Array[js.Array[AnnotationRef]],
    title: () => js.Array[AnnotationRef],
    version: () => js.Array[AnnotationRef]
  ): ApiScalarsAnnotations = {
    val __obj = js.Dynamic.literal(baseUri = js.Any.fromFunction0(baseUri), description = js.Any.fromFunction0(description), mediaType = js.Any.fromFunction0(mediaType), protocols = js.Any.fromFunction0(protocols), securedBy = js.Any.fromFunction0(securedBy), title = js.Any.fromFunction0(title), version = js.Any.fromFunction0(version))
    __obj.asInstanceOf[ApiScalarsAnnotations]
  }
  
  extension [Self <: ApiScalarsAnnotations](x: Self) {
    
    inline def setBaseUri(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "baseUri", js.Any.fromFunction0(value))
    
    inline def setDescription(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "description", js.Any.fromFunction0(value))
    
    inline def setMediaType(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "mediaType", js.Any.fromFunction0(value))
    
    inline def setProtocols(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "protocols", js.Any.fromFunction0(value))
    
    inline def setSecuredBy(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "securedBy", js.Any.fromFunction0(value))
    
    inline def setTitle(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
    
    inline def setVersion(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "version", js.Any.fromFunction0(value))
  }
}
