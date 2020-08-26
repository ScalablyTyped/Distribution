package typings.restangular.anon

import typings.angular.mod.IRequestShortcutConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends js.Object {
  var element: js.Any = js.native
  var headers: js.Any = js.native
  var httpConfig: IRequestShortcutConfig = js.native
  var params: js.Any = js.native
}

object Headers {
  @scala.inline
  def apply(element: js.Any, headers: js.Any, httpConfig: IRequestShortcutConfig, params: js.Any): Headers = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], httpConfig = httpConfig.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  @scala.inline
  implicit class HeadersOps[Self <: Headers] (val x: Self) extends AnyVal {
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
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpConfig(value: IRequestShortcutConfig): Self = this.set("httpConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
  }
  
}

