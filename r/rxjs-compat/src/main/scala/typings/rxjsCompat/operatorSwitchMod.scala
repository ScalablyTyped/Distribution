package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorSwitchMod {
  
  @JSImport("rxjs-compat/operator/switch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def switch[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("_switch")().asInstanceOf[Observable_[T]]
  
  inline def switch_TR[T, R](): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("_switch")().asInstanceOf[Observable_[R]]
}
