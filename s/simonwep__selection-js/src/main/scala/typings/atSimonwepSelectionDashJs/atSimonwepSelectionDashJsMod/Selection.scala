package typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsMod

import typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.`class`
import typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.boundaries
import typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.disableTouch
import typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.mode
import typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.onMove
import typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.onSelect
import typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.onStart
import typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.onStop
import typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.scrollSpeedDivider
import typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.selectables
import typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.selectionAreaContainer
import typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.selectionFilter
import typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.singleClick
import typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.startThreshold
import typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.startareas
import typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsStrings.validateStart
import typings.std.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  @JSName("option")
  def option_boundaries(name: boundaries): js.Array[String] = js.native
  @JSName("option")
  def option_boundaries(name: boundaries, value: js.Array[String]): js.Array[String] = js.native
  @JSName("option")
  def option_class(name: `class`): String = js.native
  @JSName("option")
  def option_class(name: `class`, value: String): String = js.native
  @JSName("option")
  def option_disableTouch(name: disableTouch): Boolean = js.native
  @JSName("option")
  def option_disableTouch(name: disableTouch, value: Boolean): Boolean = js.native
  @JSName("option")
  def option_mode(name: mode): Mode = js.native
  @JSName("option")
  def option_mode(name: mode, value: Mode): Mode = js.native
  @JSName("option")
  def option_onMove(name: onMove): js.Function1[/* evt */ SelectionEvent, Unit] = js.native
  @JSName("option")
  def option_onMove(name: onMove, value: js.Function1[/* evt */ SelectionEvent, Unit]): js.Function1[/* evt */ SelectionEvent, Unit] = js.native
  @JSName("option")
  def option_onSelect(name: onSelect): js.Function1[/* evt */ SingleSelectionEvent, Unit] = js.native
  @JSName("option")
  def option_onSelect(name: onSelect, value: js.Function1[/* evt */ SingleSelectionEvent, Unit]): js.Function1[/* evt */ SingleSelectionEvent, Unit] = js.native
  @JSName("option")
  def option_onStart(name: onStart): js.Function1[/* evt */ SelectionEvent, Unit] = js.native
  @JSName("option")
  def option_onStart(name: onStart, value: js.Function1[/* evt */ SelectionEvent, Unit]): js.Function1[/* evt */ SelectionEvent, Unit] = js.native
  @JSName("option")
  def option_onStop(name: onStop): js.Function1[/* evt */ SelectionEvent, Unit] = js.native
  @JSName("option")
  def option_onStop(name: onStop, value: js.Function1[/* evt */ SelectionEvent, Unit]): js.Function1[/* evt */ SelectionEvent, Unit] = js.native
  @JSName("option")
  def option_scrollSpeedDivider(name: scrollSpeedDivider): Double = js.native
  @JSName("option")
  def option_scrollSpeedDivider(name: scrollSpeedDivider, value: Double): Double = js.native
  @JSName("option")
  def option_selectables(name: selectables): js.Array[String] = js.native
  @JSName("option")
  def option_selectables(name: selectables, value: js.Array[String]): js.Array[String] = js.native
  @JSName("option")
  def option_selectionAreaContainer(name: selectionAreaContainer): String | HTMLElement | (js.Array[String | HTMLElement]) = js.native
  @JSName("option")
  def option_selectionAreaContainer(name: selectionAreaContainer, value: String | HTMLElement | (js.Array[String | HTMLElement])): String | HTMLElement | (js.Array[String | HTMLElement]) = js.native
  @JSName("option")
  def option_selectionFilter(name: selectionFilter): js.Function1[/* evt */ SelectionFilterEvent, Boolean] = js.native
  @JSName("option")
  def option_selectionFilter(name: selectionFilter, value: js.Function1[/* evt */ SelectionFilterEvent, Boolean]): js.Function1[/* evt */ SelectionFilterEvent, Boolean] = js.native
  @JSName("option")
  def option_singleClick(name: singleClick): Boolean = js.native
  @JSName("option")
  def option_singleClick(name: singleClick, value: Boolean): Boolean = js.native
  @JSName("option")
  def option_startThreshold(name: startThreshold): Double = js.native
  @JSName("option")
  def option_startThreshold(name: startThreshold, value: Double): Double = js.native
  @JSName("option")
  def option_startareas(name: startareas): js.Array[String] = js.native
  @JSName("option")
  def option_startareas(name: startareas, value: js.Array[String]): js.Array[String] = js.native
  @JSName("option")
  def option_validateStart(name: validateStart): js.Function1[/* evt */ MouseEvent | TouchEvent, Boolean] = js.native
  @JSName("option")
  def option_validateStart(name: validateStart, value: js.Function1[/* evt */ MouseEvent | TouchEvent, Boolean]): js.Function1[/* evt */ MouseEvent | TouchEvent, Boolean] = js.native
  def removeFromSelection(el: Element): Unit = js.native
  def resolveSelectables(): Unit = js.native
  @JSName("select")
  def select_0(
    query: /* import warning: ImportType.apply Failed type conversion: std.Parameters<(selector : string | std.HTMLElement | std.ReadonlyArray<string | std.HTMLElement>): std.Array<std.Element>>[0] */ js.Any
  ): this.type = js.native
}

