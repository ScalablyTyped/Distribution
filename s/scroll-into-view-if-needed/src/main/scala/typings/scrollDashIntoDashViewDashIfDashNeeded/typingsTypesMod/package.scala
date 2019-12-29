package typings.scrollDashIntoDashViewDashIfDashNeeded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typingsTypesMod {
  import typings.std.Element

  type CustomScrollBehaviorCallback[T] = js.Function1[/* actions */ js.Array[CustomScrollAction], T]
  type CustomScrollBoundary = Element | CustomScrollBoundaryCallback | Null
  type CustomScrollBoundaryCallback = js.Function1[/* parent */ Element, Boolean]
  type SkipOverflowHiddenElements = Boolean
}
