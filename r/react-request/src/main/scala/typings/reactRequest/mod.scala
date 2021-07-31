package typings.reactRequest

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.Error
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
  class Fetch[T] protected ()
    extends Component[FetchProps[T], js.Object, js.Any] {
    def this(props: FetchProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FetchProps[T], context: js.Any) = this()
  }
  
  @scala.inline
  def clearRequestCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearRequestCache")().asInstanceOf[Unit]
  
  @scala.inline
  def clearResponseCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearResponseCache")().asInstanceOf[Unit]
  
  @scala.inline
  def fetchDedupe(input: js.Any): js.Promise[ProxyRequest] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchDedupe")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ProxyRequest]]
  @scala.inline
  def fetchDedupe(input: js.Any, init: js.Any): js.Promise[ProxyRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchDedupe")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProxyRequest]]
  @scala.inline
  def fetchDedupe(input: js.Any, init: js.Any, dedupeOptions: js.Any): js.Promise[ProxyRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchDedupe")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any], dedupeOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProxyRequest]]
  @scala.inline
  def fetchDedupe(input: js.Any, init: Unit, dedupeOptions: js.Any): js.Promise[ProxyRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchDedupe")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any], dedupeOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProxyRequest]]
  
  @scala.inline
  def getRequestKey(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequestKey")().asInstanceOf[String]
  @scala.inline
  def getRequestKey(keyOptions: RequestKeyOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequestKey")(keyOptions.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isRequestInFlight(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequestInFlight")().asInstanceOf[Boolean]
  
  type DoFetch[T] = js.Function1[/* options */ js.UndefOr[DoFetchOptions], js.Promise[FetchResponse[T]]]
  
  trait DoFetchOptions
    extends StObject
       with RequestInit {
    
    var url: js.UndefOr[String] = js.undefined
  }
  object DoFetchOptions {
    
    @scala.inline
    def apply(): DoFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoFetchOptions]
    }
    
    @scala.inline
    implicit class DoFetchOptionsMutableBuilder[Self <: DoFetchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait FetchProps[T]
    extends StObject
       with FetchRequestProps {
    
    var afterFetch: js.UndefOr[js.Function1[/* args */ FetchResponse[T], Unit]] = js.undefined
    
    var children: js.UndefOr[js.Function1[/* renderProps */ RenderProps[T], ReactNode]] = js.undefined
    
    var responseType: js.UndefOr[ResponseType] = js.undefined
    
    var transformData: js.UndefOr[js.Function1[/* data */ js.Any, T]] = js.undefined
  }
  object FetchProps {
    
    @scala.inline
    def apply[T](url: String): FetchProps[T] = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchProps[T]]
    }
    
    @scala.inline
    implicit class FetchPropsMutableBuilder[Self <: FetchProps[?], T] (val x: Self & FetchProps[T]) extends AnyVal {
      
      @scala.inline
      def setAfterFetch(value: /* args */ FetchResponse[T] => Unit): Self = StObject.set(x, "afterFetch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterFetchUndefined: Self = StObject.set(x, "afterFetch", js.undefined)
      
      @scala.inline
      def setChildren(value: /* renderProps */ RenderProps[T] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setResponseType(value: ResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      @scala.inline
      def setTransformData(value: /* data */ js.Any => T): Self = StObject.set(x, "transformData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformDataUndefined: Self = StObject.set(x, "transformData", js.undefined)
    }
  }
  
  trait FetchRequestProps
    extends StObject
       with RequestInit {
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var url: String
  }
  object FetchRequestProps {
    
    @scala.inline
    def apply(url: String): FetchRequestProps = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchRequestProps]
    }
    
    @scala.inline
    implicit class FetchRequestPropsMutableBuilder[Self <: FetchRequestProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FetchResponse[T] extends StObject {
    
    var data: T | Null
    
    var didUnmount: Boolean
    
    var error: Error | Null
    
    var failed: Boolean
    
    var init: js.Any
    
    var requestKey: String
    
    var response: Response | Null
    
    var url: String
  }
  object FetchResponse {
    
    @scala.inline
    def apply[T](didUnmount: Boolean, failed: Boolean, init: js.Any, requestKey: String, url: String): FetchResponse[T] = {
      val __obj = js.Dynamic.literal(didUnmount = didUnmount.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], requestKey = requestKey.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], data = null, error = null, response = null)
      __obj.asInstanceOf[FetchResponse[T]]
    }
    
    @scala.inline
    implicit class FetchResponseMutableBuilder[Self <: FetchResponse[?], T] (val x: Self & FetchResponse[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataNull: Self = StObject.set(x, "data", null)
      
      @scala.inline
      def setDidUnmount(value: Boolean): Self = StObject.set(x, "didUnmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorNull: Self = StObject.set(x, "error", null)
      
      @scala.inline
      def setFailed(value: Boolean): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInit(value: js.Any): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestKey(value: String): Self = StObject.set(x, "requestKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseNull: Self = StObject.set(x, "response", null)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProxyRequest extends StObject {
    
    var requestKey: String
    
    var res: Response
  }
  object ProxyRequest {
    
    @scala.inline
    def apply(requestKey: String, res: Response): ProxyRequest = {
      val __obj = js.Dynamic.literal(requestKey = requestKey.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyRequest]
    }
    
    @scala.inline
    implicit class ProxyRequestMutableBuilder[Self <: ProxyRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestKey(value: String): Self = StObject.set(x, "requestKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRes(value: Response): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply[T](
      didUnmount: Boolean,
      doFetch: /* options */ js.UndefOr[DoFetchOptions] => js.Promise[FetchResponse[T]],
      failed: Boolean,
      fetching: Boolean,
      init: js.Any,
      requestKey: String,
      requestName: String,
      url: String
    ): RenderProps[T] = {
      val __obj = js.Dynamic.literal(didUnmount = didUnmount.asInstanceOf[js.Any], doFetch = js.Any.fromFunction1(doFetch), failed = failed.asInstanceOf[js.Any], fetching = fetching.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], requestKey = requestKey.asInstanceOf[js.Any], requestName = requestName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], data = null, error = null, response = null)
      __obj.asInstanceOf[RenderProps[T]]
    }
    
    @scala.inline
    implicit class RenderPropsMutableBuilder[Self <: RenderProps[?], T] (val x: Self & RenderProps[T]) extends AnyVal {
      
      @scala.inline
      def setDoFetch(value: /* options */ js.UndefOr[DoFetchOptions] => js.Promise[FetchResponse[T]]): Self = StObject.set(x, "doFetch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFetching(value: Boolean): Self = StObject.set(x, "fetching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestName(value: String): Self = StObject.set(x, "requestName", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestKeyOptions extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var responseType: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object RequestKeyOptions {
    
    @scala.inline
    def apply(): RequestKeyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestKeyOptions]
    }
    
    @scala.inline
    implicit class RequestKeyOptionsMutableBuilder[Self <: RequestKeyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
    
    @scala.inline
    def arrayBuffer: typings.reactRequest.reactRequestStrings.arrayBuffer = "arrayBuffer".asInstanceOf[typings.reactRequest.reactRequestStrings.arrayBuffer]
    
    @scala.inline
    def blob: typings.reactRequest.reactRequestStrings.blob = "blob".asInstanceOf[typings.reactRequest.reactRequestStrings.blob]
    
    @scala.inline
    def formData: typings.reactRequest.reactRequestStrings.formData = "formData".asInstanceOf[typings.reactRequest.reactRequestStrings.formData]
    
    @scala.inline
    def json: typings.reactRequest.reactRequestStrings.json = "json".asInstanceOf[typings.reactRequest.reactRequestStrings.json]
    
    @scala.inline
    def text: typings.reactRequest.reactRequestStrings.text = "text".asInstanceOf[typings.reactRequest.reactRequestStrings.text]
  }
}
