package typings.reactSketchapp.moduleTypesMod

import typings.reactSketchapp.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchContext extends StObject {
  
  var actionContext: `2`
  
  var document: SketchDocument
}
object SketchContext {
  
  inline def apply(actionContext: `2`, document: SketchDocument): SketchContext = {
    val __obj = js.Dynamic.literal(actionContext = actionContext.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchContext]
  }
  
  extension [Self <: SketchContext](x: Self) {
    
    inline def setActionContext(value: `2`): Self = StObject.set(x, "actionContext", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: SketchDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
  }
}
