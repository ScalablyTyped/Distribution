package typings.reactNavigationCore

import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseNavigationStateMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useNavigationState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ParamList /* <: ParamListBase */, T](selector: Selector[ParamList, T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any]).asInstanceOf[T]
  
  type Selector[ParamList /* <: ParamListBase */, T] = js.Function1[/* state */ NavigationState[ParamList], T]
}
