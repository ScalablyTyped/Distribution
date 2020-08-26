package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-1`
import typings.stellarBase.stellarBaseNumbers.`-2`
import typings.stellarBase.stellarBaseNumbers.`-3`
import typings.stellarBase.stellarBaseNumbers.`-4`
import typings.stellarBase.stellarBaseNumbers.`-5`
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.opBadAuth
import typings.stellarBase.stellarBaseStrings.opExceededWorkLimit
import typings.stellarBase.stellarBaseStrings.opInner
import typings.stellarBase.stellarBaseStrings.opNoAccount
import typings.stellarBase.stellarBaseStrings.opNotSupported
import typings.stellarBase.stellarBaseStrings.opTooManySubentry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationResultCode extends js.Object {
  val name: opInner | opBadAuth | opNoAccount | opNotSupported | opTooManySubentry | opExceededWorkLimit = js.native
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` = js.native
}

object OperationResultCode {
  @scala.inline
  def apply(
    name: opInner | opBadAuth | opNoAccount | opNotSupported | opTooManySubentry | opExceededWorkLimit,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5`
  ): OperationResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationResultCode]
  }
  @scala.inline
  implicit class OperationResultCodeOps[Self <: OperationResultCode] (val x: Self) extends AnyVal {
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
      value: opInner | opBadAuth | opNoAccount | opNotSupported | opTooManySubentry | opExceededWorkLimit
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

