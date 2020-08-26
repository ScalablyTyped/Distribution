package typings.senchaTouch.Ext.ux.device.analytics

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IBase {
  /** [Method] Returns the value of accountID
    * @returns Object
    */
  var getAccountID: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Registers yur Google Analytics account
    * @param accountID String Your Google Analytics account ID
    */
  var registerAccount: js.UndefOr[js.Function1[/* accountID */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of accountID
    * @param accountID Object The new value.
    */
  var setAccountID: js.UndefOr[js.Function1[/* accountID */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Track an event in your application
    * @param config Object
    */
  var trackEvent: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Track an pageview in your application
    * @param config String The page you want to track (must start with a slash).
    */
  var trackPageview: js.UndefOr[js.Function1[/* config */ js.UndefOr[String], Unit]] = js.native
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
    def setGetAccountID(value: () => _): Self = this.set("getAccountID", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAccountID: Self = this.set("getAccountID", js.undefined)
    @scala.inline
    def setRegisterAccount(value: /* accountID */ js.UndefOr[String] => Unit): Self = this.set("registerAccount", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRegisterAccount: Self = this.set("registerAccount", js.undefined)
    @scala.inline
    def setSetAccountID(value: /* accountID */ js.UndefOr[js.Any] => Unit): Self = this.set("setAccountID", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAccountID: Self = this.set("setAccountID", js.undefined)
    @scala.inline
    def setTrackEvent(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("trackEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTrackEvent: Self = this.set("trackEvent", js.undefined)
    @scala.inline
    def setTrackPageview(value: /* config */ js.UndefOr[String] => Unit): Self = this.set("trackPageview", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTrackPageview: Self = this.set("trackPageview", js.undefined)
  }
  
}

