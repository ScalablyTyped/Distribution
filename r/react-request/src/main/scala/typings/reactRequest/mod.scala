package typings.reactRequest

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.RequestInit
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-request", "Fetch")
  @js.native
  open class Fetch[T] protected ()
    extends Component[FetchProps[T], js.Object, Any] {
    def this(props: FetchProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FetchProps[T], context: Any) = this()
  }
  
  inline def clearRequestCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearRequestCache")().asInstanceOf[Unit]
  
  inline def clearResponseCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearResponseCache")().asInstanceOf[Unit]
  
  inline def fetchDedupe(input: Any): js.Promise[ProxyRequest] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchDedupe")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ProxyRequest]]
  inline def fetchDedupe(input: Any, init: Any): js.Promise[ProxyRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchDedupe")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProxyRequest]]
  inline def fetchDedupe(input: Any, init: Any, dedupeOptions: Any): js.Promise[ProxyRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchDedupe")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any], dedupeOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProxyRequest]]
  inline def fetchDedupe(input: Any, init: Unit, dedupeOptions: Any): js.Promise[ProxyRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchDedupe")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any], dedupeOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProxyRequest]]
  
  inline def getRequestKey(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequestKey")().asInstanceOf[String]
  inline def getRequestKey(keyOptions: RequestKeyOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequestKey")(keyOptions.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isRequestInFlight(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequestInFlight")().asInstanceOf[Boolean]
  
  type DoFetch[T] = js.Function1[/* options */ js.UndefOr[DoFetchOptions], js.Promise[FetchResponse[T]]]
  
  trait DoFetchOptions
    extends StObject
       with RequestInit {
    
    var url: js.UndefOr[String] = js.undefined
  }
  object DoFetchOptions {
    
    inline def apply(): DoFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoFetchOptions]
    }
    
    extension [Self <: DoFetchOptions](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait FetchProps[T]
    extends StObject
       with FetchRequestProps {
    
    var afterFetch: js.UndefOr[js.Function1[/* args */ FetchResponse[T], Unit]] = js.undefined
    
    var children: js.UndefOr[js.Function1[/* renderProps */ RenderProps[T], ReactNode]] = js.undefined
    
    var responseType: js.UndefOr[ResponseType] = js.undefined
    
    var transformData: js.UndefOr[js.Function1[/* data */ Any, T]] = js.undefined
  }
  object FetchProps {
    
    inline def apply[T](url: String): FetchProps[T] = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchProps[T]]
    }
    
    extension [Self <: FetchProps[?], T](x: Self & FetchProps[T]) {
      
      inline def setAfterFetch(value: /* args */ FetchResponse[T] => Unit): Self = StObject.set(x, "afterFetch", js.Any.fromFunction1(value))
      
      inline def setAfterFetchUndefined: Self = StObject.set(x, "afterFetch", js.undefined)
      
      inline def setChildren(value: /* renderProps */ RenderProps[T] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setResponseType(value: ResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setTransformData(value: /* data */ Any => T): Self = StObject.set(x, "transformData", js.Any.fromFunction1(value))
      
      inline def setTransformDataUndefined: Self = StObject.set(x, "transformData", js.undefined)
    }
  }
  
  trait FetchRequestProps
    extends StObject
       with RequestInit {
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var url: String
  }
  object FetchRequestProps {
    
    inline def apply(url: String): FetchRequestProps = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchRequestProps]
    }
    
    extension [Self <: FetchRequestProps](x: Self) {
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FetchResponse[T] extends StObject {
    
    var data: T | Null
    
    var didUnmount: Boolean
    
    var error: js.Error | Null
    
    var failed: Boolean
    
    var init: Any
    
    var requestKey: String
    
    var response: Response | Null
    
    var url: String
  }
  object FetchResponse {
    
    inline def apply[T](didUnmount: Boolean, failed: Boolean, init: Any, requestKey: String, url: String): FetchResponse[T] = {
      val __obj = js.Dynamic.literal(didUnmount = didUnmount.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], requestKey = requestKey.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], data = null, error = null, response = null)
      __obj.asInstanceOf[FetchResponse[T]]
    }
    
    extension [Self <: FetchResponse[?], T](x: Self & FetchResponse[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setDidUnmount(value: Boolean): Self = StObject.set(x, "didUnmount", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setFailed(value: Boolean): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setInit(value: Any): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setRequestKey(value: String): Self = StObject.set(x, "requestKey", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseNull: Self = StObject.set(x, "response", null)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProxyRequest extends StObject {
    
    var requestKey: String
    
    var res: Response
  }
  object ProxyRequest {
    
    inline def apply(requestKey: String, res: Response): ProxyRequest = {
      val __obj = js.Dynamic.literal(requestKey = requestKey.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyRequest]
    }
    
    extension [Self <: ProxyRequest](x: Self) {
      
      inline def setRequestKey(value: String): Self = StObject.set(x, "requestKey", value.asInstanceOf[js.Any])
      
      inline def setRes(value: Response): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenderProps[T]
    extends StObject
       with FetchResponse[T] {
    
    var doFetch: DoFetch[T]
    
    var fetching: Boolean
    
    var requestName: String
  }
  object RenderProps {
    
    inline def apply[T](
      didUnmount: Boolean,
      doFetch: /* options */ js.UndefOr[DoFetchOptions] => js.Promise[FetchResponse[T]],
      failed: Boolean,
      fetching: Boolean,
      init: Any,
      requestKey: String,
      requestName: String,
      url: String
    ): RenderProps[T] = {
      val __obj = js.Dynamic.literal(didUnmount = didUnmount.asInstanceOf[js.Any], doFetch = js.Any.fromFunction1(doFetch), failed = failed.asInstanceOf[js.Any], fetching = fetching.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], requestKey = requestKey.asInstanceOf[js.Any], requestName = requestName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], data = null, error = null, response = null)
      __obj.asInstanceOf[RenderProps[T]]
    }
    
    extension [Self <: RenderProps[?], T](x: Self & RenderProps[T]) {
      
      inline def setDoFetch(value: /* options */ js.UndefOr[DoFetchOptions] => js.Promise[FetchResponse[T]]): Self = StObject.set(x, "doFetch", js.Any.fromFunction1(value))
      
      inline def setFetching(value: Boolean): Self = StObject.set(x, "fetching", value.asInstanceOf[js.Any])
      
      inline def setRequestName(value: String): Self = StObject.set(x, "requestName", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestKeyOptions extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var responseType: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object RequestKeyOptions {
    
    inline def apply(): RequestKeyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestKeyOptions]
    }
    
    extension [Self <: RequestKeyOptions](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactRequest.reactRequestStrings.arrayBuffer
    - typings.reactRequest.reactRequestStrings.blob
    - typings.reactRequest.reactRequestStrings.formData
    - typings.reactRequest.reactRequestStrings.json
    - typings.reactRequest.reactRequestStrings.text
  */
  trait ResponseType extends StObject
  object ResponseType {
    
    inline def arrayBuffer: typings.reactRequest.reactRequestStrings.arrayBuffer = "arrayBuffer".asInstanceOf[typings.reactRequest.reactRequestStrings.arrayBuffer]
    
    inline def blob: typings.reactRequest.reactRequestStrings.blob = "blob".asInstanceOf[typings.reactRequest.reactRequestStrings.blob]
    
    inline def formData: typings.reactRequest.reactRequestStrings.formData = "formData".asInstanceOf[typings.reactRequest.reactRequestStrings.formData]
    
    inline def json: typings.reactRequest.reactRequestStrings.json = "json".asInstanceOf[typings.reactRequest.reactRequestStrings.json]
    
    inline def text: typings.reactRequest.reactRequestStrings.text = "text".asInstanceOf[typings.reactRequest.reactRequestStrings.text]
  }
}
