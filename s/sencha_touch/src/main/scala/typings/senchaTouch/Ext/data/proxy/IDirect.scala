package typings.senchaTouch.Ext.data.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDirect extends IServer {
  /** [Method] Generates a url based on a given Ext data Request object
    * @returns String The url
    */
  @JSName("buildUrl")
  var buildUrl_IDirect: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (Function/String) */
  var directFn: js.UndefOr[js.Any] = js.native
  /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
    * @param operation Object
    * @param callback Object
    * @param scope Object
    */
  @JSName("doRequest")
  var doRequest_IDirect: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Returns the value of directFn
    * @returns Function/String
    */
  var getDirectFn: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of paramOrder
    * @returns String/String[]
    */
  var getParamOrder: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of paramsAsHash
    * @returns Boolean
    */
  var getParamsAsHash: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the value of directFn
    * @param directFn Function/String The new value.
    */
  var setDirectFn: js.UndefOr[js.Function1[/* directFn */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of paramOrder
    * @param paramOrder String/String[] The new value.
    */
  var setParamOrder: js.UndefOr[js.Function1[/* paramOrder */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of paramsAsHash
    * @param paramsAsHash Boolean The new value.
    */
  var setParamsAsHash: js.UndefOr[js.Function1[/* paramsAsHash */ js.UndefOr[Boolean], Unit]] = js.native
}

object IDirect {
  @scala.inline
  def apply(): IDirect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirect]
  }
  @scala.inline
  implicit class IDirectOps[Self <: IDirect] (val x: Self) extends AnyVal {
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
    def setBuildUrl(value: () => String): Self = this.set("buildUrl", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBuildUrl: Self = this.set("buildUrl", js.undefined)
    @scala.inline
    def setDirectFn(value: js.Any): Self = this.set("directFn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectFn: Self = this.set("directFn", js.undefined)
    @scala.inline
    def setDoRequest(
      value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("doRequest", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDoRequest: Self = this.set("doRequest", js.undefined)
    @scala.inline
    def setGetDirectFn(value: () => _): Self = this.set("getDirectFn", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDirectFn: Self = this.set("getDirectFn", js.undefined)
    @scala.inline
    def setGetParamOrder(value: () => _): Self = this.set("getParamOrder", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetParamOrder: Self = this.set("getParamOrder", js.undefined)
    @scala.inline
    def setGetParamsAsHash(value: () => Boolean): Self = this.set("getParamsAsHash", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetParamsAsHash: Self = this.set("getParamsAsHash", js.undefined)
    @scala.inline
    def setParamOrder(value: js.Any): Self = this.set("paramOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParamOrder: Self = this.set("paramOrder", js.undefined)
    @scala.inline
    def setParamsAsHash(value: Boolean): Self = this.set("paramsAsHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParamsAsHash: Self = this.set("paramsAsHash", js.undefined)
    @scala.inline
    def setSetDirectFn(value: /* directFn */ js.UndefOr[js.Any] => Unit): Self = this.set("setDirectFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDirectFn: Self = this.set("setDirectFn", js.undefined)
    @scala.inline
    def setSetParamOrder(value: /* paramOrder */ js.UndefOr[js.Any] => Unit): Self = this.set("setParamOrder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetParamOrder: Self = this.set("setParamOrder", js.undefined)
    @scala.inline
    def setSetParamsAsHash(value: /* paramsAsHash */ js.UndefOr[Boolean] => Unit): Self = this.set("setParamsAsHash", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetParamsAsHash: Self = this.set("setParamsAsHash", js.undefined)
  }
  
}

