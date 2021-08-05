package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repeatMod {
  
  @JSImport("rxjs-compat/operators/repeat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def repeat[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")().asInstanceOf[js.Any]
  inline def repeat[T](count: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(count.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
