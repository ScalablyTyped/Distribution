package typings.reactToastify

import typings.reactToastify.typesMod.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastContainerReducerMod {
  
  @JSImport("react-toastify/dist/hooks/toastContainerReducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def reducer(state: State, action: Action): js.Array[Id] = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Array[Id]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactToastify.anon.StaleId
    - typings.reactToastify.anon.ToastId
  */
  trait Action extends StObject
  object Action {
    
    @scala.inline
    def StaleId(toastId: Id): typings.reactToastify.anon.StaleId = {
      val __obj = js.Dynamic.literal(toastId = toastId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ADD")
      __obj.asInstanceOf[typings.reactToastify.anon.StaleId]
    }
    
    @scala.inline
    def ToastId(): typings.reactToastify.anon.ToastId = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("REMOVE")
      __obj.asInstanceOf[typings.reactToastify.anon.ToastId]
    }
  }
  
  type State = js.Array[Id]
}
