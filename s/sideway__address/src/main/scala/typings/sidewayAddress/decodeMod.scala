package typings.sidewayAddress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decodeMod {
  
  @JSImport("@sideway/address/dist/decode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def uriDecode(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uriDecode")(string.asInstanceOf[js.Any]).asInstanceOf[String]
}
