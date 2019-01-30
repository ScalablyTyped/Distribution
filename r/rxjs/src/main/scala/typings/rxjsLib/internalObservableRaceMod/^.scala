package typings
package rxjsLib.internalObservableRaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/race", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def race(observables: rxjsLib.internalObservableMod.Observable[_]*): rxjsLib.internalObservableMod.Observable[js.Object] = js.native
  def race(observables: js.Array[rxjsLib.internalObservableMod.Observable[_]]): rxjsLib.internalObservableMod.Observable[js.Object] = js.native
  def race[A, B](a: rxjsLib.internalObservableMod.Observable[A], b: rxjsLib.internalObservableMod.Observable[B]): rxjsLib.internalObservableMod.Observable[A] | rxjsLib.internalObservableMod.Observable[B] = js.native
  def race[A, B, C](
    a: rxjsLib.internalObservableMod.Observable[A],
    b: rxjsLib.internalObservableMod.Observable[B],
    c: rxjsLib.internalObservableMod.Observable[C]
  ): rxjsLib.internalObservableMod.Observable[A] | rxjsLib.internalObservableMod.Observable[B] | rxjsLib.internalObservableMod.Observable[C] = js.native
  def race[A, B, C, D](
    a: rxjsLib.internalObservableMod.Observable[A],
    b: rxjsLib.internalObservableMod.Observable[B],
    c: rxjsLib.internalObservableMod.Observable[C],
    d: rxjsLib.internalObservableMod.Observable[D]
  ): rxjsLib.internalObservableMod.Observable[A] | rxjsLib.internalObservableMod.Observable[B] | rxjsLib.internalObservableMod.Observable[C] | rxjsLib.internalObservableMod.Observable[D] = js.native
  def race[A, B, C, D, E](
    a: rxjsLib.internalObservableMod.Observable[A],
    b: rxjsLib.internalObservableMod.Observable[B],
    c: rxjsLib.internalObservableMod.Observable[C],
    d: rxjsLib.internalObservableMod.Observable[D],
    e: rxjsLib.internalObservableMod.Observable[E]
  ): rxjsLib.internalObservableMod.Observable[A] | rxjsLib.internalObservableMod.Observable[B] | rxjsLib.internalObservableMod.Observable[C] | rxjsLib.internalObservableMod.Observable[D] | rxjsLib.internalObservableMod.Observable[E] = js.native
  @JSName("race")
  def race_T[T](observables: rxjsLib.internalObservableMod.Observable[T]*): rxjsLib.internalObservableMod.Observable[T] = js.native
  @JSName("race")
  def race_T[T](observables: js.Array[rxjsLib.internalObservableMod.Observable[T]]): rxjsLib.internalObservableMod.Observable[T] = js.native
}

