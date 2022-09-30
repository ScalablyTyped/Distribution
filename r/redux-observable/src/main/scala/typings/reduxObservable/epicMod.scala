package typings.reduxObservable

import typings.redux.mod.Action
import typings.reduxObservable.stateObservableMod.StateObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object epicMod {
  
  type Epic[Input /* <: Action[Any] */, Output /* <: Input */, State, Dependencies] = js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<Input> */ /* action$ */ Any, 
    /* state$ */ StateObservable[State], 
    /* dependencies */ Dependencies, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<Output> */ Any
  ]
}
