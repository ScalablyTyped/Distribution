package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OdbcDsn...
  */
trait IOdbcDsn extends StObject {
  
  /**
    * This parameter is optional. Default is false.
    * Is set to true if the version of ODBC is 32-bit.
    */
  var qBit32: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Description of the ODBC connection.
    */
  var qDescription: String
  
  /**
    * Name of the ODBC connection.
    */
  var qName: String
  
  /**
    * This parameter is optional. Default is false.
    * Is set to true if the connection is User DSN.
    * The connection works only for a specific user.
    */
  var qUserOnly: js.UndefOr[Boolean] = js.undefined
}
object IOdbcDsn {
  
  inline def apply(qDescription: String, qName: String): IOdbcDsn = {
    val __obj = js.Dynamic.literal(qDescription = qDescription.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOdbcDsn]
  }
  
  extension [Self <: IOdbcDsn](x: Self) {
    
    inline def setQBit32(value: Boolean): Self = StObject.set(x, "qBit32", value.asInstanceOf[js.Any])
    
    inline def setQBit32Undefined: Self = StObject.set(x, "qBit32", js.undefined)
    
    inline def setQDescription(value: String): Self = StObject.set(x, "qDescription", value.asInstanceOf[js.Any])
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    inline def setQUserOnly(value: Boolean): Self = StObject.set(x, "qUserOnly", value.asInstanceOf[js.Any])
    
    inline def setQUserOnlyUndefined: Self = StObject.set(x, "qUserOnly", js.undefined)
  }
}
