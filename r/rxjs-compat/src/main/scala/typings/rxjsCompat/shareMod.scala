package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shareMod {
  
  @JSImport("rxjs-compat/operators/share", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def share[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("share")().asInstanceOf[js.Any]
}
