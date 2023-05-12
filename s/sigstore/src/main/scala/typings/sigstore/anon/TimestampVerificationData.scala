package typings.sigstore.anon

import typings.sigstore.distTypesSigstoreSerializedMod.SerializedTLogEntry
import typings.sigstore.distTypesSigstoreSerializedMod.SerializedTimestampVerificationData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampVerificationData extends StObject {
  
  var timestampVerificationData: js.UndefOr[SerializedTimestampVerificationData] = js.undefined
  
  var tlogEntries: js.Array[SerializedTLogEntry]
}
object TimestampVerificationData {
  
  inline def apply(tlogEntries: js.Array[SerializedTLogEntry]): TimestampVerificationData = {
    val __obj = js.Dynamic.literal(tlogEntries = tlogEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampVerificationData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimestampVerificationData] (val x: Self) extends AnyVal {
    
    inline def setTimestampVerificationData(value: SerializedTimestampVerificationData): Self = StObject.set(x, "timestampVerificationData", value.asInstanceOf[js.Any])
    
    inline def setTimestampVerificationDataUndefined: Self = StObject.set(x, "timestampVerificationData", js.undefined)
    
    inline def setTlogEntries(value: js.Array[SerializedTLogEntry]): Self = StObject.set(x, "tlogEntries", value.asInstanceOf[js.Any])
    
    inline def setTlogEntriesVarargs(value: SerializedTLogEntry*): Self = StObject.set(x, "tlogEntries", js.Array(value*))
  }
}
