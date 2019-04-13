package typings
package reactDashReconcilerLib.reactDashReconcilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// shared/ReactElementType
trait Source extends js.Object {
  var fileName: java.lang.String
  var lineNumber: scala.Double
}

object Source {
  @scala.inline
  def apply(fileName: java.lang.String, lineNumber: scala.Double): Source = {
    val __obj = js.Dynamic.literal(fileName = fileName, lineNumber = lineNumber)
  
    __obj.asInstanceOf[Source]
  }
}

