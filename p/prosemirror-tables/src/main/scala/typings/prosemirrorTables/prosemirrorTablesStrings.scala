package typings.prosemirrorTables

import typings.prosemirrorTables.mod.TableRoles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prosemirrorTablesStrings {
  
  @js.native
  sealed trait cell
    extends StObject
       with TableRoles
  inline def cell: cell = "cell".asInstanceOf[cell]
  
  @js.native
  sealed trait column extends StObject
  inline def column: column = "column".asInstanceOf[column]
  
  @js.native
  sealed trait header_cell
    extends StObject
       with TableRoles
  inline def header_cell: header_cell = "header_cell".asInstanceOf[header_cell]
  
  @js.native
  sealed trait row
    extends StObject
       with TableRoles
  inline def row: row = "row".asInstanceOf[row]
  
  @js.native
  sealed trait table
    extends StObject
       with TableRoles
  inline def table: table = "table".asInstanceOf[table]
}
