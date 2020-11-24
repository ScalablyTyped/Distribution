package typings.reduxObservable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Epic[Input /* <: typings.redux.mod.Action[_] */, Output /* <: Input */, State, Dependencies] = js.Function3[
    /* action$ */ typings.reduxObservable.mod.ActionsObservable[Input], 
    /* state$ */ typings.reduxObservable.mod.StateObservable[State], 
    /* dependencies */ Dependencies, 
    typings.rxjs.mod.Observable_[Output]
  ]
}
