package typings.strange.treeMod

import typings.std.Date
import typings.strange.strangeMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create an interval tree node.
  *
  * For creating a binary search tree out of an array of ranges, you might want
  * to use [`RangeTree.from`](#RangeTree.from).
  *
  * @example
  * var RangeTree = require("strange/tree")
  * var left = new RangeTree([new Range(-5, 0)])
  * var right = new RangeTree([new Range(5, 10)])
  * var root = new RangeTree([new Range(0, 5), new Range(0, 10)], left, right)
  * root.search(7) // => [new Range(0, 10), new Range(5, 10)]
  */
@JSImport("strange/tree", JSImport.Namespace)
@js.native
class ^[T /* <: Date | Double | String */] protected () extends RangeTree[T] {
  def this(ranges: js.Array[Range[T]]) = this()
  def this(ranges: Range[T]) = this()
  def this(ranges: js.Array[Range[T]], left: RangeTree[T]) = this()
  def this(ranges: Range[T], left: RangeTree[T]) = this()
  def this(ranges: js.Array[Range[T]], left: Null, right: RangeTree[T]) = this()
  def this(ranges: js.Array[Range[T]], left: RangeTree[T], right: RangeTree[T]) = this()
  def this(ranges: Range[T], left: Null, right: RangeTree[T]) = this()
  def this(ranges: Range[T], left: RangeTree[T], right: RangeTree[T]) = this()
}

@JSImport("strange/tree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Create an interval tree (implemented as an augmented binary search tree)
    * from an array of ranges.
    * Returns a [`RangeTree`](#RangeTree) you can search on.
    *
    * If you need to relate the found ranges to other data, add some properties
    * directly to every range _or_ use JavaScript's `Map` or `WeakMap` to relate
    * extra data to those range instances.
    *
    * @example
    * var ranges = [new Range(0, 10), new Range(20, 30), new Range(40, 50)]
    * RangeTree.from(ranges).search(42) // => [new Range(40, 50)]
    */
  def from[U /* <: Date | Double | String */](ranges: js.Array[Range[U]]): RangeTree[U] = js.native
}

