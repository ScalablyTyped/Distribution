package typings.qiniuJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmUtilsBase64Mod {
  
  @JSImport("qiniu-js/esm/utils/base64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def urlSafeBase64Decode(v: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlSafeBase64Decode")(v.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def urlSafeBase64Encode(v: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("urlSafeBase64Encode")(v.asInstanceOf[js.Any]).asInstanceOf[Any]
}
