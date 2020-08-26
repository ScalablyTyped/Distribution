package typings.senchaTouch.Ext.device.compass

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IBase {
  /** [Config Option] (Number) */
  var frequency: js.UndefOr[Double] = js.native
  /** [Method] Returns the value of frequency
    * @returns Number
    */
  var getFrequency: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Sets the value of frequency
    * @param frequency Number The new value.
    */
  var setFrequency: js.UndefOr[js.Function1[/* frequency */ js.UndefOr[Double], Unit]] = js.native
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
    def setFrequency(value: Double): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    @scala.inline
    def setGetFrequency(value: () => Double): Self = this.set("getFrequency", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFrequency: Self = this.set("getFrequency", js.undefined)
    @scala.inline
    def setSetFrequency(value: /* frequency */ js.UndefOr[Double] => Unit): Self = this.set("setFrequency", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFrequency: Self = this.set("setFrequency", js.undefined)
  }
  
}

