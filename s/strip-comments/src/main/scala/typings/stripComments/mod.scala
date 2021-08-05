package typings.stripComments

import typings.stripComments.nodeMod.Block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Strip all code comments from the given `input`, including protected
    * comments that start with `!`, unless disabled by setting `options.keepProtected`
    * to true.
    *
    * ```js
    * const str = strip('const foo = "bar";// this is a comment\n / * me too *\/');
    * console.log(str);
    * // => 'const foo = "bar";'
    * ```
    * @param string - string from which to strip comments
    * @param [options] - passed to [extract-comments][extract-comments]
    */
  inline def apply(input: String): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("strip-comments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Strip only block comments.
    *
    * ```js
    * const strip = require('..');
    * const str = strip.block('const foo = "bar";// this is a comment\n / * me too *\/');
    * console.log(str);
    * // => 'const foo = "bar";// this is a comment'
    * ```
    * @param `input` string from which to strip comments
    * @param  [`options`] pass `opts.keepProtected: true` to keep ignored comments (e.g. `/ *!`)
    */
  inline def block(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("block")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def block(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("block")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Strip the first comment from the given `input`. Or, if `opts.keepProtected` is true,
    * the first non-protected comment will be stripped.
    *
    * ```js
    * const output = strip.first(input, { keepProtected: true });
    * console.log(output);
    * // => '//! first comment\nfoo; '
    * ```
    * @param  `input` string from which to strip comments
    * @param [`options`] pass `opts.keepProtected: true` to keep comments with `!`
    */
  inline def first(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def first(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Strip only line comments.
    *
    * ```js
    * const str = strip.line('const foo = "bar";// this is a comment\n / * me too *\/');
    * console.log(str);
    * // => 'const foo = "bar";\n/ * me too *\/'
    * ```
    * @param  `input` string from which to strip comments
    * @param  [`options`] pass `opts.keepProtected: true` to keep ignored comments (e.g. `//!`)
    */
  inline def line(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("line")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def line(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("strip-comments", "parse")
  @js.native
  val parse: js.Function2[/* input */ String, /* options */ js.UndefOr[Options], Block] = js.native
  
  trait Options extends StObject {
    
    /**
      * if `false` strip only line comments
      * @default true
      */
    var block: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Keep ignored comments (e.g. `/ *!` and `//!`)
      */
    var keepProtected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default 'javascript'
      */
    var language: js.UndefOr[String] = js.undefined
    
    /**
      * if `false` strip only block comments
      * @default true
      */
    var line: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Preserve newlines after comments are stripped
      */
    var preserveNewlines: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setKeepProtected(value: Boolean): Self = StObject.set(x, "keepProtected", value.asInstanceOf[js.Any])
      
      inline def setKeepProtectedUndefined: Self = StObject.set(x, "keepProtected", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLine(value: Boolean): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setPreserveNewlines(value: Boolean): Self = StObject.set(x, "preserveNewlines", value.asInstanceOf[js.Any])
      
      inline def setPreserveNewlinesUndefined: Self = StObject.set(x, "preserveNewlines", js.undefined)
    }
  }
}
