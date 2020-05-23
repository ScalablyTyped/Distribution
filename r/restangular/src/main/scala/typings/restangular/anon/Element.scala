package typings.restangular.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var element: js.Any
  var headers: js.Any
  var params: js.Any
}

object Element {
  @scala.inline
  def apply(element: js.Any, headers: js.Any, params: js.Any): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

