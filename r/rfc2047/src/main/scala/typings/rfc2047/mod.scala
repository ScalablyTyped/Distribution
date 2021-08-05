package typings.rfc2047

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rfc2047", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(encodedText: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(encodedText.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encode(decodedText: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(decodedText.asInstanceOf[js.Any]).asInstanceOf[String]
}
