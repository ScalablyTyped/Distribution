package typings.sade

import typings.sade.anon.Alias
import typings.sade.anon.lazybooleanundefinedOptio
import typings.sade.anon.lazytrueOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(usage: String): Sade = ^.asInstanceOf[js.Dynamic].apply(usage.asInstanceOf[js.Any]).asInstanceOf[Sade]
  inline def apply(usage: String, isSingle: Boolean): Sade = (^.asInstanceOf[js.Dynamic].apply(usage.asInstanceOf[js.Any], isSingle.asInstanceOf[js.Any])).asInstanceOf[Sade]
  
  @JSImport("sade", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Arrayable[T] = T | js.Array[T]
  
  @js.native
  trait Handler extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  trait LazyOutput extends StObject {
    
    var args: js.Array[String]
    
    def handler(args: Any*): Any
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
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setHandler(value: Handler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Sade extends StObject {
    
    def action(handler: Handler): Sade = js.native
    
    def alias(names: String*): Sade = js.native
    
    def command(usage: String): Sade = js.native
    def command(usage: String, description: String): Sade = js.native
    def command(usage: String, description: String, options: Alias): Sade = js.native
    def command(usage: String, description: Unit, options: Alias): Sade = js.native
    
    def describe(text: Arrayable[String]): Sade = js.native
    
    def example(usage: String): Sade = js.native
    
    def help(): Unit = js.native
    def help(cmd: String): Unit = js.native
    
    def option(flag: String): Sade = js.native
    def option(flag: String, description: String): Sade = js.native
    def option(flag: String, description: String, value: Value): Sade = js.native
    def option(flag: String, description: Unit, value: Value): Sade = js.native
    
    def parse(arr: js.Array[String]): Unit = js.native
    def parse(arr: js.Array[String], opts: lazybooleanundefinedOptio): Unit = js.native
    def parse(arr: js.Array[String], opts: lazytrueOptions): LazyOutput = js.native
    
    def version(value: String): Sade = js.native
  }
  
  type Value = Double | String | Boolean | Null
}
