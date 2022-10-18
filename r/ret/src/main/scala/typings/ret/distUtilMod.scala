package typings.ret

import typings.ret.distTypesTokensMod.SetTokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilMod {
  
  @JSImport("ret/dist/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def strToChars(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("strToChars")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def tokenizeClass(str: String, regexpStr: String): js.Tuple2[SetTokens, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenizeClass")(str.asInstanceOf[js.Any], regexpStr.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[SetTokens, Double]]
}
