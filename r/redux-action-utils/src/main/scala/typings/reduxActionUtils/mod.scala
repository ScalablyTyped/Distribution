package typings.reduxActionUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-action-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def actionCreator[T](`type`: String, props: String*): ActionCreator_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("actionCreator")(scala.List(`type`.asInstanceOf[js.Any]).`++`(props.asInstanceOf[Seq[js.Any]])*).asInstanceOf[ActionCreator_[T]]
  inline def actionCreator[T](`type`: String, props: js.Array[String]): ActionCreator_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("actionCreator")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ActionCreator_[T]]
  
  inline def optionsActionCreator[T](`type`: String, props: String*): OptionsActionCreator_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("optionsActionCreator")(scala.List(`type`.asInstanceOf[js.Any]).`++`(props.asInstanceOf[Seq[js.Any]])*).asInstanceOf[OptionsActionCreator_[T]]
  inline def optionsActionCreator[T](`type`: String, props: js.Array[String]): OptionsActionCreator_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsActionCreator")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[OptionsActionCreator_[T]]
  
  trait Action extends StObject {
    
    var `type`: String
  }
  object Action {
    
    inline def apply(`type`: String): Action = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ActionCreator_[T] = js.Function1[/* repeated */ Any, Action & T]
  
  type OptionsActionCreator_[T] = js.Function1[/* data */ T, Action & T]
}
