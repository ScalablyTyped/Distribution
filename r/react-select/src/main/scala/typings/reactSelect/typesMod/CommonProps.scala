package typings.reactSelect.typesMod

import typings.reactSelect.selectMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] extends StObject {
  
  def clearValue(): Unit = js.native
  
  var cx: CX = js.native
  
  /**
    Get the styles of a particular part of the select. Pass in the name of the
    property as the first argument, and the current props as the second argument.
    See the `styles` object for the properties available.
    */
  var getStyles: GetStyles[Option, IsMulti, Group] = js.native
  
  def getValue(): Options[Option] = js.native
  
  var hasValue: Boolean = js.native
  
  var isMulti: Boolean = js.native
  
  var isRtl: Boolean = js.native
  
  var options: OptionsOrGroups[Option, Group] = js.native
  
  def selectOption(newValue: Option): Unit = js.native
  
  var selectProps: Props[Option, IsMulti, Group] = js.native
  
  def setValue(newValue: OnChangeValue[Option, IsMulti], action: SetValueAction): Unit = js.native
  def setValue(newValue: OnChangeValue[Option, IsMulti], action: SetValueAction, option: Option): Unit = js.native
  
  var theme: Theme = js.native
}
