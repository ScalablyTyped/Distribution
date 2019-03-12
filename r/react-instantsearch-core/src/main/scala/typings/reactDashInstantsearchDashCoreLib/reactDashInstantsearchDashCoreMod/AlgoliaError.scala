package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlgoliaError extends js.Object {
  var debugData: js.Array[_]
  var message: java.lang.String
  var name: java.lang.String
  var stack: java.lang.String
  var statusCode: scala.Double
}

object AlgoliaError {
  @scala.inline
  def apply(
    debugData: js.Array[_],
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String,
    statusCode: scala.Double
  ): AlgoliaError = {
    val __obj = js.Dynamic.literal(debugData = debugData, message = message, name = name, stack = stack, statusCode = statusCode)
  
    __obj.asInstanceOf[AlgoliaError]
  }
}

