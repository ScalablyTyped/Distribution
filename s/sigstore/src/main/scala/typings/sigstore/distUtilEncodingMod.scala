package typings.sigstore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilEncodingMod {
  
  @JSImport("sigstore/dist/util/encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def base64Decode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Decode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def base64Encode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Encode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def base64URLDecode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64URLDecode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def base64URLEncode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64URLEncode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def base64URLEscape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64URLEscape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def base64URLUnescape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64URLUnescape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
