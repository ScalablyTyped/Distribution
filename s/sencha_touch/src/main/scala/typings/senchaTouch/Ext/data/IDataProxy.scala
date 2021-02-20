package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.IEvented
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IDataProxyMutableBuilder[Self <: IDataProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatch(value: /* options */ js.UndefOr[js.Any] => IBatch): Self = StObject.set(x, "batch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBatchActions(value: Boolean): Self = StObject.set(x, "batchActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchActionsUndefined: Self = StObject.set(x, "batchActions", js.undefined)
    
    @scala.inline
    def setBatchOrder(value: String): Self = StObject.set(x, "batchOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchOrderUndefined: Self = StObject.set(x, "batchOrder", js.undefined)
    
    @scala.inline
    def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    @scala.inline
    def setCreate(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDestroy(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "destroy", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setGetBatchActions(value: () => Boolean): Self = StObject.set(x, "getBatchActions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBatchActionsUndefined: Self = StObject.set(x, "getBatchActions", js.undefined)
    
    @scala.inline
    def setGetBatchOrder(value: () => String): Self = StObject.set(x, "getBatchOrder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBatchOrderUndefined: Self = StObject.set(x, "getBatchOrder", js.undefined)
    
    @scala.inline
    def setGetModel(value: () => _): Self = StObject.set(x, "getModel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetModelUndefined: Self = StObject.set(x, "getModel", js.undefined)
    
    @scala.inline
    def setGetReader(value: () => _): Self = StObject.set(x, "getReader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReaderUndefined: Self = StObject.set(x, "getReader", js.undefined)
    
    @scala.inline
    def setGetWriter(value: () => _): Self = StObject.set(x, "getWriter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWriterUndefined: Self = StObject.set(x, "getWriter", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setRead(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setReader(value: js.Any): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReaderUndefined: Self = StObject.set(x, "reader", js.undefined)
    
    @scala.inline
    def setSetBatchActions(value: /* batchActions */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setBatchActions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBatchActionsUndefined: Self = StObject.set(x, "setBatchActions", js.undefined)
    
    @scala.inline
    def setSetBatchOrder(value: /* batchOrder */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setBatchOrder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBatchOrderUndefined: Self = StObject.set(x, "setBatchOrder", js.undefined)
    
    @scala.inline
    def setSetModel(value: /* model */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setModel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetModelUndefined: Self = StObject.set(x, "setModel", js.undefined)
    
    @scala.inline
    def setSetReader(value: /* reader */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setReader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetReaderUndefined: Self = StObject.set(x, "setReader", js.undefined)
    
    @scala.inline
    def setSetWriter(value: /* writer */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setWriter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWriterUndefined: Self = StObject.set(x, "setWriter", js.undefined)
    
    @scala.inline
    def setUpdate(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    @scala.inline
    def setWriter(value: js.Any): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
  }
}
