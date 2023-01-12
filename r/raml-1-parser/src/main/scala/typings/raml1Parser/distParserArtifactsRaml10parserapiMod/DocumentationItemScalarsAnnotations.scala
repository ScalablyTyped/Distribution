package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentationItemScalarsAnnotations extends StObject {
  
  /**
    * DocumentationItem.content annotations
    **/
  def content(): js.Array[AnnotationRef]
  
  /**
    * DocumentationItem.title annotations
    **/
  def title(): js.Array[AnnotationRef]
}
object DocumentationItemScalarsAnnotations {
  
  inline def apply(content: () => js.Array[AnnotationRef], title: () => js.Array[AnnotationRef]): DocumentationItemScalarsAnnotations = {
    val __obj = js.Dynamic.literal(content = js.Any.fromFunction0(content), title = js.Any.fromFunction0(title))
    __obj.asInstanceOf[DocumentationItemScalarsAnnotations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentationItemScalarsAnnotations] (val x: Self) extends AnyVal {
    
    inline def setContent(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
    
    inline def setTitle(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
  }
}
