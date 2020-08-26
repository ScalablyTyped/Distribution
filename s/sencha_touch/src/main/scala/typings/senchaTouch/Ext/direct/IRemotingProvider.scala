package typings.senchaTouch.Ext.direct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRemotingProvider extends IJsonProvider {
  /** [Config Option] (Object) */
  var actions: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/Boolean) */
  var enableBuffer: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var enableUrlEncode: js.UndefOr[String] = js.native
  /** [Method] Returns the value of actions
    * @returns Object
    */
  var getActions: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of enableBuffer
    * @returns Number/Boolean
    */
  var getEnableBuffer: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of enableUrlEncode
    * @returns String
    */
  var getEnableUrlEncode: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of maxRetries
    * @returns Number
    */
  var getMaxRetries: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of namespace
    * @returns String/Object
    */
  var getNamespace: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of timeout
    * @returns Number
    */
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of url
    * @returns String
    */
  var getUrl: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (Number) */
  var maxRetries: js.UndefOr[Double] = js.native
  /** [Config Option] (String/Object) */
  var namespace: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of actions
    * @param actions Object The new value.
    */
  var setActions: js.UndefOr[js.Function1[/* actions */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of enableBuffer
    * @param enableBuffer Number/Boolean The new value.
    */
  var setEnableBuffer: js.UndefOr[js.Function1[/* enableBuffer */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of enableUrlEncode
    * @param enableUrlEncode String The new value.
    */
  var setEnableUrlEncode: js.UndefOr[js.Function1[/* enableUrlEncode */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of maxRetries
    * @param maxRetries Number The new value.
    */
  var setMaxRetries: js.UndefOr[js.Function1[/* maxRetries */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of namespace
    * @param namespace String/Object The new value.
    */
  var setNamespace: js.UndefOr[js.Function1[/* namespace */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of timeout
    * @param timeout Number The new value.
    */
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of url
    * @param url String The new value.
    */
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
}

object IRemotingProvider {
  @scala.inline
  def apply(): IRemotingProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRemotingProvider]
  }
  @scala.inline
  implicit class IRemotingProviderOps[Self <: IRemotingProvider] (val x: Self) extends AnyVal {
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
    def setActions(value: js.Any): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setEnableBuffer(value: js.Any): Self = this.set("enableBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableBuffer: Self = this.set("enableBuffer", js.undefined)
    @scala.inline
    def setEnableUrlEncode(value: String): Self = this.set("enableUrlEncode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableUrlEncode: Self = this.set("enableUrlEncode", js.undefined)
    @scala.inline
    def setGetActions(value: () => _): Self = this.set("getActions", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetActions: Self = this.set("getActions", js.undefined)
    @scala.inline
    def setGetEnableBuffer(value: () => _): Self = this.set("getEnableBuffer", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetEnableBuffer: Self = this.set("getEnableBuffer", js.undefined)
    @scala.inline
    def setGetEnableUrlEncode(value: () => String): Self = this.set("getEnableUrlEncode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetEnableUrlEncode: Self = this.set("getEnableUrlEncode", js.undefined)
    @scala.inline
    def setGetMaxRetries(value: () => Double): Self = this.set("getMaxRetries", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaxRetries: Self = this.set("getMaxRetries", js.undefined)
    @scala.inline
    def setGetNamespace(value: () => _): Self = this.set("getNamespace", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNamespace: Self = this.set("getNamespace", js.undefined)
    @scala.inline
    def setGetTimeout(value: () => Double): Self = this.set("getTimeout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTimeout: Self = this.set("getTimeout", js.undefined)
    @scala.inline
    def setGetUrl(value: () => String): Self = this.set("getUrl", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUrl: Self = this.set("getUrl", js.undefined)
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    @scala.inline
    def setNamespace(value: js.Any): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setSetActions(value: /* actions */ js.UndefOr[js.Any] => Unit): Self = this.set("setActions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetActions: Self = this.set("setActions", js.undefined)
    @scala.inline
    def setSetEnableBuffer(value: /* enableBuffer */ js.UndefOr[js.Any] => Unit): Self = this.set("setEnableBuffer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetEnableBuffer: Self = this.set("setEnableBuffer", js.undefined)
    @scala.inline
    def setSetEnableUrlEncode(value: /* enableUrlEncode */ js.UndefOr[String] => Unit): Self = this.set("setEnableUrlEncode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetEnableUrlEncode: Self = this.set("setEnableUrlEncode", js.undefined)
    @scala.inline
    def setSetMaxRetries(value: /* maxRetries */ js.UndefOr[Double] => Unit): Self = this.set("setMaxRetries", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxRetries: Self = this.set("setMaxRetries", js.undefined)
    @scala.inline
    def setSetNamespace(value: /* namespace */ js.UndefOr[js.Any] => Unit): Self = this.set("setNamespace", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetNamespace: Self = this.set("setNamespace", js.undefined)
    @scala.inline
    def setSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = this.set("setTimeout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTimeout: Self = this.set("setTimeout", js.undefined)
    @scala.inline
    def setSetUrl(value: /* url */ js.UndefOr[String] => Unit): Self = this.set("setUrl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUrl: Self = this.set("setUrl", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

