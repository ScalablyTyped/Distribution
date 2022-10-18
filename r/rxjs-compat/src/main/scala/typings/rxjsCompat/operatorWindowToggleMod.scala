package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorWindowToggleMod {
  
  @JSImport("rxjs-compat/operator/windowToggle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def windowToggle[T, O](openings: Observable_[O], closingSelector: js.Function1[/* openValue */ O, Observable_[Any]]): Observable_[Observable_[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowToggle")(openings.asInstanceOf[js.Any], closingSelector.asInstanceOf[js.Any])).asInstanceOf[Observable_[Observable_[T]]]
}
