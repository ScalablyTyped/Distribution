package typings.senchaTouch.Ext.scroll.indicator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICssTransform extends IAbstract {
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_ICssTransform: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_ICssTransform: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
}

object ICssTransform {
  @scala.inline
  def apply(): ICssTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICssTransform]
  }
  @scala.inline
  implicit class ICssTransformOps[Self <: ICssTransform] (val x: Self) extends AnyVal {
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
    def setGetCls(value: () => String): Self = this.set("getCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCls: Self = this.set("getCls", js.undefined)
    @scala.inline
    def setSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = this.set("setCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCls: Self = this.set("setCls", js.undefined)
  }
  
}

