package typings.reactSketchapp.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchContext extends StObject {
  
  var document: SketchDocument
}
object SketchContext {
  
  @scala.inline
  def apply(document: SketchDocument): SketchContext = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchContext]
  }
  
  @scala.inline
  implicit class SketchContextMutableBuilder[Self <: SketchContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: SketchDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
  }
}
