package typings.reactDashHighlight.reactDashHighlightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightProps extends js.Object {
  /**
    * Language name to use as a class to signal type to highlight.js.
    */
  var className: String
}

object HighlightProps {
  @scala.inline
  def apply(className: String): HighlightProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HighlightProps]
  }
}

