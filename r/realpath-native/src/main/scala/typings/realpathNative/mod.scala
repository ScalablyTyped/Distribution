package typings.realpathNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("realpath-native", JSImport.Namespace)
  @js.native
  def apply(filepath: String): String = js.native
  
  @JSImport("realpath-native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("realpath-native", "sync")
  @js.native
  def sync: js.Function1[/* filepath */ String, String] = js.native
  @scala.inline
  def sync_=(x: js.Function1[/* filepath */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sync")(x.asInstanceOf[js.Any])
}
