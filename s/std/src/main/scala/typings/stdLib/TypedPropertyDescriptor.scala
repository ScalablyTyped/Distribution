package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedPropertyDescriptor[T] extends js.Object {
  var configurable: js.UndefOr[scala.Boolean] = js.undefined
  var enumerable: js.UndefOr[scala.Boolean] = js.undefined
  var get: js.UndefOr[js.Function0[T]] = js.undefined
  var set: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
  var value: js.UndefOr[T] = js.undefined
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}

