package typings.rcTable

import typings.rcTable.interfaceMod.ColumnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnMod {
  
  /**
    * This is a syntactic sugar for `columns` prop.
    * So HOC will not work on this.
    */
  @JSImport("rc-table/lib/sugar/Column", JSImport.Default)
  @js.native
  def default[RecordType](_underscore: ColumnProps[RecordType]): js.Any = js.native
  
  @js.native
  trait ColumnProps[RecordType] extends ColumnType[RecordType] {
    
    var children: js.UndefOr[Null] = js.native
  }
  object ColumnProps {
    
    @scala.inline
    def apply[RecordType](): ColumnProps[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnProps[RecordType]]
    }
  }
}
