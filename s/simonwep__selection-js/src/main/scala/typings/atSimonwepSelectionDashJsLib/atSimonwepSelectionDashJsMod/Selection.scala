package typings
package atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selection extends js.Object {
  def cancel(): scala.Unit = js.native
  def cancel(keepEvent: scala.Boolean): scala.Unit = js.native
  def clearSelection(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def getSelection(): js.Array[stdLib.Element] = js.native
  def keepSelection(): scala.Unit = js.native
  @JSName("option")
  def option_boundaries(name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.boundaries): js.Array[java.lang.String] = js.native
  @JSName("option")
  def option_boundaries(
    name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.boundaries,
    value: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  @JSName("option")
  def option_class(name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.`class`): java.lang.String = js.native
  @JSName("option")
  def option_class(
    name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.`class`,
    value: java.lang.String
  ): java.lang.String = js.native
  @JSName("option")
  def option_disableTouch(name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.disableTouch): scala.Boolean = js.native
  @JSName("option")
  def option_disableTouch(
    name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.disableTouch,
    value: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("option")
  def option_mode(name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.mode): Mode = js.native
  @JSName("option")
  def option_mode(name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.mode, value: Mode): Mode = js.native
  @JSName("option")
  def option_onMove(name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.onMove): js.Function1[/* evt */ SelectionEvent, scala.Unit] = js.native
  @JSName("option")
  def option_onMove(
    name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.onMove,
    value: js.Function1[/* evt */ SelectionEvent, scala.Unit]
  ): js.Function1[/* evt */ SelectionEvent, scala.Unit] = js.native
  @JSName("option")
  def option_onSelect(name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.onSelect): js.Function1[/* evt */ SingleSelectionEvent, scala.Unit] = js.native
  @JSName("option")
  def option_onSelect(
    name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.onSelect,
    value: js.Function1[/* evt */ SingleSelectionEvent, scala.Unit]
  ): js.Function1[/* evt */ SingleSelectionEvent, scala.Unit] = js.native
  @JSName("option")
  def option_onStart(name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.onStart): js.Function1[/* evt */ SelectionEvent, scala.Unit] = js.native
  @JSName("option")
  def option_onStart(
    name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.onStart,
    value: js.Function1[/* evt */ SelectionEvent, scala.Unit]
  ): js.Function1[/* evt */ SelectionEvent, scala.Unit] = js.native
  @JSName("option")
  def option_onStop(name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.onStop): js.Function1[/* evt */ SelectionEvent, scala.Unit] = js.native
  @JSName("option")
  def option_onStop(
    name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.onStop,
    value: js.Function1[/* evt */ SelectionEvent, scala.Unit]
  ): js.Function1[/* evt */ SelectionEvent, scala.Unit] = js.native
  @JSName("option")
  def option_scrollSpeedDivider(name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.scrollSpeedDivider): scala.Double = js.native
  @JSName("option")
  def option_scrollSpeedDivider(
    name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.scrollSpeedDivider,
    value: scala.Double
  ): scala.Double = js.native
  @JSName("option")
  def option_selectables(name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.selectables): js.Array[java.lang.String] = js.native
  @JSName("option")
  def option_selectables(
    name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.selectables,
    value: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  @JSName("option")
  def option_selectionAreaContainer(name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.selectionAreaContainer): java.lang.String | stdLib.HTMLElement | (js.Array[java.lang.String | stdLib.HTMLElement]) = js.native
  @JSName("option")
  def option_selectionAreaContainer(
    name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.selectionAreaContainer,
    value: java.lang.String | stdLib.HTMLElement | (js.Array[java.lang.String | stdLib.HTMLElement])
  ): java.lang.String | stdLib.HTMLElement | (js.Array[java.lang.String | stdLib.HTMLElement]) = js.native
  @JSName("option")
  def option_selectionFilter(name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.selectionFilter): js.Function1[/* evt */ SelectionFilterEvent, scala.Boolean] = js.native
  @JSName("option")
  def option_selectionFilter(
    name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.selectionFilter,
    value: js.Function1[/* evt */ SelectionFilterEvent, scala.Boolean]
  ): js.Function1[/* evt */ SelectionFilterEvent, scala.Boolean] = js.native
  @JSName("option")
  def option_singleClick(name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.singleClick): scala.Boolean = js.native
  @JSName("option")
  def option_singleClick(
    name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.singleClick,
    value: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("option")
  def option_startThreshold(name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.startThreshold): scala.Double = js.native
  @JSName("option")
  def option_startThreshold(
    name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.startThreshold,
    value: scala.Double
  ): scala.Double = js.native
  @JSName("option")
  def option_startareas(name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.startareas): js.Array[java.lang.String] = js.native
  @JSName("option")
  def option_startareas(
    name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.startareas,
    value: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  @JSName("option")
  def option_validateStart(name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.validateStart): js.Function1[/* evt */ stdLib.MouseEvent | stdLib.TouchEvent, scala.Boolean] = js.native
  @JSName("option")
  def option_validateStart(
    name: atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsLibStrings.validateStart,
    value: js.Function1[/* evt */ stdLib.MouseEvent | stdLib.TouchEvent, scala.Boolean]
  ): js.Function1[/* evt */ stdLib.MouseEvent | stdLib.TouchEvent, scala.Boolean] = js.native
  def removeFromSelection(el: stdLib.Element): scala.Unit = js.native
  def resolveSelectables(): scala.Unit = js.native
  @JSName("select")
  def select_0(
    query: /* import warning: ImportType.apply Failed type conversion: std.Parameters<(selector : string | std.HTMLElement | std.ReadonlyArray<string | std.HTMLElement>): std.Array<std.Element>>[0] */ js.Any
  ): this.type = js.native
}

