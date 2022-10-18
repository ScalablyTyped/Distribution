package typings.reduxObservable

import typings.redux.mod.Action
import typings.reduxObservable.distTypesStateObservableMod.StateObservable
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEpicMod {
  
  type Epic[Input /* <: Action[Any] */, Output /* <: Input */, State, Dependencies] = js.Function3[
    /* action$ */ Observable_[Input], 
    /* state$ */ StateObservable[State], 
    /* dependencies */ Dependencies, 
    Observable_[Output]
  ]
}
