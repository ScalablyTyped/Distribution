package typings.restfulJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint[Self] extends js.Object {
  /**
    * Add a full request interceptor. You can alter params, headers, data, method and url.
    */
  def addFullRequestInterceptor(interceptor: FullRequestInterceptor): Self = js.native
  /**
    * Add a full response interceptor. You can alter data and headers.
    */
  def addFullResponseInterceptor(interceptor: ResponseInterceptor): Self = js.native
  /**
    * Add a request interceptor.
    */
  def addRequestInterceptor(interceptor: RequestInterceptor): Self = js.native
  /**
    * Add a response interceptor. You can only alter data and headers.
    */
  def addResponseInterceptor(interceptor: ResponseInterceptor): Self = js.native
  def fullRequestInterceptors(): js.Array[FullRequestInterceptor] = js.native
  def fullResponseInterceptors(): js.Array[ResponseInterceptor] = js.native
  /**
    * Add a header.
    * @param name
    * @param value
    */
  def header(name: String, value: js.Any): Self = js.native
  def headers(): Headers = js.native
  def requestInterceptors(): js.Array[RequestInterceptor] = js.native
  def responseInterceptors(): js.Array[ResponseInterceptor] = js.native
  /**
    * Get the url.
    */
  def url(): String = js.native
}

object Endpoint {
  @scala.inline
  def apply[Self](
    addFullRequestInterceptor: FullRequestInterceptor => Self,
    addFullResponseInterceptor: ResponseInterceptor => Self,
    addRequestInterceptor: RequestInterceptor => Self,
    addResponseInterceptor: ResponseInterceptor => Self,
    fullRequestInterceptors: () => js.Array[FullRequestInterceptor],
    fullResponseInterceptors: () => js.Array[ResponseInterceptor],
    header: (String, js.Any) => Self,
    headers: () => Headers,
    requestInterceptors: () => js.Array[RequestInterceptor],
    responseInterceptors: () => js.Array[ResponseInterceptor],
    url: () => String
  ): Endpoint[Self] = {
    val __obj = js.Dynamic.literal(addFullRequestInterceptor = js.Any.fromFunction1(addFullRequestInterceptor), addFullResponseInterceptor = js.Any.fromFunction1(addFullResponseInterceptor), addRequestInterceptor = js.Any.fromFunction1(addRequestInterceptor), addResponseInterceptor = js.Any.fromFunction1(addResponseInterceptor), fullRequestInterceptors = js.Any.fromFunction0(fullRequestInterceptors), fullResponseInterceptors = js.Any.fromFunction0(fullResponseInterceptors), header = js.Any.fromFunction2(header), headers = js.Any.fromFunction0(headers), requestInterceptors = js.Any.fromFunction0(requestInterceptors), responseInterceptors = js.Any.fromFunction0(responseInterceptors), url = js.Any.fromFunction0(url))
    __obj.asInstanceOf[Endpoint[Self]]
  }
  @scala.inline
  implicit class EndpointOps[Self_ <: Endpoint[_], Self] (val x: Self_ with Endpoint[Self]) extends AnyVal {
    @scala.inline
    def duplicate: Self_ = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self_]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self_ with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self_ with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self_ = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddFullRequestInterceptor(value: FullRequestInterceptor => Self): Self_ = this.set("addFullRequestInterceptor", js.Any.fromFunction1(value))
    @scala.inline
    def setAddFullResponseInterceptor(value: ResponseInterceptor => Self): Self_ = this.set("addFullResponseInterceptor", js.Any.fromFunction1(value))
    @scala.inline
    def setAddRequestInterceptor(value: RequestInterceptor => Self): Self_ = this.set("addRequestInterceptor", js.Any.fromFunction1(value))
    @scala.inline
    def setAddResponseInterceptor(value: ResponseInterceptor => Self): Self_ = this.set("addResponseInterceptor", js.Any.fromFunction1(value))
    @scala.inline
    def setFullRequestInterceptors(value: () => js.Array[FullRequestInterceptor]): Self_ = this.set("fullRequestInterceptors", js.Any.fromFunction0(value))
    @scala.inline
    def setFullResponseInterceptors(value: () => js.Array[ResponseInterceptor]): Self_ = this.set("fullResponseInterceptors", js.Any.fromFunction0(value))
    @scala.inline
    def setHeader(value: (String, js.Any) => Self): Self_ = this.set("header", js.Any.fromFunction2(value))
    @scala.inline
    def setHeaders(value: () => Headers): Self_ = this.set("headers", js.Any.fromFunction0(value))
    @scala.inline
    def setRequestInterceptors(value: () => js.Array[RequestInterceptor]): Self_ = this.set("requestInterceptors", js.Any.fromFunction0(value))
    @scala.inline
    def setResponseInterceptors(value: () => js.Array[ResponseInterceptor]): Self_ = this.set("responseInterceptors", js.Any.fromFunction0(value))
    @scala.inline
    def setUrl(value: () => String): Self_ = this.set("url", js.Any.fromFunction0(value))
  }
  
}

