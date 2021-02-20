package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OdbcDsn...
  */
@js.native
trait IOdbcDsn extends StObject {
  
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
  implicit class IOdbcDsnMutableBuilder[Self <: IOdbcDsn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQBit32(value: Boolean): Self = StObject.set(x, "qBit32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQBit32Undefined: Self = StObject.set(x, "qBit32", js.undefined)
    
    @scala.inline
    def setQDescription(value: String): Self = StObject.set(x, "qDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUserOnly(value: Boolean): Self = StObject.set(x, "qUserOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUserOnlyUndefined: Self = StObject.set(x, "qUserOnly", js.undefined)
  }
}
