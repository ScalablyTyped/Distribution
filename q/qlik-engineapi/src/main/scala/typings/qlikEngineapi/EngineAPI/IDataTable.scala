package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DataTable...
  */
trait IDataTable extends StObject {
  
  /**
    * Name of the table.
    */
  var qName: String
  
  /**
    * Type of the table.
    * For examples: Table, View
    */
  var qType: String
}
object IDataTable {
  
  @scala.inline
  def apply(qName: String, qType: String): IDataTable = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataTable]
  }
  
  @scala.inline
  implicit class IDataTableMutableBuilder[Self <: IDataTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: String): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
