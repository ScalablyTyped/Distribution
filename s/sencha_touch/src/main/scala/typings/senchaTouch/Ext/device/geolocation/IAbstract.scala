package typings.senchaTouch.Ext.device.geolocation

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IBase {
  /** [Config Option] (Boolean) */
  var allowHighAccuracy: js.UndefOr[Boolean] = js.native
  /** [Method] If you are currently watching for the current position this will stop that task  */
  var clearWatch: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number) */
  var frequency: js.UndefOr[Double] = js.native
  /** [Method] Returns the value of allowHighAccuracy
    * @returns Boolean
    */
  var getAllowHighAccuracy: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Attempts to get the current position of this device
    * @param config Object An object which contains the following config options:
    */
  var getCurrentPosition: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns the value of frequency
    * @returns Number
    */
  var getFrequency: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of maximumAge
    * @returns Number
    */
  var getMaximumAge: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of timeout
    * @returns Number
    */
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Number) */
  var maximumAge: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of allowHighAccuracy
    * @param allowHighAccuracy Boolean The new value.
    */
  var setAllowHighAccuracy: js.UndefOr[js.Function1[/* allowHighAccuracy */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of frequency
    * @param frequency Number The new value.
    */
  var setFrequency: js.UndefOr[js.Function1[/* frequency */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of maximumAge
    * @param maximumAge Number The new value.
    */
  var setMaximumAge: js.UndefOr[js.Function1[/* maximumAge */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of timeout
    * @param timeout Number The new value.
    */
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.native
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  /** [Method] Watches for the current position and calls the callback when successful depending on the specified frequency
    * @param config Object An object which contains the following config options:
    */
  var watchPosition: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
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
    def setAllowHighAccuracy(value: Boolean): Self = this.set("allowHighAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHighAccuracy: Self = this.set("allowHighAccuracy", js.undefined)
    @scala.inline
    def setClearWatch(value: () => Unit): Self = this.set("clearWatch", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClearWatch: Self = this.set("clearWatch", js.undefined)
    @scala.inline
    def setFrequency(value: Double): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    @scala.inline
    def setGetAllowHighAccuracy(value: () => Boolean): Self = this.set("getAllowHighAccuracy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAllowHighAccuracy: Self = this.set("getAllowHighAccuracy", js.undefined)
    @scala.inline
    def setGetCurrentPosition(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("getCurrentPosition", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetCurrentPosition: Self = this.set("getCurrentPosition", js.undefined)
    @scala.inline
    def setGetFrequency(value: () => Double): Self = this.set("getFrequency", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFrequency: Self = this.set("getFrequency", js.undefined)
    @scala.inline
    def setGetMaximumAge(value: () => Double): Self = this.set("getMaximumAge", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaximumAge: Self = this.set("getMaximumAge", js.undefined)
    @scala.inline
    def setGetTimeout(value: () => Double): Self = this.set("getTimeout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTimeout: Self = this.set("getTimeout", js.undefined)
    @scala.inline
    def setMaximumAge(value: Double): Self = this.set("maximumAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumAge: Self = this.set("maximumAge", js.undefined)
    @scala.inline
    def setSetAllowHighAccuracy(value: /* allowHighAccuracy */ js.UndefOr[Boolean] => Unit): Self = this.set("setAllowHighAccuracy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAllowHighAccuracy: Self = this.set("setAllowHighAccuracy", js.undefined)
    @scala.inline
    def setSetFrequency(value: /* frequency */ js.UndefOr[Double] => Unit): Self = this.set("setFrequency", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFrequency: Self = this.set("setFrequency", js.undefined)
    @scala.inline
    def setSetMaximumAge(value: /* maximumAge */ js.UndefOr[Double] => Unit): Self = this.set("setMaximumAge", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaximumAge: Self = this.set("setMaximumAge", js.undefined)
    @scala.inline
    def setSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = this.set("setTimeout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTimeout: Self = this.set("setTimeout", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setWatchPosition(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("watchPosition", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWatchPosition: Self = this.set("watchPosition", js.undefined)
  }
  
}

