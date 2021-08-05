package typings.sade

import typings.mri.mod.Options
import typings.sade.anon.ReadonlyCommandOptions
import typings.sade.anon.lazytrueParseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(str: String): Sade = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[Sade]
  inline def apply(str: String, isOne: Boolean): Sade = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], isOne.asInstanceOf[js.Any])).asInstanceOf[Sade]
  
  @JSImport("sade", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CommandOptions extends StObject {
    
    var default: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optionally define one or more aliases for the current Command.
      * When declared, the `opts.alias` value is passed directly to the [`prog.alias`](#progaliasnames) method.
      */
    var alias: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object CommandOptions {
    
    inline def apply(): CommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandOptions]
    }
    
    extension [Self <: CommandOptions](x: Self) {
      
      inline def setAlias(value: String | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value :_*))
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    }
  }
  
  @js.native
  trait Handler extends StObject {
    
    def apply(args: js.Any*): js.Any = js.native
  }
  
  trait LazyOutput extends StObject {
    
    var args: js.Array[String]
    
    def handler(args: js.Any*): js.Any
    @JSName("handler")
    var handler_Original: Handler
    
    var name: String
  }
  object LazyOutput {
    
    inline def apply(args: js.Array[String], handler: Handler, name: String): LazyOutput = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LazyOutput]
    }
    
    extension [Self <: LazyOutput](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setHandler(value: Handler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseOptions
    extends StObject
       with Options {
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
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
    def command(str: String, desc: String): Sade = js.native
    def command(str: String, desc: String, opts: ReadonlyCommandOptions): Sade = js.native
    def command(str: String, desc: Unit, opts: ReadonlyCommandOptions): Sade = js.native
    
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
