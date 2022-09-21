package typings.ret

import typings.ret.tokensMod.Tokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reconstructMod {
  
  @JSImport("ret/dist/reconstruct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reconstruct(token: Tokens): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reconstruct")(token.asInstanceOf[js.Any]).asInstanceOf[String]
}
