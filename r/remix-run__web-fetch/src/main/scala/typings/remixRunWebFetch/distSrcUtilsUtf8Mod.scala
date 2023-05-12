package typings.remixRunWebFetch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsUtf8Mod {
  
  @JSImport("@remix-run/web-fetch/dist/src/utils/utf8", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(bytes: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encode(text: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(text.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
