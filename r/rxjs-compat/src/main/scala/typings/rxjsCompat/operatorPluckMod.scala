package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorPluckMod {
  
  @JSImport("rxjs-compat/operator/pluck", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pluck[T, R](properties: String*): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(properties.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Observable_[R]]
}
