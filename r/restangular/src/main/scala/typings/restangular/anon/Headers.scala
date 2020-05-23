package typings.restangular.anon

import typings.angular.mod.IRequestShortcutConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  var element: js.Any
  var headers: js.Any
  var httpConfig: IRequestShortcutConfig
  var params: js.Any
}

object Headers {
  @scala.inline
  def apply(element: js.Any, headers: js.Any, httpConfig: IRequestShortcutConfig, params: js.Any): Headers = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], httpConfig = httpConfig.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

