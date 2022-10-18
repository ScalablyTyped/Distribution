package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorWindowMod {
  
  @JSImport("rxjs-compat/operator/window", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def window[T](windowBoundaries: Observable_[Any]): Observable_[Observable_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("window")(windowBoundaries.asInstanceOf[js.Any]).asInstanceOf[Observable_[Observable_[T]]]
}
