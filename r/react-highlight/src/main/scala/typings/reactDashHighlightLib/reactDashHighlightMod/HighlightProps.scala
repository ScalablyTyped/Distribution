package typings
package reactDashHighlightLib.reactDashHighlightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightProps extends js.Object {
  /**
    * Language name to use as a class to signal type to highlight.js.
    */
  var className: java.lang.String
}

object HighlightProps {
  @scala.inline
  def apply(className: java.lang.String): HighlightProps = {
    val __obj = js.Dynamic.literal(className = className)
  
    __obj.asInstanceOf[HighlightProps]
  }
}

