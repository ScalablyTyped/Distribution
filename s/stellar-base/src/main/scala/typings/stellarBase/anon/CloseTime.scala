package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.StellarValueExt
import typings.stellarBase.xdrMod.xdr.TimePoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseTime extends js.Object {
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
  implicit class CloseTimeOps[Self <: CloseTime] (val x: Self) extends AnyVal {
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
    def setCloseTime(value: TimePoint): Self = this.set("closeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setExt(value: StellarValueExt): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def setTxSetHash(value: Buffer): Self = this.set("txSetHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpgradesVarargs(value: Buffer*): Self = this.set("upgrades", js.Array(value :_*))
    @scala.inline
    def setUpgrades(value: js.Array[Buffer]): Self = this.set("upgrades", value.asInstanceOf[js.Any])
  }
  
}

