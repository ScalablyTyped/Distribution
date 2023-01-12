package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DataField...
  */
trait IDataField extends StObject {
  
  /**
    * Is set to true if the field is a primary key.
    */
  var qIsKey: Boolean
  
  /**
    * Name of the field.
    *
    */
  var qName: String
  
  /**
    * Is shown for fixed records.
    * qOriginalFieldName and qName are identical if no field names are used in the file.
    * qOriginalFieldName differs from qName if embedded file names are used in the file.
    */
  var qOriginalFieldName: String
}
object IDataField {
  
  inline def apply(qIsKey: Boolean, qName: String, qOriginalFieldName: String): IDataField = {
    val __obj = js.Dynamic.literal(qIsKey = qIsKey.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qOriginalFieldName = qOriginalFieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDataField] (val x: Self) extends AnyVal {
    
    inline def setQIsKey(value: Boolean): Self = StObject.set(x, "qIsKey", value.asInstanceOf[js.Any])
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    inline def setQOriginalFieldName(value: String): Self = StObject.set(x, "qOriginalFieldName", value.asInstanceOf[js.Any])
  }
}
