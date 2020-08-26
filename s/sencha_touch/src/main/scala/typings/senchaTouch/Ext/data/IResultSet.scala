package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResultSet extends IBase {
  /** [Config Option] (Number) */
  var count: js.UndefOr[Double] = js.native
  /** [Method] Returns the value of count
    * @returns Number
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of loaded
    * @returns Boolean
    */
  var getLoaded: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of message
    * @returns String
    */
  var getMessage: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of records
    * @returns Ext.data.Model[]
    */
  var getRecords: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of success
    * @returns Boolean
    */
  var getSuccess: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of total
    * @returns Number
    */
  var getTotal: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Boolean) */
  var loaded: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var message: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.data.Model[]) */
  var records: js.UndefOr[Array] = js.native
  /** [Method] Sets the value of count
    * @param count Number The new value.
    */
  var setCount: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of loaded
    * @param loaded Boolean The new value.
    */
  var setLoaded: js.UndefOr[js.Function1[/* loaded */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of message
    * @param message String The new value.
    */
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of records
    * @param records Ext.data.Model[] The new value.
    */
  var setRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of success
    * @param success Boolean The new value.
    */
  var setSuccess: js.UndefOr[js.Function1[/* success */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of total
    * @param total Number The new value.
    */
  var setTotal: js.UndefOr[js.Function1[/* total */ js.UndefOr[Double], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var success: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var total: js.UndefOr[Double] = js.native
}

object IResultSet {
  @scala.inline
  def apply(): IResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResultSet]
  }
  @scala.inline
  implicit class IResultSetOps[Self <: IResultSet] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCount: Self = this.set("getCount", js.undefined)
    @scala.inline
    def setGetLoaded(value: () => Boolean): Self = this.set("getLoaded", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLoaded: Self = this.set("getLoaded", js.undefined)
    @scala.inline
    def setGetMessage(value: () => String): Self = this.set("getMessage", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMessage: Self = this.set("getMessage", js.undefined)
    @scala.inline
    def setGetRecords(value: () => Array): Self = this.set("getRecords", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRecords: Self = this.set("getRecords", js.undefined)
    @scala.inline
    def setGetSuccess(value: () => Boolean): Self = this.set("getSuccess", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSuccess: Self = this.set("getSuccess", js.undefined)
    @scala.inline
    def setGetTotal(value: () => Double): Self = this.set("getTotal", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTotal: Self = this.set("getTotal", js.undefined)
    @scala.inline
    def setLoaded(value: Boolean): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setRecords(value: Array): Self = this.set("records", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecords: Self = this.set("records", js.undefined)
    @scala.inline
    def setSetCount(value: /* count */ js.UndefOr[Double] => Unit): Self = this.set("setCount", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCount: Self = this.set("setCount", js.undefined)
    @scala.inline
    def setSetLoaded(value: /* loaded */ js.UndefOr[Boolean] => Unit): Self = this.set("setLoaded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLoaded: Self = this.set("setLoaded", js.undefined)
    @scala.inline
    def setSetMessage(value: /* message */ js.UndefOr[String] => Unit): Self = this.set("setMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMessage: Self = this.set("setMessage", js.undefined)
    @scala.inline
    def setSetRecords(value: /* records */ js.UndefOr[Array] => Unit): Self = this.set("setRecords", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRecords: Self = this.set("setRecords", js.undefined)
    @scala.inline
    def setSetSuccess(value: /* success */ js.UndefOr[Boolean] => Unit): Self = this.set("setSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSuccess: Self = this.set("setSuccess", js.undefined)
    @scala.inline
    def setSetTotal(value: /* total */ js.UndefOr[Double] => Unit): Self = this.set("setTotal", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTotal: Self = this.set("setTotal", js.undefined)
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

