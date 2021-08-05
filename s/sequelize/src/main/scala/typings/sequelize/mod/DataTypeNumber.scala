package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTypeNumber
  extends StObject
     with DataTypeAbstractNumber[DataTypeNumber]
object DataTypeNumber {
  
  inline def apply(UNSIGNED: DataTypeNumber, ZEROFILL: DataTypeNumber, dialectTypes: String): DataTypeNumber = {
    val __obj = js.Dynamic.literal(UNSIGNED = UNSIGNED.asInstanceOf[js.Any], ZEROFILL = ZEROFILL.asInstanceOf[js.Any], dialectTypes = dialectTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypeNumber]
  }
}
