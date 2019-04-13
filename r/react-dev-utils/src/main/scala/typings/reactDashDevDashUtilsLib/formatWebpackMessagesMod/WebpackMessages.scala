package typings
package reactDashDevDashUtilsLib.formatWebpackMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpackMessages extends js.Object {
  var errors: js.Array[java.lang.String]
  var warnings: js.Array[java.lang.String]
}

object WebpackMessages {
  @scala.inline
  def apply(errors: js.Array[java.lang.String], warnings: js.Array[java.lang.String]): WebpackMessages = {
    val __obj = js.Dynamic.literal(errors = errors, warnings = warnings)
  
    __obj.asInstanceOf[WebpackMessages]
  }
}

