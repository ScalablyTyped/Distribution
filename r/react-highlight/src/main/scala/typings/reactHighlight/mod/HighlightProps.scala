package typings.reactHighlight.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightProps extends js.Object {
  /**
    * Language name to use as a class to signal type to highlight.js.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Set innerHTML=true to highlight multiple code snippets at a time.
    */
  var innerHTML: js.UndefOr[Boolean] = js.undefined
}

object HighlightProps {
  @scala.inline
  def apply(className: String = null, innerHTML: js.UndefOr[Boolean] = js.undefined): HighlightProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(innerHTML)) __obj.updateDynamic("innerHTML")(innerHTML.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightProps]
  }
}

