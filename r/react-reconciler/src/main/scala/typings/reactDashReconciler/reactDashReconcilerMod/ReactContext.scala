package typings.reactDashReconciler.reactDashReconcilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactContext[T] extends js.Object {
  @JSName("$$typeof")
  var $$typeof: js.Symbol | Double
  var Consumer: ReactContext[T]
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
    $$typeof: js.Symbol | Double,
    Consumer: ReactContext[T],
    Provider: ReactProviderType[T],
    _currentValue: T,
    _currentValue2: T,
    _threadCount: Double,
    unstable_read: () => T,
    _calculateChangedBits: (/* a */ T, /* b */ T) => Double = null,
    _currentRenderer: js.Object = null,
    _currentRenderer2: js.Object = null
  ): ReactContext[T] = {
    val __obj = js.Dynamic.literal($$typeof = $$typeof.asInstanceOf[js.Any], Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], _currentValue = _currentValue.asInstanceOf[js.Any], _currentValue2 = _currentValue2.asInstanceOf[js.Any], _threadCount = _threadCount.asInstanceOf[js.Any], unstable_read = js.Any.fromFunction0(unstable_read))
    if (_calculateChangedBits != null) __obj.updateDynamic("_calculateChangedBits")(js.Any.fromFunction2(_calculateChangedBits))
    if (_currentRenderer != null) __obj.updateDynamic("_currentRenderer")(_currentRenderer.asInstanceOf[js.Any])
    if (_currentRenderer2 != null) __obj.updateDynamic("_currentRenderer2")(_currentRenderer2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactContext[T]]
  }
}

