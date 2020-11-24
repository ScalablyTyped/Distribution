package typings.sequelize.mod

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
  implicit class DataTypeAbstractNumberOps[Self <: DataTypeAbstractNumber[_], T] (val x: Self with DataTypeAbstractNumber[T]) extends AnyVal {
    
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
    def setUNSIGNED(value: T): Self = this.set("UNSIGNED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZEROFILL(value: T): Self = this.set("ZEROFILL", value.asInstanceOf[js.Any])
  }
}
