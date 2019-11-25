package typings.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceError extends js.Object {
  var errorCode: String
  var errorString: String
  var id: Double
  var url: String
}

object ResourceError {
  @scala.inline
  def apply(errorCode: String, errorString: String, id: Double, url: String): ResourceError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorString = errorString.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceError]
  }
}

