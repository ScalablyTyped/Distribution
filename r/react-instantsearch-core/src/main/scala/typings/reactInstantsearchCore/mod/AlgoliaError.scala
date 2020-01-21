package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlgoliaError extends js.Object {
  var debugData: js.Array[_]
  var message: String
  var name: String
  var stack: String
  var statusCode: Double
}

object AlgoliaError {
  @scala.inline
  def apply(debugData: js.Array[_], message: String, name: String, stack: String, statusCode: Double): AlgoliaError = {
    val __obj = js.Dynamic.literal(debugData = debugData.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AlgoliaError]
  }
}

