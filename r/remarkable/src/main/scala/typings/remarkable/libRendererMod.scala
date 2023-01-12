package typings.remarkable

import typings.remarkable.libMod.ContentToken
import typings.remarkable.libMod.Env
import typings.remarkable.libMod.GetBreak
import typings.remarkable.libMod.Options
import typings.remarkable.libMod.Remarkable
import typings.remarkable.libMod.Rules
import typings.remarkable.libMod.Token
import typings.remarkable.remarkableStrings.Linefeed
import typings.remarkable.remarkableStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRendererMod {
  
  /**
    * Renderer class. Renders HTML and exposes `rules` to allow
    * local modifications.
    */
  @JSImport("remarkable/lib/renderer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Renderer {
    
    /**
      * Exported helper, for custom rules only.
      */
    /* CompleteClass */
    override def getBreak(
      /**
      * The list of tokens currently being processed.
      */
    tokens: js.Array[ContentToken],
      /**
      * The index of the token currently being processed.
      */
    idx: Double
    ): _empty | Linefeed = js.native
    /* CompleteClass */
    override def getBreak(
      /**
      * The list of tokens currently being processed.
      */
    tokens: js.Array[ContentToken],
      /**
      * The index of the token currently being processed.
      */
    idx: Double,
      /**
      * The options given to remarkable.
      */
    options: Unit,
      /**
      * The key-value store created by the parsing rules.
      */
    env: Unit,
      /**
      * The possible instance of Remarkable. See `fence` renderer function.
      */
    instance: Remarkable
    ): _empty | Linefeed = js.native
    /* CompleteClass */
    override def getBreak(
      /**
      * The list of tokens currently being processed.
      */
    tokens: js.Array[ContentToken],
      /**
      * The index of the token currently being processed.
      */
    idx: Double,
      /**
      * The options given to remarkable.
      */
    options: Unit,
      /**
      * The key-value store created by the parsing rules.
      */
    env: Env
    ): _empty | Linefeed = js.native
    /* CompleteClass */
    override def getBreak(
      /**
      * The list of tokens currently being processed.
      */
    tokens: js.Array[ContentToken],
      /**
      * The index of the token currently being processed.
      */
    idx: Double,
      /**
      * The options given to remarkable.
      */
    options: Unit,
      /**
      * The key-value store created by the parsing rules.
      */
    env: Env,
      /**
      * The possible instance of Remarkable. See `fence` renderer function.
      */
    instance: Remarkable
    ): _empty | Linefeed = js.native
    /* CompleteClass */
    override def getBreak(
      /**
      * The list of tokens currently being processed.
      */
    tokens: js.Array[ContentToken],
      /**
      * The index of the token currently being processed.
      */
    idx: Double,
      /**
      * The options given to remarkable.
      */
    options: Options
    ): _empty | Linefeed = js.native
    /* CompleteClass */
    override def getBreak(
      /**
      * The list of tokens currently being processed.
      */
    tokens: js.Array[ContentToken],
      /**
      * The index of the token currently being processed.
      */
    idx: Double,
      /**
      * The options given to remarkable.
      */
    options: Options,
      /**
      * The key-value store created by the parsing rules.
      */
    env: Unit,
      /**
      * The possible instance of Remarkable. See `fence` renderer function.
      */
    instance: Remarkable
    ): _empty | Linefeed = js.native
    /* CompleteClass */
    override def getBreak(
      /**
      * The list of tokens currently being processed.
      */
    tokens: js.Array[ContentToken],
      /**
      * The index of the token currently being processed.
      */
    idx: Double,
      /**
      * The options given to remarkable.
      */
    options: Options,
      /**
      * The key-value store created by the parsing rules.
      */
    env: Env
    ): _empty | Linefeed = js.native
    /* CompleteClass */
    override def getBreak(
      /**
      * The list of tokens currently being processed.
      */
    tokens: js.Array[ContentToken],
      /**
      * The index of the token currently being processed.
      */
    idx: Double,
      /**
      * The options given to remarkable.
      */
    options: Options,
      /**
      * The key-value store created by the parsing rules.
      */
    env: Env,
      /**
      * The possible instance of Remarkable. See `fence` renderer function.
      */
    instance: Remarkable
    ): _empty | Linefeed = js.native
    /**
      * Exported helper, for custom rules only.
      */
    /* CompleteClass */
    @JSName("getBreak")
    var getBreak_Original: GetBreak = js.native
    
    /**
      * Render a string of HTML with the given `tokens` and
      * `options`.
      */
    /* CompleteClass */
    override def render(tokens: js.Array[Token], options: Options, env: Env): String = js.native
    
    /**
      * Render a string of inline HTML with the given `tokens` and
      * `options`.
      */
    /* CompleteClass */
    override def renderInline(tokens: js.Array[Token], options: Options, env: Env): String = js.native
    
    /* CompleteClass */
    var rules: Rules = js.native
  }
  
  /**
    * Renderer class. Renders HTML and exposes `rules` to allow
    * local modifications.
    */
  trait Renderer extends StObject {
    
    /**
      * Exported helper, for custom rules only.
      */
    def getBreak(
      /**
      * The list of tokens currently being processed.
      */
    tokens: js.Array[ContentToken],
      /**
      * The index of the token currently being processed.
      */
    idx: Double
    ): _empty | Linefeed
    def getBreak(
      /**
      * The list of tokens currently being processed.
      */
    tokens: js.Array[ContentToken],
      /**
      * The index of the token currently being processed.
      */
    idx: Double,
      /**
      * The options given to remarkable.
      */
    options: Unit,
      /**
      * The key-value store created by the parsing rules.
      */
    env: Unit,
      /**
      * The possible instance of Remarkable. See `fence` renderer function.
      */
    instance: Remarkable
    ): _empty | Linefeed
    def getBreak(
      /**
      * The list of tokens currently being processed.
      */
    tokens: js.Array[ContentToken],
      /**
      * The index of the token currently being processed.
      */
    idx: Double,
      /**
      * The options given to remarkable.
      */
    options: Unit,
      /**
      * The key-value store created by the parsing rules.
      */
    env: Env
    ): _empty | Linefeed
    def getBreak(
      /**
      * The list of tokens currently being processed.
      */
    tokens: js.Array[ContentToken],
      /**
      * The index of the token currently being processed.
      */
    idx: Double,
      /**
      * The options given to remarkable.
      */
    options: Unit,
      /**
      * The key-value store created by the parsing rules.
      */
    env: Env,
      /**
      * The possible instance of Remarkable. See `fence` renderer function.
      */
    instance: Remarkable
    ): _empty | Linefeed
    def getBreak(
      /**
      * The list of tokens currently being processed.
      */
    tokens: js.Array[ContentToken],
      /**
      * The index of the token currently being processed.
      */
    idx: Double,
      /**
      * The options given to remarkable.
      */
    options: Options
    ): _empty | Linefeed
    def getBreak(
      /**
      * The list of tokens currently being processed.
      */
    tokens: js.Array[ContentToken],
      /**
      * The index of the token currently being processed.
      */
    idx: Double,
      /**
      * The options given to remarkable.
      */
    options: Options,
      /**
      * The key-value store created by the parsing rules.
      */
    env: Unit,
      /**
      * The possible instance of Remarkable. See `fence` renderer function.
      */
    instance: Remarkable
    ): _empty | Linefeed
    def getBreak(
      /**
      * The list of tokens currently being processed.
      */
    tokens: js.Array[ContentToken],
      /**
      * The index of the token currently being processed.
      */
    idx: Double,
      /**
      * The options given to remarkable.
      */
    options: Options,
      /**
      * The key-value store created by the parsing rules.
      */
    env: Env
    ): _empty | Linefeed
    def getBreak(
      /**
      * The list of tokens currently being processed.
      */
    tokens: js.Array[ContentToken],
      /**
      * The index of the token currently being processed.
      */
    idx: Double,
      /**
      * The options given to remarkable.
      */
    options: Options,
      /**
      * The key-value store created by the parsing rules.
      */
    env: Env,
      /**
      * The possible instance of Remarkable. See `fence` renderer function.
      */
    instance: Remarkable
    ): _empty | Linefeed
    /**
      * Exported helper, for custom rules only.
      */
    @JSName("getBreak")
    var getBreak_Original: GetBreak
    
    /**
      * Render a string of HTML with the given `tokens` and
      * `options`.
      */
    def render(tokens: js.Array[Token], options: Options, env: Env): String
    
    /**
      * Render a string of inline HTML with the given `tokens` and
      * `options`.
      */
    def renderInline(tokens: js.Array[Token], options: Options, env: Env): String
    
    var rules: Rules
  }
  object Renderer {
    
    inline def apply(
      getBreak: (/* tokens */ js.Array[ContentToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => _empty | Linefeed,
      render: (js.Array[Token], Options, Env) => String,
      renderInline: (js.Array[Token], Options, Env) => String,
      rules: Rules
    ): Renderer = {
      val __obj = js.Dynamic.literal(getBreak = js.Any.fromFunction5(getBreak), render = js.Any.fromFunction3(render), renderInline = js.Any.fromFunction3(renderInline), rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Renderer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Renderer] (val x: Self) extends AnyVal {
      
      inline def setGetBreak(
        value: (/* tokens */ js.Array[ContentToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => _empty | Linefeed
      ): Self = StObject.set(x, "getBreak", js.Any.fromFunction5(value))
      
      inline def setRender(value: (js.Array[Token], Options, Env) => String): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      inline def setRenderInline(value: (js.Array[Token], Options, Env) => String): Self = StObject.set(x, "renderInline", js.Any.fromFunction3(value))
      
      inline def setRules(value: Rules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    }
  }
}
