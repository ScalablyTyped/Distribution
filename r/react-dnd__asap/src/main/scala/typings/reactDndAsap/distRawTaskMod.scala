package typings.reactDndAsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRawTaskMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task * / any */ @JSImport("@react-dnd/asap/dist/RawTask", "RawTask")
  @js.native
  open class RawTask protected () extends StObject {
    def this(onError: js.Function1[/* err */ Any, Unit], release: js.Function1[/* t */ RawTask, Unit]) = this()
    
    def call(): Unit = js.native
    
    /* private */ var onError: Any = js.native
    
    /* private */ var release: Any = js.native
    
    var task: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskFn */ Any) | Null = js.native
  }
}
