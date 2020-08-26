package typings.senchaTouch.Ext.data.proxy

import typings.senchaTouch.Ext.data.IOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJsonP extends IServer {
  /** [Method] Aborts the current server request if one is currently running  */
  var abort: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var autoAppendParams: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var callbackKey: js.UndefOr[String] = js.native
  /** [Method] Performs the read request to the remote domain
    * @param operation Ext.data.Operation The Operation object to execute.
    * @param callback Function A callback function to execute when the Operation has been completed.
    * @param scope Object The scope to execute the callback in.
    * @returns Object
    */
  @JSName("doRequest")
  var doRequest_IJsonP: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Method] Returns the value of autoAppendParams
    * @returns Boolean
    */
  var getAutoAppendParams: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of callbackKey
    * @returns String
    */
  var getCallbackKey: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of defaultWriterType
    * @returns String
    */
  var getDefaultWriterType: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of recordParam
    * @returns String
    */
  var getRecordParam: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var recordParam: js.UndefOr[String] = js.native
  /** [Method] Sets the value of autoAppendParams
    * @param autoAppendParams Boolean The new value.
    */
  var setAutoAppendParams: js.UndefOr[js.Function1[/* autoAppendParams */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of callbackKey
    * @param callbackKey String The new value.
    */
  var setCallbackKey: js.UndefOr[js.Function1[/* callbackKey */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of defaultWriterType
    * @param defaultWriterType String The new value.
    */
  var setDefaultWriterType: js.UndefOr[js.Function1[/* defaultWriterType */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of recordParam
    * @param recordParam String The new value.
    */
  var setRecordParam: js.UndefOr[js.Function1[/* recordParam */ js.UndefOr[String], Unit]] = js.native
}

object IJsonP {
  @scala.inline
  def apply(): IJsonP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJsonP]
  }
  @scala.inline
  implicit class IJsonPOps[Self <: IJsonP] (val x: Self) extends AnyVal {
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
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAbort: Self = this.set("abort", js.undefined)
    @scala.inline
    def setAutoAppendParams(value: Boolean): Self = this.set("autoAppendParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAppendParams: Self = this.set("autoAppendParams", js.undefined)
    @scala.inline
    def setCallbackKey(value: String): Self = this.set("callbackKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbackKey: Self = this.set("callbackKey", js.undefined)
    @scala.inline
    def setDoRequest(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _
    ): Self = this.set("doRequest", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDoRequest: Self = this.set("doRequest", js.undefined)
    @scala.inline
    def setGetAutoAppendParams(value: () => Boolean): Self = this.set("getAutoAppendParams", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAutoAppendParams: Self = this.set("getAutoAppendParams", js.undefined)
    @scala.inline
    def setGetCallbackKey(value: () => String): Self = this.set("getCallbackKey", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCallbackKey: Self = this.set("getCallbackKey", js.undefined)
    @scala.inline
    def setGetDefaultWriterType(value: () => String): Self = this.set("getDefaultWriterType", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDefaultWriterType: Self = this.set("getDefaultWriterType", js.undefined)
    @scala.inline
    def setGetRecordParam(value: () => String): Self = this.set("getRecordParam", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRecordParam: Self = this.set("getRecordParam", js.undefined)
    @scala.inline
    def setRecordParam(value: String): Self = this.set("recordParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordParam: Self = this.set("recordParam", js.undefined)
    @scala.inline
    def setSetAutoAppendParams(value: /* autoAppendParams */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoAppendParams", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAutoAppendParams: Self = this.set("setAutoAppendParams", js.undefined)
    @scala.inline
    def setSetCallbackKey(value: /* callbackKey */ js.UndefOr[String] => Unit): Self = this.set("setCallbackKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCallbackKey: Self = this.set("setCallbackKey", js.undefined)
    @scala.inline
    def setSetDefaultWriterType(value: /* defaultWriterType */ js.UndefOr[String] => Unit): Self = this.set("setDefaultWriterType", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDefaultWriterType: Self = this.set("setDefaultWriterType", js.undefined)
    @scala.inline
    def setSetRecordParam(value: /* recordParam */ js.UndefOr[String] => Unit): Self = this.set("setRecordParam", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRecordParam: Self = this.set("setRecordParam", js.undefined)
  }
  
}

