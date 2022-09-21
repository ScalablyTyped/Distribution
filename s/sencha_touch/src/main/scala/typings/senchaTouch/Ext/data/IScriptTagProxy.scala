package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.data.proxy.IServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScriptTagProxy
  extends StObject
     with IServer {
  
  /** [Method] Aborts the current server request if one is currently running  */
  var abort: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoAppendParams: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var callbackKey: js.UndefOr[String] = js.undefined
  
  /** [Method] Performs the read request to the remote domain
    * @param operation Ext.data.Operation The Operation object to execute.
    * @param callback Function A callback function to execute when the Operation has been completed.
    * @param scope Object The scope to execute the callback in.
    * @returns Object
    */
  @JSName("doRequest")
  var doRequest_IScriptTagProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Any
    ]
  ] = js.undefined
  
  /** [Method] Returns the value of autoAppendParams
    * @returns Boolean
    */
  var getAutoAppendParams: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of callbackKey
    * @returns String
    */
  var getCallbackKey: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of defaultWriterType
    * @returns String
    */
  var getDefaultWriterType: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of recordParam
    * @returns String
    */
  var getRecordParam: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (String) */
  var recordParam: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of autoAppendParams
    * @param autoAppendParams Boolean The new value.
    */
  var setAutoAppendParams: js.UndefOr[js.Function1[/* autoAppendParams */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of callbackKey
    * @param callbackKey String The new value.
    */
  var setCallbackKey: js.UndefOr[js.Function1[/* callbackKey */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of defaultWriterType
    * @param defaultWriterType String The new value.
    */
  var setDefaultWriterType: js.UndefOr[js.Function1[/* defaultWriterType */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of recordParam
    * @param recordParam String The new value.
    */
  var setRecordParam: js.UndefOr[js.Function1[/* recordParam */ js.UndefOr[String], Unit]] = js.undefined
}
object IScriptTagProxy {
  
  inline def apply(): IScriptTagProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScriptTagProxy]
  }
  
  extension [Self <: IScriptTagProxy](x: Self) {
    
    inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    inline def setAutoAppendParams(value: Boolean): Self = StObject.set(x, "autoAppendParams", value.asInstanceOf[js.Any])
    
    inline def setAutoAppendParamsUndefined: Self = StObject.set(x, "autoAppendParams", js.undefined)
    
    inline def setCallbackKey(value: String): Self = StObject.set(x, "callbackKey", value.asInstanceOf[js.Any])
    
    inline def setCallbackKeyUndefined: Self = StObject.set(x, "callbackKey", js.undefined)
    
    inline def setDoRequest(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Any
    ): Self = StObject.set(x, "doRequest", js.Any.fromFunction3(value))
    
    inline def setDoRequestUndefined: Self = StObject.set(x, "doRequest", js.undefined)
    
    inline def setGetAutoAppendParams(value: () => Boolean): Self = StObject.set(x, "getAutoAppendParams", js.Any.fromFunction0(value))
    
    inline def setGetAutoAppendParamsUndefined: Self = StObject.set(x, "getAutoAppendParams", js.undefined)
    
    inline def setGetCallbackKey(value: () => String): Self = StObject.set(x, "getCallbackKey", js.Any.fromFunction0(value))
    
    inline def setGetCallbackKeyUndefined: Self = StObject.set(x, "getCallbackKey", js.undefined)
    
    inline def setGetDefaultWriterType(value: () => String): Self = StObject.set(x, "getDefaultWriterType", js.Any.fromFunction0(value))
    
    inline def setGetDefaultWriterTypeUndefined: Self = StObject.set(x, "getDefaultWriterType", js.undefined)
    
    inline def setGetRecordParam(value: () => String): Self = StObject.set(x, "getRecordParam", js.Any.fromFunction0(value))
    
    inline def setGetRecordParamUndefined: Self = StObject.set(x, "getRecordParam", js.undefined)
    
    inline def setRecordParam(value: String): Self = StObject.set(x, "recordParam", value.asInstanceOf[js.Any])
    
    inline def setRecordParamUndefined: Self = StObject.set(x, "recordParam", js.undefined)
    
    inline def setSetAutoAppendParams(value: /* autoAppendParams */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoAppendParams", js.Any.fromFunction1(value))
    
    inline def setSetAutoAppendParamsUndefined: Self = StObject.set(x, "setAutoAppendParams", js.undefined)
    
    inline def setSetCallbackKey(value: /* callbackKey */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setCallbackKey", js.Any.fromFunction1(value))
    
    inline def setSetCallbackKeyUndefined: Self = StObject.set(x, "setCallbackKey", js.undefined)
    
    inline def setSetDefaultWriterType(value: /* defaultWriterType */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDefaultWriterType", js.Any.fromFunction1(value))
    
    inline def setSetDefaultWriterTypeUndefined: Self = StObject.set(x, "setDefaultWriterType", js.undefined)
    
    inline def setSetRecordParam(value: /* recordParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setRecordParam", js.Any.fromFunction1(value))
    
    inline def setSetRecordParamUndefined: Self = StObject.set(x, "setRecordParam", js.undefined)
  }
}
