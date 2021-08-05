package typings.secureJsonParse

import typings.secureJsonParse.secureJsonParseStrings.error
import typings.secureJsonParse.secureJsonParseStrings.ignore
import typings.secureJsonParse.secureJsonParseStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("secure-json-parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(input: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def parse(input: String, reviver: Unit, options: ParseOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def parse(input: String, reviver: Reviver): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def parse(input: String, reviver: Reviver, options: ParseOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def safeParse(input: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("safeParse")(input.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def safeParse(input: String, reviver: Reviver): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("safeParse")(input.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def scan(input: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def scan(input: js.Any, options: ParseOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ParseOptions extends StObject {
    
    var constructorAction: js.UndefOr[error | remove] = js.undefined
    
    var protoAction: js.UndefOr[error | remove | ignore] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setConstructorAction(value: error | remove): Self = StObject.set(x, "constructorAction", value.asInstanceOf[js.Any])
      
      inline def setConstructorActionUndefined: Self = StObject.set(x, "constructorAction", js.undefined)
      
      inline def setProtoAction(value: error | remove | ignore): Self = StObject.set(x, "protoAction", value.asInstanceOf[js.Any])
      
      inline def setProtoActionUndefined: Self = StObject.set(x, "protoAction", js.undefined)
    }
  }
  
  type Reviver = js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any]
}
