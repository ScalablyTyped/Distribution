package typings.reactSpringShared

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMemoOneMod {
  
  @JSImport("@react-spring/shared/dist/declarations/src/hooks/useMemoOne", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMemoOne[T](getResult: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemoOne")(getResult.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useMemoOne[T](getResult: js.Function0[T], inputs: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemoOne")(getResult.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any])).asInstanceOf[T]
}
