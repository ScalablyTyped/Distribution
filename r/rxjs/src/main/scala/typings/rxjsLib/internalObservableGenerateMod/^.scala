package typings
package rxjsLib.internalObservableGenerateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/generate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def generate[S](
    initialState: S,
    condition: rxjsLib.internalObservableGenerateMod.ConditionFunc[S],
    iterate: rxjsLib.internalObservableGenerateMod.IterateFunc[S]
  ): rxjsLib.internalObservableMod.Observable[S] = js.native
  def generate[S](
    initialState: S,
    condition: rxjsLib.internalObservableGenerateMod.ConditionFunc[S],
    iterate: rxjsLib.internalObservableGenerateMod.IterateFunc[S],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[S] = js.native
  def generate[S](options: rxjsLib.internalObservableGenerateMod.GenerateBaseOptions[S]): rxjsLib.internalObservableMod.Observable[S] = js.native
  def generate[T, S](
    initialState: S,
    condition: rxjsLib.internalObservableGenerateMod.ConditionFunc[S],
    iterate: rxjsLib.internalObservableGenerateMod.IterateFunc[S],
    resultSelector: rxjsLib.internalObservableGenerateMod.ResultFunc[S, T]
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
  def generate[T, S](
    initialState: S,
    condition: rxjsLib.internalObservableGenerateMod.ConditionFunc[S],
    iterate: rxjsLib.internalObservableGenerateMod.IterateFunc[S],
    resultSelector: rxjsLib.internalObservableGenerateMod.ResultFunc[S, T],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
  def generate[T, S](options: rxjsLib.internalObservableGenerateMod.GenerateOptions[T, S]): rxjsLib.internalObservableMod.Observable[T] = js.native
}

