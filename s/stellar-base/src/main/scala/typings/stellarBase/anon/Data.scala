package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.LedgerEntryData
import typings.stellarBase.xdrMod.xdr.LedgerEntryExt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends StObject {
  
  var data: LedgerEntryData = js.native
  
  var ext: LedgerEntryExt = js.native
  
  var lastModifiedLedgerSeq: Double = js.native
}
object Data {
  
  @scala.inline
  def apply(data: LedgerEntryData, ext: LedgerEntryExt, lastModifiedLedgerSeq: Double): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], lastModifiedLedgerSeq = lastModifiedLedgerSeq.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: LedgerEntryData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExt(value: LedgerEntryExt): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedLedgerSeq(value: Double): Self = StObject.set(x, "lastModifiedLedgerSeq", value.asInstanceOf[js.Any])
  }
}
