package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMenu extends ISheet {
  /** [Method] Only fire the hide event if it is initialized */
  var doSetHidden: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of bottom
    * @returns Number
    */
  @JSName("getBottom")
  var getBottom_IMenu: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of height
    * @returns String
    */
  @JSName("getHeight")
  var getHeight_IMenu: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of left
    * @returns Number
    */
  @JSName("getLeft")
  var getLeft_IMenu: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of right
    * @returns Number
    */
  @JSName("getRight")
  var getRight_IMenu: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of width
    * @returns String
    */
  @JSName("getWidth")
  var getWidth_IMenu: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Sets the value of bottom
    * @param bottom Number The new value.
    */
  @JSName("setBottom")
  var setBottom_IMenu: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of height
    * @param height String The new value.
    */
  @JSName("setHeight")
  var setHeight_IMenu: js.UndefOr[js.Function1[/* height */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of left
    * @param left Number The new value.
    */
  @JSName("setLeft")
  var setLeft_IMenu: js.UndefOr[js.Function1[/* left */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of right
    * @param right Number The new value.
    */
  @JSName("setRight")
  var setRight_IMenu: js.UndefOr[js.Function1[/* right */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of width
    * @param width String The new value.
    */
  @JSName("setWidth")
  var setWidth_IMenu: js.UndefOr[js.Function1[/* width */ js.UndefOr[java.lang.String], Unit]] = js.native
}

object IMenu {
  @scala.inline
  def apply(): IMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenu]
  }
  @scala.inline
  implicit class IMenuOps[Self <: IMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDoSetHidden(value: () => Unit): Self = this.set("doSetHidden", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDoSetHidden: Self = this.set("doSetHidden", js.undefined)
    @scala.inline
    def setGetBottom(value: () => Double): Self = this.set("getBottom", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBottom: Self = this.set("getBottom", js.undefined)
    @scala.inline
    def setGetHeight(value: () => java.lang.String): Self = this.set("getHeight", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetHeight: Self = this.set("getHeight", js.undefined)
    @scala.inline
    def setGetLeft(value: () => Double): Self = this.set("getLeft", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLeft: Self = this.set("getLeft", js.undefined)
    @scala.inline
    def setGetRight(value: () => Double): Self = this.set("getRight", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRight: Self = this.set("getRight", js.undefined)
    @scala.inline
    def setGetWidth(value: () => java.lang.String): Self = this.set("getWidth", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetWidth: Self = this.set("getWidth", js.undefined)
    @scala.inline
    def setSetBottom(value: /* bottom */ js.UndefOr[Double] => Unit): Self = this.set("setBottom", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBottom: Self = this.set("setBottom", js.undefined)
    @scala.inline
    def setSetHeight(value: /* height */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setHeight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetHeight: Self = this.set("setHeight", js.undefined)
    @scala.inline
    def setSetLeft(value: /* left */ js.UndefOr[Double] => Unit): Self = this.set("setLeft", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLeft: Self = this.set("setLeft", js.undefined)
    @scala.inline
    def setSetRight(value: /* right */ js.UndefOr[Double] => Unit): Self = this.set("setRight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRight: Self = this.set("setRight", js.undefined)
    @scala.inline
    def setSetWidth(value: /* width */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setWidth", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetWidth: Self = this.set("setWidth", js.undefined)
  }
  
}

