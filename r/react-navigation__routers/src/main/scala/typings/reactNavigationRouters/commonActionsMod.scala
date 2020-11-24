package typings.reactNavigationRouters

import typings.reactNavigationRouters.anon.KeyParams
import typings.reactNavigationRouters.anon.Name
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", JSImport.Namespace)
@js.native
object commonActionsMod extends js.Object {
  
  def goBack(): Action = js.native
  
  def navigate(name: String): Action = js.native
  def navigate(name: String, params: js.Object): Action = js.native
  def navigate(route: KeyParams): Action = js.native
  def navigate(route: Name): Action = js.native
  
  def reset(): Action = js.native
  def reset(state: ResetState): Action = js.native
  
  def setParams(params: js.Object): Action = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNavigationRouters.anon.Source
    - typings.reactNavigationRouters.anon.Payload
    - typings.reactNavigationRouters.anon.Target
    - typings.reactNavigationRouters.anon.Type
  */
  trait Action extends js.Object
  
  trait _ResetState extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNavigationRouters.anon.PartialStateNavigationSta
    - typings.reactNavigationRouters.typesMod.NavigationState[typings.reactNavigationRouters.typesMod.ParamListBase]
    - typings.reactNavigationRouters.anon.OmitNavigationStateParamL
  */
  type ResetState = _ResetState | NavigationState[ParamListBase]
}
