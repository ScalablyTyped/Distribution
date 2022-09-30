package typings.sortedArrayFunctions

import typings.sortedArrayFunctions.sortedArrayFunctionsInts.`-1`
import typings.sortedArrayFunctions.sortedArrayFunctionsInts.`0`
import typings.sortedArrayFunctions.sortedArrayFunctionsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sorted-array-functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add[T](list: js.Array[T], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def add[T](list: js.Array[T], value: T, compareFn: CompareFn[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any], compareFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addFromFront[T](list: js.Array[T], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addFromFront")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addFromFront[T](list: js.Array[T], value: T, compareFn: CompareFn[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addFromFront")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any], compareFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def eq_[T](list: js.Array[T], value: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def eq_[T](list: js.Array[T], value: T, compareFn: CompareFn[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any], compareFn.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def gt[T](list: js.Array[T], value: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def gt[T](list: js.Array[T], value: T, compareFn: CompareFn[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any], compareFn.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def gte[T](list: js.Array[T], value: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def gte[T](list: js.Array[T], value: T, compareFn: CompareFn[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any], compareFn.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def has[T](list: js.Array[T], value: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def has[T](list: js.Array[T], value: T, compareFn: CompareFn[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any], compareFn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lt[T](list: js.Array[T], value: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def lt[T](list: js.Array[T], value: T, compareFn: CompareFn[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any], compareFn.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def lte[T](list: js.Array[T], value: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def lte[T](list: js.Array[T], value: T, compareFn: CompareFn[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any], compareFn.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def nearest[T](list: js.Array[T], value: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nearest")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def nearest[T](list: js.Array[T], value: T, compareFn: CompareFn[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nearest")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any], compareFn.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def remove[T](list: js.Array[T], value: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def remove[T](list: js.Array[T], value: T, compareFn: CompareFn[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any], compareFn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type CompareFn[T] = js.Function2[/* a */ T, /* b */ T, `-1` | `0` | `1`]
}
