package typings.reduxObservable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<S> * / any */ @JSImport("redux-observable/dist/types/StateObservable", "StateObservable")
  @js.native
  open class StateObservable[S] protected () extends StObject {
    def this(
      input$: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<S> */ Any,
      initialState: S
    ) = this()
    
    /* private */ var __notifier: Any = js.native
    
    var value: S = js.native
  }
}
