package typings.rbush.rbushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbush", JSImport.Default)
@js.native
/**
  * Constructs an `RBush`, a high-performance 2D spatial index for points and
  * rectangles. Based on an optimized __R-tree__ data structure with
  * __bulk-insertion__ support.
  *
  * @param maxEntries An optional argument to RBush defines the maximum
  *                   number of entries in a tree node. `9` (used by default)
  *                   is a reasonable choice for most applications. Higher
  *                   value means faster insertion and slower search, and
  *                   vice versa.
  */
class default[T] () extends RBush[T] {
  def this(maxEntries: Double) = this()
}

