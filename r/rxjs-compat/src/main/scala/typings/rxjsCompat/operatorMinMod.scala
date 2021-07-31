package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMinMod {
  
  @JSImport("rxjs-compat/operator/min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def min[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[js.Any]
  @scala.inline
  def min[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(comparer.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
