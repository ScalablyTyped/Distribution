package typings.scrollIntoViewIfNeeded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type CustomScrollBehaviorCallback[T] = js.Function1[
    /* actions */ js.Array[typings.scrollIntoViewIfNeeded.typesMod.CustomScrollAction], 
    T
  ]
  type CustomScrollBoundary = typings.std.Element | typings.scrollIntoViewIfNeeded.typesMod.CustomScrollBoundaryCallback | scala.Null
  type CustomScrollBoundaryCallback = js.Function1[/* parent */ typings.std.Element, scala.Boolean]
  type SkipOverflowHiddenElements = scala.Boolean
}
