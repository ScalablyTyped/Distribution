package typings.remotedevSerialize

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.Immutable.Collection
import typings.immutable.Immutable.Set_
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSetCollectionFromKeys extends js.Object {
  def apply(): Set_[_] = js.native
  def apply[T](collection: Iterable[T]): Set_[T] = js.native
  def fromKeys(obj: StringDictionary[js.Any]): Set_[String] = js.native
  /**
    * `Set.fromKeys()` creates a new immutable Set containing the keys from
    * this Collection or JavaScript Object.
    */
  def fromKeys[T](iter: Collection[T, _]): Set_[T] = js.native
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
  def intersect[T](sets: Iterable[Iterable[T]]): Set_[T] = js.native
  /**
    * True if the provided value is a Set
    */
  def isSet(maybeSet: js.Any): /* is immutable.Immutable.Set<any> */ Boolean = js.native
  /**
    * Creates a new Set containing `values`.
    */
  def of[T](values: T*): Set_[T] = js.native
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
  def union[T](sets: Iterable[Iterable[T]]): Set_[T] = js.native
}

