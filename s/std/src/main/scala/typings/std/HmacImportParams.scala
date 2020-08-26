package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HmacImportParams extends Algorithm {
  var hash: HashAlgorithmIdentifier = js.native
  var length: js.UndefOr[Double] = js.native
}

object HmacImportParams {
  @scala.inline
  def apply(hash: HashAlgorithmIdentifier, name: java.lang.String): HmacImportParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HmacImportParams]
  }
  @scala.inline
  implicit class HmacImportParamsOps[Self <: HmacImportParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHash(value: HashAlgorithmIdentifier): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
  }
  
}

