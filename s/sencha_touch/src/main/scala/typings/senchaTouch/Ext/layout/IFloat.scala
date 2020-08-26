package typings.senchaTouch.Ext.layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFloat extends IDefault {
  /** [Method] Returns the value of direction
    * @returns String
    */
  var getDirection: js.UndefOr[js.Function0[String]] = js.native
  /** [Method]
    * @param item Object
    * @param isInner Object
    */
  @JSName("onItemInnerStateChange")
  var onItemInnerStateChange_IFloat: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* isInner */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Sets the value of direction
    * @param direction String The new value.
    */
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.native
}

object IFloat {
  @scala.inline
  def apply(): IFloat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFloat]
  }
  @scala.inline
  implicit class IFloatOps[Self <: IFloat] (val x: Self) extends AnyVal {
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
    def setOnItemInnerStateChange(value: (/* item */ js.UndefOr[js.Any], /* isInner */ js.UndefOr[js.Any]) => Unit): Self = this.set("onItemInnerStateChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnItemInnerStateChange: Self = this.set("onItemInnerStateChange", js.undefined)
    @scala.inline
    def setSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = this.set("setDirection", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDirection: Self = this.set("setDirection", js.undefined)
  }
  
}

