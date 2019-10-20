package typings.rcDashTable.esTableMod

import typings.rcDashTable.Anon_Cancel
import typings.rcDashTable.Anon_Remove
import typings.rcDashTable.Anon_Table
import typings.rcDashTable.esInterfaceMod.DefaultValueType
import typings.rcDashTable.esInterfaceMod.Expander
import typings.rcDashTable.esInterfaceMod.ScrollPosition
import typings.rcDashTable.esInterfaceMod.TableStore
import typings.react.reactMod.Component
import typings.react.reactMod.UIEventHandler
import typings.react.reactMod.WheelEventHandler
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table[ValueType]
  extends Component[TableProps[ValueType], TableState, js.Any] {
  var bodyTable: HTMLDivElement = js.native
  var columnManager: typings.rcDashTable.esColumnManagerMod.default = js.native
  var debouncedWindowResize: js.Function with Anon_Cancel = js.native
  var expander: Expander[DefaultValueType] = js.native
  var fixedColumnsBodyLeft: HTMLDivElement = js.native
  var fixedColumnsBodyRight: HTMLDivElement = js.native
  var handleBodyScroll: UIEventHandler[HTMLDivElement] = js.native
  var handleBodyScrollLeft: UIEventHandler[HTMLDivElement] = js.native
  var handleBodyScrollTop: UIEventHandler[HTMLDivElement] = js.native
  var handleWheel: WheelEventHandler[HTMLDivElement] = js.native
  var headTable: HTMLDivElement = js.native
  var lastScrollLeft: Double = js.native
  var lastScrollTop: Double = js.native
  var resizeEvent: Anon_Remove = js.native
  var scrollPosition: ScrollPosition = js.native
  var store: TableStore = js.native
  var tableNode: HTMLDivElement = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTable(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTable(prevProps: js.Any): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTable(): Unit = js.native
  def getChildContext(): Anon_Table[ValueType] = js.native
  def getRowKey(record: ValueType, index: Double): js.Any = js.native
  def handleWindowResize(): Unit = js.native
  def hasScrollX(): Boolean = js.native
  def isTableLayoutFixed(): Boolean = js.native
  def renderEmptyText(): Element = js.native
  def renderFooter(): Element = js.native
  def renderLeftFixedTable(): Element = js.native
  def renderMainTable(): Element | (js.Array[Element | js.Array[Element]]) = js.native
  def renderRightFixedTable(): Element = js.native
  def renderTable(options: js.Any): js.Array[Element] = js.native
  def renderTitle(): Element = js.native
  def resetScrollX(): Unit = js.native
  def saveRef(name: String): js.Function1[/* node */ HTMLElement, Unit] = js.native
  def saveTableNodeRef(node: HTMLDivElement): Unit = js.native
  def setScrollPosition(position: ScrollPosition): Unit = js.native
  def setScrollPositionClassName(): Unit = js.native
  def syncFixedTableRowHeight(): Unit = js.native
}

