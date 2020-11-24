package typings.rrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rrc", "wrapSwitch")
@js.native
object wrapSwitch extends js.Object {
  
  def apply[WrapperProps, Params](Wrapper: ComponentConstructor[WrapperProps]): ComponentConstructor[WrapSwitchProps[Params] with WrapperProps] = js.native
}
