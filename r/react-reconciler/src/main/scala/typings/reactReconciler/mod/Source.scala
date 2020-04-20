package typings.reactReconciler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// shared/ReactElementType
trait Source extends js.Object {
  var fileName: String
  var lineNumber: Double
}

object Source {
  @scala.inline
  def apply(fileName: String, lineNumber: Double): Source = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

