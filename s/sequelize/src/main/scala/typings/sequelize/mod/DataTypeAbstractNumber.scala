package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTypeAbstractNumber[T]
  extends StObject
     with DataTypeAbstract {
  
  var UNSIGNED: T
  
  var ZEROFILL: T
}
object DataTypeAbstractNumber {
  
  inline def apply[T](UNSIGNED: T, ZEROFILL: T, dialectTypes: String): DataTypeAbstractNumber[T] = {
    val __obj = js.Dynamic.literal(UNSIGNED = UNSIGNED.asInstanceOf[js.Any], ZEROFILL = ZEROFILL.asInstanceOf[js.Any], dialectTypes = dialectTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypeAbstractNumber[T]]
  }
  
  extension [Self <: DataTypeAbstractNumber[?], T](x: Self & DataTypeAbstractNumber[T]) {
    
    inline def setUNSIGNED(value: T): Self = StObject.set(x, "UNSIGNED", value.asInstanceOf[js.Any])
    
    inline def setZEROFILL(value: T): Self = StObject.set(x, "ZEROFILL", value.asInstanceOf[js.Any])
  }
}
