package typings.qixianCsPathToRegexp

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@qixian.cs/path-to-regexp", "compile")
  @js.native
  def compile[P /* <: js.Object */](str: String): PathFunction[P] = js.native
  @JSImport("@qixian.cs/path-to-regexp", "compile")
  @js.native
  def compile[P /* <: js.Object */](str: String, options: ParseOptions with TokensToFunctionOptions): PathFunction[P] = js.native
  
  @JSImport("@qixian.cs/path-to-regexp", "parse")
  @js.native
  def parse(str: String): js.Array[Token] = js.native
  @JSImport("@qixian.cs/path-to-regexp", "parse")
  @js.native
  def parse(str: String, options: ParseOptions): js.Array[Token] = js.native
  
  @JSImport("@qixian.cs/path-to-regexp", "pathToRegexp")
  @js.native
  def pathToRegexp(path: Path): RegExp = js.native
  @JSImport("@qixian.cs/path-to-regexp", "pathToRegexp")
  @js.native
  def pathToRegexp(path: Path, keys: js.UndefOr[scala.Nothing], options: TokensToRegexpOptions with ParseOptions): RegExp = js.native
  @JSImport("@qixian.cs/path-to-regexp", "pathToRegexp")
  @js.native
  def pathToRegexp(path: Path, keys: js.Array[Key]): RegExp = js.native
  @JSImport("@qixian.cs/path-to-regexp", "pathToRegexp")
  @js.native
  def pathToRegexp(path: Path, keys: js.Array[Key], options: TokensToRegexpOptions with ParseOptions): RegExp = js.native
  
  @JSImport("@qixian.cs/path-to-regexp", "regexpToFunction")
  @js.native
  def regexpToFunction[P /* <: js.Object */](re: RegExp, keys: js.Array[Key]): MatchFunction[P] = js.native
  @JSImport("@qixian.cs/path-to-regexp", "regexpToFunction")
  @js.native
  def regexpToFunction[P /* <: js.Object */](re: RegExp, keys: js.Array[Key], options: RegexpToFunctionOptions): MatchFunction[P] = js.native
  
  @JSImport("@qixian.cs/path-to-regexp", "tokensToFunction")
  @js.native
  def tokensToFunction[P /* <: js.Object */](tokens: js.Array[Token]): PathFunction[P] = js.native
  @JSImport("@qixian.cs/path-to-regexp", "tokensToFunction")
  @js.native
  def tokensToFunction[P /* <: js.Object */](tokens: js.Array[Token], options: TokensToFunctionOptions): PathFunction[P] = js.native
  
  @JSImport("@qixian.cs/path-to-regexp", "tokensToRegexp")
  @js.native
  def tokensToRegexp(tokens: js.Array[Token]): RegExp = js.native
  @JSImport("@qixian.cs/path-to-regexp", "tokensToRegexp")
  @js.native
  def tokensToRegexp(tokens: js.Array[Token], keys: js.UndefOr[scala.Nothing], options: TokensToRegexpOptions): RegExp = js.native
  @JSImport("@qixian.cs/path-to-regexp", "tokensToRegexp")
  @js.native
  def tokensToRegexp(tokens: js.Array[Token], keys: js.Array[Key]): RegExp = js.native
  @JSImport("@qixian.cs/path-to-regexp", "tokensToRegexp")
  @js.native
  def tokensToRegexp(tokens: js.Array[Token], keys: js.Array[Key], options: TokensToRegexpOptions): RegExp = js.native
  
  @js.native
  trait Key extends StObject {
    
    var modifier: String = js.native
    
    var name: String | Double = js.native
    
    var pattern: String = js.native
    
    var prefix: String = js.native
    
    var suffix: String = js.native
  }
  object Key {
    
    @scala.inline
    def apply(modifier: String, name: String | Double, pattern: String, prefix: String, suffix: String): Key = {
      val __obj = js.Dynamic.literal(modifier = modifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String | Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    }
  }
  
  type MatchFunction[P /* <: js.Object */] = js.Function1[/* path */ String, Match_[P]]
  
  @js.native
  trait MatchResult[P /* <: js.Object */] extends Match_[P] {
    
    var index: Double = js.native
    
    var params: P = js.native
    
    var path: String = js.native
  }
  object MatchResult {
    
    @scala.inline
    def apply[P /* <: js.Object */](index: Double, params: P, path: String): MatchResult[P] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchResult[P]]
    }
    
    @scala.inline
    implicit class MatchResultMutableBuilder[Self <: MatchResult[_], P /* <: js.Object */] (val x: Self with MatchResult[P]) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: P): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.qixianCsPathToRegexp.qixianCsPathToRegexpBooleans.`false`
    - typings.qixianCsPathToRegexp.mod.MatchResult[P]
  */
  trait Match_[P /* <: js.Object */] extends StObject
  
  @js.native
  trait ParseOptions extends StObject {
    
    /**
      * Set the default delimiter for repeat parameters. (default: `'/'`)
      */
    var delimiter: js.UndefOr[String] = js.native
    
    /**
      * List of characters to automatically consider prefixes when parsing.
      */
    var prefixes: js.UndefOr[String] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setPrefixes(value: String): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixesUndefined: Self = StObject.set(x, "prefixes", js.undefined)
    }
  }
  
  type Path = String | RegExp | (js.Array[String | RegExp])
  
  type PathFunction[P /* <: js.Object */] = js.Function1[/* data */ js.UndefOr[P], String]
  
  @js.native
  trait RegexpToFunctionOptions extends StObject {
    
    /**
      * Function for decoding strings for params.
      */
    var decode: js.UndefOr[js.Function2[/* value */ String, /* token */ Key, String]] = js.native
  }
  object RegexpToFunctionOptions {
    
    @scala.inline
    def apply(): RegexpToFunctionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegexpToFunctionOptions]
    }
    
    @scala.inline
    implicit class RegexpToFunctionOptionsMutableBuilder[Self <: RegexpToFunctionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecode(value: (/* value */ String, /* token */ Key) => String): Self = StObject.set(x, "decode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
    }
  }
  
  type Token = String | Key
  
  @js.native
  trait TokensToFunctionOptions extends StObject {
    
    /**
      * Function for encoding input strings for output.
      */
    var encode: js.UndefOr[js.Function2[/* value */ String, /* token */ Key, String]] = js.native
    
    /**
      * When `true` the regexp will be case sensitive. (default: `false`)
      */
    var sensitive: js.UndefOr[Boolean] = js.native
    
    /**
      * When `false` the function can produce an invalid (unmatched) path. (default: `true`)
      */
    var validate: js.UndefOr[Boolean] = js.native
  }
  object TokensToFunctionOptions {
    
    @scala.inline
    def apply(): TokensToFunctionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokensToFunctionOptions]
    }
    
    @scala.inline
    implicit class TokensToFunctionOptionsMutableBuilder[Self <: TokensToFunctionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncode(value: (/* value */ String, /* token */ Key) => String): Self = StObject.set(x, "encode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      @scala.inline
      def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
      
      @scala.inline
      def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  @js.native
  trait TokensToRegexpOptions extends StObject {
    
    /**
      * Sets the final character for non-ending optimistic matches. (default: `/`)
      */
    var delimiter: js.UndefOr[String] = js.native
    
    /**
      * Encode path tokens for use in the `RegExp`.
      */
    var encode: js.UndefOr[js.Function1[/* value */ String, String]] = js.native
    
    /**
      * When `true` the regexp will match to the end of the string. (default: `true`)
      */
    var end: js.UndefOr[Boolean] = js.native
    
    /**
      * List of characters that can also be "end" characters.
      */
    var endsWith: js.UndefOr[String] = js.native
    
    /**
      * When `true` the regexp will be case sensitive. (default: `false`)
      */
    var sensitive: js.UndefOr[Boolean] = js.native
    
    /**
      * When `true` the regexp will match from the beginning of the string. (default: `true`)
      */
    var start: js.UndefOr[Boolean] = js.native
    
    /**
      * When `true` the regexp allows an optional trailing delimiter to match. (default: `false`)
      */
    var strict: js.UndefOr[Boolean] = js.native
  }
  object TokensToRegexpOptions {
    
    @scala.inline
    def apply(): TokensToRegexpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokensToRegexpOptions]
    }
    
    @scala.inline
    implicit class TokensToRegexpOptionsMutableBuilder[Self <: TokensToRegexpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setEncode(value: /* value */ String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      @scala.inline
      def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setEndsWith(value: String): Self = StObject.set(x, "endsWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndsWithUndefined: Self = StObject.set(x, "endsWith", js.undefined)
      
      @scala.inline
      def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
      
      @scala.inline
      def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  @JSImport("@qixian.cs/path-to-regexp", "match")
  @js.native
  def `match`[P /* <: js.Object */](str: Path): MatchFunction[P] = js.native
  @JSImport("@qixian.cs/path-to-regexp", "match")
  @js.native
  def `match`[P /* <: js.Object */](str: Path, options: ParseOptions with TokensToRegexpOptions with RegexpToFunctionOptions): MatchFunction[P] = js.native
}
