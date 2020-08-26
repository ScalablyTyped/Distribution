package typings.sdpTransform.anon

import typings.sdpTransform.sdpTransformStrings.excl
import typings.sdpTransform.sdpTransformStrings.incl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressTypes extends js.Object {
  var addressTypes: String = js.native
  var destAddress: String = js.native
  var filterMode: excl | incl = js.native
  var netType: String = js.native
  var srcList: String = js.native
}

object AddressTypes {
  @scala.inline
  def apply(
    addressTypes: String,
    destAddress: String,
    filterMode: excl | incl,
    netType: String,
    srcList: String
  ): AddressTypes = {
    val __obj = js.Dynamic.literal(addressTypes = addressTypes.asInstanceOf[js.Any], destAddress = destAddress.asInstanceOf[js.Any], filterMode = filterMode.asInstanceOf[js.Any], netType = netType.asInstanceOf[js.Any], srcList = srcList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressTypes]
  }
  @scala.inline
  implicit class AddressTypesOps[Self <: AddressTypes] (val x: Self) extends AnyVal {
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
    def setAddressTypes(value: String): Self = this.set("addressTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestAddress(value: String): Self = this.set("destAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterMode(value: excl | incl): Self = this.set("filterMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetType(value: String): Self = this.set("netType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcList(value: String): Self = this.set("srcList", value.asInstanceOf[js.Any])
  }
  
}

