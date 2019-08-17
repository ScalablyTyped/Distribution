package typings.reduxDashObservable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashObservableMod {
  import typings.redux.reduxMod.Action
  import typings.rxjs.rxjsMod.Observable

  type Epic[Input /* <: Action[_] */, Output /* <: Input */, State, Dependencies] = js.Function3[
    /* action$ */ ActionsObservable[Input], 
    /* state$ */ StateObservable[State], 
    /* dependencies */ Dependencies, 
    Observable[Output]
  ]
}
