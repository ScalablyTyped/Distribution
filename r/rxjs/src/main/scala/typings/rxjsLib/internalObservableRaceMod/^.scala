package typings
package rxjsLib.internalObservableRaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/race", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def race(arg: js.Array[rxjsLib.internalTypesMod.ObservableInput[_]]): rxjsLib.internalObservableMod.Observable[js.Object] = js.native
  def race(observables: rxjsLib.internalTypesMod.ObservableInput[_]*): rxjsLib.internalObservableMod.Observable[js.Object] = js.native
  def race[A](a: rxjsLib.internalTypesMod.ObservableInput[A]): rxjsLib.internalObservableMod.Observable[A] = js.native
  def race[A, B](
    arg: js.Tuple2[
      rxjsLib.internalTypesMod.ObservableInput[A], 
      rxjsLib.internalTypesMod.ObservableInput[B]
    ]
  ): rxjsLib.internalObservableMod.Observable[A | B] = js.native
  def race[A, B](a: rxjsLib.internalTypesMod.ObservableInput[A], b: rxjsLib.internalTypesMod.ObservableInput[B]): rxjsLib.internalObservableMod.Observable[A | B] = js.native
  def race[A, B, C](
    arg: js.Tuple3[
      rxjsLib.internalTypesMod.ObservableInput[A], 
      rxjsLib.internalTypesMod.ObservableInput[B], 
      rxjsLib.internalTypesMod.ObservableInput[C]
    ]
  ): rxjsLib.internalObservableMod.Observable[A | B | C] = js.native
  def race[A, B, C](
    a: rxjsLib.internalTypesMod.ObservableInput[A],
    b: rxjsLib.internalTypesMod.ObservableInput[B],
    c: rxjsLib.internalTypesMod.ObservableInput[C]
  ): rxjsLib.internalObservableMod.Observable[A | B | C] = js.native
  def race[A, B, C, D](
    arg: js.Tuple4[
      rxjsLib.internalTypesMod.ObservableInput[A], 
      rxjsLib.internalTypesMod.ObservableInput[B], 
      rxjsLib.internalTypesMod.ObservableInput[C], 
      rxjsLib.internalTypesMod.ObservableInput[D]
    ]
  ): rxjsLib.internalObservableMod.Observable[A | B | C | D] = js.native
  def race[A, B, C, D](
    a: rxjsLib.internalTypesMod.ObservableInput[A],
    b: rxjsLib.internalTypesMod.ObservableInput[B],
    c: rxjsLib.internalTypesMod.ObservableInput[C],
    d: rxjsLib.internalTypesMod.ObservableInput[D]
  ): rxjsLib.internalObservableMod.Observable[A | B | C | D] = js.native
  def race[A, B, C, D, E](
    arg: js.Tuple5[
      rxjsLib.internalTypesMod.ObservableInput[A], 
      rxjsLib.internalTypesMod.ObservableInput[B], 
      rxjsLib.internalTypesMod.ObservableInput[C], 
      rxjsLib.internalTypesMod.ObservableInput[D], 
      rxjsLib.internalTypesMod.ObservableInput[E]
    ]
  ): rxjsLib.internalObservableMod.Observable[A | B | C | D | E] = js.native
  def race[A, B, C, D, E](
    a: rxjsLib.internalTypesMod.ObservableInput[A],
    b: rxjsLib.internalTypesMod.ObservableInput[B],
    c: rxjsLib.internalTypesMod.ObservableInput[C],
    d: rxjsLib.internalTypesMod.ObservableInput[D],
    e: rxjsLib.internalTypesMod.ObservableInput[E]
  ): rxjsLib.internalObservableMod.Observable[A | B | C | D | E] = js.native
  @JSName("race")
  def race_A[A](arg: js.Array[rxjsLib.internalTypesMod.ObservableInput[A]]): rxjsLib.internalObservableMod.Observable[A] = js.native
  @JSName("race")
  def race_T[T](arg: js.Array[rxjsLib.internalTypesMod.ObservableInput[T]]): rxjsLib.internalObservableMod.Observable[T] = js.native
  @JSName("race")
  def race_T[T](observables: rxjsLib.internalTypesMod.ObservableInput[T]*): rxjsLib.internalObservableMod.Observable[T] = js.native
}

