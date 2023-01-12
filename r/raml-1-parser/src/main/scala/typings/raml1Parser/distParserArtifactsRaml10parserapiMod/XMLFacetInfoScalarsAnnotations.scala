package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLFacetInfoScalarsAnnotations extends StObject {
  
  /**
    * XMLFacetInfo.attribute annotations
    **/
  def attribute(): js.Array[AnnotationRef]
  
  /**
    * XMLFacetInfo.name annotations
    **/
  def name(): js.Array[AnnotationRef]
  
  /**
    * XMLFacetInfo.namespace annotations
    **/
  def namespace(): js.Array[AnnotationRef]
  
  /**
    * XMLFacetInfo.prefix annotations
    **/
  def prefix(): js.Array[AnnotationRef]
  
  /**
    * XMLFacetInfo.wrapped annotations
    **/
  def wrapped(): js.Array[AnnotationRef]
}
object XMLFacetInfoScalarsAnnotations {
  
  inline def apply(
    attribute: () => js.Array[AnnotationRef],
    name: () => js.Array[AnnotationRef],
    namespace: () => js.Array[AnnotationRef],
    prefix: () => js.Array[AnnotationRef],
    wrapped: () => js.Array[AnnotationRef]
  ): XMLFacetInfoScalarsAnnotations = {
    val __obj = js.Dynamic.literal(attribute = js.Any.fromFunction0(attribute), name = js.Any.fromFunction0(name), namespace = js.Any.fromFunction0(namespace), prefix = js.Any.fromFunction0(prefix), wrapped = js.Any.fromFunction0(wrapped))
    __obj.asInstanceOf[XMLFacetInfoScalarsAnnotations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XMLFacetInfoScalarsAnnotations] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "attribute", js.Any.fromFunction0(value))
    
    inline def setName(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
    
    inline def setNamespace(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "namespace", js.Any.fromFunction0(value))
    
    inline def setPrefix(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "prefix", js.Any.fromFunction0(value))
    
    inline def setWrapped(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "wrapped", js.Any.fromFunction0(value))
  }
}
