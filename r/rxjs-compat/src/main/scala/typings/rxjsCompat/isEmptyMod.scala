package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isEmptyMod {
  
  @JSImport("rxjs-compat/operators/isEmpty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isEmpty[T](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")().asInstanceOf[Any]
}
