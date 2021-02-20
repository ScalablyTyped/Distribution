package typings.reactSelect.anon

import typings.reactSelect.selectMod.Props
import typings.reactSelect.typesMod.ActionTypes
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearValue[OptionType /* <: OptionTypeBase */] extends StObject {
  
  def clearValue(): Unit = js.native
  
  var cx: js.Any = js.native
  
  def getStyles(key: String, props: js.Object): js.Object = js.native
  
  def getValue(): js.Array[OptionType] = js.native
  
  var hasValue: Boolean = js.native
  
  var isMulti: Boolean = js.native
  
  var isRtl: Boolean = js.native
  
  var options: OptionsType[_] = js.native
  
  def selectOption(newValue: OptionType): Unit = js.native
  
  var selectProps: ReadonlychildrenReactNode with Props[OptionType] = js.native
  
  def setValue(newValue: ValueType[OptionType], action: ActionTypes): Unit = js.native
  def setValue(newValue: ValueType[OptionType], action: ActionTypes, option: OptionType): Unit = js.native
}
