package typings.slate.slateMod

import typings.immutable.Immutable.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "PathUtils")
@js.native
object PathUtils extends js.Object {
  /**
    * Compare paths `path` and `target` to see which is before or after.
    */
  def compare(path: List[Double], target: List[Double]): Double | Null = js.native
  def create(attrs: js.Array[Double]): List[Double] = js.native
  /**
    * Create a path from `attrs`.
    */
  def create(attrs: List[Double]): List[Double] = js.native
  /**
    * Crop paths `a` and `b` to an equal size, defaulting to the shortest.
    */
  def crop(a: List[Double], b: List[Double]): js.Array[List[Double]] = js.native
  def crop(a: List[Double], b: List[Double], size: Double): js.Array[List[Double]] = js.native
  /**
    * Decrement a `path` by `n` at `index`, defaulting to the last index.
    */
  def decrement(path: List[Double]): List[Double] = js.native
  def decrement(path: List[Double], n: Double): List[Double] = js.native
  def decrement(path: List[Double], n: Double, index: Double): List[Double] = js.native
  /**
    * Drop a `path`, returning a relative path from a depth of `n`.
    */
  def drop(path: List[Double]): List[Double] = js.native
  def drop(path: List[Double], n: Double): List[Double] = js.native
  /**
    * Get all ancestor paths of the given path.
    */
  def getAncestors(path: List[Double]): List[Double] = js.native
  /**
    * Increment a `path` by `n` at `index`, defaulting to the last index.
    */
  def increment(path: List[Double]): List[Double] = js.native
  def increment(path: List[Double], n: Double): List[Double] = js.native
  def increment(path: List[Double], n: Double, index: Double): List[Double] = js.native
  /**
    * Is a `path` above another `target` path?
    */
  def isAbove(path: List[Double], target: List[Double]): Boolean = js.native
  /**
    * Is a `path` after another `target` path in a document?
    */
  def isAfter(path: List[Double], target: List[Double]): Boolean = js.native
  /**
    * Is a `path` before another `target` path in a document?
    */
  def isBefore(path: List[Double], target: List[Double]): Boolean = js.native
  /**
    * Is a `path` equal to another `target` path in a document?
    */
  def isEqual(path: List[Double], target: List[Double]): Boolean = js.native
  /**
    * Is a `path` older than a `target` path? Meaning that it ends as an older
    * sibling of one of the indexes in the target.
    */
  def isOlder(path: List[Double], target: List[Double]): Boolean = js.native
  /**
    * Is an `any` object a path?
    */
  def isPath(maybePath: js.Any): Boolean = js.native
  /**
    * Is a `path` a sibling of a `target` path?
    */
  def isSibling(path: List[Double], target: List[Double]): Boolean = js.native
  /**
    * Is a `path` younger than a `target` path? Meaning that it ends as a younger
    * sibling of one of the indexes in the target.
    */
  def isYounger(path: List[Double], target: List[Double]): Boolean = js.native
  /**
    * Lift a `path` to refer to its `n`th ancestor.
    */
  def lift(path: List[Double]): List[Double] = js.native
  def lift(path: List[Double], n: Double): List[Double] = js.native
  /**
    * Get the maximum length of paths `a` and `b`.
    */
  def max(a: List[Double], b: List[Double]): Double = js.native
  /**
    * Get the minimum length of paths `a` and `b`.
    */
  def min(a: List[Double], b: List[Double]): Double = js.native
  /**
    * Get the common ancestor path of path `a` and path `b`.
    */
  def relate(a: List[Double], b: List[Double]): List[Double] = js.native
  /**
    * Transform a `path` by an `operation`, adjusting it to stay current.
    */
  def transform(path: List[Double], operation: Operation): List[List[Double]] = js.native
  def transform(path: List[Double], operation: OperationJSON): List[List[Double]] = js.native
  def transform(path: List[Double], operation: OperationProperties): List[List[Double]] = js.native
}

