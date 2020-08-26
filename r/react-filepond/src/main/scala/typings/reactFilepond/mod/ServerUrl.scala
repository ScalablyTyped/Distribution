package typings.reactFilepond.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactFilepond.reactFilepondStrings.DELETE
import typings.reactFilepond.reactFilepondStrings.GET
import typings.reactFilepond.reactFilepondStrings.POST
import typings.reactFilepond.reactFilepondStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerUrl extends js.Object {
  var headers: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.native
  var method: js.UndefOr[GET | POST | PUT | DELETE] = js.native
  /**
    * Called with the formdata object right before it is sent,
    * return extended formdata object to make changes
    */
  var ondata: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  /**
    * Called when server error is received, receives the response
    * body, useful to select the relevant error data
    */
  var onerror: js.UndefOr[js.Function1[/* responseBody */ js.Any, _]] = js.native
  /**
    * Called when server response is received, useful for getting
    * the unique file id from the server response
    */
  var onload: js.UndefOr[js.Function0[_]] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var url: String = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object ServerUrl {
  @scala.inline
  def apply(url: String): ServerUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerUrl]
  }
  @scala.inline
  implicit class ServerUrlOps[Self <: ServerUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: StringDictionary[String | Boolean | Double]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMethod(value: GET | POST | PUT | DELETE): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setOndata(value: /* data */ js.Any => _): Self = this.set("ondata", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOndata: Self = this.set("ondata", js.undefined)
    @scala.inline
    def setOnerror(value: /* responseBody */ js.Any => _): Self = this.set("onerror", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    @scala.inline
    def setOnload(value: () => _): Self = this.set("onload", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}

