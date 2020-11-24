package typings.simonwepSelectionJs.mod

import typings.simonwepSelectionJs.simonwepSelectionJsStrings.`class`
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.beforestart
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.boundaries
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.disableTouch
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.frame
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.manualScrollSpeed
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.mode
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.move
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.scrollSpeedDivider
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.selectables
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.selectionAreaContainer
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.singleClick
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.start
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.startThreshold
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.startareas
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.stop
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.tapMode
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Selection extends js.Object {
  
  def cancel(): Unit = js.native
  def cancel(keepEvent: Boolean): Unit = js.native
  
  def clearSelection(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def getSelection(): js.Array[Element] = js.native
  
  def keepSelection(): Unit = js.native
  
  def off[E /* <: /* keyof @simonwep/selection-js.@simonwep/selection-js.SelectionEvents */ beforestart | start | move | stop */](
    ev: E,
    cb: /* import warning: importer.ImportType#apply Failed type conversion: @simonwep/selection-js.@simonwep/selection-js.SelectionEvents[E] */ js.Any
  ): this.type = js.native
  
  def on[E /* <: /* keyof @simonwep/selection-js.@simonwep/selection-js.SelectionEvents */ beforestart | start | move | stop */](
    ev: E,
    cb: /* import warning: importer.ImportType#apply Failed type conversion: @simonwep/selection-js.@simonwep/selection-js.SelectionEvents[E] */ js.Any
  ): this.type = js.native
  
  @JSName("option")
  def option_boundaries(name: boundaries): js.UndefOr[js.Array[String]] = js.native
  @JSName("option")
  def option_boundaries(name: boundaries, value: js.UndefOr[js.Array[String]]): js.UndefOr[js.Array[String]] = js.native
  @JSName("option")
  def option_class(name: `class`): js.UndefOr[String] = js.native
  @JSName("option")
  def option_class(name: `class`, value: js.UndefOr[String]): js.UndefOr[String] = js.native
  @JSName("option")
  def option_disableTouch(name: disableTouch): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_disableTouch(name: disableTouch, value: js.UndefOr[Boolean]): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_frame(name: frame): js.UndefOr[Node] = js.native
  @JSName("option")
  def option_frame(name: frame, value: js.UndefOr[Node]): js.UndefOr[Node] = js.native
  @JSName("option")
  def option_manualScrollSpeed(name: manualScrollSpeed): js.UndefOr[Double] = js.native
  @JSName("option")
  def option_manualScrollSpeed(name: manualScrollSpeed, value: js.UndefOr[Double]): js.UndefOr[Double] = js.native
  @JSName("option")
  def option_mode(name: mode): js.UndefOr[Mode] = js.native
  @JSName("option")
  def option_mode(name: mode, value: js.UndefOr[Mode]): js.UndefOr[Mode] = js.native
  @JSName("option")
  def option_scrollSpeedDivider(name: scrollSpeedDivider): js.UndefOr[Double] = js.native
  @JSName("option")
  def option_scrollSpeedDivider(name: scrollSpeedDivider, value: js.UndefOr[Double]): js.UndefOr[Double] = js.native
  @JSName("option")
  def option_selectables(name: selectables): js.UndefOr[js.Array[String]] = js.native
  @JSName("option")
  def option_selectables(name: selectables, value: js.UndefOr[js.Array[String]]): js.UndefOr[js.Array[String]] = js.native
  @JSName("option")
  def option_selectionAreaContainer(name: selectionAreaContainer): js.UndefOr[String | HTMLElement | (js.Array[String | HTMLElement])] = js.native
  @JSName("option")
  def option_selectionAreaContainer(
    name: selectionAreaContainer,
    value: js.UndefOr[String | HTMLElement | (js.Array[String | HTMLElement])]
  ): js.UndefOr[String | HTMLElement | (js.Array[String | HTMLElement])] = js.native
  @JSName("option")
  def option_singleClick(name: singleClick): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_singleClick(name: singleClick, value: js.UndefOr[Boolean]): js.UndefOr[Boolean] = js.native
  @JSName("option")
  def option_startThreshold(name: startThreshold): js.UndefOr[Double] = js.native
  @JSName("option")
  def option_startThreshold(name: startThreshold, value: js.UndefOr[Double]): js.UndefOr[Double] = js.native
  @JSName("option")
  def option_startareas(name: startareas): js.UndefOr[js.Array[String]] = js.native
  @JSName("option")
  def option_startareas(name: startareas, value: js.UndefOr[js.Array[String]]): js.UndefOr[js.Array[String]] = js.native
  @JSName("option")
  def option_tapMode(name: tapMode): js.UndefOr[TapMode] = js.native
  @JSName("option")
  def option_tapMode(name: tapMode, value: js.UndefOr[TapMode]): js.UndefOr[TapMode] = js.native
  
  def removeFromSelection(el: Element): Unit = js.native
  
  def resolveSelectables(): Unit = js.native
  
  @JSName("select")
  def select_0(
    query: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(selector : string | std.HTMLElement | std.ReadonlyArray<string | std.HTMLElement>): std.Array<std.Element>>[0] */ js.Any
  ): this.type = js.native
  
  def trigger(evt: UIEvent): Unit = js.native
  def trigger(evt: UIEvent, silent: Boolean): Unit = js.native
}
