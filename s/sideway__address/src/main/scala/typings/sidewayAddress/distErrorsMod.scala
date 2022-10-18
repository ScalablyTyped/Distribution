package typings.sidewayAddress

import typings.sidewayAddress.anon.Code
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorsMod {
  
  @JSImport("@sideway/address/dist/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def errorCode(code: String): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("errorCode")(code.asInstanceOf[js.Any]).asInstanceOf[Code]
  
  @JSImport("@sideway/address/dist/errors", "errorCodes")
  @js.native
  val errorCodes: Record[String, String] = js.native
}
