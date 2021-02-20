package typings.reactImmutableProptypes

import typings.immutable.Immutable.List
import typings.immutable.Immutable.Map
import typings.immutable.Immutable.OrderedMap
import typings.immutable.Immutable.OrderedSet
import typings.immutable.Immutable.Seq
import typings.immutable.Immutable.Set
import typings.immutable.Immutable.Stack
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.ValidationMap
import typings.propTypes.mod.Validator
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-immutable-proptypes", "contains")
  @js.native
  def contains(`type`: ValidationMap[_]): Requireable[Iterable[_]] = js.native
  
  @JSImport("react-immutable-proptypes", "iterable")
  @js.native
  val iterable: Requireable[Iterable[js.Any]] = js.native
  
  @JSImport("react-immutable-proptypes", "iterableOf")
  @js.native
  def iterableOf[V](`type`: Validator[V]): Requireable[Iterable[_]] = js.native
  
  @JSImport("react-immutable-proptypes", "list")
  @js.native
  val list: Requireable[List[js.Any]] = js.native
  
  @JSImport("react-immutable-proptypes", "listOf")
  @js.native
  def listOf[V](`type`: Validator[V]): Requireable[List[V]] = js.native
  
  @JSImport("react-immutable-proptypes", "map")
  @js.native
  val map: Requireable[Map[js.Any, js.Any]] = js.native
  
  @JSImport("react-immutable-proptypes", "mapContains")
  @js.native
  def mapContains(`type`: ValidationMap[_]): Requireable[Map[_, _]] = js.native
  
  @JSImport("react-immutable-proptypes", "mapOf")
  @js.native
  def mapOf[V, K](valueType: Validator[V]): Requireable[Map[K, V]] = js.native
  @JSImport("react-immutable-proptypes", "mapOf")
  @js.native
  def mapOf[V, K](valueType: Validator[V], keyType: Validator[K]): Requireable[Map[K, V]] = js.native
  
  @JSImport("react-immutable-proptypes", "orderedMap")
  @js.native
  val orderedMap: Requireable[OrderedMap[js.Any, js.Any]] = js.native
  
  @JSImport("react-immutable-proptypes", "orderedMapOf")
  @js.native
  def orderedMapOf[V, K](valueType: Validator[V]): Requireable[OrderedMap[K, V]] = js.native
  @JSImport("react-immutable-proptypes", "orderedMapOf")
  @js.native
  def orderedMapOf[V, K](valueType: Validator[V], keyType: Validator[K]): Requireable[OrderedMap[K, V]] = js.native
  
  @JSImport("react-immutable-proptypes", "orderedSet")
  @js.native
  val orderedSet: Requireable[OrderedSet[js.Any]] = js.native
  
  @JSImport("react-immutable-proptypes", "orderedSetOf")
  @js.native
  def orderedSetOf[V](`type`: Validator[V]): Requireable[OrderedSet[V]] = js.native
  
  @JSImport("react-immutable-proptypes", "record")
  @js.native
  val record: Requireable[Map[String, js.Any]] = js.native
  
  @JSImport("react-immutable-proptypes", "recordOf")
  @js.native
  def recordOf(`type`: ValidationMap[_]): Requireable[Map[String, _]] = js.native
  
  @JSImport("react-immutable-proptypes", "seq")
  @js.native
  val seq: Requireable[Seq[js.Any, js.Any]] = js.native
  
  @JSImport("react-immutable-proptypes", "set")
  @js.native
  val set: Requireable[Set[js.Any]] = js.native
  
  @JSImport("react-immutable-proptypes", "setOf")
  @js.native
  def setOf[V](`type`: Validator[V]): Requireable[Set[V]] = js.native
  
  @JSImport("react-immutable-proptypes", "shape")
  @js.native
  def shape(`type`: ValidationMap[_]): Requireable[Iterable[_]] = js.native
  
  @JSImport("react-immutable-proptypes", "stack")
  @js.native
  val stack: Requireable[Stack[js.Any]] = js.native
  
  @JSImport("react-immutable-proptypes", "stackOf")
  @js.native
  def stackOf[V](`type`: Validator[V]): Requireable[Stack[V]] = js.native
}
