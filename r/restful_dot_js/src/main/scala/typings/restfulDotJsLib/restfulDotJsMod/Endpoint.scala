package typings
package restfulDotJsLib.restfulDotJsMod

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
  def header(name: java.lang.String, value: js.Any): Self
  def headers(): Headers
  def requestInterceptors(): js.Array[RequestInterceptor]
  def responseInterceptors(): js.Array[ResponseInterceptor]
  /**
    * Get the url.
    */
  def url(): java.lang.String
}

object Endpoint {
  @scala.inline
  def apply[Self](
    addFullRequestInterceptor: js.Function1[FullRequestInterceptor, Self],
    addFullResponseInterceptor: js.Function1[ResponseInterceptor, Self],
    addRequestInterceptor: js.Function1[RequestInterceptor, Self],
    addResponseInterceptor: js.Function1[ResponseInterceptor, Self],
    fullRequestInterceptors: js.Function0[js.Array[FullRequestInterceptor]],
    fullResponseInterceptors: js.Function0[js.Array[ResponseInterceptor]],
    header: js.Function2[java.lang.String, js.Any, Self],
    headers: js.Function0[Headers],
    requestInterceptors: js.Function0[js.Array[RequestInterceptor]],
    responseInterceptors: js.Function0[js.Array[ResponseInterceptor]],
    url: js.Function0[java.lang.String]
  ): Endpoint[Self] = {
    val __obj = js.Dynamic.literal(addFullRequestInterceptor = addFullRequestInterceptor, addFullResponseInterceptor = addFullResponseInterceptor, addRequestInterceptor = addRequestInterceptor, addResponseInterceptor = addResponseInterceptor, fullRequestInterceptors = fullRequestInterceptors, fullResponseInterceptors = fullResponseInterceptors, header = header, headers = headers, requestInterceptors = requestInterceptors, responseInterceptors = responseInterceptors, url = url)
  
    __obj.asInstanceOf[Endpoint[Self]]
  }
}

