package typings.rcMotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStateMod {
  
  @JSImport("rc-motion/es/hooks/useState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): js.Tuple2[T, js.Function1[/* next */ T | js.Function0[T], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[T, js.Function1[/* next */ T | js.Function0[T], Unit]]]
  inline def default[T](defaultValue: T): js.Tuple2[T, js.Function1[/* next */ T | js.Function0[T], Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, js.Function1[/* next */ T | js.Function0[T], Unit]]]
}
