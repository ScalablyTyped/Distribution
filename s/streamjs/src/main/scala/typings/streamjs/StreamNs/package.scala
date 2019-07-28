package typings.streamjs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object StreamNs {
  type Accumulator[T] = js.Function2[/* e1 */ T, /* e2 */ T, T]
  type Comparator[T] = js.Function2[/* e1 */ T, /* e2 */ T, Double]
  type Consumer[T] = js.Function1[/* elem */ T, Unit]
  type Function[T, U] = js.Function1[/* elem */ T, U]
  type GroupingResult[T] = StringDictionary[js.Array[T]]
  type Map[T] = StringDictionary[T]
  type Predicate[T] = js.Function1[/* elem */ T, Boolean]
  type Sample = StringDictionary[js.Any]
  type Supplier[T] = js.Function0[T]
}
