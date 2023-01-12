package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LibraryScalarsAnnotations extends StObject {
  
  /**
    * Library.usage annotations
    **/
  def usage(): js.Array[AnnotationRef]
}
object LibraryScalarsAnnotations {
  
  inline def apply(usage: () => js.Array[AnnotationRef]): LibraryScalarsAnnotations = {
    val __obj = js.Dynamic.literal(usage = js.Any.fromFunction0(usage))
    __obj.asInstanceOf[LibraryScalarsAnnotations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LibraryScalarsAnnotations] (val x: Self) extends AnyVal {
    
    inline def setUsage(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "usage", js.Any.fromFunction0(value))
  }
}
