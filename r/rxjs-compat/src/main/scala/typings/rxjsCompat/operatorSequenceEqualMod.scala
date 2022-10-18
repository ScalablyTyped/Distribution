package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorSequenceEqualMod {
  
  @JSImport("rxjs-compat/operator/sequenceEqual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sequenceEqual[T](compareTo: Observable_[T]): Observable_[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceEqual")(compareTo.asInstanceOf[js.Any]).asInstanceOf[Observable_[Boolean]]
  inline def sequenceEqual[T](compareTo: Observable_[T], comparor: js.Function2[/* a */ T, /* b */ T, Boolean]): Observable_[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("sequenceEqual")(compareTo.asInstanceOf[js.Any], comparor.asInstanceOf[js.Any])).asInstanceOf[Observable_[Boolean]]
}
