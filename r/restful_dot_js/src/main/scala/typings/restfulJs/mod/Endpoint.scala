package typings.restfulJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint[Self] extends js.Object {
  /**
    * Add a full request interceptor. You can alter params, headers, data, method and url.
    */
  def addFullRequestInterceptor(interceptor: FullRequestInterceptor): Self
  /**
    * Add a full response interceptor. You can alter data and headers.
    */
  def addFullResponseInterceptor(interceptor: ResponseInterceptor): Self
  /**
    * Add a request interceptor.
    */
  def addRequestInterceptor(interceptor: RequestInterceptor): Self
  /**
    * Add a response interceptor. You can only alter data and headers.
    */
  def addResponseInterceptor(interceptor: ResponseInterceptor): Self
  def fullRequestInterceptors(): js.Array[FullRequestInterceptor]
  def fullResponseInterceptors(): js.Array[ResponseInterceptor]
  /**
    * Add a header.
    * @param name
    * @param value
    */
  def header(name: String, value: js.Any): Self
  def headers(): Headers
  def requestInterceptors(): js.Array[RequestInterceptor]
  def responseInterceptors(): js.Array[ResponseInterceptor]
  /**
    * Get the url.
    */
  def url(): String
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
}

