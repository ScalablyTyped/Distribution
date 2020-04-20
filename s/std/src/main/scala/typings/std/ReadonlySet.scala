package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadonlySet[T] extends js.Object {
  /** Iterates over values in the set. */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[T]] = js.native
  val size: Double = js.native
  /**
    * Returns an iterable of [v,v] pairs for every value `v` in the set.
    */
  def entries(): IterableIterator[js.Tuple2[T, T]] = js.native
  def forEach(callbackfn: js.Function3[/* value */ T, /* value2 */ T, /* set */ ReadonlySet[T], Unit]): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ T, /* value2 */ T, /* set */ ReadonlySet[T], Unit],
    thisArg: js.Any
  ): Unit = js.native
  def has(value: T): scala.Boolean = js.native
  /**
    * Despite its name, returns an iterable of the values in the set,
    */
  def keys(): IterableIterator[T] = js.native
  /**
    * Returns an iterable of values in the set.
    */
  def values(): IterableIterator[T] = js.native
}

