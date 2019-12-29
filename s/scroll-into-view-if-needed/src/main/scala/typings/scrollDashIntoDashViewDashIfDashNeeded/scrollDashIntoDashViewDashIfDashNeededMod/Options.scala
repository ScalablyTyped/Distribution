package typings.scrollDashIntoDashViewDashIfDashNeeded.scrollDashIntoDashViewDashIfDashNeededMod

import typings.scrollDashIntoDashViewDashIfDashNeeded.typingsTypesMod.CustomScrollBehaviorCallback
import typings.scrollDashIntoDashViewDashIfDashNeeded.typingsTypesMod.CustomScrollBoundary
import typings.scrollDashIntoDashViewDashIfDashNeeded.typingsTypesMod.ScrollBehavior
import typings.scrollDashIntoDashViewDashIfDashNeeded.typingsTypesMod.ScrollLogicalPosition
import typings.scrollDashIntoDashViewDashIfDashNeeded.typingsTypesMod.ScrollMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T]
  extends typings.scrollDashIntoDashViewDashIfDashNeeded.typingsTypesMod.Options {
  var behavior: js.UndefOr[ScrollBehavior | CustomScrollBehaviorCallback[T]] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    behavior: ScrollBehavior | CustomScrollBehaviorCallback[T] = null,
    block: ScrollLogicalPosition = null,
    boundary: CustomScrollBoundary = null,
    `inline`: ScrollLogicalPosition = null,
    scrollMode: ScrollMode = null,
    skipOverflowHiddenElements: js.UndefOr[Boolean] = js.undefined
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (scrollMode != null) __obj.updateDynamic("scrollMode")(scrollMode.asInstanceOf[js.Any])
    if (!js.isUndefined(skipOverflowHiddenElements)) __obj.updateDynamic("skipOverflowHiddenElements")(skipOverflowHiddenElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[T]]
  }
}

