package typings.reactOnclickoutside.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-onclickoutside", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[P](component: ComponentClass[P, ComponentState]): WrapperClass[P, ComponentClass[P, ComponentState]] = js.native
  def apply[P](component: ComponentClass[P, ComponentState], config: ConfigObject): WrapperClass[P, ComponentClass[P, ComponentState]] = js.native
  def apply[P](component: FunctionComponent[P]): WrapperClass[P, FunctionComponent[P]] = js.native
  def apply[P](component: FunctionComponent[P], config: ConfigObject): WrapperClass[P, FunctionComponent[P]] = js.native
  def apply[P](component: ClickOutComponentClass[P]): WrapperClass[P, ClickOutComponentClass[P]] = js.native
  def apply[P](component: ClickOutComponentClass[P], config: ConfigObject): WrapperClass[P, ClickOutComponentClass[P]] = js.native
}
