package typings.senchaTouch.Ext.util.translatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDom extends IAbstract {
  /** [Method] Returns the value of element
    * @returns Object
    */
  var getElement: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of element
    * @param element Object The new value.
    */
  var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Unit]] = js.native
}

object IDom {
  @scala.inline
  def apply(): IDom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDom]
  }
  @scala.inline
  implicit class IDomOps[Self <: IDom] (val x: Self) extends AnyVal {
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
    def setGetElement(value: () => _): Self = this.set("getElement", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetElement: Self = this.set("getElement", js.undefined)
    @scala.inline
    def setSetElement(value: /* element */ js.UndefOr[js.Any] => Unit): Self = this.set("setElement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetElement: Self = this.set("setElement", js.undefined)
  }
  
}

