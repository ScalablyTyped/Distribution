package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeAbstractNumber[T] extends DataTypeAbstract {
  
  var UNSIGNED: T = js.native
  
  var ZEROFILL: T = js.native
}
object DataTypeAbstractNumber {
  
  @scala.inline
  def apply[T](UNSIGNED: T, ZEROFILL: T, dialectTypes: String): DataTypeAbstractNumber[T] = {
    val __obj = js.Dynamic.literal(UNSIGNED = UNSIGNED.asInstanceOf[js.Any], ZEROFILL = ZEROFILL.asInstanceOf[js.Any], dialectTypes = dialectTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypeAbstractNumber[T]]
  }
  
  @scala.inline
  implicit class DataTypeAbstractNumberMutableBuilder[Self <: DataTypeAbstractNumber[_], T] (val x: Self with DataTypeAbstractNumber[T]) extends AnyVal {
    
    @scala.inline
    def setUNSIGNED(value: T): Self = StObject.set(x, "UNSIGNED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZEROFILL(value: T): Self = StObject.set(x, "ZEROFILL", value.asInstanceOf[js.Any])
  }
}
