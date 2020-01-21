package typings.reactReconciler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactContext[T] extends js.Object {
  var Consumer: ReactContext[T] = js.native
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol | Double = js.native
  var Provider: ReactProviderType[T] = js.native
  var _calculateChangedBits: (js.Function2[/* a */ T, /* b */ T, Double]) | Null = js.native
  // DEV only
  var _currentRenderer: js.UndefOr[js.Object | Null] = js.native
  var _currentRenderer2: js.UndefOr[js.Object | Null] = js.native
  var _currentValue: T = js.native
  var _currentValue2: T = js.native
  var _threadCount: Double = js.native
  def unstable_read(): T = js.native
}

