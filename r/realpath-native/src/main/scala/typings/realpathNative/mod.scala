package typings.realpathNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(filepath: String): String = ^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("realpath-native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("realpath-native", "sync")
  @js.native
  def sync: js.Function1[/* filepath */ String, String] = js.native
  inline def sync_=(x: js.Function1[/* filepath */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sync")(x.asInstanceOf[js.Any])
}
