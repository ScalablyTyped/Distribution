package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.DataEntryExt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataValue extends StObject {
  
  var accountId: typings.stellarBase.xdrMod.xdr.AccountId = js.native
  
  var dataName: String | Buffer = js.native
  
  var dataValue: Buffer = js.native
  
  var ext: DataEntryExt = js.native
}
object DataValue {
  
  @scala.inline
  def apply(
    accountId: typings.stellarBase.xdrMod.xdr.AccountId,
    dataName: String | Buffer,
    dataValue: Buffer,
    ext: DataEntryExt
  ): DataValue = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], dataName = dataName.asInstanceOf[js.Any], dataValue = dataValue.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValue]
  }
  
  @scala.inline
  implicit class DataValueMutableBuilder[Self <: DataValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataName(value: String | Buffer): Self = StObject.set(x, "dataName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataValue(value: Buffer): Self = StObject.set(x, "dataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExt(value: DataEntryExt): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
  }
}
