package typings.secureJsonParse

import typings.secureJsonParse.secureJsonParseStrings.error
import typings.secureJsonParse.secureJsonParseStrings.ignore
import typings.secureJsonParse.secureJsonParseStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("secure-json-parse", "parse")
  @js.native
  def parse(input: String): js.Any = js.native
  @JSImport("secure-json-parse", "parse")
  @js.native
  def parse(input: String, reviver: js.UndefOr[scala.Nothing], options: ParseOptions): js.Any = js.native
  @JSImport("secure-json-parse", "parse")
  @js.native
  def parse(input: String, reviver: Reviver): js.Any = js.native
  @JSImport("secure-json-parse", "parse")
  @js.native
  def parse(input: String, reviver: Reviver, options: ParseOptions): js.Any = js.native
  
  @JSImport("secure-json-parse", "safeParse")
  @js.native
  def safeParse(input: String): js.Any = js.native
  @JSImport("secure-json-parse", "safeParse")
  @js.native
  def safeParse(input: String, reviver: Reviver): js.Any = js.native
  
  @JSImport("secure-json-parse", "scan")
  @js.native
  def scan(input: js.Any): Unit = js.native
  @JSImport("secure-json-parse", "scan")
  @js.native
  def scan(input: js.Any, options: ParseOptions): Unit = js.native
  
  @js.native
  trait ParseOptions extends StObject {
    
    var constructorAction: js.UndefOr[error | remove] = js.native
    
    var protoAction: js.UndefOr[error | remove | ignore] = js.native
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
      def setConstructorAction(value: error | remove): Self = StObject.set(x, "constructorAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstructorActionUndefined: Self = StObject.set(x, "constructorAction", js.undefined)
      
      @scala.inline
      def setProtoAction(value: error | remove | ignore): Self = StObject.set(x, "protoAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtoActionUndefined: Self = StObject.set(x, "protoAction", js.undefined)
    }
  }
  
  type Reviver = js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any]
}
