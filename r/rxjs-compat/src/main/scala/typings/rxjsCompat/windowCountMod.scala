package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowCountMod {
  
  @JSImport("rxjs-compat/operators/windowCount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def windowCount[T](windowSize: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("windowCount")(windowSize.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def windowCount[T](windowSize: Double, startWindowEvery: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("windowCount")(windowSize.asInstanceOf[js.Any], startWindowEvery.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
