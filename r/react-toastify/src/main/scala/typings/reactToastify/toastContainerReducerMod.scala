package typings.reactToastify

import typings.reactToastify.typesMod.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-toastify/dist/hooks/toastContainerReducer", JSImport.Namespace)
@js.native
object toastContainerReducerMod extends js.Object {
  
  def reducer(state: State, action: Action): js.Array[Id] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactToastify.anon.StaleId
    - typings.reactToastify.anon.ToastId
  */
  trait Action extends js.Object
  
  type State = js.Array[Id]
}
