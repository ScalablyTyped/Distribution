package typings.reactNativeUuid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMd5Mod {
  
  @JSImport("react-native-uuid/dist/md5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def anyHmacMd5(k: String, d: String, e: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("any_hmac_md5")(k.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def anyMd5(s: String, e: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("any_md5")(s.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def b64HmacMd5(k: String, d: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("b64_hmac_md5")(k.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def b64Md5(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("b64_md5")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexHmacMd5(k: String, d: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hex_hmac_md5")(k.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hexMd5(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hex_md5")(s.asInstanceOf[js.Any]).asInstanceOf[String]
}
