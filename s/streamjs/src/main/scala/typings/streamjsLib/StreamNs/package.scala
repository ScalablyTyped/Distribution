package typings
package streamjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object StreamNs {
  type Accumulator[T] = js.Function2[/* e1 */ T, /* e2 */ T, T]
  type Comparator[T] = js.Function2[/* e1 */ T, /* e2 */ T, scala.Double]
  type Consumer[T] = js.Function1[/* elem */ T, scala.Unit]
  type Function[T, U] = js.Function1[/* elem */ T, U]
  type Predicate[T] = js.Function1[/* elem */ T, scala.Boolean]
  type Supplier[T] = js.Function0[T]
}
