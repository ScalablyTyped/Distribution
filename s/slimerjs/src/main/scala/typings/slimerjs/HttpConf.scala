package typings.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpConf extends js.Object {
  var data: js.Any
  var headers: js.Any
  var operation: String
}

object HttpConf {
  @scala.inline
  def apply(data: js.Any, headers: js.Any, operation: String): HttpConf = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HttpConf]
  }
}

