package typings.restangular

import typings.angular.angularMod.IRequestShortcutConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ElementHeaders extends js.Object {
  var element: js.Any
  var headers: js.Any
  var httpConfig: IRequestShortcutConfig
  var params: js.Any
}

object Anon_ElementHeaders {
  @scala.inline
  def apply(element: js.Any, headers: js.Any, httpConfig: IRequestShortcutConfig, params: js.Any): Anon_ElementHeaders = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], httpConfig = httpConfig.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ElementHeaders]
  }
}

