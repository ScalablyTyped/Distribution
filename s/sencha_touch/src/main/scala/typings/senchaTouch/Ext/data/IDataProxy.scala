package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.IEvented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataProxy extends IEvented {
  /** [Method] Performs a batch of Operations in the order specified by batchOrder
    * @param options Object Object containing one or more properties supported by the batch method:
    * @returns Ext.data.Batch The newly created Batch
    */
  var batch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IBatch]] = js.native
  /** [Config Option] (Boolean) */
  var batchActions: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var batchOrder: js.UndefOr[String] = js.native
  /** [Method] Performs the given create operation
    * @param operation Ext.data.Operation The Operation to perform
    * @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
    * @param scope Object Scope to execute the callback function in
    */
  var create: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Performs the given destroy operation
    * @param operation Ext.data.Operation The Operation to perform
    * @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
    * @param scope Object Scope to execute the callback function in
    */
  @JSName("destroy")
  var destroy_IDataProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Returns the value of batchActions
    * @returns Boolean
    */
  var getBatchActions: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of batchOrder
    * @returns String
    */
  var getBatchOrder: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of model
    * @returns String/Ext.data.Model
    */
  var getModel: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of reader
    * @returns Object/String/Ext.data.reader.Reader
    */
  var getReader: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of writer
    * @returns Object/String/Ext.data.writer.Writer
    */
  var getWriter: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (String/Ext.data.Model) */
  var model: js.UndefOr[js.Any] = js.native
  /** [Method] Performs the given read operation
    * @param operation Ext.data.Operation The Operation to perform
    * @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
    * @param scope Object Scope to execute the callback function in
    */
  var read: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Object/String/Ext.data.reader.Reader) */
  var reader: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of batchActions
    * @param batchActions Boolean The new value.
    */
  var setBatchActions: js.UndefOr[js.Function1[/* batchActions */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of batchOrder
    * @param batchOrder String The new value.
    */
  var setBatchOrder: js.UndefOr[js.Function1[/* batchOrder */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of model
    * @param model String/Ext.data.Model The new value.
    */
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of reader
    * @param reader Object/String/Ext.data.reader.Reader The new value.
    */
  var setReader: js.UndefOr[js.Function1[/* reader */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of writer
    * @param writer Object/String/Ext.data.writer.Writer The new value.
    */
  var setWriter: js.UndefOr[js.Function1[/* writer */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Performs the given update operation
    * @param operation Ext.data.Operation The Operation to perform
    * @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
    * @param scope Object Scope to execute the callback function in
    */
  var update: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Object/String/Ext.data.writer.Writer) */
  var writer: js.UndefOr[js.Any] = js.native
}

object IDataProxy {
  @scala.inline
  def apply(): IDataProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataProxy]
  }
  @scala.inline
  implicit class IDataProxyOps[Self <: IDataProxy] (val x: Self) extends AnyVal {
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
    def setBatch(value: /* options */ js.UndefOr[js.Any] => IBatch): Self = this.set("batch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBatch: Self = this.set("batch", js.undefined)
    @scala.inline
    def setBatchActions(value: Boolean): Self = this.set("batchActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchActions: Self = this.set("batchActions", js.undefined)
    @scala.inline
    def setBatchOrder(value: String): Self = this.set("batchOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchOrder: Self = this.set("batchOrder", js.undefined)
    @scala.inline
    def setCreate(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("create", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setDestroy(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("destroy", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setGetBatchActions(value: () => Boolean): Self = this.set("getBatchActions", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBatchActions: Self = this.set("getBatchActions", js.undefined)
    @scala.inline
    def setGetBatchOrder(value: () => String): Self = this.set("getBatchOrder", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBatchOrder: Self = this.set("getBatchOrder", js.undefined)
    @scala.inline
    def setGetModel(value: () => _): Self = this.set("getModel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetModel: Self = this.set("getModel", js.undefined)
    @scala.inline
    def setGetReader(value: () => _): Self = this.set("getReader", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetReader: Self = this.set("getReader", js.undefined)
    @scala.inline
    def setGetWriter(value: () => _): Self = this.set("getWriter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetWriter: Self = this.set("getWriter", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setRead(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("read", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setReader(value: js.Any): Self = this.set("reader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReader: Self = this.set("reader", js.undefined)
    @scala.inline
    def setSetBatchActions(value: /* batchActions */ js.UndefOr[Boolean] => Unit): Self = this.set("setBatchActions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBatchActions: Self = this.set("setBatchActions", js.undefined)
    @scala.inline
    def setSetBatchOrder(value: /* batchOrder */ js.UndefOr[String] => Unit): Self = this.set("setBatchOrder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBatchOrder: Self = this.set("setBatchOrder", js.undefined)
    @scala.inline
    def setSetModel(value: /* model */ js.UndefOr[js.Any] => Unit): Self = this.set("setModel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetModel: Self = this.set("setModel", js.undefined)
    @scala.inline
    def setSetReader(value: /* reader */ js.UndefOr[js.Any] => Unit): Self = this.set("setReader", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetReader: Self = this.set("setReader", js.undefined)
    @scala.inline
    def setSetWriter(value: /* writer */ js.UndefOr[js.Any] => Unit): Self = this.set("setWriter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetWriter: Self = this.set("setWriter", js.undefined)
    @scala.inline
    def setUpdate(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("update", js.Any.fromFunction3(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setWriter(value: js.Any): Self = this.set("writer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriter: Self = this.set("writer", js.undefined)
  }
  
}

