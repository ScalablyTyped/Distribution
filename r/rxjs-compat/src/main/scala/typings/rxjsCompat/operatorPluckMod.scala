package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorPluckMod {
  
  @JSImport("rxjs-compat/operator/pluck", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def pluck[T, R](properties: String*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(properties.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
