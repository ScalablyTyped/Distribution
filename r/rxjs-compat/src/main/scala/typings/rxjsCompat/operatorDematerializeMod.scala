package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorDematerializeMod {
  
  @JSImport("rxjs-compat/operator/dematerialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dematerialize[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("dematerialize")().asInstanceOf[Observable_[T]]
}
