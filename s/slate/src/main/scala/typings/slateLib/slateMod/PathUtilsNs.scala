package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "PathUtils")
@js.native
object PathUtilsNs extends js.Object {
  /**
    * Compare paths `path` and `target` to see which is before or after.
    */
  def compare(
    path: immutableLib.immutableMod.List[scala.Double],
    target: immutableLib.immutableMod.List[scala.Double]
  ): scala.Double | scala.Null = js.native
  /**
    * Create a path from `attrs`.
    */
  def create(attrs: immutableLib.immutableMod.List[scala.Double]): immutableLib.immutableMod.List[scala.Double] = js.native
  def create(attrs: js.Array[scala.Double]): immutableLib.immutableMod.List[scala.Double] = js.native
  /**
    * Crop paths `a` and `b` to an equal size, defaulting to the shortest.
    */
  def crop(a: immutableLib.immutableMod.List[scala.Double], b: immutableLib.immutableMod.List[scala.Double]): js.Array[immutableLib.immutableMod.List[scala.Double]] = js.native
  def crop(
    a: immutableLib.immutableMod.List[scala.Double],
    b: immutableLib.immutableMod.List[scala.Double],
    size: scala.Double
  ): js.Array[immutableLib.immutableMod.List[scala.Double]] = js.native
  /**
    * Decrement a `path` by `n` at `index`, defaulting to the last index.
    */
  def decrement(path: immutableLib.immutableMod.List[scala.Double]): immutableLib.immutableMod.List[scala.Double] = js.native
  def decrement(path: immutableLib.immutableMod.List[scala.Double], n: scala.Double): immutableLib.immutableMod.List[scala.Double] = js.native
  def decrement(path: immutableLib.immutableMod.List[scala.Double], n: scala.Double, index: scala.Double): immutableLib.immutableMod.List[scala.Double] = js.native
  /**
    * Drop a `path`, returning a relative path from a depth of `n`.
    */
  def drop(path: immutableLib.immutableMod.List[scala.Double]): immutableLib.immutableMod.List[scala.Double] = js.native
  def drop(path: immutableLib.immutableMod.List[scala.Double], n: scala.Double): immutableLib.immutableMod.List[scala.Double] = js.native
  /**
    * Get all ancestor paths of the given path.
    */
  def getAncestors(path: immutableLib.immutableMod.List[scala.Double]): immutableLib.immutableMod.List[scala.Double] = js.native
  /**
    * Increment a `path` by `n` at `index`, defaulting to the last index.
    */
  def increment(path: immutableLib.immutableMod.List[scala.Double]): immutableLib.immutableMod.List[scala.Double] = js.native
  def increment(path: immutableLib.immutableMod.List[scala.Double], n: scala.Double): immutableLib.immutableMod.List[scala.Double] = js.native
  def increment(path: immutableLib.immutableMod.List[scala.Double], n: scala.Double, index: scala.Double): immutableLib.immutableMod.List[scala.Double] = js.native
  /**
    * Is a `path` above another `target` path?
    */
  def isAbove(
    path: immutableLib.immutableMod.List[scala.Double],
    target: immutableLib.immutableMod.List[scala.Double]
  ): scala.Boolean = js.native
  /**
    * Is a `path` after another `target` path in a document?
    */
  def isAfter(
    path: immutableLib.immutableMod.List[scala.Double],
    target: immutableLib.immutableMod.List[scala.Double]
  ): scala.Boolean = js.native
  /**
    * Is a `path` before another `target` path in a document?
    */
  def isBefore(
    path: immutableLib.immutableMod.List[scala.Double],
    target: immutableLib.immutableMod.List[scala.Double]
  ): scala.Boolean = js.native
  /**
    * Is a `path` equal to another `target` path in a document?
    */
  def isEqual(
    path: immutableLib.immutableMod.List[scala.Double],
    target: immutableLib.immutableMod.List[scala.Double]
  ): scala.Boolean = js.native
  /**
    * Is a `path` older than a `target` path? Meaning that it ends as an older
    * sibling of one of the indexes in the target.
    */
  def isOlder(
    path: immutableLib.immutableMod.List[scala.Double],
    target: immutableLib.immutableMod.List[scala.Double]
  ): scala.Boolean = js.native
  /**
    * Is an `any` object a path?
    */
  def isPath(any: js.Any): scala.Boolean = js.native
  /**
    * Is a `path` a sibling of a `target` path?
    */
  def isSibling(
    path: immutableLib.immutableMod.List[scala.Double],
    target: immutableLib.immutableMod.List[scala.Double]
  ): scala.Boolean = js.native
  /**
    * Is a `path` younger than a `target` path? Meaning that it ends as a younger
    * sibling of one of the indexes in the target.
    */
  def isYounger(
    path: immutableLib.immutableMod.List[scala.Double],
    target: immutableLib.immutableMod.List[scala.Double]
  ): scala.Boolean = js.native
  /**
    * Lift a `path` to refer to its `n`th ancestor.
    */
  def lift(path: immutableLib.immutableMod.List[scala.Double]): immutableLib.immutableMod.List[scala.Double] = js.native
  /**
    * Get the maximum length of paths `a` and `b`.
    */
  def max(a: immutableLib.immutableMod.List[scala.Double], b: immutableLib.immutableMod.List[scala.Double]): scala.Double = js.native
  /**
    * Get the minimum length of paths `a` and `b`.
    */
  def min(a: immutableLib.immutableMod.List[scala.Double], b: immutableLib.immutableMod.List[scala.Double]): scala.Double = js.native
  /**
    * Get the common ancestor path of path `a` and path `b`.
    */
  def relate(a: immutableLib.immutableMod.List[scala.Double], b: immutableLib.immutableMod.List[scala.Double]): immutableLib.immutableMod.List[scala.Double] = js.native
  /**
    * Transform a `path` by an `operation`, adjusting it to stay current.
    */
  def transform(path: immutableLib.immutableMod.List[scala.Double], operation: slateLib.slateMod.Operation): immutableLib.immutableMod.List[immutableLib.immutableMod.List[scala.Double]] = js.native
}

