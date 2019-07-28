package typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

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
    val __obj = js.Dynamic.literal(debugData = debugData, message = message, name = name, stack = stack, statusCode = statusCode)
  
    __obj.asInstanceOf[AlgoliaError]
  }
}

