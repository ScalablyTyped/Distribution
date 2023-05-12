package typings.stringAlgorithms

import typings.stringAlgorithms.stringAlgorithmsStrings.linear
import typings.stringAlgorithms.stringAlgorithmsStrings.log
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("string-algorithms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("string-algorithms", "StringIndexMap")
  @js.native
  open class StringIndexMap () extends StObject {
    def this(k: Double) = this()
    
    def add(length: Double): Double = js.native
    
    def lookup(suffix: Double, start: Double, end: Double): Double = js.native
  }
  
  inline def longestCommonPrefix(sequence: js.Array[String], suffixArray: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("longestCommonPrefix")(sequence.asInstanceOf[js.Any], suffixArray.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def longestCommonSubstring(strings: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("longestCommonSubstring")(strings.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def longestCommonSubstring(strings: js.Array[String], indexMap: log | linear): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("longestCommonSubstring")(strings.asInstanceOf[js.Any], indexMap.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def longestCommonSubstring(strings: js.Array[String], indexMap: StringIndexMap): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("longestCommonSubstring")(strings.asInstanceOf[js.Any], indexMap.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def radixSort[T](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T extends Array<number> ? [entries: Array<T>, getEntry: (el : T): Array<number> | undefined] : [entries: Array<T>, getEntry: (el : T): Array<number>] is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<number> ? [entries: std.Array<T>, getEntry: (el : T): std.Array<number> | undefined] : [entries: std.Array<T>, getEntry: (el : T): std.Array<number>] */ js.Any
  ): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("radixSort")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
  
  inline def search(text: String, term: String): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(text.asInstanceOf[js.Any], term.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def suffixArray(s: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("suffixArray")(s.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def suffixArray(s: String, terminator: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("suffixArray")(s.asInstanceOf[js.Any], terminator.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def suffixArray(s: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("suffixArray")(s.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def suffixArray(s: js.Array[Double], terminator: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("suffixArray")(s.asInstanceOf[js.Any], terminator.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
