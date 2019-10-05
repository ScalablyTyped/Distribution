package typings.remotedevDashSerialize

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.Collection
import typings.immutable.immutableMod.Set
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSetCollectionFromKeys extends js.Object {
  def apply(): Set[_] = js.native
  def apply[T](collection: Iterable[T]): Set[T] = js.native
  def fromKeys(obj: StringDictionary[js.Any]): Set[String] = js.native
  /**
    * `Set.fromKeys()` creates a new immutable Set containing the keys from
    * this Collection or JavaScript Object.
    */
  def fromKeys[T](iter: Collection[T, _]): Set[T] = js.native
  /**
    * `Set.intersect()` creates a new immutable Set that is the intersection of
    * a collection of other sets.
    *
    * ```js
    * const { Set } = require('immutable')
    * const intersected = Set.intersect([
    *   Set([ 'a', 'b', 'c' ])
    *   Set([ 'c', 'a', 't' ])
    * ])
    * // Set [ "a", "c"" ]
    * ```
    */
  def intersect[T](sets: Iterable[Iterable[T]]): Set[T] = js.native
  /**
    * True if the provided value is a Set
    */
  def isSet(maybeSet: js.Any): /* is immutable.immutable.Set<any> */ Boolean = js.native
  /**
    * Creates a new Set containing `values`.
    */
  def of[T](values: T*): Set[T] = js.native
  /**
    * `Set.union()` creates a new immutable Set that is the union of a
    * collection of other sets.
    *
    * ```js
    * const { Set } = require('immutable')
    * const unioned = Set.union([
    *   Set([ 'a', 'b', 'c' ])
    *   Set([ 'c', 'a', 't' ])
    * ])
    * // Set [ "a", "b", "c", "t"" ]
    * ```
    */
  def union[T](sets: Iterable[Iterable[T]]): Set[T] = js.native
}

