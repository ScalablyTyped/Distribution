package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorShareMod {
  
  @JSImport("rxjs-compat/operator/share", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def share[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("share")().asInstanceOf[Observable_[T]]
}
