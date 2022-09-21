package typings.re2

import org.scalablytyped.runtime.Shortcut
import typings.node.bufferMod.global.Buffer
import typings.re2.re2Strings.`throw`
import typings.re2.re2Strings.nothing
import typings.re2.re2Strings.warn
import typings.re2.re2Strings.warnOnce
import typings.std.Array
import typings.std.RegExp
import typings.std.RegExpConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("re2", JSImport.Namespace)
  @js.native
  val ^ : RE2Constructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("re2", JSImport.Namespace)
  @js.native
  open class Class protected ()
    extends StObject
       with RE2 {
    def this(pattern: String) = this()
    def this(pattern: js.RegExp) = this()
    def this(pattern: Buffer) = this()
    def this(pattern: String, flags: String) = this()
    def this(pattern: Buffer, flags: String) = this()
  }
  
  @js.native
  trait RE2
    extends StObject
       with RegExp {
    
    def exec(str: Buffer): RE2ExecArray[Buffer] | Null = js.native
    
    @JSName("match")
    def match_MRE2(str: String): RE2MatchArray[String] | Null = js.native
    @JSName("match")
    def match_MRE2(str: Buffer): RE2MatchArray[Buffer] | Null = js.native
    
    @JSName("replace")
    def replace_MRE2(str: String, replaceValue: String): String = js.native
    @JSName("replace")
    def replace_MRE2(str: String, replaceValue: Buffer): String = js.native
    @JSName("replace")
    def replace_MRE2(str: String, replacer: js.Function2[/* substring */ String, /* repeated */ Any, String | Buffer]): String = js.native
    @JSName("replace")
    def replace_MRE2(str: Buffer, replaceValue: String): Buffer = js.native
    @JSName("replace")
    def replace_MRE2(str: Buffer, replaceValue: Buffer): Buffer = js.native
    @JSName("replace")
    def replace_MRE2(str: Buffer, replacer: js.Function2[/* substring */ String, /* repeated */ Any, String | Buffer]): Buffer = js.native
    
    @JSName("search")
    def search_MRE2(str: String): Double = js.native
    @JSName("search")
    def search_MRE2(str: Buffer): Double = js.native
    
    @JSName("split")
    def split_MRE2(str: String): js.Array[String] = js.native
    @JSName("split")
    def split_MRE2(str: String, limit: Double): js.Array[String] = js.native
    @JSName("split")
    def split_MRE2(str: Buffer): js.Array[Buffer] = js.native
    @JSName("split")
    def split_MRE2(str: Buffer, limit: Double): js.Array[Buffer] = js.native
    
    def test(str: Buffer): Boolean = js.native
  }
  
  @js.native
  trait RE2Constructor
    extends StObject
       with RegExpConstructor {
    
    def apply(pattern: Buffer): RE2 = js.native
    def apply(pattern: Buffer, flags: String): RE2 = js.native
    
    def getUtf16Length(value: Buffer): Double = js.native
    
    def getUtf8Length(value: String): Double = js.native
    
    var unicodeWarningLevel: nothing | warnOnce | warn | `throw` = js.native
  }
  
  @js.native
  trait RE2ExecArray[K]
    extends StObject
       with Array[K] {
    
    var index: Double = js.native
    
    var input: K = js.native
  }
  
  @js.native
  trait RE2MatchArray[K]
    extends StObject
       with Array[K] {
    
    var index: js.UndefOr[Double] = js.native
    
    var input: js.UndefOr[K] = js.native
  }
  
  type _To = RE2Constructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RE2Constructor = ^
}
