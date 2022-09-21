package typings.ret

import typings.ret.tokensMod.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writeSetTokensMod {
  
  @JSImport("ret/dist/write-set-tokens", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setChar(charCode: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("setChar")(charCode.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def writeSetTokens(set: Set): String = ^.asInstanceOf[js.Dynamic].applyDynamic("writeSetTokens")(set.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def writeSetTokens(set: Set, isNested: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSetTokens")(set.asInstanceOf[js.Any], isNested.asInstanceOf[js.Any])).asInstanceOf[String]
}
