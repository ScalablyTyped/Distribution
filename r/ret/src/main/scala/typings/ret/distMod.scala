package typings.ret

import typings.ret.distTypesTokensMod.Root
import typings.ret.distTypesTokensMod.Tokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
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
    def apply(value: Double): js.UndefOr[typings.ret.distTypesTypesMod.types & Double] = js.native
    
    /* 7 */ val CHAR: typings.ret.distTypesTypesMod.types.CHAR & Double = js.native
    
    /* 1 */ val GROUP: typings.ret.distTypesTypesMod.types.GROUP & Double = js.native
    
    /* 2 */ val POSITION: typings.ret.distTypesTypesMod.types.POSITION & Double = js.native
    
    /* 4 */ val RANGE: typings.ret.distTypesTypesMod.types.RANGE & Double = js.native
    
    /* 6 */ val REFERENCE: typings.ret.distTypesTypesMod.types.REFERENCE & Double = js.native
    
    /* 5 */ val REPETITION: typings.ret.distTypesTypesMod.types.REPETITION & Double = js.native
    
    /* 0 */ val ROOT: typings.ret.distTypesTypesMod.types.ROOT & Double = js.native
    
    /* 3 */ val SET: typings.ret.distTypesTypesMod.types.SET & Double = js.native
  }
}
