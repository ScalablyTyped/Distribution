package typings.reduxDashObservable

import typings.redux.reduxMod.Action
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashObservableMod {
  type Epic[Input /* <: Action[_] */, Output /* <: Input */, State, Dependencies] = js.Function3[
    /* action$ */ ActionsObservable[Input], 
    /* state$ */ StateObservable[State], 
    /* dependencies */ Dependencies, 
    Observable[Output]
  ]
}
