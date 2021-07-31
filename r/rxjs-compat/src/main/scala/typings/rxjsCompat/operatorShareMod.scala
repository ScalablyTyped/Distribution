package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorShareMod {
  
  @JSImport("rxjs-compat/operator/share", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def share[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("share")().asInstanceOf[js.Any]
}
