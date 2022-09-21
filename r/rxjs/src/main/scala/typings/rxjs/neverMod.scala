package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object neverMod {
  
  @JSImport("rxjs/dist/types/internal/observable/never", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/dist/types/internal/observable/never", "NEVER")
  @js.native
  val NEVER_ : Observable[scala.Nothing] = js.native
  
  inline def never(): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[Observable[scala.Nothing]]
}
