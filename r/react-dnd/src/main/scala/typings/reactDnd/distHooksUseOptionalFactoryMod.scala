package typings.reactDnd

import typings.reactDnd.distHooksTypesMod.FactoryOrInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseOptionalFactoryMod {
  
  @JSImport("react-dnd/dist/hooks/useOptionalFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useOptionalFactory[T](arg: FactoryOrInstance[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useOptionalFactory")(arg.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useOptionalFactory[T](arg: FactoryOrInstance[T], deps: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useOptionalFactory")(arg.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
}
