package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("rxjs-compat/operators/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(project.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R], thisArg: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(project.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
