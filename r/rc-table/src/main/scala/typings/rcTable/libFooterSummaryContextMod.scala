package typings.rcTable

import org.scalablytyped.runtime.Shortcut
import typings.rcTable.anon.Scrollbar
import typings.rcTable.libInterfaceMod.ColumnType
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFooterSummaryContextMod extends Shortcut {
  
  @JSImport("rc-table/lib/Footer/SummaryContext", JSImport.Default)
  @js.native
  val default: Context[typings.rcTable.anon.FlattenColumns] = js.native
  
  type FlattenColumns[RecordType] = js.Array[ColumnType[RecordType] & Scrollbar]
  
  type _To = Context[typings.rcTable.anon.FlattenColumns]
  
  /* This means you don't have to write `default`, but can instead just say `libFooterSummaryContextMod.foo` */
  override def _to: Context[typings.rcTable.anon.FlattenColumns] = default
}
