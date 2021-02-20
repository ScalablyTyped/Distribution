package typings.sade

import typings.mri.mod.Options
import typings.sade.anon.ReadonlyCommandOptions
import typings.sade.anon.lazytrueParseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sade", JSImport.Namespace)
  @js.native
  def apply(str: String): Sade = js.native
  @JSImport("sade", JSImport.Namespace)
  @js.native
  def apply(str: String, isOne: Boolean): Sade = js.native
  
  @js.native
  trait CommandOptions extends StObject {
    
    var default: js.UndefOr[Boolean] = js.native
    
    /**
      * Optionally define one or more aliases for the current Command.
      * When declared, the `opts.alias` value is passed directly to the [`prog.alias`](#progaliasnames) method.
      */
    var alias: js.UndefOr[String | js.Array[String]] = js.native
  }
  object CommandOptions {
    
    @scala.inline
    def apply(): CommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandOptions]
    }
    
    @scala.inline
    implicit class CommandOptionsMutableBuilder[Self <: CommandOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    }
  }
  
  type Handler = js.Function1[/* repeated */ js.Any, js.Any]
  
  @js.native
  trait LazyOutput extends StObject {
    
    var args: js.Array[String] = js.native
    
    def handler(args: js.Any*): js.Any = js.native
    @JSName("handler")
    var handler_Original: Handler = js.native
    
    var name: String = js.native
  }
  
  @js.native
  trait ParseOptions extends Options {
    
    var `lazy`: js.UndefOr[Boolean] = js.native
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
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    }
  }
  
  @js.native
  trait Sade extends StObject {
    
    def action(handler: Handler): Sade = js.native
    
    /**
      * Define one or more aliases for the current Command.
      */
    def alias(names: String*): Sade = js.native
    
    def command(str: String): Sade = js.native
    def command(str: String, desc: js.UndefOr[scala.Nothing], opts: ReadonlyCommandOptions): Sade = js.native
    def command(str: String, desc: String): Sade = js.native
    def command(str: String, desc: String, opts: ReadonlyCommandOptions): Sade = js.native
    
    def describe(str: String): Sade = js.native
    def describe(str: js.Array[String]): Sade = js.native
    
    def example(str: String): Sade = js.native
    
    def help(str: String): Unit = js.native
    
    def option(str: String, desc: String): Sade = js.native
    def option(str: String, desc: String, `val`: String): Sade = js.native
    def option(str: String, desc: String, `val`: Boolean): Sade = js.native
    def option(str: String, desc: String, `val`: Double): Sade = js.native
    
    def parse(arr: js.Array[String]): Unit = js.native
    def parse(arr: js.Array[String], opts: lazytrueParseOptions): LazyOutput = js.native
    def parse(arr: js.Array[String], opts: ParseOptions): Unit = js.native
    
    def version(str: String): Sade = js.native
  }
}
