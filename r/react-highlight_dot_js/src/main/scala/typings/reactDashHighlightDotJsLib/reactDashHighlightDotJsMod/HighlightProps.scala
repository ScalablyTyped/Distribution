package typings
package reactDashHighlightDotJsLib.reactDashHighlightDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightProps extends js.Object {
  /**
    * Content that will be highlighted
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * Language name to use as a class to signal type to highlight.js.
    */
  var language: java.lang.String
}

object HighlightProps {
  @scala.inline
  def apply(language: java.lang.String, children: reactLib.reactMod.ReactNode = null): HighlightProps = {
    val __obj = js.Dynamic.literal(language = language)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightProps]
  }
}

