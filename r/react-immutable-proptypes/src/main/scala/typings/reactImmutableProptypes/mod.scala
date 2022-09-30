package typings.reactImmutableProptypes

import typings.immutable.mod.Map
import typings.immutable.mod.OrderedMap
import typings.immutable.mod.OrderedSet
import typings.immutable.mod.Seq
import typings.immutable.mod.Set_
import typings.immutable.mod.Stack
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.ValidationMap
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-immutable-proptypes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contains(`type`: ValidationMap[Any]): Requireable[js.Iterable[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")(`type`.asInstanceOf[js.Any]).asInstanceOf[Requireable[js.Iterable[Any]]]
  
  @JSImport("react-immutable-proptypes", "iterable")
  @js.native
  val iterable: Requireable[js.Iterable[Any]] = js.native
  
  inline def iterableOf[V](`type`: Validator[V]): Requireable[js.Iterable[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterableOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Requireable[js.Iterable[Any]]]
  
  @JSImport("react-immutable-proptypes", "list")
  @js.native
  val list: Requireable[typings.immutable.mod.List[Any]] = js.native
  
  inline def listOf[V](`type`: Validator[V]): Requireable[typings.immutable.mod.List[V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Requireable[typings.immutable.mod.List[V]]]
  
  @JSImport("react-immutable-proptypes", "map")
  @js.native
  val map: Requireable[Map[Any, Any]] = js.native
  
  inline def mapContains(`type`: ValidationMap[Any]): Requireable[Map[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapContains")(`type`.asInstanceOf[js.Any]).asInstanceOf[Requireable[Map[Any, Any]]]
  
  inline def mapOf[V, K](valueType: Validator[V]): Requireable[Map[K, V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapOf")(valueType.asInstanceOf[js.Any]).asInstanceOf[Requireable[Map[K, V]]]
  inline def mapOf[V, K](valueType: Validator[V], keyType: Validator[K]): Requireable[Map[K, V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapOf")(valueType.asInstanceOf[js.Any], keyType.asInstanceOf[js.Any])).asInstanceOf[Requireable[Map[K, V]]]
  
  @JSImport("react-immutable-proptypes", "orderedMap")
  @js.native
  val orderedMap: Requireable[OrderedMap[Any, Any]] = js.native
  
  inline def orderedMapOf[V, K](valueType: Validator[V]): Requireable[OrderedMap[K, V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orderedMapOf")(valueType.asInstanceOf[js.Any]).asInstanceOf[Requireable[OrderedMap[K, V]]]
  inline def orderedMapOf[V, K](valueType: Validator[V], keyType: Validator[K]): Requireable[OrderedMap[K, V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("orderedMapOf")(valueType.asInstanceOf[js.Any], keyType.asInstanceOf[js.Any])).asInstanceOf[Requireable[OrderedMap[K, V]]]
  
  @JSImport("react-immutable-proptypes", "orderedSet")
  @js.native
  val orderedSet: Requireable[OrderedSet[Any]] = js.native
  
  inline def orderedSetOf[V](`type`: Validator[V]): Requireable[OrderedSet[V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orderedSetOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Requireable[OrderedSet[V]]]
  
  @JSImport("react-immutable-proptypes", "record")
  @js.native
  val record: Requireable[Map[String, Any]] = js.native
  
  inline def recordOf(`type`: ValidationMap[Any]): Requireable[Map[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("recordOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Requireable[Map[String, Any]]]
  
  @JSImport("react-immutable-proptypes", "seq")
  @js.native
  val seq: Requireable[Seq[Any, Any]] = js.native
  
  @JSImport("react-immutable-proptypes", "set")
  @js.native
  val set: Requireable[Set_[Any]] = js.native
  
  inline def setOf[V](`type`: Validator[V]): Requireable[Set_[V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Requireable[Set_[V]]]
  
  inline def shape(`type`: ValidationMap[Any]): Requireable[js.Iterable[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shape")(`type`.asInstanceOf[js.Any]).asInstanceOf[Requireable[js.Iterable[Any]]]
  
  @JSImport("react-immutable-proptypes", "stack")
  @js.native
  val stack: Requireable[Stack[Any]] = js.native
  
  inline def stackOf[V](`type`: Validator[V]): Requireable[Stack[V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Requireable[Stack[V]]]
}
