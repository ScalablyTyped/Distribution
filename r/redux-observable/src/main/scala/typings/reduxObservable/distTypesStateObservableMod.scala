package typings.reduxObservable

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStateObservableMod {
  
  @JSImport("redux-observable/dist/types/StateObservable", "StateObservable")
  @js.native
  open class StateObservable[S] protected () extends Observable_[S] {
    def this(input$: Observable_[S], initialState: S) = this()
    
    /* private */ var __notifier: Any = js.native
    
    var value: S = js.native
  }
}
