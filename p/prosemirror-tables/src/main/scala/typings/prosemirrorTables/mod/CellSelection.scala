package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorState.mod.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A [`Selection`](http://prosemirror.net/docs/ref/#state.Selection)
  * subclass that represents a cell selection spanning part of a table.
  * With the plugin enabled, these will be created when the user
  * selects across cells, and will be drawn by giving selected cells a
  * `selectedCell` CSS class.
  *
  * @public
  */
@JSImport("prosemirror-tables", "CellSelection")
@js.native
open class CellSelection protected () extends Selection {
  def this($anchorCell: ResolvedPos) = this()
  def this($anchorCell: ResolvedPos, $headCell: ResolvedPos) = this()
  
  @JSName("$anchorCell")
  var $anchorCell: ResolvedPos = js.native
  
  @JSName("$headCell")
  var $headCell: ResolvedPos = js.native
  
  def forEachCell(f: js.Function2[/* node */ Node, /* pos */ Double, Unit]): Unit = js.native
  
  def isColSelection(): Boolean = js.native
  
  def isRowSelection(): Boolean = js.native
}
object CellSelection {
  
  @JSImport("prosemirror-tables", "CellSelection")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def colSelection($anchorCell: ResolvedPos): CellSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("colSelection")($anchorCell.asInstanceOf[js.Any]).asInstanceOf[CellSelection]
  inline def colSelection($anchorCell: ResolvedPos, $headCell: ResolvedPos): CellSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("colSelection")($anchorCell.asInstanceOf[js.Any], $headCell.asInstanceOf[js.Any])).asInstanceOf[CellSelection]
  
  /* static member */
  inline def create(doc: Node, anchorCell: Double): CellSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(doc.asInstanceOf[js.Any], anchorCell.asInstanceOf[js.Any])).asInstanceOf[CellSelection]
  inline def create(doc: Node, anchorCell: Double, headCell: Double): CellSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(doc.asInstanceOf[js.Any], anchorCell.asInstanceOf[js.Any], headCell.asInstanceOf[js.Any])).asInstanceOf[CellSelection]
  
  /* static member */
  inline def fromJSON(doc: Node, json: CellSelectionJSON): CellSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(doc.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[CellSelection]
  
  /* static member */
  inline def rowSelection($anchorCell: ResolvedPos): CellSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("rowSelection")($anchorCell.asInstanceOf[js.Any]).asInstanceOf[CellSelection]
  inline def rowSelection($anchorCell: ResolvedPos, $headCell: ResolvedPos): CellSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("rowSelection")($anchorCell.asInstanceOf[js.Any], $headCell.asInstanceOf[js.Any])).asInstanceOf[CellSelection]
}
