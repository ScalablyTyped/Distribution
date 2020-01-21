package typings.rcTable.tableMod

import typings.rcTable.AnonCancel
import typings.rcTable.AnonRemove
import typings.rcTable.AnonTableAnonColumnManager
import typings.rcTable.interfaceMod.DefaultValueType
import typings.rcTable.interfaceMod.Expander
import typings.rcTable.interfaceMod.ScrollPosition
import typings.rcTable.interfaceMod.TableStore
import typings.react.mod.Component
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEventHandler
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table[ValueType]
  extends Component[TableProps[ValueType], TableState, js.Any] {
  var bodyTable: HTMLDivElement = js.native
  var columnManager: typings.rcTable.columnManagerMod.default = js.native
  var debouncedWindowResize: js.Function with AnonCancel = js.native
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
  var resizeEvent: AnonRemove = js.native
  var scrollPosition: ScrollPosition = js.native
  var store: TableStore = js.native
  var tableNode: HTMLDivElement = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTable(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTable(prevProps: js.Any): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTable(): Unit = js.native
  def getChildContext(): AnonTableAnonColumnManager[ValueType] = js.native
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

