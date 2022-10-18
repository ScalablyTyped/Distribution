package typings.reactMdForm

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesToggleUseCheckedMod {
  
  @JSImport("@react-md/form/types/toggle/useChecked", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useChecked(defaultChecked: js.Function0[Boolean]): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Boolean, ChangeEventHandler, SetChecked]]
  inline def useChecked(defaultChecked: js.Function0[Boolean], onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Boolean, ChangeEventHandler, SetChecked]]
  inline def useChecked(defaultChecked: Boolean): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Boolean, ChangeEventHandler, SetChecked]]
  inline def useChecked(defaultChecked: Boolean, onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Boolean, ChangeEventHandler, SetChecked]]
  
  type ChangeEventHandler = typings.react.mod.ChangeEventHandler[HTMLInputElement]
  
  type SetChecked = Dispatch[SetStateAction[Boolean]]
}
