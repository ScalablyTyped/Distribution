package typings.reactReduxEpic

import typings.react.mod.ReactElement
import typings.reduxObservable.mod.Epic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-redux-epic", "renderToString")
  @js.native
  def renderToString(element: ReactElement, wrappedEpic: Epic[_, _, _, _]): js.Any = js.native
  
  @JSImport("react-redux-epic", "wrapRootEpic")
  @js.native
  def wrapRootEpic[T /* <: Action */, S, D, O /* <: T */](epic: Epic[T, S, D, O]): Epic[T, S, D, O] = js.native
  
  @js.native
  trait Action extends StObject {
    
    var `type`: String = js.native
  }
  object Action {
    
    @scala.inline
    def apply(`type`: String): Action = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
