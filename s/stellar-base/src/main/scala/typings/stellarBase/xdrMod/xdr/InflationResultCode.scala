package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-1`
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.inflationNotTime
import typings.stellarBase.stellarBaseStrings.inflationSuccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InflationResultCode extends js.Object {
  val name: inflationSuccess | inflationNotTime = js.native
  val value: `0` | `-1` = js.native
}

object InflationResultCode {
  @scala.inline
  def apply(name: inflationSuccess | inflationNotTime, value: `0` | `-1`): InflationResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InflationResultCode]
  }
  @scala.inline
  implicit class InflationResultCodeOps[Self <: InflationResultCode] (val x: Self) extends AnyVal {
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
    def setName(value: inflationSuccess | inflationNotTime): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: `0` | `-1`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

