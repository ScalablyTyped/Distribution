package typings.reactNativeMd5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-md5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def b64HmacMd5(key: String, data: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("b64_hmac_md5")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def b64Md5(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("b64_md5")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexHmacMd5(key: String, data: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hex_hmac_md5")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hexMd5(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hex_md5")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def strHmacMd5(key: String, data: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("str_hmac_md5")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def strMd5(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str_md5")(s.asInstanceOf[js.Any]).asInstanceOf[String]
}
