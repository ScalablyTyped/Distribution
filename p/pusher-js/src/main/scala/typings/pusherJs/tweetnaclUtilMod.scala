package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tweetnaclUtilMod {
  
  @JSImport("tweetnacl-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeBase64(data: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBase64")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def decodeUTF8(data: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUTF8")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeBase64(data: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBase64")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeUTF8(data: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeUTF8")(data.asInstanceOf[js.Any]).asInstanceOf[String]
}
