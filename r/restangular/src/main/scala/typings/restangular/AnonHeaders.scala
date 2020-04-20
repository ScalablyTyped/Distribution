package typings.restangular

import typings.angular.mod.IRequestShortcutConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaders extends js.Object {
  var element: js.Any
  var headers: js.Any
  var httpConfig: IRequestShortcutConfig
  var params: js.Any
}

object AnonHeaders {
  @scala.inline
  def apply(element: js.Any, headers: js.Any, httpConfig: IRequestShortcutConfig, params: js.Any): AnonHeaders = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], httpConfig = httpConfig.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeaders]
  }
}

