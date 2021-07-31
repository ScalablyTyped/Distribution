package typings.reactVirtualized.esTableMod

import typings.react.mod.PureComponent
import typings.reactVirtualized.anon.AlignmentIndex
import typings.reactVirtualized.anon.ClassName
import typings.reactVirtualized.anon.DisableHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized/dist/es/Table", "Table")
@js.native
class Table protected ()
  extends PureComponent[TableProps, js.Object, js.Any] {
  def this(props: TableProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TableProps, context: js.Any) = this()
  
  var Grid: typings.reactVirtualized.esGridMod.Grid = js.native
  
  def forceUpdateGrid(): Unit = js.native
  
  /** See Grid#getOffsetForCell */
  def getOffsetForRow(params: AlignmentIndex): Double = js.native
  
  /** See Grid#measureAllCells */
  def measureAllRows(): Unit = js.native
  
  /** See Grid#recomputeGridSize */
  def recomputeRowHeights(): Unit = js.native
  def recomputeRowHeights(index: Double): Unit = js.native
  
  /** See Grid#scrollToPosition */
  def scrollToPosition(): Unit = js.native
  def scrollToPosition(scrollTop: Double): Unit = js.native
  
  /** See Grid#scrollToCell */
  def scrollToRow(): Unit = js.native
  def scrollToRow(index: Double): Unit = js.native
}
/* static members */
object Table {
  
  @JSImport("react-virtualized/dist/es/Table", "Table")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-virtualized/dist/es/Table", "Table.defaultProps")
  @js.native
  def defaultProps: DisableHeader = js.native
  @scala.inline
  def defaultProps_=(x: DisableHeader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("react-virtualized/dist/es/Table", "Table.propTypes")
  @js.native
  def propTypes: ClassName = js.native
  @scala.inline
  def propTypes_=(x: ClassName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
