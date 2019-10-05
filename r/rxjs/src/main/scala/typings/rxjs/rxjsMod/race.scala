package typings.rxjs.rxjsMod

import typings.rxjs.internalTypesMod.ObservableInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "race")
@js.native
object race extends js.Object {
  def apply(arg: js.Array[ObservableInput[_]]): typings.rxjs.internalObservableMod.Observable[js.Object] = js.native
  def apply(observables: ObservableInput[_]*): typings.rxjs.internalObservableMod.Observable[js.Object] = js.native
  def apply[A](a: ObservableInput[A]): typings.rxjs.internalObservableMod.Observable[A] = js.native
  def apply[A, B](arg: js.Tuple2[ObservableInput[A], ObservableInput[B]]): typings.rxjs.internalObservableMod.Observable[A | B] = js.native
  def apply[A, B](a: ObservableInput[A], b: ObservableInput[B]): typings.rxjs.internalObservableMod.Observable[A | B] = js.native
  def apply[A, B, C](arg: js.Tuple3[ObservableInput[A], ObservableInput[B], ObservableInput[C]]): typings.rxjs.internalObservableMod.Observable[A | B | C] = js.native
  def apply[A, B, C](a: ObservableInput[A], b: ObservableInput[B], c: ObservableInput[C]): typings.rxjs.internalObservableMod.Observable[A | B | C] = js.native
  def apply[A, B, C, D](arg: js.Tuple4[ObservableInput[A], ObservableInput[B], ObservableInput[C], ObservableInput[D]]): typings.rxjs.internalObservableMod.Observable[A | B | C | D] = js.native
  def apply[A, B, C, D](a: ObservableInput[A], b: ObservableInput[B], c: ObservableInput[C], d: ObservableInput[D]): typings.rxjs.internalObservableMod.Observable[A | B | C | D] = js.native
  def apply[A, B, C, D, E](
    arg: js.Tuple5[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E]
    ]
  ): typings.rxjs.internalObservableMod.Observable[A | B | C | D | E] = js.native
  def apply[A, B, C, D, E](
    a: ObservableInput[A],
    b: ObservableInput[B],
    c: ObservableInput[C],
    d: ObservableInput[D],
    e: ObservableInput[E]
  ): typings.rxjs.internalObservableMod.Observable[A | B | C | D | E] = js.native
}

