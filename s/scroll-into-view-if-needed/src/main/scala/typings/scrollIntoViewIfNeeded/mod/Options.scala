package typings.scrollIntoViewIfNeeded.mod

import typings.scrollIntoViewIfNeeded.typesMod.CustomScrollBehaviorCallback
import typings.scrollIntoViewIfNeeded.typesMod.CustomScrollBoundary
import typings.scrollIntoViewIfNeeded.typesMod.ScrollBehavior
import typings.scrollIntoViewIfNeeded.typesMod.ScrollLogicalPosition
import typings.scrollIntoViewIfNeeded.typesMod.ScrollMode
import typings.scrollIntoViewIfNeeded.typesMod.SkipOverflowHiddenElements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T]
  extends typings.scrollIntoViewIfNeeded.typesMod.Options {
  var behavior: js.UndefOr[ScrollBehavior | CustomScrollBehaviorCallback[T]] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    behavior: ScrollBehavior | CustomScrollBehaviorCallback[T] = null,
    block: ScrollLogicalPosition = null,
    boundary: js.UndefOr[Null | CustomScrollBoundary] = js.undefined,
    `inline`: ScrollLogicalPosition = null,
    scrollMode: ScrollMode = null,
    skipOverflowHiddenElements: js.UndefOr[SkipOverflowHiddenElements] = js.undefined
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (!js.isUndefined(boundary)) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (scrollMode != null) __obj.updateDynamic("scrollMode")(scrollMode.asInstanceOf[js.Any])
    if (!js.isUndefined(skipOverflowHiddenElements)) __obj.updateDynamic("skipOverflowHiddenElements")(skipOverflowHiddenElements.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[T]]
  }
}

