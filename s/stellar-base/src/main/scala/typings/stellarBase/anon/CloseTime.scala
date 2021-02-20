package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.StellarValueExt
import typings.stellarBase.xdrMod.xdr.TimePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseTime extends StObject {
  
  var closeTime: TimePoint = js.native
  
  var ext: StellarValueExt = js.native
  
  var txSetHash: Buffer = js.native
  
  var upgrades: js.Array[Buffer] = js.native
}
object CloseTime {
  
  @scala.inline
  def apply(closeTime: TimePoint, ext: StellarValueExt, txSetHash: Buffer, upgrades: js.Array[Buffer]): CloseTime = {
    val __obj = js.Dynamic.literal(closeTime = closeTime.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], txSetHash = txSetHash.asInstanceOf[js.Any], upgrades = upgrades.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseTime]
  }
  
  @scala.inline
  implicit class CloseTimeMutableBuilder[Self <: CloseTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseTime(value: TimePoint): Self = StObject.set(x, "closeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExt(value: StellarValueExt): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxSetHash(value: Buffer): Self = StObject.set(x, "txSetHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgrades(value: js.Array[Buffer]): Self = StObject.set(x, "upgrades", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradesVarargs(value: Buffer*): Self = StObject.set(x, "upgrades", js.Array(value :_*))
  }
}
