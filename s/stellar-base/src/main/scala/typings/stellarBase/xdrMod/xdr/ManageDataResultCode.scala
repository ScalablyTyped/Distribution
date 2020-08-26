package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-1`
import typings.stellarBase.stellarBaseNumbers.`-2`
import typings.stellarBase.stellarBaseNumbers.`-3`
import typings.stellarBase.stellarBaseNumbers.`-4`
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.manageDataInvalidName
import typings.stellarBase.stellarBaseStrings.manageDataLowReserve
import typings.stellarBase.stellarBaseStrings.manageDataNameNotFound
import typings.stellarBase.stellarBaseStrings.manageDataNotSupportedYet
import typings.stellarBase.stellarBaseStrings.manageDataSuccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManageDataResultCode extends js.Object {
  val name: manageDataSuccess | manageDataNotSupportedYet | manageDataNameNotFound | manageDataLowReserve | manageDataInvalidName = js.native
  val value: `0` | `-1` | `-2` | `-3` | `-4` = js.native
}

object ManageDataResultCode {
  @scala.inline
  def apply(
    name: manageDataSuccess | manageDataNotSupportedYet | manageDataNameNotFound | manageDataLowReserve | manageDataInvalidName,
    value: `0` | `-1` | `-2` | `-3` | `-4`
  ): ManageDataResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageDataResultCode]
  }
  @scala.inline
  implicit class ManageDataResultCodeOps[Self <: ManageDataResultCode] (val x: Self) extends AnyVal {
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
      value: manageDataSuccess | manageDataNotSupportedYet | manageDataNameNotFound | manageDataLowReserve | manageDataInvalidName
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

