package typings.re2

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.re2.re2Strings.`throw`
import typings.re2.re2Strings.nothing
import typings.re2.re2Strings.warn
import typings.re2.re2Strings.warnOnce
import typings.std.RegExp
import typings.std.RegExpConstructor
import typings.std.RegExpMatchArray
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
    def this(pattern: RE2) = this()
    def this(pattern: String, flags: String) = this()
    def this(pattern: String, flags: Buffer) = this()
    def this(pattern: Buffer, flags: String) = this()
    def this(pattern: Buffer, flags: Buffer) = this()
  }
  
  @js.native
  trait RE2
    extends StObject
       with RegExp {
    
    def exec(str: Buffer): RE2BufferExecArray | Null = js.native
    
    @JSName("match")
    def match_MRE2(str: String): RegExpMatchArray | Null = js.native
    @JSName("match")
    def match_MRE2(str: Buffer): RE2BufferMatchArray | Null = js.native
    
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
  
  trait RE2BufferExecArray extends StObject {
    
    var `0`: Buffer
    
    var groups: js.UndefOr[StringDictionary[Buffer]] = js.undefined
    
    var index: Double
    
    var input: Buffer
  }
  object RE2BufferExecArray {
    
    inline def apply(`0`: Buffer, index: Double, input: Buffer): RE2BufferExecArray = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RE2BufferExecArray]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RE2BufferExecArray] (val x: Self) extends AnyVal {
      
      inline def set0(value: Buffer): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def setGroups(value: StringDictionary[Buffer]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInput(value: Buffer): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
  
  trait RE2BufferMatchArray extends StObject {
    
    var `0`: Buffer
    
    var groups: js.UndefOr[StringDictionary[Buffer]] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var input: js.UndefOr[Buffer] = js.undefined
  }
  object RE2BufferMatchArray {
    
    inline def apply(`0`: Buffer): RE2BufferMatchArray = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RE2BufferMatchArray]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RE2BufferMatchArray] (val x: Self) extends AnyVal {
      
      inline def set0(value: Buffer): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def setGroups(value: StringDictionary[Buffer]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setInput(value: Buffer): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    }
  }
  
  @js.native
  trait RE2Constructor
    extends StObject
       with RegExpConstructor {
    
    def apply(pattern: String, flags: Buffer): RE2 = js.native
    def apply(pattern: Buffer): RE2 = js.native
    def apply(pattern: Buffer, flags: String): RE2 = js.native
    def apply(pattern: Buffer, flags: Buffer): RE2 = js.native
    def apply(pattern: RE2): RE2 = js.native
    
    def getUtf16Length(value: Buffer): Double = js.native
    
    def getUtf8Length(value: String): Double = js.native
    
    var unicodeWarningLevel: nothing | warnOnce | warn | `throw` = js.native
  }
  
  type _To = RE2Constructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RE2Constructor = ^
}
