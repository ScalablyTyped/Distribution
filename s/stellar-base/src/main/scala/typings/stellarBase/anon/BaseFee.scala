package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.Int64
import typings.stellarBase.xdrMod.xdr.LedgerHeaderExt
import typings.stellarBase.xdrMod.xdr.StellarValue
import typings.stellarBase.xdrMod.xdr.Uint64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseFee extends StObject {
  
  var baseFee: Double = js.native
  
  var baseReserve: Double = js.native
  
  var bucketListHash: Buffer = js.native
  
  var ext: LedgerHeaderExt = js.native
  
  var feePool: Int64 = js.native
  
  var idPool: Uint64 = js.native
  
  var inflationSeq: Double = js.native
  
  var ledgerSeq: Double = js.native
  
  var ledgerVersion: Double = js.native
  
  var maxTxSetSize: Double = js.native
  
  var previousLedgerHash: Buffer = js.native
  
  var scpValue: StellarValue = js.native
  
  var skipList: js.Array[Buffer] = js.native
  
  var totalCoins: Int64 = js.native
  
  var txSetResultHash: Buffer = js.native
}
object BaseFee {
  
  @scala.inline
  def apply(
    baseFee: Double,
    baseReserve: Double,
    bucketListHash: Buffer,
    ext: LedgerHeaderExt,
    feePool: Int64,
    idPool: Uint64,
    inflationSeq: Double,
    ledgerSeq: Double,
    ledgerVersion: Double,
    maxTxSetSize: Double,
    previousLedgerHash: Buffer,
    scpValue: StellarValue,
    skipList: js.Array[Buffer],
    totalCoins: Int64,
    txSetResultHash: Buffer
  ): BaseFee = {
    val __obj = js.Dynamic.literal(baseFee = baseFee.asInstanceOf[js.Any], baseReserve = baseReserve.asInstanceOf[js.Any], bucketListHash = bucketListHash.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], feePool = feePool.asInstanceOf[js.Any], idPool = idPool.asInstanceOf[js.Any], inflationSeq = inflationSeq.asInstanceOf[js.Any], ledgerSeq = ledgerSeq.asInstanceOf[js.Any], ledgerVersion = ledgerVersion.asInstanceOf[js.Any], maxTxSetSize = maxTxSetSize.asInstanceOf[js.Any], previousLedgerHash = previousLedgerHash.asInstanceOf[js.Any], scpValue = scpValue.asInstanceOf[js.Any], skipList = skipList.asInstanceOf[js.Any], totalCoins = totalCoins.asInstanceOf[js.Any], txSetResultHash = txSetResultHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFee]
  }
  
  @scala.inline
  implicit class BaseFeeMutableBuilder[Self <: BaseFee] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseFee(value: Double): Self = StObject.set(x, "baseFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseReserve(value: Double): Self = StObject.set(x, "baseReserve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketListHash(value: Buffer): Self = StObject.set(x, "bucketListHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExt(value: LedgerHeaderExt): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeePool(value: Int64): Self = StObject.set(x, "feePool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdPool(value: Uint64): Self = StObject.set(x, "idPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInflationSeq(value: Double): Self = StObject.set(x, "inflationSeq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLedgerSeq(value: Double): Self = StObject.set(x, "ledgerSeq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLedgerVersion(value: Double): Self = StObject.set(x, "ledgerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTxSetSize(value: Double): Self = StObject.set(x, "maxTxSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousLedgerHash(value: Buffer): Self = StObject.set(x, "previousLedgerHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScpValue(value: StellarValue): Self = StObject.set(x, "scpValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipList(value: js.Array[Buffer]): Self = StObject.set(x, "skipList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipListVarargs(value: Buffer*): Self = StObject.set(x, "skipList", js.Array(value :_*))
    
    @scala.inline
    def setTotalCoins(value: Int64): Self = StObject.set(x, "totalCoins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxSetResultHash(value: Buffer): Self = StObject.set(x, "txSetResultHash", value.asInstanceOf[js.Any])
  }
}
