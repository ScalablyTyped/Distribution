package typings.reactImmutableProptypes

import typings.immutable.Immutable.List
import typings.immutable.Immutable.Map
import typings.immutable.Immutable.OrderedMap
import typings.immutable.Immutable.OrderedSet
import typings.immutable.Immutable.Seq
import typings.immutable.Immutable.Set_
import typings.immutable.Immutable.Stack
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.ValidationMap
import typings.propTypes.mod.Validator
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-immutable-proptypes", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val iterable: Requireable[Iterable[js.Any]] = js.native
  val list: Requireable[List[js.Any]] = js.native
  val map: Requireable[Map[js.Any, js.Any]] = js.native
  val orderedMap: Requireable[OrderedMap[js.Any, js.Any]] = js.native
  val orderedSet: Requireable[OrderedSet[js.Any]] = js.native
  val record: Requireable[Map[String, js.Any]] = js.native
  val seq: Requireable[Seq[js.Any, js.Any]] = js.native
  val set: Requireable[Set_[js.Any]] = js.native
  val stack: Requireable[Stack[js.Any]] = js.native
  def contains(`type`: ValidationMap[_]): Requireable[Iterable[_]] = js.native
  def iterableOf[V](`type`: Validator[V]): Requireable[Iterable[_]] = js.native
  def listOf[V](`type`: Validator[V]): Requireable[List[V]] = js.native
  def mapContains(`type`: ValidationMap[_]): Requireable[Map[_, _]] = js.native
  def mapOf[V, K](valueType: Validator[V]): Requireable[Map[K, V]] = js.native
  def mapOf[V, K](valueType: Validator[V], keyType: Validator[K]): Requireable[Map[K, V]] = js.native
  def orderedMapOf[V, K](valueType: Validator[V]): Requireable[OrderedMap[K, V]] = js.native
  def orderedMapOf[V, K](valueType: Validator[V], keyType: Validator[K]): Requireable[OrderedMap[K, V]] = js.native
  def orderedSetOf[V](`type`: Validator[V]): Requireable[OrderedSet[V]] = js.native
  def recordOf(`type`: ValidationMap[_]): Requireable[Map[String, _]] = js.native
  def setOf[V](`type`: Validator[V]): Requireable[Set_[V]] = js.native
  def shape(`type`: ValidationMap[_]): Requireable[Iterable[_]] = js.native
  def stackOf[V](`type`: Validator[V]): Requireable[Stack[V]] = js.native
}

