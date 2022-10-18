package typings.reactSelect.anon

import typings.react.mod.ReactNode
import typings.reactSelect.distDeclarationsSrcComponentsMenuMod.ChildrenProps
import typings.reactSelect.distDeclarationsSrcSelectMod.Props
import typings.reactSelect.distDeclarationsSrcTypesMod.CX
import typings.reactSelect.distDeclarationsSrcTypesMod.CoercedMenuPlacement
import typings.reactSelect.distDeclarationsSrcTypesMod.GetStyles
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typings.reactSelect.distDeclarationsSrcTypesMod.MenuPlacement
import typings.reactSelect.distDeclarationsSrcTypesMod.MenuPosition
import typings.reactSelect.distDeclarationsSrcTypesMod.OnChangeValue
import typings.reactSelect.distDeclarationsSrcTypesMod.OptionsOrGroups
import typings.reactSelect.distDeclarationsSrcTypesMod.SetValueAction
import typings.reactSelect.distDeclarationsSrcTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cx[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] extends StObject {
  
  var children: (js.Function1[/* childrenProps */ ChildrenProps, ReactNode]) & ReactNode = js.native
  
  def clearValue(): Unit = js.native
  
  var cx: CX = js.native
  
  var getStyles: GetStyles[Option, IsMulti, Group] = js.native
  
  def getValue(): typings.reactSelect.distDeclarationsSrcTypesMod.Options[Option] = js.native
  
  var hasValue: Boolean = js.native
  
  var isMulti: Boolean = js.native
  
  var isRtl: Boolean = js.native
  
  var maxHeight: Double = js.native
  
  var maxMenuHeight: Double = js.native
  
  var menuPlacement: MenuPlacement = js.native
  
  var menuPosition: MenuPosition = js.native
  
  var menuShouldScrollIntoView: Boolean = js.native
  
  var minMenuHeight: Double = js.native
  
  var options: OptionsOrGroups[Option, Group] = js.native
  
  var placement: CoercedMenuPlacement = js.native
  
  def selectOption(newValue: Option): Unit = js.native
  
  var selectProps: Props[Option, IsMulti, Group] = js.native
  
  def setValue(newValue: OnChangeValue[Option, IsMulti], action: SetValueAction): Unit = js.native
  def setValue(newValue: OnChangeValue[Option, IsMulti], action: SetValueAction, option: Option): Unit = js.native
  
  var theme: Theme = js.native
}
