package typings.prosemirrorTables

import typings.prosemirrorTables.mod.TableRole
import typings.prosemirrorTables.mod.ToggleHeaderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prosemirrorTablesStrings {
  
  @js.native
  sealed trait cell
    extends StObject
       with TableRole
       with ToggleHeaderType
  inline def cell: cell = "cell".asInstanceOf[cell]
  
  @js.native
  sealed trait collision extends StObject
  inline def collision: collision = "collision".asInstanceOf[collision]
  
  @js.native
  sealed trait column
    extends StObject
       with ToggleHeaderType
  inline def column: column = "column".asInstanceOf[column]
  
  @js.native
  sealed trait `colwidth mismatch` extends StObject
  inline def `colwidth mismatch`: `colwidth mismatch` = ("colwidth mismatch").asInstanceOf[`colwidth mismatch`]
  
  @js.native
  sealed trait header_cell
    extends StObject
       with TableRole
  inline def header_cell: header_cell = "header_cell".asInstanceOf[header_cell]
  
  @js.native
  sealed trait horiz extends StObject
  inline def horiz: horiz = "horiz".asInstanceOf[horiz]
  
  @js.native
  sealed trait missing extends StObject
  inline def missing: missing = "missing".asInstanceOf[missing]
  
  @js.native
  sealed trait overlong_rowspan extends StObject
  inline def overlong_rowspan: overlong_rowspan = "overlong_rowspan".asInstanceOf[overlong_rowspan]
  
  @js.native
  sealed trait row
    extends StObject
       with TableRole
       with ToggleHeaderType
  inline def row: row = "row".asInstanceOf[row]
  
  @js.native
  sealed trait table
    extends StObject
       with TableRole
  inline def table: table = "table".asInstanceOf[table]
  
  @js.native
  sealed trait vert extends StObject
  inline def vert: vert = "vert".asInstanceOf[vert]
}
