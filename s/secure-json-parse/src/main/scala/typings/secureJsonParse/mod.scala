package typings.secureJsonParse

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
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
  
  inline def parse(text: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parse(text: String, reviver: Null, options: ParseOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(text: String, reviver: Unit, options: ParseOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(text: String, reviver: Reviver): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(text: String, reviver: Reviver, options: ParseOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(text: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parse(text: Buffer, reviver: Null, options: ParseOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(text: Buffer, reviver: Unit, options: ParseOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(text: Buffer, reviver: Reviver): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(text: Buffer, reviver: Reviver, options: ParseOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def safeParse(text: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("safeParse")(text.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def safeParse(text: String, reviver: Reviver): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("safeParse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def safeParse(text: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("safeParse")(text.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def safeParse(text: Buffer, reviver: Reviver): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("safeParse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def scan(obj: StringDictionary[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def scan(obj: StringDictionary[Any], options: ParseOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait ParseOptions extends StObject {
    
    /**
      * What to do when a `constructor` key is found.
      * - `'error'` - throw a `SyntaxError` when a `constructor.prototype` key is found. This is the default value.
      * - `'remove'` - deletes any `constructor` keys from the result object.
      * - `'ignore'` - skips all validation (same as calling `JSON.parse()` directly).
      */
    var constructorAction: js.UndefOr[error | remove | ignore] = js.undefined
    
    /**
      * What to do when a `__proto__` key is found.
      * - `'error'` - throw a `SyntaxError` when a `__proto__` key is found. This is the default value.
      * - `'remove'` - deletes any `__proto__` keys from the result object.
      * - `'ignore'` - skips all validation (same as calling `JSON.parse()` directly).
      */
    var protoAction: js.UndefOr[error | remove | ignore] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setConstructorAction(value: error | remove | ignore): Self = StObject.set(x, "constructorAction", value.asInstanceOf[js.Any])
      
      inline def setConstructorActionUndefined: Self = StObject.set(x, "constructorAction", js.undefined)
      
      inline def setProtoAction(value: error | remove | ignore): Self = StObject.set(x, "protoAction", value.asInstanceOf[js.Any])
      
      inline def setProtoActionUndefined: Self = StObject.set(x, "protoAction", js.undefined)
    }
  }
  
  type Reviver = js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]
  
  type ScanOptions = ParseOptions
}
