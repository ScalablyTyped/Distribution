package typings
package reactDashReconcilerLib.reactDashReconcilerMod.ReactReconcilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactContext[T] extends js.Object {
  @JSName("$$typeof")
  var $$typeof: js.Symbol | scala.Double
  var Consumer: ReactContext[T]
  var Provider: ReactProviderType[T]
  var _calculateChangedBits: (js.Function2[/* a */ T, /* b */ T, scala.Double]) | scala.Null
  // DEV only
  var _currentRenderer: js.UndefOr[js.Object | scala.Null] = js.undefined
  var _currentRenderer2: js.UndefOr[js.Object | scala.Null] = js.undefined
  var _currentValue: T
  var _currentValue2: T
  def unstable_read(): T
}

