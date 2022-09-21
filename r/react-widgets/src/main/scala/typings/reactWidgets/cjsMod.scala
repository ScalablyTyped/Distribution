package typings.reactWidgets

import typings.reactWidgets.listMod.GroupBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsMod {
  
  @JSImport("react-widgets/cjs/_", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chunk[T](array: js.Array[T], chunkSize: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("chunk")(array.asInstanceOf[js.Any], chunkSize.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
  
  inline def groupBySortedKeys[TData](groupBy: GroupBy[TData], data: js.Array[TData]): js.Array[js.Tuple2[Any, js.Array[TData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBySortedKeys")(groupBy.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[Any, js.Array[TData]]]]
  inline def groupBySortedKeys[TData](groupBy: GroupBy[TData], data: js.Array[TData], _keys: js.Array[Any]): js.Array[js.Tuple2[Any, js.Array[TData]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBySortedKeys")(groupBy.asInstanceOf[js.Any], data.asInstanceOf[js.Any], _keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[Any, js.Array[TData]]]]
  
  inline def has[T](o: T, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(o.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def makeArray[T](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeArray")().asInstanceOf[js.Array[T]]
  inline def makeArray[T](obj: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeArray")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def makeArray[T](obj: T, excludeNull: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeArray")(obj.asInstanceOf[js.Any], excludeNull.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def makeArray[T](obj: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeArray")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def makeArray[T](obj: js.Array[T], excludeNull: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeArray")(obj.asInstanceOf[js.Any], excludeNull.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def makeArray[T](obj: Null, excludeNull: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeArray")(obj.asInstanceOf[js.Any], excludeNull.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def makeArray[T](obj: Unit, excludeNull: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeArray")(obj.asInstanceOf[js.Any], excludeNull.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def toItemArray[TDataItem](): js.Array[TDataItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("toItemArray")().asInstanceOf[js.Array[TDataItem]]
  inline def toItemArray[TDataItem](a: js.Array[TDataItem]): js.Array[TDataItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("toItemArray")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[TDataItem]]
  inline def toItemArray[TDataItem](a: Boolean): js.Array[TDataItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("toItemArray")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[TDataItem]]
}
