package typings.reactReconciler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactContext[T] extends js.Object {
  var Consumer: ReactContext[T]
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol | Double
  var Provider: ReactProviderType[T]
  var _calculateChangedBits: (js.Function2[/* a */ T, /* b */ T, Double]) | Null
  // DEV only
  var _currentRenderer: js.UndefOr[js.Object | Null] = js.undefined
  var _currentRenderer2: js.UndefOr[js.Object | Null] = js.undefined
  var _currentValue: T
  var _currentValue2: T
  var _threadCount: Double
  def unstable_read(): T
}

object ReactContext {
  @scala.inline
  def apply[T](
    Consumer: ReactContext[T],
    DollarDollartypeof: js.Symbol | Double,
    Provider: ReactProviderType[T],
    _currentValue: T,
    _currentValue2: T,
    _threadCount: Double,
    unstable_read: () => T,
    _calculateChangedBits: (/* a */ T, /* b */ T) => Double = null,
    _currentRenderer: js.UndefOr[Null | js.Object] = js.undefined,
    _currentRenderer2: js.UndefOr[Null | js.Object] = js.undefined
  ): ReactContext[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], _currentValue = _currentValue.asInstanceOf[js.Any], _currentValue2 = _currentValue2.asInstanceOf[js.Any], _threadCount = _threadCount.asInstanceOf[js.Any], unstable_read = js.Any.fromFunction0(unstable_read), _calculateChangedBits = js.Any.fromFunction2(_calculateChangedBits))
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    if (!js.isUndefined(_currentRenderer)) __obj.updateDynamic("_currentRenderer")(_currentRenderer.asInstanceOf[js.Any])
    if (!js.isUndefined(_currentRenderer2)) __obj.updateDynamic("_currentRenderer2")(_currentRenderer2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactContext[T]]
  }
}

