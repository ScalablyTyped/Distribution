package typings.primereact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("primereact", "ObjectUtils")
@js.native
open class ObjectUtils ()
  extends typings.primereact.utilsMod.ObjectUtils
/* static members */
object ObjectUtils {
  
  @JSImport("primereact", "ObjectUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def combinedRefs(innerRef: Any, forwardRef: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("combinedRefs")(innerRef.asInstanceOf[js.Any], forwardRef.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deepEquals(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def equals(obj1: Any, obj2: Any, field: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def findDiffKeys(obj1: Any, obj2: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("findDiffKeys")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def findIndexInList(value: Any, list: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexInList")(value.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def findIndexInList(value: Any, list: js.Array[Any], dataKey: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexInList")(value.asInstanceOf[js.Any], list.asInstanceOf[js.Any], dataKey.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getJSXElement(obj: Any, params: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSXElement")(scala.List(obj.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def getPropValue(obj: Any, params: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropValue")(scala.List(obj.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def getRefElement(ref: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRefElement")(ref.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isEmpty(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNotEmpty(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def removeAccents(str: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAccents")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def reorderArray(value: Any, from: Double, to: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reorderArray")(value.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolveFieldData(data: Any, field: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFieldData")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def sort(value1: Any, value2: Any, order: Double, locale: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], order.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def sort(value1: Any, value2: Any, order: Double, locale: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], order.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Double]
}
