package typings.safeRegex2

import typings.safeRegex2.anon.Limit
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<SafeRegex2> is not an array type */ params: Parameters[SafeRegex2]
  ): ReturnType[SafeRegex2] = ^.asInstanceOf[js.Dynamic].apply(params.asInstanceOf[js.Any]).asInstanceOf[ReturnType[SafeRegex2]]
  
  @JSImport("safe-regex2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("safe-regex2", JSImport.Default)
  @js.native
  val default: SafeRegex2 = js.native
  
  @JSImport("safe-regex2", "safeRegex")
  @js.native
  val safeRegex: SafeRegex2 = js.native
  
  type SafeRegex2 = js.Function2[/* re */ String | js.RegExp, /* opts */ js.UndefOr[Limit], Boolean]
}
