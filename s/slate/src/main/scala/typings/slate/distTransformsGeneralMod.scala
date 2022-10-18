package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesOperationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformsGeneralMod {
  
  trait GeneralTransforms extends StObject {
    
    def transform(editor: Editor, op: Operation): Unit
  }
  object GeneralTransforms {
    
    @JSImport("slate/dist/transforms/general", "GeneralTransforms")
    @js.native
    val ^ : GeneralTransforms = js.native
    
    extension [Self <: GeneralTransforms](x: Self) {
      
      inline def setTransform(value: (Editor, Operation) => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    }
  }
}
