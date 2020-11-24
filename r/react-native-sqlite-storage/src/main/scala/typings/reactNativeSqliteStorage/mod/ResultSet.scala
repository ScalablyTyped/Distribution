package typings.reactNativeSqliteStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultSet extends js.Object {
  
  var insertId: Double = js.native
  
  var rows: ResultSetRowList = js.native
  
  var rowsAffected: Double = js.native
}
object ResultSet {
  
  @scala.inline
  def apply(insertId: Double, rows: ResultSetRowList, rowsAffected: Double): ResultSet = {
    val __obj = js.Dynamic.literal(insertId = insertId.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSet]
  }
  
  @scala.inline
  implicit class ResultSetOps[Self <: ResultSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInsertId(value: Double): Self = this.set("insertId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: ResultSetRowList): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsAffected(value: Double): Self = this.set("rowsAffected", value.asInstanceOf[js.Any])
  }
}
