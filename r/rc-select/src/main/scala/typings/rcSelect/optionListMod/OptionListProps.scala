package typings.rcSelect.optionListMod

import typings.rcSelect.anon.Selected
import typings.rcSelect.generatorMod.FlattenOptionsType
import typings.rcSelect.generatorMod.RawValueType
import typings.rcSelect.interfaceMod.OnActiveValue
import typings.rcSelect.interfaceMod.RenderNode
import typings.react.mod.MouseEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.UIEventHandler
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionListProps[OptionsType /* <: js.Array[js.Object] */] extends js.Object {
  
  var childrenAsData: Boolean = js.native
  
  var defaultActiveFirstOption: js.UndefOr[Boolean] = js.native
  
  var flattenOptions: FlattenOptionsType[OptionsType] = js.native
  
  var height: Double = js.native
  
  var id: String = js.native
  
  var itemHeight: Double = js.native
  
  var menuItemSelectedIcon: js.UndefOr[RenderNode] = js.native
  
  var multiple: Boolean = js.native
  
  var notFoundContent: js.UndefOr[ReactNode] = js.native
  
  /** Tell Select that some value is now active to make accessibility work */
  var onActiveValue: OnActiveValue = js.native
  
  /** Tell Select that mouse enter the popup to force re-render */
  var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.native
  
  var onScroll: UIEventHandler[HTMLDivElement] = js.native
  
  def onSelect(value: RawValueType, option: Selected): Unit = js.native
  
  def onToggleOpen(): Unit = js.native
  def onToggleOpen(open: Boolean): Unit = js.native
  
  var open: Boolean = js.native
  
  var options: OptionsType = js.native
  
  var prefixCls: String = js.native
  
  var searchValue: String = js.native
  
  var values: Set[RawValueType] = js.native
  
  var virtual: Boolean = js.native
}
