package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-1`
import typings.stellarBase.stellarBaseNumbers.`-2`
import typings.stellarBase.stellarBaseNumbers.`-3`
import typings.stellarBase.stellarBaseNumbers.`-4`
import typings.stellarBase.stellarBaseNumbers.`-5`
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.changeTrustInvalidLimit
import typings.stellarBase.stellarBaseStrings.changeTrustLowReserve
import typings.stellarBase.stellarBaseStrings.changeTrustMalformed
import typings.stellarBase.stellarBaseStrings.changeTrustNoIssuer
import typings.stellarBase.stellarBaseStrings.changeTrustSelfNotAllowed
import typings.stellarBase.stellarBaseStrings.changeTrustSuccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeTrustResultCode extends js.Object {
  val name: changeTrustSuccess | changeTrustMalformed | changeTrustNoIssuer | changeTrustInvalidLimit | changeTrustLowReserve | changeTrustSelfNotAllowed = js.native
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` = js.native
}

object ChangeTrustResultCode {
  @scala.inline
  def apply(
    name: changeTrustSuccess | changeTrustMalformed | changeTrustNoIssuer | changeTrustInvalidLimit | changeTrustLowReserve | changeTrustSelfNotAllowed,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5`
  ): ChangeTrustResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTrustResultCode]
  }
  @scala.inline
  implicit class ChangeTrustResultCodeOps[Self <: ChangeTrustResultCode] (val x: Self) extends AnyVal {
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
    def setName(
      value: changeTrustSuccess | changeTrustMalformed | changeTrustNoIssuer | changeTrustInvalidLimit | changeTrustLowReserve | changeTrustSelfNotAllowed
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

