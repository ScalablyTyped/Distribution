package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.IEvented
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProxy
  extends StObject
     with IEvented {
  
  /** [Method] Performs a batch of Operations in the order specified by batchOrder
    * @param options Object Object containing one or more properties supported by the batch method:
    * @returns Ext.data.Batch The newly created Batch
    */
  var batch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IBatch]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var batchActions: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var batchOrder: js.UndefOr[String] = js.undefined
  
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
  ] = js.undefined
  
  /** [Method] Performs the given destroy operation
    * @param operation Ext.data.Operation The Operation to perform
    * @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
    * @param scope Object Scope to execute the callback function in
    */
  @JSName("destroy")
  var destroy_IProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Returns the value of batchActions
    * @returns Boolean
    */
  var getBatchActions: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of batchOrder
    * @returns String
    */
  var getBatchOrder: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of model
    * @returns String/Ext.data.Model
    */
  var getModel: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of reader
    * @returns Object/String/Ext.data.reader.Reader
    */
  var getReader: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of writer
    * @returns Object/String/Ext.data.writer.Writer
    */
  var getWriter: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Config Option] (String/Ext.data.Model) */
  var model: js.UndefOr[js.Any] = js.undefined
  
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
  ] = js.undefined
  
  /** [Config Option] (Object/String/Ext.data.reader.Reader) */
  var reader: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Sets the value of batchActions
    * @param batchActions Boolean The new value.
    */
  var setBatchActions: js.UndefOr[js.Function1[/* batchActions */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of batchOrder
    * @param batchOrder String The new value.
    */
  var setBatchOrder: js.UndefOr[js.Function1[/* batchOrder */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of model
    * @param model String/Ext.data.Model The new value.
    */
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of reader
    * @param reader Object/String/Ext.data.reader.Reader The new value.
    */
  var setReader: js.UndefOr[js.Function1[/* reader */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of writer
    * @param writer Object/String/Ext.data.writer.Writer The new value.
    */
  var setWriter: js.UndefOr[js.Function1[/* writer */ js.UndefOr[js.Any], Unit]] = js.undefined
  
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
  ] = js.undefined
  
  /** [Config Option] (Object/String/Ext.data.writer.Writer) */
  var writer: js.UndefOr[js.Any] = js.undefined
}
object IProxy {
  
  inline def apply(): IProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProxy]
  }
  
  extension [Self <: IProxy](x: Self) {
    
    inline def setBatch(value: /* options */ js.UndefOr[js.Any] => IBatch): Self = StObject.set(x, "batch", js.Any.fromFunction1(value))
    
    inline def setBatchActions(value: Boolean): Self = StObject.set(x, "batchActions", value.asInstanceOf[js.Any])
    
    inline def setBatchActionsUndefined: Self = StObject.set(x, "batchActions", js.undefined)
    
    inline def setBatchOrder(value: String): Self = StObject.set(x, "batchOrder", value.asInstanceOf[js.Any])
    
    inline def setBatchOrderUndefined: Self = StObject.set(x, "batchOrder", js.undefined)
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setCreate(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDestroy(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "destroy", js.Any.fromFunction3(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setGetBatchActions(value: () => Boolean): Self = StObject.set(x, "getBatchActions", js.Any.fromFunction0(value))
    
    inline def setGetBatchActionsUndefined: Self = StObject.set(x, "getBatchActions", js.undefined)
    
    inline def setGetBatchOrder(value: () => String): Self = StObject.set(x, "getBatchOrder", js.Any.fromFunction0(value))
    
    inline def setGetBatchOrderUndefined: Self = StObject.set(x, "getBatchOrder", js.undefined)
    
    inline def setGetModel(value: () => js.Any): Self = StObject.set(x, "getModel", js.Any.fromFunction0(value))
    
    inline def setGetModelUndefined: Self = StObject.set(x, "getModel", js.undefined)
    
    inline def setGetReader(value: () => js.Any): Self = StObject.set(x, "getReader", js.Any.fromFunction0(value))
    
    inline def setGetReaderUndefined: Self = StObject.set(x, "getReader", js.undefined)
    
    inline def setGetWriter(value: () => js.Any): Self = StObject.set(x, "getWriter", js.Any.fromFunction0(value))
    
    inline def setGetWriterUndefined: Self = StObject.set(x, "getWriter", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setRead(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setReader(value: js.Any): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
    
    inline def setReaderUndefined: Self = StObject.set(x, "reader", js.undefined)
    
    inline def setSetBatchActions(value: /* batchActions */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setBatchActions", js.Any.fromFunction1(value))
    
    inline def setSetBatchActionsUndefined: Self = StObject.set(x, "setBatchActions", js.undefined)
    
    inline def setSetBatchOrder(value: /* batchOrder */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setBatchOrder", js.Any.fromFunction1(value))
    
    inline def setSetBatchOrderUndefined: Self = StObject.set(x, "setBatchOrder", js.undefined)
    
    inline def setSetModel(value: /* model */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setModel", js.Any.fromFunction1(value))
    
    inline def setSetModelUndefined: Self = StObject.set(x, "setModel", js.undefined)
    
    inline def setSetReader(value: /* reader */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setReader", js.Any.fromFunction1(value))
    
    inline def setSetReaderUndefined: Self = StObject.set(x, "setReader", js.undefined)
    
    inline def setSetWriter(value: /* writer */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setWriter", js.Any.fromFunction1(value))
    
    inline def setSetWriterUndefined: Self = StObject.set(x, "setWriter", js.undefined)
    
    inline def setUpdate(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setWriter(value: js.Any): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    
    inline def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
  }
}
