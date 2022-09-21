package typings.reactNativeUuid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha1Mod {
  
  @JSImport("react-native-uuid/dist/sha1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def anyHmacSha1(k: String, d: String, e: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("any_hmac_sha1")(k.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def anySha1(s: String, e: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("any_sha1")(s.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def b64HmacSha1(k: String, d: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("b64_hmac_sha1")(k.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def b64Sha1(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("b64_sha1")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexHmacSha1(k: String, d: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hex_hmac_sha1")(k.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hexSha1(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hex_sha1")(s.asInstanceOf[js.Any]).asInstanceOf[String]
}
