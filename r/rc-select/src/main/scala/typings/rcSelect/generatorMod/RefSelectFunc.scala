package typings.rcSelect.generatorMod

import typings.rcSelect.generateMod.RefSelectProps
import typings.rcSelect.generateMod.SelectProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.react.mod.RefForwardingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-select/lib/interface/generator", "RefSelectFunc")
@js.native
object RefSelectFunc extends js.Object {
  def apply[OptionsType /* <: js.Array[js.Object] */, ValueType](Component: RefForwardingComponent[RefSelectProps, SelectProps[OptionsType, ValueType]]): ForwardRefExoticComponent[
    (PropsWithoutRef[SelectProps[OptionsType, ValueType]]) with RefAttributes[RefSelectProps]
  ] = js.native
}

