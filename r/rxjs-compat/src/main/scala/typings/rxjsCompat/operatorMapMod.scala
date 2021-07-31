package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMapMod {
  
  @JSImport("rxjs-compat/operator/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(project.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R], thisArg: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(project.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
