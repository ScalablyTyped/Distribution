package typings.ret

import typings.ret.tokensMod.Root
import typings.ret.tokensMod.Tokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ret/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(regexpStr: String): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(regexpStr.asInstanceOf[js.Any]).asInstanceOf[Root]
  
  inline def reconstruct(token: Tokens): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reconstruct")(token.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def tokenizer(regexpStr: String): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenizer")(regexpStr.asInstanceOf[js.Any]).asInstanceOf[Root]
  
  @JSImport("ret/dist", "types")
  @js.native
  object types extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ret.typesTypesMod.types & Double] = js.native
    
    /* 7 */ val CHAR: typings.ret.typesTypesMod.types.CHAR & Double = js.native
    
    /* 1 */ val GROUP: typings.ret.typesTypesMod.types.GROUP & Double = js.native
    
    /* 2 */ val POSITION: typings.ret.typesTypesMod.types.POSITION & Double = js.native
    
    /* 4 */ val RANGE: typings.ret.typesTypesMod.types.RANGE & Double = js.native
    
    /* 6 */ val REFERENCE: typings.ret.typesTypesMod.types.REFERENCE & Double = js.native
    
    /* 5 */ val REPETITION: typings.ret.typesTypesMod.types.REPETITION & Double = js.native
    
    /* 0 */ val ROOT: typings.ret.typesTypesMod.types.ROOT & Double = js.native
    
    /* 3 */ val SET: typings.ret.typesTypesMod.types.SET & Double = js.native
  }
}
