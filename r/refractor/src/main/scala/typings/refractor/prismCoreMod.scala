package typings.refractor

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prismCoreMod {
  
  object Prism {
    
    @JSImport("refractor/lib/prism-core", "Prism")
    @js.native
    val ^ : js.Any = js.native
    
    inline def highlight(
      text: String,
      grammar: StringDictionary[js.RegExp | GrammarToken | (js.Array[js.RegExp | GrammarToken])],
      language: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(text.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[String]
    
    object hooks {
      
      @JSImport("refractor/lib/prism-core", "Prism.hooks")
      @js.native
      val ^ : js.Any = js.native
      
      inline def add(name: String, callback: HookCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def run(name: String, env: StringDictionary[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    object languages {
      
      @JSImport("refractor/lib/prism-core", "Prism.languages")
      @js.native
      val ^ : js.Any = js.native
      
      inline def DFS(o: Any, callback: Any, `type`: Any, visited: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DFS")(o.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], visited.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def extend(
        id: String,
        redef: StringDictionary[js.RegExp | GrammarToken | (js.Array[js.RegExp | GrammarToken])]
      ): StringDictionary[js.RegExp | GrammarToken | (js.Array[js.RegExp | GrammarToken])] = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(id.asInstanceOf[js.Any], redef.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.RegExp | GrammarToken | (js.Array[js.RegExp | GrammarToken])]]
      
      inline def insertBefore(
        inside: String,
        before: String,
        insert: StringDictionary[js.RegExp | GrammarToken | (js.Array[js.RegExp | GrammarToken])]
      ): StringDictionary[js.RegExp | GrammarToken | (js.Array[js.RegExp | GrammarToken])] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(inside.asInstanceOf[js.Any], before.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.RegExp | GrammarToken | (js.Array[js.RegExp | GrammarToken])]]
      inline def insertBefore(
        inside: String,
        before: String,
        insert: StringDictionary[js.RegExp | GrammarToken | (js.Array[js.RegExp | GrammarToken])],
        root: StringDictionary[Any]
      ): StringDictionary[js.RegExp | GrammarToken | (js.Array[js.RegExp | GrammarToken])] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(inside.asInstanceOf[js.Any], before.asInstanceOf[js.Any], insert.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.RegExp | GrammarToken | (js.Array[js.RegExp | GrammarToken])]]
    }
    
    inline def tokenize(
      text: String,
      grammar: StringDictionary[js.RegExp | GrammarToken | (js.Array[js.RegExp | GrammarToken])]
    ): TokenStream = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(text.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any])).asInstanceOf[TokenStream]
    
    object util {
      
      @JSImport("refractor/lib/prism-core", "Prism.util")
      @js.native
      val ^ : js.Any = js.native
      
      inline def clone_[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(o.asInstanceOf[js.Any]).asInstanceOf[T]
      inline def clone_[T](o: T, visited: Record[Double, Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(o.asInstanceOf[js.Any], visited.asInstanceOf[js.Any])).asInstanceOf[T]
      
      inline def objId(obj: js.Object): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("objId")(obj.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def `type`(o: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(o.asInstanceOf[js.Any]).asInstanceOf[String]
    }
  }
  
  type Grammar = StringDictionary[js.RegExp | GrammarToken | (js.Array[js.RegExp | GrammarToken])]
  
  trait GrammarToken extends StObject {
    
    /**
      * An optional alias or list of aliases.
      */
    var alias: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Whether the token is greedy.
      */
    var greedy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The nested grammar of this token.
      *
      * The `inside` grammar will be used to tokenize the text value of each token of this kind.
      *
      * This can be used to make nested and even recursive language definitions.
      *
      * Note: This can cause infinite recursion. Be careful when you embed different languages or even the same language into
      * each another.
      */
    var inside: js.UndefOr[
        StringDictionary[js.RegExp | GrammarToken | (js.Array[js.RegExp | GrammarToken])]
      ] = js.undefined
    
    /**
      * If `true`, then the first capturing group of `pattern` will (effectively)
      * behave as a lookbehind group meaning that the captured text will not be part of the matched text of the new token.
      */
    var lookbehind: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The regular expression of the token.
      */
    var pattern: js.RegExp
  }
  object GrammarToken {
    
    inline def apply(pattern: js.RegExp): GrammarToken = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[GrammarToken]
    }
    
    extension [Self <: GrammarToken](x: Self) {
      
      inline def setAlias(value: String | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
      
      inline def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
      
      inline def setGreedyUndefined: Self = StObject.set(x, "greedy", js.undefined)
      
      inline def setInside(value: StringDictionary[js.RegExp | GrammarToken | (js.Array[js.RegExp | GrammarToken])]): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
      
      inline def setInsideUndefined: Self = StObject.set(x, "inside", js.undefined)
      
      inline def setLookbehind(value: Boolean): Self = StObject.set(x, "lookbehind", value.asInstanceOf[js.Any])
      
      inline def setLookbehindUndefined: Self = StObject.set(x, "lookbehind", js.undefined)
      
      inline def setPattern(value: js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  type HighlightCallback = js.Function1[/* element */ Element, Unit]
  
  type HookCallback = js.Function1[/* env */ StringDictionary[Any], Unit]
  
  trait LinkedListNode[T] extends StObject {
    
    /**
      * The next node.
      */
    var next: LinkedListNode[T] | Null
    
    /**
      * The previous node.
      */
    var prev: LinkedListNode[T] | Null
    
    var value: T
  }
  object LinkedListNode {
    
    inline def apply[T](value: T): LinkedListNode[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], next = null, prev = null)
      __obj.asInstanceOf[LinkedListNode[T]]
    }
    
    extension [Self <: LinkedListNode[?], T](x: Self & LinkedListNode[T]) {
      
      inline def setNext(value: LinkedListNode[T]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
      
      inline def setPrev(value: LinkedListNode[T]): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevNull: Self = StObject.set(x, "prev", null)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RematchOptions extends StObject {
    
    var cause: String
    
    var reach: Double
  }
  object RematchOptions {
    
    inline def apply(cause: String, reach: Double): RematchOptions = {
      val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], reach = reach.asInstanceOf[js.Any])
      __obj.asInstanceOf[RematchOptions]
    }
    
    extension [Self <: RematchOptions](x: Self) {
      
      inline def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setReach(value: Double): Self = StObject.set(x, "reach", value.asInstanceOf[js.Any])
    }
  }
  
  trait Token extends StObject {
    
    /**
      * The alias(es) of the token.
      *
      * @type {string|string[]}
      * @see GrammarToken
      * @public
      */
    var alias: String | js.Array[String]
    
    /**
      * The strings or tokens contained by this token.
      *
      * This will be a token stream if the pattern matched also defined an `inside` grammar.
      *
      * @type {string | TokenStream}
      * @public
      */
    var content: String | TokenStream
    
    var length: Double
    
    /**
      * The type of the token.
      *
      * This is usually the key of a pattern in a {@link Grammar}.
      *
      * @type {string}
      * @see GrammarToken
      * @public
      */
    var `type`: String
  }
  object Token {
    
    inline def apply(alias: String | js.Array[String], content: String | TokenStream, length: Double, `type`: String): Token = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setAlias(value: String | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
      
      inline def setContent(value: String | TokenStream): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVarargs(value: (String | Token)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type TokenStream = js.Array[String | Token]
}
