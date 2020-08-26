package typings.senchaTouch.Ext.direct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPollingProvider extends IJsonProvider {
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of baseParams
    * @returns Object
    */
  var getBaseParams: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of interval
    * @returns Number
    */
  var getInterval: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of url
    * @returns String/Function
    */
  var getUrl: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Number) */
  var interval: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of baseParams
    * @param baseParams Object The new value.
    */
  var setBaseParams: js.UndefOr[js.Function1[/* baseParams */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of interval
    * @param interval Number The new value.
    */
  var setInterval: js.UndefOr[js.Function1[/* interval */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of url
    * @param url String/Function The new value.
    */
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String/Function) */
  var url: js.UndefOr[js.Any] = js.native
}

object IPollingProvider {
  @scala.inline
  def apply(): IPollingProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPollingProvider]
  }
  @scala.inline
  implicit class IPollingProviderOps[Self <: IPollingProvider] (val x: Self) extends AnyVal {
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
    def setBaseParams(value: js.Any): Self = this.set("baseParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseParams: Self = this.set("baseParams", js.undefined)
    @scala.inline
    def setGetBaseParams(value: () => _): Self = this.set("getBaseParams", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBaseParams: Self = this.set("getBaseParams", js.undefined)
    @scala.inline
    def setGetInterval(value: () => Double): Self = this.set("getInterval", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetInterval: Self = this.set("getInterval", js.undefined)
    @scala.inline
    def setGetUrl(value: () => _): Self = this.set("getUrl", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUrl: Self = this.set("getUrl", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setSetBaseParams(value: /* baseParams */ js.UndefOr[js.Any] => Unit): Self = this.set("setBaseParams", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBaseParams: Self = this.set("setBaseParams", js.undefined)
    @scala.inline
    def setSetInterval(value: /* interval */ js.UndefOr[Double] => Unit): Self = this.set("setInterval", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetInterval: Self = this.set("setInterval", js.undefined)
    @scala.inline
    def setSetUrl(value: /* url */ js.UndefOr[js.Any] => Unit): Self = this.set("setUrl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUrl: Self = this.set("setUrl", js.undefined)
    @scala.inline
    def setUrl(value: js.Any): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

