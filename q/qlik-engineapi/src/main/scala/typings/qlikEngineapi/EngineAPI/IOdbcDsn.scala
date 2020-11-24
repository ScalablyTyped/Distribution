package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OdbcDsn...
  */
@js.native
trait IOdbcDsn extends js.Object {
  
  /**
    * This parameter is optional. Default is false.
    * Is set to true if the version of ODBC is 32-bit.
    */
  var qBit32: js.UndefOr[Boolean] = js.native
  
  /**
    * Description of the ODBC connection.
    */
  var qDescription: String = js.native
  
  /**
    * Name of the ODBC connection.
    */
  var qName: String = js.native
  
  /**
    * This parameter is optional. Default is false.
    * Is set to true if the connection is User DSN.
    * The connection works only for a specific user.
    */
  var qUserOnly: js.UndefOr[Boolean] = js.native
}
object IOdbcDsn {
  
  @scala.inline
  def apply(qDescription: String, qName: String): IOdbcDsn = {
    val __obj = js.Dynamic.literal(qDescription = qDescription.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOdbcDsn]
  }
  
  @scala.inline
  implicit class IOdbcDsnOps[Self <: IOdbcDsn] (val x: Self) extends AnyVal {
    
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
    def setQDescription(value: String): Self = this.set("qDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQBit32(value: Boolean): Self = this.set("qBit32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQBit32: Self = this.set("qBit32", js.undefined)
    
    @scala.inline
    def setQUserOnly(value: Boolean): Self = this.set("qUserOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQUserOnly: Self = this.set("qUserOnly", js.undefined)
  }
}
