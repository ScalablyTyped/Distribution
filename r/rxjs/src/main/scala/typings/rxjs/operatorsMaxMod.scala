package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsMaxMod {
  
  @JSImport("rxjs/operators/max", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def max[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[js.Any]
  @scala.inline
  def max[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(comparer.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
