package typings.senchaTouch.Ext.fx.layout.card

import typings.senchaTouch.Ext.IEvented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IEvented {
  /** [Method] Returns the value of direction
    * @returns String
    */
  var getDirection: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of duration
    * @returns Object
    */
  var getDuration: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of layout
    * @returns Object
    */
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of reverse
    * @returns Object
    */
  var getReverse: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of direction
    * @param direction String The new value.
    */
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of duration
    * @param duration Object The new value.
    */
  var setDuration: js.UndefOr[js.Function1[/* duration */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of layout
    * @param layout Object The new value.
    */
  var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of reverse
    * @param reverse Object The new value.
    */
  var setReverse: js.UndefOr[js.Function1[/* reverse */ js.UndefOr[js.Any], Unit]] = js.native
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
    def setGetDirection(value: () => String): Self = this.set("getDirection", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDirection: Self = this.set("getDirection", js.undefined)
    @scala.inline
    def setGetDuration(value: () => _): Self = this.set("getDuration", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDuration: Self = this.set("getDuration", js.undefined)
    @scala.inline
    def setGetLayout(value: () => _): Self = this.set("getLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLayout: Self = this.set("getLayout", js.undefined)
    @scala.inline
    def setGetReverse(value: () => _): Self = this.set("getReverse", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetReverse: Self = this.set("getReverse", js.undefined)
    @scala.inline
    def setSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = this.set("setDirection", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDirection: Self = this.set("setDirection", js.undefined)
    @scala.inline
    def setSetDuration(value: /* duration */ js.UndefOr[js.Any] => Unit): Self = this.set("setDuration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDuration: Self = this.set("setDuration", js.undefined)
    @scala.inline
    def setSetLayout(value: /* layout */ js.UndefOr[js.Any] => Unit): Self = this.set("setLayout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLayout: Self = this.set("setLayout", js.undefined)
    @scala.inline
    def setSetReverse(value: /* reverse */ js.UndefOr[js.Any] => Unit): Self = this.set("setReverse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetReverse: Self = this.set("setReverse", js.undefined)
  }
  
}

