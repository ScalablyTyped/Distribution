package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IEvented
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxy {
  
  @js.native
  trait IAjax extends IServer {
    
    /** [Property] (Object) */
    var actionMethods: js.UndefOr[js.Any] = js.native
    
    /** [Method] Performs Ajax request
      * @param operation Ext.data.Operation
      * @param callback Function
      * @param scope Object
      * @returns Object
      */
    @JSName("doRequest")
    var doRequest_IAjax: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[IOperation], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          _
        ]
      ] = js.native
    
    /** [Method] Returns the value of headers
      * @returns Object
      */
    var getHeaders: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the HTTP method name for a given request
      * @param request Ext.data.Request The request object.
      * @returns String The HTTP method to use (should be one of 'GET', 'POST', 'PUT' or 'DELETE').
      */
    var getMethod: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], String]] = js.native
    
    /** [Method] Returns the value of password
      * @returns String
      */
    var getPassword: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of useDefaultXhrHeader
      * @returns Boolean
      */
    var getUseDefaultXhrHeader: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of username
      * @returns String
      */
    var getUsername: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of withCredentials
      * @returns Boolean
      */
    var getWithCredentials: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Config Option] (Object) */
    var headers: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var password: js.UndefOr[String] = js.native
    
    /** [Method] Sets the value of headers
      * @param headers Object The new value.
      */
    var setHeaders: js.UndefOr[js.Function1[/* headers */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of password
      * @param password String The new value.
      */
    var setPassword: js.UndefOr[js.Function1[/* password */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of useDefaultXhrHeader
      * @param useDefaultXhrHeader Boolean The new value.
      */
    var setUseDefaultXhrHeader: js.UndefOr[js.Function1[/* useDefaultXhrHeader */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of username
      * @param username String The new value.
      */
    var setUsername: js.UndefOr[js.Function1[/* username */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of withCredentials
      * @param withCredentials Boolean The new value.
      */
    var setWithCredentials: js.UndefOr[js.Function1[/* withCredentials */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Config Option] (Boolean) */
    var useDefaultXhrHeader: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var username: js.UndefOr[String] = js.native
    
    /** [Config Option] (Boolean) */
    var withCredentials: js.UndefOr[Boolean] = js.native
  }
  object IAjax {
    
    @scala.inline
    def apply(): IAjax = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAjax]
    }
    
    @scala.inline
    implicit class IAjaxMutableBuilder[Self <: IAjax] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionMethods(value: js.Any): Self = StObject.set(x, "actionMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionMethodsUndefined: Self = StObject.set(x, "actionMethods", js.undefined)
      
      @scala.inline
      def setDoRequest(
        value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _
      ): Self = StObject.set(x, "doRequest", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDoRequestUndefined: Self = StObject.set(x, "doRequest", js.undefined)
      
      @scala.inline
      def setGetHeaders(value: () => _): Self = StObject.set(x, "getHeaders", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHeadersUndefined: Self = StObject.set(x, "getHeaders", js.undefined)
      
      @scala.inline
      def setGetMethod(value: /* request */ js.UndefOr[IRequest] => String): Self = StObject.set(x, "getMethod", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMethodUndefined: Self = StObject.set(x, "getMethod", js.undefined)
      
      @scala.inline
      def setGetPassword(value: () => String): Self = StObject.set(x, "getPassword", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPasswordUndefined: Self = StObject.set(x, "getPassword", js.undefined)
      
      @scala.inline
      def setGetUseDefaultXhrHeader(value: () => Boolean): Self = StObject.set(x, "getUseDefaultXhrHeader", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUseDefaultXhrHeaderUndefined: Self = StObject.set(x, "getUseDefaultXhrHeader", js.undefined)
      
      @scala.inline
      def setGetUsername(value: () => String): Self = StObject.set(x, "getUsername", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUsernameUndefined: Self = StObject.set(x, "getUsername", js.undefined)
      
      @scala.inline
      def setGetWithCredentials(value: () => Boolean): Self = StObject.set(x, "getWithCredentials", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWithCredentialsUndefined: Self = StObject.set(x, "getWithCredentials", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setSetHeaders(value: /* headers */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setHeaders", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHeadersUndefined: Self = StObject.set(x, "setHeaders", js.undefined)
      
      @scala.inline
      def setSetPassword(value: /* password */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setPassword", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPasswordUndefined: Self = StObject.set(x, "setPassword", js.undefined)
      
      @scala.inline
      def setSetUseDefaultXhrHeader(value: /* useDefaultXhrHeader */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseDefaultXhrHeader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetUseDefaultXhrHeaderUndefined: Self = StObject.set(x, "setUseDefaultXhrHeader", js.undefined)
      
      @scala.inline
      def setSetUsername(value: /* username */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setUsername", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetUsernameUndefined: Self = StObject.set(x, "setUsername", js.undefined)
      
      @scala.inline
      def setSetWithCredentials(value: /* withCredentials */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setWithCredentials", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetWithCredentialsUndefined: Self = StObject.set(x, "setWithCredentials", js.undefined)
      
      @scala.inline
      def setUseDefaultXhrHeader(value: Boolean): Self = StObject.set(x, "useDefaultXhrHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDefaultXhrHeaderUndefined: Self = StObject.set(x, "useDefaultXhrHeader", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  @js.native
  trait IClient
    extends typings.senchaTouch.Ext.data.proxy.IProxy {
    
    /** [Method] Abstract function that must be implemented by each ClientProxy subclass  */
    var clear: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object IClient {
    
    @scala.inline
    def apply(): IClient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IClient]
    }
    
    @scala.inline
    implicit class IClientMutableBuilder[Self <: IClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    }
  }
  
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
    implicit class IDirectMutableBuilder[Self <: IDirect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuildUrl(value: () => String): Self = StObject.set(x, "buildUrl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBuildUrlUndefined: Self = StObject.set(x, "buildUrl", js.undefined)
      
      @scala.inline
      def setDirectFn(value: js.Any): Self = StObject.set(x, "directFn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectFnUndefined: Self = StObject.set(x, "directFn", js.undefined)
      
      @scala.inline
      def setDoRequest(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "doRequest", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDoRequestUndefined: Self = StObject.set(x, "doRequest", js.undefined)
      
      @scala.inline
      def setGetDirectFn(value: () => _): Self = StObject.set(x, "getDirectFn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDirectFnUndefined: Self = StObject.set(x, "getDirectFn", js.undefined)
      
      @scala.inline
      def setGetParamOrder(value: () => _): Self = StObject.set(x, "getParamOrder", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParamOrderUndefined: Self = StObject.set(x, "getParamOrder", js.undefined)
      
      @scala.inline
      def setGetParamsAsHash(value: () => Boolean): Self = StObject.set(x, "getParamsAsHash", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParamsAsHashUndefined: Self = StObject.set(x, "getParamsAsHash", js.undefined)
      
      @scala.inline
      def setParamOrder(value: js.Any): Self = StObject.set(x, "paramOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamOrderUndefined: Self = StObject.set(x, "paramOrder", js.undefined)
      
      @scala.inline
      def setParamsAsHash(value: Boolean): Self = StObject.set(x, "paramsAsHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsAsHashUndefined: Self = StObject.set(x, "paramsAsHash", js.undefined)
      
      @scala.inline
      def setSetDirectFn(value: /* directFn */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDirectFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDirectFnUndefined: Self = StObject.set(x, "setDirectFn", js.undefined)
      
      @scala.inline
      def setSetParamOrder(value: /* paramOrder */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setParamOrder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetParamOrderUndefined: Self = StObject.set(x, "setParamOrder", js.undefined)
      
      @scala.inline
      def setSetParamsAsHash(value: /* paramsAsHash */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setParamsAsHash", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetParamsAsHashUndefined: Self = StObject.set(x, "setParamsAsHash", js.undefined)
    }
  }
  
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
    def apply(): typings.senchaTouch.Ext.data.proxy.IJsonP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.data.proxy.IJsonP]
    }
    
    @scala.inline
    implicit class IJsonPMutableBuilder[Self <: typings.senchaTouch.Ext.data.proxy.IJsonP] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
      
      @scala.inline
      def setAutoAppendParams(value: Boolean): Self = StObject.set(x, "autoAppendParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAppendParamsUndefined: Self = StObject.set(x, "autoAppendParams", js.undefined)
      
      @scala.inline
      def setCallbackKey(value: String): Self = StObject.set(x, "callbackKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackKeyUndefined: Self = StObject.set(x, "callbackKey", js.undefined)
      
      @scala.inline
      def setDoRequest(
        value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _
      ): Self = StObject.set(x, "doRequest", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDoRequestUndefined: Self = StObject.set(x, "doRequest", js.undefined)
      
      @scala.inline
      def setGetAutoAppendParams(value: () => Boolean): Self = StObject.set(x, "getAutoAppendParams", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAutoAppendParamsUndefined: Self = StObject.set(x, "getAutoAppendParams", js.undefined)
      
      @scala.inline
      def setGetCallbackKey(value: () => String): Self = StObject.set(x, "getCallbackKey", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCallbackKeyUndefined: Self = StObject.set(x, "getCallbackKey", js.undefined)
      
      @scala.inline
      def setGetDefaultWriterType(value: () => String): Self = StObject.set(x, "getDefaultWriterType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDefaultWriterTypeUndefined: Self = StObject.set(x, "getDefaultWriterType", js.undefined)
      
      @scala.inline
      def setGetRecordParam(value: () => String): Self = StObject.set(x, "getRecordParam", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRecordParamUndefined: Self = StObject.set(x, "getRecordParam", js.undefined)
      
      @scala.inline
      def setRecordParam(value: String): Self = StObject.set(x, "recordParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordParamUndefined: Self = StObject.set(x, "recordParam", js.undefined)
      
      @scala.inline
      def setSetAutoAppendParams(value: /* autoAppendParams */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoAppendParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAutoAppendParamsUndefined: Self = StObject.set(x, "setAutoAppendParams", js.undefined)
      
      @scala.inline
      def setSetCallbackKey(value: /* callbackKey */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setCallbackKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetCallbackKeyUndefined: Self = StObject.set(x, "setCallbackKey", js.undefined)
      
      @scala.inline
      def setSetDefaultWriterType(value: /* defaultWriterType */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDefaultWriterType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDefaultWriterTypeUndefined: Self = StObject.set(x, "setDefaultWriterType", js.undefined)
      
      @scala.inline
      def setSetRecordParam(value: /* recordParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setRecordParam", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRecordParamUndefined: Self = StObject.set(x, "setRecordParam", js.undefined)
    }
  }
  
  type ILocalStorage = IWebStorage
  
  @js.native
  trait IMemory extends IClient {
    
    /** [Config Option] (Object) */
    var data: js.UndefOr[js.Any] = js.native
    
    /** [Method] Returns the value of data
      * @returns Object
      */
    var getData: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Sets the value of data
      * @param data Object The new value.
      */
    var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object IMemory {
    
    @scala.inline
    def apply(): IMemory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMemory]
    }
    
    @scala.inline
    implicit class IMemoryMutableBuilder[Self <: IMemory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setGetData(value: () => _): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
      
      @scala.inline
      def setSetData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
    }
  }
  
  @js.native
  trait IProxy extends IEvented {
    
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
    var destroy_IProxy: js.UndefOr[
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
  object IProxy {
    
    @scala.inline
    def apply(): typings.senchaTouch.Ext.data.proxy.IProxy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.data.proxy.IProxy]
    }
    
    @scala.inline
    implicit class IProxyMutableBuilder[Self <: typings.senchaTouch.Ext.data.proxy.IProxy] (val x: Self) extends AnyVal {
      
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
  
  @js.native
  trait IRest extends IAjax {
    
    /** [Config Option] (Boolean) */
    var appendId: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var format: js.UndefOr[String] = js.native
    
    /** [Method] Returns the value of actionMethods
      * @returns Object
      */
    var getActionMethods: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of appendId
      * @returns Boolean
      */
    var getAppendId: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of format
      * @returns String
      */
    var getFormat: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Sets the value of actionMethods
      * @param actionMethods Object The new value.
      */
    var setActionMethods: js.UndefOr[js.Function1[/* actionMethods */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of appendId
      * @param appendId Boolean The new value.
      */
    var setAppendId: js.UndefOr[js.Function1[/* appendId */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of format
      * @param format String The new value.
      */
    var setFormat: js.UndefOr[js.Function1[/* format */ js.UndefOr[String], Unit]] = js.native
  }
  object IRest {
    
    @scala.inline
    def apply(): IRest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRest]
    }
    
    @scala.inline
    implicit class IRestMutableBuilder[Self <: IRest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendId(value: Boolean): Self = StObject.set(x, "appendId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendIdUndefined: Self = StObject.set(x, "appendId", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGetActionMethods(value: () => _): Self = StObject.set(x, "getActionMethods", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetActionMethodsUndefined: Self = StObject.set(x, "getActionMethods", js.undefined)
      
      @scala.inline
      def setGetAppendId(value: () => Boolean): Self = StObject.set(x, "getAppendId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAppendIdUndefined: Self = StObject.set(x, "getAppendId", js.undefined)
      
      @scala.inline
      def setGetFormat(value: () => String): Self = StObject.set(x, "getFormat", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFormatUndefined: Self = StObject.set(x, "getFormat", js.undefined)
      
      @scala.inline
      def setSetActionMethods(value: /* actionMethods */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setActionMethods", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetActionMethodsUndefined: Self = StObject.set(x, "setActionMethods", js.undefined)
      
      @scala.inline
      def setSetAppendId(value: /* appendId */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAppendId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAppendIdUndefined: Self = StObject.set(x, "setAppendId", js.undefined)
      
      @scala.inline
      def setSetFormat(value: /* format */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFormatUndefined: Self = StObject.set(x, "setFormat", js.undefined)
    }
  }
  
  @js.native
  trait IServer
    extends typings.senchaTouch.Ext.data.proxy.IProxy {
    
    /** [Method] Optional callback function which can be used to clean up after a request has been completed
      * @param request Ext.data.Request The Request object
      * @param success Boolean True if the request was successful
      */
    var afterRequest: js.UndefOr[
        js.Function2[/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean], Unit]
      ] = js.native
    
    /** [Config Option] (Object) */
    var api: js.UndefOr[js.Any] = js.native
    
    /** [Method] Creates and returns an Ext data Request object based on the options passed by the Store that this Proxy is attached to
      * @param operation Ext.data.Operation The Operation object to execute
      * @returns Ext.data.Request The request object
      */
    var buildRequest: js.UndefOr[js.Function1[/* operation */ js.UndefOr[IOperation], IRequest]] = js.native
    
    /** [Method] Generates a url based on a given Ext data Request object
      * @param request Ext.data.Request The request object
      * @returns String The url
      */
    var buildUrl: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], String]] = js.native
    
    /** [Config Option] (String) */
    var cacheString: js.UndefOr[String] = js.native
    
    /** [Method] in a ServerProxy all four CRUD operations are executed in the same manner so we delegate to doRequest in each case */
    @JSName("create")
    var create_IServer: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (String) */
    var directionParam: js.UndefOr[String] = js.native
    
    /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
      * @param operation Ext.data.Operation The Ext.data.Operation object
      * @param callback Function The callback function to call when the Operation has completed
      * @param scope Object The scope in which to execute the callback
      */
    var doRequest: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[IOperation], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
    
    /** [Config Option] (Boolean) */
    var enablePagingParams: js.UndefOr[Boolean] = js.native
    
    /** [Method] Encodes the array of Ext util Filter objects into a string to be sent in the request url
      * @param filters Ext.util.Filter[] The array of Filter objects
      * @returns String The encoded filters
      */
    var encodeFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], String]] = js.native
    
    /** [Method] Encodes the array of Ext util Sorter objects into a string to be sent in the request url
      * @param sorters Ext.util.Sorter[] The array of Sorter objects
      * @returns String The encoded sorters
      */
    var encodeSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], String]] = js.native
    
    /** [Config Option] (Object) */
    var extraParams: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var filterParam: js.UndefOr[String] = js.native
    
    /** [Method] Returns the value of api
      * @returns Object
      */
    var getApi: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of cacheString
      * @returns String
      */
    var getCacheString: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of directionParam
      * @returns String
      */
    var getDirectionParam: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of enablePagingParams
      * @returns Boolean
      */
    var getEnablePagingParams: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of extraParams
      * @returns Object
      */
    var getExtraParams: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of filterParam
      * @returns String
      */
    var getFilterParam: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of groupParam
      * @returns String
      */
    var getGroupParam: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of limitParam
      * @returns String
      */
    var getLimitParam: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of noCache
      * @returns Boolean
      */
    var getNoCache: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of pageParam
      * @returns String
      */
    var getPageParam: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of simpleSortMode
      * @returns Boolean
      */
    var getSimpleSortMode: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of sortParam
      * @returns String
      */
    var getSortParam: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of startParam
      * @returns String
      */
    var getStartParam: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of timeout
      * @returns Number
      */
    var getTimeout: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Config Option] (String) */
    var groupParam: js.UndefOr[String] = js.native
    
    /** [Config Option] (String) */
    var limitParam: js.UndefOr[String] = js.native
    
    /** [Config Option] (Boolean) */
    var noCache: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var pageParam: js.UndefOr[String] = js.native
    
    /** [Method] This method handles the processing of the response and is usually overridden by subclasses to do additional processing
      * @param success Boolean Whether or not this request was successful
      * @param operation Ext.data.Operation The operation we made this request for
      * @param request Ext.data.Request The request that was made
      * @param response Object The response that we got
      * @param callback Function The callback to be fired onces the response is processed
      * @param scope Object The scope in which we call the callback
      */
    var processResponse: js.UndefOr[
        js.Function6[
          /* success */ js.UndefOr[Boolean], 
          /* operation */ js.UndefOr[IOperation], 
          /* request */ js.UndefOr[IRequest], 
          /* response */ js.UndefOr[js.Any], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Performs the given read operation  */
    @JSName("read")
    var read_IServer: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Sets the value of api
      * @param api Object The new value.
      */
    var setApi: js.UndefOr[js.Function1[/* api */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of cacheString
      * @param cacheString String The new value.
      */
    var setCacheString: js.UndefOr[js.Function1[/* cacheString */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of directionParam
      * @param directionParam String The new value.
      */
    var setDirectionParam: js.UndefOr[js.Function1[/* directionParam */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of enablePagingParams
      * @param enablePagingParams Boolean The new value.
      */
    var setEnablePagingParams: js.UndefOr[js.Function1[/* enablePagingParams */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets a value in the underlying extraParams
      * @param name String The key for the new value
      * @param value Object The value
      */
    var setExtraParam: js.UndefOr[
        js.Function2[/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], Unit]
      ] = js.native
    
    /** [Method] Sets the value of extraParams
      * @param extraParams Object The new value.
      */
    var setExtraParams: js.UndefOr[js.Function1[/* extraParams */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of filterParam
      * @param filterParam String The new value.
      */
    var setFilterParam: js.UndefOr[js.Function1[/* filterParam */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of groupParam
      * @param groupParam String The new value.
      */
    var setGroupParam: js.UndefOr[js.Function1[/* groupParam */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of limitParam
      * @param limitParam String The new value.
      */
    var setLimitParam: js.UndefOr[js.Function1[/* limitParam */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of noCache
      * @param noCache Boolean The new value.
      */
    var setNoCache: js.UndefOr[js.Function1[/* noCache */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of pageParam
      * @param pageParam String The new value.
      */
    var setPageParam: js.UndefOr[js.Function1[/* pageParam */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of simpleSortMode
      * @param simpleSortMode Boolean The new value.
      */
    var setSimpleSortMode: js.UndefOr[js.Function1[/* simpleSortMode */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of sortParam
      * @param sortParam String The new value.
      */
    var setSortParam: js.UndefOr[js.Function1[/* sortParam */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of startParam
      * @param startParam String The new value.
      */
    var setStartParam: js.UndefOr[js.Function1[/* startParam */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of timeout
      * @param timeout Number The new value.
      */
    var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Sets the value of url
      * @param url String The new value.
      */
    var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.native
    
    /** [Config Option] (Boolean) */
    var simpleSortMode: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var sortParam: js.UndefOr[String] = js.native
    
    /** [Config Option] (String) */
    var startParam: js.UndefOr[String] = js.native
    
    /** [Config Option] (Number) */
    var timeout: js.UndefOr[Double] = js.native
    
    /** [Method] Performs the given update operation  */
    @JSName("update")
    var update_IServer: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (String) */
    var url: js.UndefOr[String] = js.native
  }
  object IServer {
    
    @scala.inline
    def apply(): IServer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IServer]
    }
    
    @scala.inline
    implicit class IServerMutableBuilder[Self <: IServer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterRequest(value: (/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "afterRequest", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAfterRequestUndefined: Self = StObject.set(x, "afterRequest", js.undefined)
      
      @scala.inline
      def setApi(value: js.Any): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      @scala.inline
      def setBuildRequest(value: /* operation */ js.UndefOr[IOperation] => IRequest): Self = StObject.set(x, "buildRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBuildRequestUndefined: Self = StObject.set(x, "buildRequest", js.undefined)
      
      @scala.inline
      def setBuildUrl(value: /* request */ js.UndefOr[IRequest] => String): Self = StObject.set(x, "buildUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBuildUrlUndefined: Self = StObject.set(x, "buildUrl", js.undefined)
      
      @scala.inline
      def setCacheString(value: String): Self = StObject.set(x, "cacheString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheStringUndefined: Self = StObject.set(x, "cacheString", js.undefined)
      
      @scala.inline
      def setCreate(value: () => Unit): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setDirectionParam(value: String): Self = StObject.set(x, "directionParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionParamUndefined: Self = StObject.set(x, "directionParam", js.undefined)
      
      @scala.inline
      def setDoRequest(
        value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "doRequest", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDoRequestUndefined: Self = StObject.set(x, "doRequest", js.undefined)
      
      @scala.inline
      def setEnablePagingParams(value: Boolean): Self = StObject.set(x, "enablePagingParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePagingParamsUndefined: Self = StObject.set(x, "enablePagingParams", js.undefined)
      
      @scala.inline
      def setEncodeFilters(value: /* filters */ js.UndefOr[Array] => String): Self = StObject.set(x, "encodeFilters", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodeFiltersUndefined: Self = StObject.set(x, "encodeFilters", js.undefined)
      
      @scala.inline
      def setEncodeSorters(value: /* sorters */ js.UndefOr[Array] => String): Self = StObject.set(x, "encodeSorters", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodeSortersUndefined: Self = StObject.set(x, "encodeSorters", js.undefined)
      
      @scala.inline
      def setExtraParams(value: js.Any): Self = StObject.set(x, "extraParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraParamsUndefined: Self = StObject.set(x, "extraParams", js.undefined)
      
      @scala.inline
      def setFilterParam(value: String): Self = StObject.set(x, "filterParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterParamUndefined: Self = StObject.set(x, "filterParam", js.undefined)
      
      @scala.inline
      def setGetApi(value: () => _): Self = StObject.set(x, "getApi", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetApiUndefined: Self = StObject.set(x, "getApi", js.undefined)
      
      @scala.inline
      def setGetCacheString(value: () => String): Self = StObject.set(x, "getCacheString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCacheStringUndefined: Self = StObject.set(x, "getCacheString", js.undefined)
      
      @scala.inline
      def setGetDirectionParam(value: () => String): Self = StObject.set(x, "getDirectionParam", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDirectionParamUndefined: Self = StObject.set(x, "getDirectionParam", js.undefined)
      
      @scala.inline
      def setGetEnablePagingParams(value: () => Boolean): Self = StObject.set(x, "getEnablePagingParams", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEnablePagingParamsUndefined: Self = StObject.set(x, "getEnablePagingParams", js.undefined)
      
      @scala.inline
      def setGetExtraParams(value: () => _): Self = StObject.set(x, "getExtraParams", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetExtraParamsUndefined: Self = StObject.set(x, "getExtraParams", js.undefined)
      
      @scala.inline
      def setGetFilterParam(value: () => String): Self = StObject.set(x, "getFilterParam", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFilterParamUndefined: Self = StObject.set(x, "getFilterParam", js.undefined)
      
      @scala.inline
      def setGetGroupParam(value: () => String): Self = StObject.set(x, "getGroupParam", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetGroupParamUndefined: Self = StObject.set(x, "getGroupParam", js.undefined)
      
      @scala.inline
      def setGetLimitParam(value: () => String): Self = StObject.set(x, "getLimitParam", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLimitParamUndefined: Self = StObject.set(x, "getLimitParam", js.undefined)
      
      @scala.inline
      def setGetNoCache(value: () => Boolean): Self = StObject.set(x, "getNoCache", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNoCacheUndefined: Self = StObject.set(x, "getNoCache", js.undefined)
      
      @scala.inline
      def setGetPageParam(value: () => String): Self = StObject.set(x, "getPageParam", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPageParamUndefined: Self = StObject.set(x, "getPageParam", js.undefined)
      
      @scala.inline
      def setGetSimpleSortMode(value: () => Boolean): Self = StObject.set(x, "getSimpleSortMode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSimpleSortModeUndefined: Self = StObject.set(x, "getSimpleSortMode", js.undefined)
      
      @scala.inline
      def setGetSortParam(value: () => String): Self = StObject.set(x, "getSortParam", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSortParamUndefined: Self = StObject.set(x, "getSortParam", js.undefined)
      
      @scala.inline
      def setGetStartParam(value: () => String): Self = StObject.set(x, "getStartParam", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStartParamUndefined: Self = StObject.set(x, "getStartParam", js.undefined)
      
      @scala.inline
      def setGetTimeout(value: () => Double): Self = StObject.set(x, "getTimeout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTimeoutUndefined: Self = StObject.set(x, "getTimeout", js.undefined)
      
      @scala.inline
      def setGroupParam(value: String): Self = StObject.set(x, "groupParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupParamUndefined: Self = StObject.set(x, "groupParam", js.undefined)
      
      @scala.inline
      def setLimitParam(value: String): Self = StObject.set(x, "limitParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitParamUndefined: Self = StObject.set(x, "limitParam", js.undefined)
      
      @scala.inline
      def setNoCache(value: Boolean): Self = StObject.set(x, "noCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCacheUndefined: Self = StObject.set(x, "noCache", js.undefined)
      
      @scala.inline
      def setPageParam(value: String): Self = StObject.set(x, "pageParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageParamUndefined: Self = StObject.set(x, "pageParam", js.undefined)
      
      @scala.inline
      def setProcessResponse(
        value: (/* success */ js.UndefOr[Boolean], /* operation */ js.UndefOr[IOperation], /* request */ js.UndefOr[IRequest], /* response */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "processResponse", js.Any.fromFunction6(value))
      
      @scala.inline
      def setProcessResponseUndefined: Self = StObject.set(x, "processResponse", js.undefined)
      
      @scala.inline
      def setRead(value: () => Unit): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setSetApi(value: /* api */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setApi", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetApiUndefined: Self = StObject.set(x, "setApi", js.undefined)
      
      @scala.inline
      def setSetCacheString(value: /* cacheString */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setCacheString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetCacheStringUndefined: Self = StObject.set(x, "setCacheString", js.undefined)
      
      @scala.inline
      def setSetDirectionParam(value: /* directionParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDirectionParam", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDirectionParamUndefined: Self = StObject.set(x, "setDirectionParam", js.undefined)
      
      @scala.inline
      def setSetEnablePagingParams(value: /* enablePagingParams */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setEnablePagingParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetEnablePagingParamsUndefined: Self = StObject.set(x, "setEnablePagingParams", js.undefined)
      
      @scala.inline
      def setSetExtraParam(value: (/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setExtraParam", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetExtraParamUndefined: Self = StObject.set(x, "setExtraParam", js.undefined)
      
      @scala.inline
      def setSetExtraParams(value: /* extraParams */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setExtraParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetExtraParamsUndefined: Self = StObject.set(x, "setExtraParams", js.undefined)
      
      @scala.inline
      def setSetFilterParam(value: /* filterParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setFilterParam", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFilterParamUndefined: Self = StObject.set(x, "setFilterParam", js.undefined)
      
      @scala.inline
      def setSetGroupParam(value: /* groupParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setGroupParam", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetGroupParamUndefined: Self = StObject.set(x, "setGroupParam", js.undefined)
      
      @scala.inline
      def setSetLimitParam(value: /* limitParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setLimitParam", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLimitParamUndefined: Self = StObject.set(x, "setLimitParam", js.undefined)
      
      @scala.inline
      def setSetNoCache(value: /* noCache */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setNoCache", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetNoCacheUndefined: Self = StObject.set(x, "setNoCache", js.undefined)
      
      @scala.inline
      def setSetPageParam(value: /* pageParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setPageParam", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPageParamUndefined: Self = StObject.set(x, "setPageParam", js.undefined)
      
      @scala.inline
      def setSetSimpleSortMode(value: /* simpleSortMode */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setSimpleSortMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSimpleSortModeUndefined: Self = StObject.set(x, "setSimpleSortMode", js.undefined)
      
      @scala.inline
      def setSetSortParam(value: /* sortParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setSortParam", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSortParamUndefined: Self = StObject.set(x, "setSortParam", js.undefined)
      
      @scala.inline
      def setSetStartParam(value: /* startParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setStartParam", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStartParamUndefined: Self = StObject.set(x, "setStartParam", js.undefined)
      
      @scala.inline
      def setSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
      
      @scala.inline
      def setSetUrl(value: /* url */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetUrlUndefined: Self = StObject.set(x, "setUrl", js.undefined)
      
      @scala.inline
      def setSimpleSortMode(value: Boolean): Self = StObject.set(x, "simpleSortMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleSortModeUndefined: Self = StObject.set(x, "simpleSortMode", js.undefined)
      
      @scala.inline
      def setSortParam(value: String): Self = StObject.set(x, "sortParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortParamUndefined: Self = StObject.set(x, "sortParam", js.undefined)
      
      @scala.inline
      def setStartParam(value: String): Self = StObject.set(x, "startParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartParamUndefined: Self = StObject.set(x, "startParam", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type ISessionStorage = IWebStorage
  
  @js.native
  trait ISql extends IClient {
    
    /** [Method] Performs the given create operation
      * @param operation Object
      * @param callback Object
      * @param scope Object
      */
    @JSName("create")
    var create_ISql: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[js.Any], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
    
    /** [Config Option] (String) */
    var database: js.UndefOr[String] = js.native
    
    /** [Method] Performs the given destroy operation
      * @param operation Object
      * @param callback Object
      * @param scope Object
      */
    @JSName("destroy")
    var destroy_ISql: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[js.Any], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Returns the value of columns
      * @returns String
      */
    var getColumns: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of database
      * @returns String
      */
    var getDatabase: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of defaultDateFormat
      * @returns String
      */
    var getDefaultDateFormat: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Formats the data for each record before sending it to the server
      * @param record Object The record that we are writing to the server.
      * @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
      */
    var getRecordData: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], _]] = js.native
    
    /** [Method] Returns the value of table
      * @returns String
      */
    var getTable: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of tableExists
      * @returns Boolean
      */
    var getTableExists: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of uniqueIdStrategy
      * @returns Boolean
      */
    var getUniqueIdStrategy: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Performs the given read operation
      * @param operation Object
      * @param callback Object
      * @param scope Object
      */
    @JSName("read")
    var read_ISql: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[js.Any], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Sets the value of columns
      * @param columns String The new value.
      */
    var setColumns: js.UndefOr[js.Function1[/* columns */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of database
      * @param database String The new value.
      */
    var setDatabase: js.UndefOr[js.Function1[/* database */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of defaultDateFormat
      * @param defaultDateFormat String The new value.
      */
    var setDefaultDateFormat: js.UndefOr[js.Function1[/* defaultDateFormat */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of table
      * @param table String The new value.
      */
    var setTable: js.UndefOr[js.Function1[/* table */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of tableExists
      * @param tableExists Boolean The new value.
      */
    var setTableExists: js.UndefOr[js.Function1[/* tableExists */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of uniqueIdStrategy
      * @param uniqueIdStrategy Boolean The new value.
      */
    var setUniqueIdStrategy: js.UndefOr[js.Function1[/* uniqueIdStrategy */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Config Option] (String) */
    var table: js.UndefOr[String] = js.native
    
    /** [Method] Performs the given update operation
      * @param operation Object
      * @param callback Object
      * @param scope Object
      */
    @JSName("update")
    var update_ISql: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[js.Any], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
  }
  object ISql {
    
    @scala.inline
    def apply(): ISql = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISql]
    }
    
    @scala.inline
    implicit class ISqlMutableBuilder[Self <: ISql] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setDestroy(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "destroy", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setGetColumns(value: () => String): Self = StObject.set(x, "getColumns", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetColumnsUndefined: Self = StObject.set(x, "getColumns", js.undefined)
      
      @scala.inline
      def setGetDatabase(value: () => String): Self = StObject.set(x, "getDatabase", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDatabaseUndefined: Self = StObject.set(x, "getDatabase", js.undefined)
      
      @scala.inline
      def setGetDefaultDateFormat(value: () => String): Self = StObject.set(x, "getDefaultDateFormat", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDefaultDateFormatUndefined: Self = StObject.set(x, "getDefaultDateFormat", js.undefined)
      
      @scala.inline
      def setGetRecordData(value: /* record */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "getRecordData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRecordDataUndefined: Self = StObject.set(x, "getRecordData", js.undefined)
      
      @scala.inline
      def setGetTable(value: () => String): Self = StObject.set(x, "getTable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTableExists(value: () => Boolean): Self = StObject.set(x, "getTableExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTableExistsUndefined: Self = StObject.set(x, "getTableExists", js.undefined)
      
      @scala.inline
      def setGetTableUndefined: Self = StObject.set(x, "getTable", js.undefined)
      
      @scala.inline
      def setGetUniqueIdStrategy(value: () => Boolean): Self = StObject.set(x, "getUniqueIdStrategy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUniqueIdStrategyUndefined: Self = StObject.set(x, "getUniqueIdStrategy", js.undefined)
      
      @scala.inline
      def setRead(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setSetColumns(value: /* columns */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setColumns", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetColumnsUndefined: Self = StObject.set(x, "setColumns", js.undefined)
      
      @scala.inline
      def setSetDatabase(value: /* database */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDatabase", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDatabaseUndefined: Self = StObject.set(x, "setDatabase", js.undefined)
      
      @scala.inline
      def setSetDefaultDateFormat(value: /* defaultDateFormat */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDefaultDateFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDefaultDateFormatUndefined: Self = StObject.set(x, "setDefaultDateFormat", js.undefined)
      
      @scala.inline
      def setSetTable(value: /* table */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setTable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTableExists(value: /* tableExists */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setTableExists", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTableExistsUndefined: Self = StObject.set(x, "setTableExists", js.undefined)
      
      @scala.inline
      def setSetTableUndefined: Self = StObject.set(x, "setTable", js.undefined)
      
      @scala.inline
      def setSetUniqueIdStrategy(value: /* uniqueIdStrategy */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUniqueIdStrategy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetUniqueIdStrategyUndefined: Self = StObject.set(x, "setUniqueIdStrategy", js.undefined)
      
      @scala.inline
      def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      @scala.inline
      def setUpdate(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  @js.native
  trait IWebStorage extends IClient {
    
    /** [Property] (Object) */
    var cache: js.UndefOr[js.Any] = js.native
    
    /** [Method] inherit docs
      * @param operation Object
      * @param callback Object
      * @param scope Object
      */
    @JSName("create")
    var create_IWebStorage: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[js.Any], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
    
    /** [Method] inherit
      * @param operation Object
      * @param callback Object
      * @param scope Object
      */
    @JSName("destroy")
    var destroy_IWebStorage: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[js.Any], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
    
    /** [Config Option] (Boolean) */
    var enablePagingParams: js.UndefOr[Boolean] = js.native
    
    /** [Method] Returns the value of defaultDateFormat
      * @returns String
      */
    var getDefaultDateFormat: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of enablePagingParams
      * @returns Boolean
      */
    var getEnablePagingParams: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of id
      * @returns String
      */
    @JSName("getId")
    var getId_IWebStorage: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Config Option] (String) */
    var id: js.UndefOr[String] = js.native
    
    /** [Method] inherit docs
      * @param operation Object
      * @param callback Object
      * @param scope Object
      */
    @JSName("read")
    var read_IWebStorage: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[js.Any], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Sets the value of defaultDateFormat
      * @param defaultDateFormat String The new value.
      */
    var setDefaultDateFormat: js.UndefOr[js.Function1[/* defaultDateFormat */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of enablePagingParams
      * @param enablePagingParams Boolean The new value.
      */
    var setEnablePagingParams: js.UndefOr[js.Function1[/* enablePagingParams */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of id
      * @param id String The new value.
      */
    var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Saves the given record in the Proxy
      * @param record Ext.data.Model The model instance
      * @param id String The id to save the record under (defaults to the value of the record's getId() function)
      */
    var setRecord: js.UndefOr[js.Function2[/* record */ js.UndefOr[IModel], /* id */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] inherit docs
      * @param operation Object
      * @param callback Object
      * @param scope Object
      */
    @JSName("update")
    var update_IWebStorage: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[js.Any], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
  }
  object IWebStorage {
    
    @scala.inline
    def apply(): IWebStorage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWebStorage]
    }
    
    @scala.inline
    implicit class IWebStorageMutableBuilder[Self <: IWebStorage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: js.Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCreate(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setDestroy(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "destroy", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEnablePagingParams(value: Boolean): Self = StObject.set(x, "enablePagingParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePagingParamsUndefined: Self = StObject.set(x, "enablePagingParams", js.undefined)
      
      @scala.inline
      def setGetDefaultDateFormat(value: () => String): Self = StObject.set(x, "getDefaultDateFormat", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDefaultDateFormatUndefined: Self = StObject.set(x, "getDefaultDateFormat", js.undefined)
      
      @scala.inline
      def setGetEnablePagingParams(value: () => Boolean): Self = StObject.set(x, "getEnablePagingParams", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEnablePagingParamsUndefined: Self = StObject.set(x, "getEnablePagingParams", js.undefined)
      
      @scala.inline
      def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setRead(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setSetDefaultDateFormat(value: /* defaultDateFormat */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDefaultDateFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDefaultDateFormatUndefined: Self = StObject.set(x, "setDefaultDateFormat", js.undefined)
      
      @scala.inline
      def setSetEnablePagingParams(value: /* enablePagingParams */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setEnablePagingParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetEnablePagingParamsUndefined: Self = StObject.set(x, "setEnablePagingParams", js.undefined)
      
      @scala.inline
      def setSetId(value: /* id */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIdUndefined: Self = StObject.set(x, "setId", js.undefined)
      
      @scala.inline
      def setSetRecord(value: (/* record */ js.UndefOr[IModel], /* id */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "setRecord", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetRecordUndefined: Self = StObject.set(x, "setRecord", js.undefined)
      
      @scala.inline
      def setUpdate(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
}
