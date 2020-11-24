package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database...
  */
@js.native
trait IDatabase extends js.Object {
  
  /**
    * Is set to true if the database is set by default.
    */
  var qIsDefault: Boolean = js.native
  
  /**
    * Name of the database.
    */
  var qName: String = js.native
}
object IDatabase {
  
  @scala.inline
  def apply(qIsDefault: Boolean, qName: String): IDatabase = {
    val __obj = js.Dynamic.literal(qIsDefault = qIsDefault.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatabase]
  }
  
  @scala.inline
  implicit class IDatabaseOps[Self <: IDatabase] (val x: Self) extends AnyVal {
    
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
    def setQIsDefault(value: Boolean): Self = this.set("qIsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
  }
}
