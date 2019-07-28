package typings.rxjs.internalObservableGenerateMod

import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateBaseOptions[S] extends js.Object {
  /**
    * Condition function that accepts state and returns boolean.
    * When it returns false, the generator stops.
    * If not specified, a generator never stops.
    */
  var condition: js.UndefOr[ConditionFunc[S]] = js.native
  /**
    * Initial state.
    */
  var initialState: S = js.native
  /**
    * Iterate function that accepts state and returns new state.
    */
  @JSName("iterate")
  var iterate_Original: IterateFunc[S] = js.native
  /**
    * SchedulerLike to use for generation process.
    * By default, a generator starts immediately.
    */
  var scheduler: js.UndefOr[SchedulerLike] = js.native
  /**
    * Iterate function that accepts state and returns new state.
    */
  def iterate(state: S): S = js.native
}

