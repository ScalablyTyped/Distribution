package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorTables.prosemirrorTablesStrings.horiz
import typings.prosemirrorTables.prosemirrorTablesStrings.vert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A table map describes the structure of a given table. To avoid
  * recomputing them all the time, they are cached per table node. To
  * be able to do that, positions saved in the map are relative to the
  * start of the table, rather than the start of the document.
  *
  * @public
  */
@JSImport("prosemirror-tables", "TableMap")
@js.native
open class TableMap protected () extends StObject {
  def this(
    /**
    * The number of columns
    */
  width: Double,
    /**
    * The number of rows
    */
  height: Double,
    /**
    * A width * height array with the start position of
    * the cell covering that part of the table in each slot
    */
  map: js.Array[Double]
  ) = this()
  def this(
    /**
    * The number of columns
    */
  width: Double,
    /**
    * The number of rows
    */
  height: Double,
    /**
    * A width * height array with the start position of
    * the cell covering that part of the table in each slot
    */
  map: js.Array[Double],
    /**
    * An optional array of problems (cell overlap or non-rectangular
    * shape) for the table, used by the table normalizer.
    */
  problems: js.Array[Problem]
  ) = this()
  
  def cellsInRect(rect: Rect): js.Array[Double] = js.native
  
  def colCount(pos: Double): Double = js.native
  
  def findCell(pos: Double): Rect = js.native
  
  /**
    * The number of rows
    */
  var height: Double = js.native
  
  /**
    * A width * height array with the start position of
    * the cell covering that part of the table in each slot
    */
  var map: js.Array[Double] = js.native
  
  def nextCell(pos: Double, axis: horiz | vert, dir: Double): Null | Double = js.native
  
  def positionAt(row: Double, col: Double, table: Node): Double = js.native
  
  /**
    * An optional array of problems (cell overlap or non-rectangular
    * shape) for the table, used by the table normalizer.
    */
  var problems: js.Array[Problem] | Null = js.native
  
  def rectBetween(a: Double, b: Double): Rect = js.native
  
  /**
    * The number of columns
    */
  var width: Double = js.native
}
object TableMap {
  
  @JSImport("prosemirror-tables", "TableMap")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def get(table: Node): TableMap = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(table.asInstanceOf[js.Any]).asInstanceOf[TableMap]
}
