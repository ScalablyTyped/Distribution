package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IResultSetMutableBuilder[Self <: IResultSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
    
    @scala.inline
    def setGetLoaded(value: () => Boolean): Self = StObject.set(x, "getLoaded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLoadedUndefined: Self = StObject.set(x, "getLoaded", js.undefined)
    
    @scala.inline
    def setGetMessage(value: () => String): Self = StObject.set(x, "getMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMessageUndefined: Self = StObject.set(x, "getMessage", js.undefined)
    
    @scala.inline
    def setGetRecords(value: () => Array): Self = StObject.set(x, "getRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecordsUndefined: Self = StObject.set(x, "getRecords", js.undefined)
    
    @scala.inline
    def setGetSuccess(value: () => Boolean): Self = StObject.set(x, "getSuccess", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSuccessUndefined: Self = StObject.set(x, "getSuccess", js.undefined)
    
    @scala.inline
    def setGetTotal(value: () => Double): Self = StObject.set(x, "getTotal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTotalUndefined: Self = StObject.set(x, "getTotal", js.undefined)
    
    @scala.inline
    def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setRecords(value: Array): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
    
    @scala.inline
    def setSetCount(value: /* count */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCountUndefined: Self = StObject.set(x, "setCount", js.undefined)
    
    @scala.inline
    def setSetLoaded(value: /* loaded */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setLoaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLoadedUndefined: Self = StObject.set(x, "setLoaded", js.undefined)
    
    @scala.inline
    def setSetMessage(value: /* message */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMessageUndefined: Self = StObject.set(x, "setMessage", js.undefined)
    
    @scala.inline
    def setSetRecords(value: /* records */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setRecords", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRecordsUndefined: Self = StObject.set(x, "setRecords", js.undefined)
    
    @scala.inline
    def setSetSuccess(value: /* success */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSuccessUndefined: Self = StObject.set(x, "setSuccess", js.undefined)
    
    @scala.inline
    def setSetTotal(value: /* total */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTotal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTotalUndefined: Self = StObject.set(x, "setTotal", js.undefined)
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
