package typings.sqlFormatter

import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("sql-formatter/lib/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dedupe(arr: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("dedupe")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def equalizeWhitespace(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("equalizeWhitespace")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def flatKeywordList(obj: Record[String, js.Array[String]]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatKeywordList")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def last[T](arr: js.Array[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(arr.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def maxLength(strings: js.Array[String]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maxLength")(strings.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sortByLengthDesc(strings: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sortByLengthDesc")(strings.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def sum(arr: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type Optional[T, K /* <: /* keyof T */ String */] = (Pick[Partial[T], K]) & (Omit[T, K])
}
