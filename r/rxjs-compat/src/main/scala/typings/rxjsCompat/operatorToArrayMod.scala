package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorToArrayMod {
  
  @JSImport("rxjs-compat/operator/toArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toArray[T](): Observable_[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[Observable_[js.Array[T]]]
}
