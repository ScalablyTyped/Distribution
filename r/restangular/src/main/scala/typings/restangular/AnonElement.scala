package typings.restangular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElement extends js.Object {
  var element: js.Any
  var headers: js.Any
  var params: js.Any
}

object AnonElement {
  @scala.inline
  def apply(element: js.Any, headers: js.Any, params: js.Any): AnonElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonElement]
  }
}

