package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollIntoViewOptions extends ScrollOptions {
  var block: js.UndefOr[ScrollLogicalPosition] = js.undefined
  var `inline`: js.UndefOr[ScrollLogicalPosition] = js.undefined
}

object ScrollIntoViewOptions {
  @scala.inline
  def apply(
    behavior: ScrollBehavior = null,
    block: ScrollLogicalPosition = null,
    `inline`: ScrollLogicalPosition = null
  ): ScrollIntoViewOptions = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollIntoViewOptions]
  }
}

