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

object ReactContext {
  @scala.inline
  def apply[T](
    Consumer: ReactContext[T],
    DollarDollartypeof: js.Symbol | Double,
    Provider: ReactProviderType[T],
    _currentValue: T,
    _currentValue2: T,
    _threadCount: Double,
    unstable_read: () => T
  ): ReactContext[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], _currentValue = _currentValue.asInstanceOf[js.Any], _currentValue2 = _currentValue2.asInstanceOf[js.Any], _threadCount = _threadCount.asInstanceOf[js.Any], unstable_read = js.Any.fromFunction0(unstable_read))
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactContext[T]]
  }
  @scala.inline
  implicit class ReactContextOps[Self <: ReactContext[_], T] (val x: Self with ReactContext[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConsumer(value: ReactContext[T]): Self = this.set("Consumer", value.asInstanceOf[js.Any])
    @scala.inline
    def setDollarDollartypeof(value: js.Symbol | Double): Self = this.set("$$typeof", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvider(value: ReactProviderType[T]): Self = this.set("Provider", value.asInstanceOf[js.Any])
    @scala.inline
    def set_currentValue(value: T): Self = this.set("_currentValue", value.asInstanceOf[js.Any])
    @scala.inline
    def set_currentValue2(value: T): Self = this.set("_currentValue2", value.asInstanceOf[js.Any])
    @scala.inline
    def set_threadCount(value: Double): Self = this.set("_threadCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnstable_read(value: () => T): Self = this.set("unstable_read", js.Any.fromFunction0(value))
    @scala.inline
    def set_calculateChangedBits(value: (/* a */ T, /* b */ T) => Double): Self = this.set("_calculateChangedBits", js.Any.fromFunction2(value))
    @scala.inline
    def set_calculateChangedBitsNull: Self = this.set("_calculateChangedBits", null)
    @scala.inline
    def set_currentRenderer(value: js.Object): Self = this.set("_currentRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_currentRenderer: Self = this.set("_currentRenderer", js.undefined)
    @scala.inline
    def set_currentRendererNull: Self = this.set("_currentRenderer", null)
    @scala.inline
    def set_currentRenderer2(value: js.Object): Self = this.set("_currentRenderer2", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_currentRenderer2: Self = this.set("_currentRenderer2", js.undefined)
    @scala.inline
    def set_currentRenderer2Null: Self = this.set("_currentRenderer2", null)
  }
  
}

