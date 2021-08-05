package typings.strange

import typings.std.Date
import typings.strange.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMod {
  
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
  class ^[T /* <: Date | Double | String */] protected ()
    extends StObject
       with RangeTree[T] {
    def this(ranges: js.Array[Range[T]]) = this()
    def this(ranges: Range[T]) = this()
    def this(ranges: js.Array[Range[T]], left: RangeTree[T]) = this()
    def this(ranges: Range[T], left: RangeTree[T]) = this()
    def this(ranges: js.Array[Range[T]], left: Null, right: RangeTree[T]) = this()
    def this(ranges: js.Array[Range[T]], left: Unit, right: RangeTree[T]) = this()
    def this(ranges: js.Array[Range[T]], left: RangeTree[T], right: RangeTree[T]) = this()
    def this(ranges: Range[T], left: Null, right: RangeTree[T]) = this()
    def this(ranges: Range[T], left: Unit, right: RangeTree[T]) = this()
    def this(ranges: Range[T], left: RangeTree[T], right: RangeTree[T]) = this()
  }
  @JSImport("strange/tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  inline def from[U /* <: Date | Double | String */](ranges: js.Array[Range[U]]): RangeTree[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(ranges.asInstanceOf[js.Any]).asInstanceOf[RangeTree[U]]
  
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
  @js.native
  trait RangeTree[T /* <: Date | Double | String */] extends StObject {
    
    /**
      * Ranges of current tree node.
      */
    /* private */ var keys: js.Array[Range[T]] = js.native
    
    /* private */ var left: RangeTree[T] | Null = js.native
    
    /* private */ var right: RangeTree[T] | Null = js.native
    
    /**
      * Search for ranges that include the given value or, given a range, intersect
      * with it.
      * Returns an array of matches or an empty one if no range contained or
      * intersected with the given value.
      *
      * @example
      * var tree = RangeTree.from([new Range(40, 50)])
      * tree.search(42) // => [new Range(40, 50)]
      * tree.search(13) // => []
      * tree.search(new Range(30, 42)) // => [new Range(40, 50)]
      */
    def search(): js.Array[Range[T]] = js.native
    def search(valueOrRange: T): js.Array[Range[T]] = js.native
    def search(valueOrRange: Range[T]): js.Array[Range[T]] = js.native
  }
}
