package typings.reactNavigationCore

import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useNavigationStateMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useNavigationState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](selector: Selector[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any]).asInstanceOf[T]
  
  type Selector[T] = js.Function1[/* state */ NavigationState[ParamListBase], T]
}
