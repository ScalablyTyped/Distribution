package typings
package reduxDashObservableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashObservableMod {
  type Epic[Input /* <: reduxLib.reduxMod.Action[_] */, Output /* <: Input */, State, Dependencies] = js.Function3[
    /* action$ */ ActionsObservable[Input], 
    /* state$ */ StateObservable[State], 
    /* dependencies */ Dependencies, 
    rxjsLib.rxjsMod.Observable[Output]
  ]
}
