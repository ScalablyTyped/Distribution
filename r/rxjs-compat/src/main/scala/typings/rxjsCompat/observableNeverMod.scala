package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableNeverMod {
  
  @JSImport("rxjs-compat/observable/never", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def never(): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[Observable[scala.Nothing]]
}
