package typings.reactNativeUuid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-native-uuid/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-uuid/dist/utils", "DNS")
  @js.native
  val DNS: /* "6ba7b810-9dad-11d1-80b4-00c04fd430c8" */ String = js.native
  
  @JSImport("react-native-uuid/dist/utils", "NIL")
  @js.native
  val NIL: /* "00000000-0000-0000-0000-000000000000" */ String = js.native
  
  @JSImport("react-native-uuid/dist/utils", "OID")
  @js.native
  val OID: /* "6ba7b812-9dad-11d1-80b4-00c04fd430c8" */ String = js.native
  
  @JSImport("react-native-uuid/dist/utils", "URL")
  @js.native
  val URL: /* "6ba7b811-9dad-11d1-80b4-00c04fd430c8" */ String = js.native
  
  @JSImport("react-native-uuid/dist/utils", "X500")
  @js.native
  val X500: /* "6ba7b814-9dad-11d1-80b4-00c04fd430c8" */ String = js.native
  
  @JSImport("react-native-uuid/dist/utils", "byteToHex")
  @js.native
  val byteToHex: js.Array[String] = js.native
  
  inline def bytesToString(buf: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToString")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringToBytes(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToBytes")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
