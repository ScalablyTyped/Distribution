package typings.reactNativeSha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-sha1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sha1(data: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
