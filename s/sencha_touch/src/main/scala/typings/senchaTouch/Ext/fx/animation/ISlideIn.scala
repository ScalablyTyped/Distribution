package typings.senchaTouch.Ext.fx.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISlideIn extends IAbstract {
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.native
  /** [Method] Returns the value of isElementBoxFit
    * @returns Boolean
    */
  var getIsElementBoxFit: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of offset
    * @returns Number
    */
  var getOffset: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of out
    * @returns Boolean
    */
  var getOut: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of useCssTransform
    * @returns Boolean
    */
  var getUseCssTransform: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Number) */
  var offset: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var out: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the value of containerBox
    * @param containerBox String The new value.
    */
  var setContainerBox: js.UndefOr[js.Function1[/* containerBox */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of elementBox
    * @param elementBox String The new value.
    */
  var setElementBox: js.UndefOr[js.Function1[/* elementBox */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of isElementBoxFit
    * @param isElementBoxFit Boolean The new value.
    */
  var setIsElementBoxFit: js.UndefOr[js.Function1[/* isElementBoxFit */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of offset
    * @param offset Number The new value.
    */
  var setOffset: js.UndefOr[js.Function1[/* offset */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of out
    * @param out Boolean The new value.
    */
  var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of useCssTransform
    * @param useCssTransform Boolean The new value.
    */
  var setUseCssTransform: js.UndefOr[js.Function1[/* useCssTransform */ js.UndefOr[Boolean], Unit]] = js.native
}

object ISlideIn {
  @scala.inline
  def apply(): ISlideIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISlideIn]
  }
  @scala.inline
  implicit class ISlideInOps[Self <: ISlideIn] (val x: Self) extends AnyVal {
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setGetIsElementBoxFit(value: () => Boolean): Self = this.set("getIsElementBoxFit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetIsElementBoxFit: Self = this.set("getIsElementBoxFit", js.undefined)
    @scala.inline
    def setGetOffset(value: () => Double): Self = this.set("getOffset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetOffset: Self = this.set("getOffset", js.undefined)
    @scala.inline
    def setGetOut(value: () => Boolean): Self = this.set("getOut", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetOut: Self = this.set("getOut", js.undefined)
    @scala.inline
    def setGetUseCssTransform(value: () => Boolean): Self = this.set("getUseCssTransform", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUseCssTransform: Self = this.set("getUseCssTransform", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOut(value: Boolean): Self = this.set("out", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOut: Self = this.set("out", js.undefined)
    @scala.inline
    def setSetContainerBox(value: /* containerBox */ js.UndefOr[String] => Unit): Self = this.set("setContainerBox", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetContainerBox: Self = this.set("setContainerBox", js.undefined)
    @scala.inline
    def setSetElementBox(value: /* elementBox */ js.UndefOr[String] => Unit): Self = this.set("setElementBox", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetElementBox: Self = this.set("setElementBox", js.undefined)
    @scala.inline
    def setSetIsElementBoxFit(value: /* isElementBoxFit */ js.UndefOr[Boolean] => Unit): Self = this.set("setIsElementBoxFit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIsElementBoxFit: Self = this.set("setIsElementBoxFit", js.undefined)
    @scala.inline
    def setSetOffset(value: /* offset */ js.UndefOr[Double] => Unit): Self = this.set("setOffset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetOffset: Self = this.set("setOffset", js.undefined)
    @scala.inline
    def setSetOut(value: /* out */ js.UndefOr[Boolean] => Unit): Self = this.set("setOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetOut: Self = this.set("setOut", js.undefined)
    @scala.inline
    def setSetUseCssTransform(value: /* useCssTransform */ js.UndefOr[Boolean] => Unit): Self = this.set("setUseCssTransform", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUseCssTransform: Self = this.set("setUseCssTransform", js.undefined)
  }
  
}

