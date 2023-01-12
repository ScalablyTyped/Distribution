package typings.qiniu.mod

import typings.node.NodeJS.ReadableStream
import typings.node.bufferMod.global.Buffer
import typings.qiniu.anon.Connection
import typings.qiniu.mod.auth.digest.Mac
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpc {
  
  @JSImport("qiniu", "rpc")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(requestUrl: String, headers: Null, callbackFunc: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(requestUrl.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    *
    * @param requestUrl 请求地址
    * @param headers 请求 headers
    * @param callbackFunc 回调函数
    */
  inline def get(requestUrl: String, headers: Headers, callbackFunc: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(requestUrl.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getWithOptions(requestUrl: String, options: Null, callbackFunc: callback): ReturnType[
    js.Function3[
      /* requestUrl */ String, 
      /* headers */ Headers | Null, 
      /* callbackFunc */ callback, 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWithOptions")(requestUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function3[
      /* requestUrl */ String, 
      /* headers */ Headers | Null, 
      /* callbackFunc */ callback, 
      Unit
    ]
  ]]
  /**
    * @param requestUrl 请求地址
    * @param options 请求的配置
    * @param callbackFunc 回调函数
    */
  inline def getWithOptions(requestUrl: String, options: RequestOptions, callbackFunc: callback): ReturnType[
    js.Function3[
      /* requestUrl */ String, 
      /* headers */ Headers | Null, 
      /* callbackFunc */ callback, 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWithOptions")(requestUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function3[
      /* requestUrl */ String, 
      /* headers */ Headers | Null, 
      /* callbackFunc */ callback, 
      Unit
    ]
  ]]
  
  /**
    *
    * @param requestUrl 请求地址
    * @param token 请求认证签名
    * @param callbackFunc 回调函数
    */
  inline def getWithToken(requestUrl: String, token: String, callbackFunc: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getWithToken")(requestUrl.asInstanceOf[js.Any], token.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getWithToken(requestUrl: String, token: Null, callbackFunc: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getWithToken")(requestUrl.asInstanceOf[js.Any], token.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def post(requestURI: String, requestForm: String, headers: Null, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def post(requestURI: String, requestForm: String, headers: Headers, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def post(requestURI: String, requestForm: Null, headers: Null, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def post(requestURI: String, requestForm: Null, headers: Headers, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def post(requestURI: String, requestForm: ReadableStream, headers: Null, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def post(requestURI: String, requestForm: ReadableStream, headers: Headers, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def post(requestURI: String, requestForm: Buffer, headers: Null, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    *
    * @param requestURI
    * @param requestForm
    * @param headers
    * @param callback
    */
  inline def post(requestURI: String, requestForm: Buffer, headers: Headers, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def postMultipart(requestURI: String, requestForm: String, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postMultipart")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def postMultipart(requestURI: String, requestForm: Null, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postMultipart")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def postMultipart(requestURI: String, requestForm: ReadableStream, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postMultipart")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    *
    * @param requestURI
    * @param requestForm
    * @param callback
    */
  inline def postMultipart(requestURI: String, requestForm: Buffer, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postMultipart")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def postWithForm(requestURI: String, requestForm: String, token: String, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postWithForm")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def postWithForm(requestURI: String, requestForm: String, token: Null, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postWithForm")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def postWithForm(requestURI: String, requestForm: Null, token: String, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postWithForm")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def postWithForm(requestURI: String, requestForm: Null, token: Null, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postWithForm")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def postWithForm(requestURI: String, requestForm: ReadableStream, token: String, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postWithForm")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def postWithForm(requestURI: String, requestForm: ReadableStream, token: Null, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postWithForm")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    *
    * @param requestURI
    * @param requestForm
    * @param token
    * @param callback
    */
  inline def postWithForm(requestURI: String, requestForm: Buffer, token: String, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postWithForm")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def postWithForm(requestURI: String, requestForm: Buffer, token: Null, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postWithForm")(requestURI.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def postWithOptions(requestUrl: String, requestForm: String, options: Null, callbackFunc: callback): ReturnType[
    js.Function4[
      /* requestURI */ String, 
      /* requestForm */ Buffer | String | ReadableStream | Null, 
      /* headers */ Headers | Null, 
      /* callback */ callback, 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("postWithOptions")(requestUrl.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* requestURI */ String, 
      /* requestForm */ Buffer | String | ReadableStream | Null, 
      /* headers */ Headers | Null, 
      /* callback */ callback, 
      Unit
    ]
  ]]
  inline def postWithOptions(requestUrl: String, requestForm: String, options: RequestOptions, callbackFunc: callback): ReturnType[
    js.Function4[
      /* requestURI */ String, 
      /* requestForm */ Buffer | String | ReadableStream | Null, 
      /* headers */ Headers | Null, 
      /* callback */ callback, 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("postWithOptions")(requestUrl.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* requestURI */ String, 
      /* requestForm */ Buffer | String | ReadableStream | Null, 
      /* headers */ Headers | Null, 
      /* callback */ callback, 
      Unit
    ]
  ]]
  inline def postWithOptions(requestUrl: String, requestForm: Null, options: Null, callbackFunc: callback): ReturnType[
    js.Function4[
      /* requestURI */ String, 
      /* requestForm */ Buffer | String | ReadableStream | Null, 
      /* headers */ Headers | Null, 
      /* callback */ callback, 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("postWithOptions")(requestUrl.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* requestURI */ String, 
      /* requestForm */ Buffer | String | ReadableStream | Null, 
      /* headers */ Headers | Null, 
      /* callback */ callback, 
      Unit
    ]
  ]]
  inline def postWithOptions(requestUrl: String, requestForm: Null, options: RequestOptions, callbackFunc: callback): ReturnType[
    js.Function4[
      /* requestURI */ String, 
      /* requestForm */ Buffer | String | ReadableStream | Null, 
      /* headers */ Headers | Null, 
      /* callback */ callback, 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("postWithOptions")(requestUrl.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* requestURI */ String, 
      /* requestForm */ Buffer | String | ReadableStream | Null, 
      /* headers */ Headers | Null, 
      /* callback */ callback, 
      Unit
    ]
  ]]
  inline def postWithOptions(requestUrl: String, requestForm: ReadableStream, options: Null, callbackFunc: callback): ReturnType[
    js.Function4[
      /* requestURI */ String, 
      /* requestForm */ Buffer | String | ReadableStream | Null, 
      /* headers */ Headers | Null, 
      /* callback */ callback, 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("postWithOptions")(requestUrl.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* requestURI */ String, 
      /* requestForm */ Buffer | String | ReadableStream | Null, 
      /* headers */ Headers | Null, 
      /* callback */ callback, 
      Unit
    ]
  ]]
  inline def postWithOptions(requestUrl: String, requestForm: ReadableStream, options: RequestOptions, callbackFunc: callback): ReturnType[
    js.Function4[
      /* requestURI */ String, 
      /* requestForm */ Buffer | String | ReadableStream | Null, 
      /* headers */ Headers | Null, 
      /* callback */ callback, 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("postWithOptions")(requestUrl.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* requestURI */ String, 
      /* requestForm */ Buffer | String | ReadableStream | Null, 
      /* headers */ Headers | Null, 
      /* callback */ callback, 
      Unit
    ]
  ]]
  inline def postWithOptions(requestUrl: String, requestForm: Buffer, options: Null, callbackFunc: callback): ReturnType[
    js.Function4[
      /* requestURI */ String, 
      /* requestForm */ Buffer | String | ReadableStream | Null, 
      /* headers */ Headers | Null, 
      /* callback */ callback, 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("postWithOptions")(requestUrl.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* requestURI */ String, 
      /* requestForm */ Buffer | String | ReadableStream | Null, 
      /* headers */ Headers | Null, 
      /* callback */ callback, 
      Unit
    ]
  ]]
  /**
    * @param requestUrl 请求地址
    * @param requestForm 请求体
    * @param options 请求的配置
    * @param callbackFunc 回调函数
    */
  inline def postWithOptions(requestUrl: String, requestForm: Buffer, options: RequestOptions, callbackFunc: callback): ReturnType[
    js.Function4[
      /* requestURI */ String, 
      /* requestForm */ Buffer | String | ReadableStream | Null, 
      /* headers */ Headers | Null, 
      /* callback */ callback, 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("postWithOptions")(requestUrl.asInstanceOf[js.Any], requestForm.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* requestURI */ String, 
      /* requestForm */ Buffer | String | ReadableStream | Null, 
      /* headers */ Headers | Null, 
      /* callback */ callback, 
      Unit
    ]
  ]]
  
  /**
    *
    * @param requestURI
    * @param token
    * @param callback
    */
  inline def postWithoutForm(requestURI: String, token: String, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postWithoutForm")(requestURI.asInstanceOf[js.Any], token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def postWithoutForm(requestURI: String, token: Null, callback: callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postWithoutForm")(requestURI.asInstanceOf[js.Any], token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Headers = (Record[String, String]) & Connection
  
  trait RequestOptions extends StObject {
    
    var headers: Headers
    
    var mac: Mac
  }
  object RequestOptions {
    
    inline def apply(headers: Headers, mac: Mac): RequestOptions = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMac(value: Mac): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    }
  }
}
