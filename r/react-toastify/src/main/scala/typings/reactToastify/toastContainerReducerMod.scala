package typings.reactToastify

import typings.reactToastify.reactToastifyStrings.ADD
import typings.reactToastify.reactToastifyStrings.REMOVE
import typings.reactToastify.typesMod.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastContainerReducerMod {
  
  @JSImport("react-toastify/dist/hooks/toastContainerReducer", "reducer")
  @js.native
  def reducer(state: State, action: Action): js.Array[Id] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactToastify.anon.StaleId
    - typings.reactToastify.anon.ToastId
  */
  trait Action extends StObject
  object Action {
    
    @scala.inline
    def StaleId(toastId: Id, `type`: ADD): typings.reactToastify.anon.StaleId = {
      val __obj = js.Dynamic.literal(toastId = toastId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactToastify.anon.StaleId]
    }
    
    @scala.inline
    def ToastId(`type`: REMOVE): typings.reactToastify.anon.ToastId = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactToastify.anon.ToastId]
    }
  }
  
  type State = js.Array[Id]
}
