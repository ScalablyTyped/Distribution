package typings.reactMdTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tableCellMod {
  
  type TableCellAttributes = typings.std.Omit[
    typings.react.mod.TdHTMLAttributes[typings.std.HTMLTableDataCellElement] | typings.react.mod.ThHTMLAttributes[typings.std.HTMLTableHeaderCellElement], 
    typings.reactMdTable.reactMdTableStrings.colSpan | typings.reactMdTable.reactMdTableStrings.scope
  ]
  
  type TableCellElement = typings.std.HTMLTableDataCellElement | typings.std.HTMLTableHeaderCellElement
}
