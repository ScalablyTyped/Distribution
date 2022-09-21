package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectionsMod {
  
  @JSImport("pusher-js/types/src/core/utils/collections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(array: js.Array[Any], test: js.Function): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(array.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def any(array: js.Array[Any], test: js.Function): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(array.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def apply(array: js.Array[Any], f: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(array.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(array: js.Array[Any], f: js.Function, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(array.asInstanceOf[js.Any], f.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def arrayIndexOf(array: js.Array[Any], item: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayIndexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def buildQueryString(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildQueryString")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decycleObject(`object`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decycleObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def encodeParamsObject(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeParamsObject")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def extend[T](target: Any, sources: Any*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[T]
  
  inline def filter(array: js.Array[Any], test: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def filterObject(`object`: js.Object, test: js.Function): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("filterObject")(`object`.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def flatten(`object`: js.Object): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def keys(`object`: Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def map(array: js.Array[Any], f: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def mapObject(`object`: Any, f: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mapObject")(`object`.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def objectApply(`object`: Any, f: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("objectApply")(`object`.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def safeJSONStringify(source: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeJSONStringify")(source.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringify(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[String]
  
  inline def values(`object`: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
}
