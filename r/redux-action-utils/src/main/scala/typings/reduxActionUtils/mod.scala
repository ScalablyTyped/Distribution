package typings.reduxActionUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-action-utils", "actionCreator")
  @js.native
  def actionCreator[T](`type`: String, props: String*): ActionCreator_[T] = js.native
  @JSImport("redux-action-utils", "actionCreator")
  @js.native
  def actionCreator[T](`type`: String, props: js.Array[String]): ActionCreator_[T] = js.native
  
  @JSImport("redux-action-utils", "optionsActionCreator")
  @js.native
  def optionsActionCreator[T](`type`: String, props: String*): OptionsActionCreator_[T] = js.native
  @JSImport("redux-action-utils", "optionsActionCreator")
  @js.native
  def optionsActionCreator[T](`type`: String, props: js.Array[String]): OptionsActionCreator_[T] = js.native
  
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
  
  type ActionCreator_[T] = js.Function1[/* repeated */ js.Any, Action with T]
  
  type OptionsActionCreator_[T] = js.Function1[/* data */ T, Action with T]
}
