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
    if (behavior != null) __obj.updateDynamic("behavior")(behavior)
    if (block != null) __obj.updateDynamic("block")(block)
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[ScrollIntoViewOptions]
  }
}

