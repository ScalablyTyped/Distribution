package typings.sendgrid.mod.SendGrid.Rest

import org.scalablytyped.runtime.StringDictionary
import typings.sendgrid.sendgridStrings.DELETE
import typings.sendgrid.sendgridStrings.GET
import typings.sendgrid.sendgridStrings.PATCH
import typings.sendgrid.sendgridStrings.POST
import typings.sendgrid.sendgridStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var body: js.UndefOr[String | js.Object] = js.native
  var headers: js.UndefOr[StringDictionary[String | Double]] = js.native
  var host: js.UndefOr[String] = js.native
  var method: GET | PATCH | POST | PUT | DELETE = js.native
  var path: String = js.native
  var port: js.UndefOr[String | Double] = js.native
  var queryParams: js.UndefOr[StringDictionary[String]] = js.native
  var test: js.UndefOr[Boolean] = js.native
}

object Request {
  @scala.inline
  def apply(method: GET | PATCH | POST | PUT | DELETE, path: String): Request = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
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
    def setMethod(value: GET | PATCH | POST | PUT | DELETE): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String | js.Object): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String | Double]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setPort(value: String | Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setQueryParams(value: StringDictionary[String]): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
    @scala.inline
    def setTest(value: Boolean): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
  
}

