package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesOperationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesTransformsGeneralMod {
  
  trait GeneralTransforms extends StObject {
    
    /**
      * Transform the editor by an operation.
      */
    def transform(editor: Editor, op: Operation): Unit
  }
  object GeneralTransforms {
    
    @JSImport("slate/dist/interfaces/transforms/general", "GeneralTransforms")
    @js.native
    val ^ : GeneralTransforms = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeneralTransforms] (val x: Self) extends AnyVal {
      
      inline def setTransform(value: (Editor, Operation) => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    }
  }
}
