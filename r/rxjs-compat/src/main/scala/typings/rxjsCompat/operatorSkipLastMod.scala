package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorSkipLastMod {
  
  @JSImport("rxjs-compat/operator/skipLast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def skipLast[T](count: Double): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipLast")(count.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
