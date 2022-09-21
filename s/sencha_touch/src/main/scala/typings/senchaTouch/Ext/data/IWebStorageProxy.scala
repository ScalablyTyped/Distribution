package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.data.proxy.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebStorageProxy
  extends StObject
     with IClient {
  
  /** [Property] (Object) */
  var cache: js.UndefOr[Any] = js.undefined
  
  /** [Method] inherit docs
    * @param operation Object
    * @param callback Object
    * @param scope Object
    */
  @JSName("create")
  var create_IWebStorageProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[Any], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] inherit
    * @param operation Object
    * @param callback Object
    * @param scope Object
    */
  @JSName("destroy")
  var destroy_IWebStorageProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[Any], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Config Option] (Boolean) */
  var enablePagingParams: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns the value of defaultDateFormat
    * @returns String
    */
  var getDefaultDateFormat: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of enablePagingParams
    * @returns Boolean
    */
  var getEnablePagingParams: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of id
    * @returns String
    */
  @JSName("getId")
  var getId_IWebStorageProxy: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Method] inherit docs
    * @param operation Object
    * @param callback Object
    * @param scope Object
    */
  @JSName("read")
  var read_IWebStorageProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[Any], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Sets the value of defaultDateFormat
    * @param defaultDateFormat String The new value.
    */
  var setDefaultDateFormat: js.UndefOr[js.Function1[/* defaultDateFormat */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of enablePagingParams
    * @param enablePagingParams Boolean The new value.
    */
  var setEnablePagingParams: js.UndefOr[js.Function1[/* enablePagingParams */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of id
    * @param id String The new value.
    */
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Saves the given record in the Proxy
    * @param record Ext.data.Model The model instance
    * @param id String The id to save the record under (defaults to the value of the record's getId() function)
    */
  var setRecord: js.UndefOr[js.Function2[/* record */ js.UndefOr[IModel], /* id */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] inherit docs
    * @param operation Object
    * @param callback Object
    * @param scope Object
    */
  @JSName("update")
  var update_IWebStorageProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[Any], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
}
object IWebStorageProxy {
  
  inline def apply(): IWebStorageProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebStorageProxy]
  }
  
  extension [Self <: IWebStorageProxy](x: Self) {
    
    inline def setCache(value: Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCreate(
      value: (/* operation */ js.UndefOr[Any], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDestroy(
      value: (/* operation */ js.UndefOr[Any], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "destroy", js.Any.fromFunction3(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setEnablePagingParams(value: Boolean): Self = StObject.set(x, "enablePagingParams", value.asInstanceOf[js.Any])
    
    inline def setEnablePagingParamsUndefined: Self = StObject.set(x, "enablePagingParams", js.undefined)
    
    inline def setGetDefaultDateFormat(value: () => String): Self = StObject.set(x, "getDefaultDateFormat", js.Any.fromFunction0(value))
    
    inline def setGetDefaultDateFormatUndefined: Self = StObject.set(x, "getDefaultDateFormat", js.undefined)
    
    inline def setGetEnablePagingParams(value: () => Boolean): Self = StObject.set(x, "getEnablePagingParams", js.Any.fromFunction0(value))
    
    inline def setGetEnablePagingParamsUndefined: Self = StObject.set(x, "getEnablePagingParams", js.undefined)
    
    inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRead(
      value: (/* operation */ js.UndefOr[Any], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setSetDefaultDateFormat(value: /* defaultDateFormat */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDefaultDateFormat", js.Any.fromFunction1(value))
    
    inline def setSetDefaultDateFormatUndefined: Self = StObject.set(x, "setDefaultDateFormat", js.undefined)
    
    inline def setSetEnablePagingParams(value: /* enablePagingParams */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setEnablePagingParams", js.Any.fromFunction1(value))
    
    inline def setSetEnablePagingParamsUndefined: Self = StObject.set(x, "setEnablePagingParams", js.undefined)
    
    inline def setSetId(value: /* id */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    inline def setSetIdUndefined: Self = StObject.set(x, "setId", js.undefined)
    
    inline def setSetRecord(value: (/* record */ js.UndefOr[IModel], /* id */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "setRecord", js.Any.fromFunction2(value))
    
    inline def setSetRecordUndefined: Self = StObject.set(x, "setRecord", js.undefined)
    
    inline def setUpdate(
      value: (/* operation */ js.UndefOr[Any], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
