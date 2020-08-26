package typings.senchaTouch.Ext.util.translatable

import typings.senchaTouch.Ext.IEvented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IEvented {
  /** [Method] Returns the value of easing
    * @returns Object
    */
  var getEasing: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of easingX
    * @returns Object
    */
  var getEasingX: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of easingY
    * @returns Object
    */
  var getEasingY: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of useWrapper
    * @returns Object
    */
  var getUseWrapper: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of easing
    * @param easing Object The new value.
    */
  var setEasing: js.UndefOr[js.Function1[/* easing */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of easingX
    * @param easingX Object The new value.
    */
  var setEasingX: js.UndefOr[js.Function1[/* easingX */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of easingY
    * @param easingY Object The new value.
    */
  var setEasingY: js.UndefOr[js.Function1[/* easingY */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of useWrapper
    * @param useWrapper Object The new value.
    */
  var setUseWrapper: js.UndefOr[js.Function1[/* useWrapper */ js.UndefOr[js.Any], Unit]] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
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
    def setGetEasing(value: () => _): Self = this.set("getEasing", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetEasing: Self = this.set("getEasing", js.undefined)
    @scala.inline
    def setGetEasingX(value: () => _): Self = this.set("getEasingX", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetEasingX: Self = this.set("getEasingX", js.undefined)
    @scala.inline
    def setGetEasingY(value: () => _): Self = this.set("getEasingY", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetEasingY: Self = this.set("getEasingY", js.undefined)
    @scala.inline
    def setGetUseWrapper(value: () => _): Self = this.set("getUseWrapper", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUseWrapper: Self = this.set("getUseWrapper", js.undefined)
    @scala.inline
    def setSetEasing(value: /* easing */ js.UndefOr[js.Any] => Unit): Self = this.set("setEasing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetEasing: Self = this.set("setEasing", js.undefined)
    @scala.inline
    def setSetEasingX(value: /* easingX */ js.UndefOr[js.Any] => Unit): Self = this.set("setEasingX", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetEasingX: Self = this.set("setEasingX", js.undefined)
    @scala.inline
    def setSetEasingY(value: /* easingY */ js.UndefOr[js.Any] => Unit): Self = this.set("setEasingY", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetEasingY: Self = this.set("setEasingY", js.undefined)
    @scala.inline
    def setSetUseWrapper(value: /* useWrapper */ js.UndefOr[js.Any] => Unit): Self = this.set("setUseWrapper", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUseWrapper: Self = this.set("setUseWrapper", js.undefined)
  }
  
}

