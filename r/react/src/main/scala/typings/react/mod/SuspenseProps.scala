package typings.react.mod

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuspenseProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  /** A fallback react tree to show when a Suspense child (like React.lazy) suspends */
  var fallback: NonNullable[ReactNode] | Null
  /**
    * Tells React whether to “skip” revealing this boundary during the initial load.
    * This API will likely be removed in a future release.
    */
  // NOTE: this is unflagged and is respected even in stable builds
  var unstable_avoidThisFallback: js.UndefOr[Boolean] = js.undefined
}

object SuspenseProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    fallback: NonNullable[ReactNode] = null,
    unstable_avoidThisFallback: js.UndefOr[Boolean] = js.undefined
  ): SuspenseProps = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(unstable_avoidThisFallback)) __obj.updateDynamic("unstable_avoidThisFallback")(unstable_avoidThisFallback.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseProps]
  }
}

