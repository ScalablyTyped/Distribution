package typings.reactNavigationNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useThenableMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/useThenable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](create: js.Function0[js.Thenable[T]]): js.Tuple2[Boolean, js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(create.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, js.UndefOr[T]]]
}
