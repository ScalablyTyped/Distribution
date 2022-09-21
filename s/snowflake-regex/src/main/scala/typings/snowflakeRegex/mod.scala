package typings.snowflakeRegex

import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.RegExp & {generate (options : snowflake-regex.snowflake-regex.GenerateOptions | undefined): std.RegExp} */
object mod {
  
  @JSImport("snowflake-regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // Non-standard extensions
  /** @deprecated A legacy feature for browser compatibility */
  /* standard es5 */
  inline def compile(pattern: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(pattern.asInstanceOf[js.Any]).asInstanceOf[this.type]
  inline def compile(pattern: String, flags: String): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[this.type]
  
  /**
    * Returns a Boolean value indicating the state of the dotAll flag (s) used with a regular expression.
    * Default is false. Read-only.
    */
  /* standard es2018.regexp */
  @JSImport("snowflake-regex", "dotAll")
  @js.native
  val dotAll: Boolean = js.native
  
  /**
    * Executes a search on a string using a regular expression pattern, and returns an array containing the results of that search.
    * @param string The String object or string literal on which to perform the search.
    */
  /* standard es5 */
  inline def exec(string: String): RegExpExecArray | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(string.asInstanceOf[js.Any]).asInstanceOf[RegExpExecArray | Null]
  
  /**
    * Returns a string indicating the flags of the regular expression in question. This field is read-only.
    * The characters in this string are sequenced and concatenated in the following order:
    *
    *    - "g" for global
    *    - "i" for ignoreCase
    *    - "m" for multiline
    *    - "u" for unicode
    *    - "y" for sticky
    *
    * If no flags are set, the value is the empty string.
    */
  /* standard es2015.core */
  @JSImport("snowflake-regex", "flags")
  @js.native
  val flags: String = js.native
  
  inline def generate(): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[js.RegExp]
  inline def generate(options: GenerateOptions): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  /** Returns a Boolean value indicating the state of the global flag (g) used with a regular expression. Default is false. Read-only. */
  /* standard es5 */
  @JSImport("snowflake-regex", "global")
  @js.native
  val global: Boolean = js.native
  
  /** Returns a Boolean value indicating the state of the ignoreCase flag (i) used with a regular expression. Default is false. Read-only. */
  /* standard es5 */
  @JSImport("snowflake-regex", "ignoreCase")
  @js.native
  val ignoreCase: Boolean = js.native
  
  /* standard es5 */
  @JSImport("snowflake-regex", "lastIndex")
  @js.native
  def lastIndex: Double = js.native
  inline def lastIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastIndex")(x.asInstanceOf[js.Any])
  
  /** Returns a Boolean value indicating the state of the multiline flag (m) used with a regular expression. Default is false. Read-only. */
  /* standard es5 */
  @JSImport("snowflake-regex", "multiline")
  @js.native
  val multiline: Boolean = js.native
  
  /** Returns a copy of the text of the regular expression pattern. Read-only. The regExp argument is a Regular expression object. It can be a variable name or a literal. */
  /* standard es5 */
  @JSImport("snowflake-regex", "source")
  @js.native
  val source: String = js.native
  
  /**
    * Returns a Boolean value indicating the state of the sticky flag (y) used with a regular
    * expression. Default is false. Read-only.
    */
  /* standard es2015.core */
  @JSImport("snowflake-regex", "sticky")
  @js.native
  val sticky: Boolean = js.native
  
  /**
    * Returns a Boolean value that indicates whether or not a pattern exists in a searched string.
    * @param string String on which to perform the search.
    */
  /* standard es5 */
  inline def test(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns a Boolean value indicating the state of the Unicode flag (u) used with a regular
    * expression. Default is false. Read-only.
    */
  /* standard es2015.core */
  @JSImport("snowflake-regex", "unicode")
  @js.native
  val unicode: Boolean = js.native
  
  trait GenerateOptions extends StObject {
    
    var exact: js.UndefOr[Boolean] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var multiline: js.UndefOr[Boolean] = js.undefined
  }
  object GenerateOptions {
    
    inline def apply(): GenerateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateOptions]
    }
    
    extension [Self <: GenerateOptions](x: Self) {
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    }
  }
}
