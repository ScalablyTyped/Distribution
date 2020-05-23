package typings.sdpTransform.anon

import typings.sdpTransform.sdpTransformStrings.excl
import typings.sdpTransform.sdpTransformStrings.incl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressTypes extends js.Object {
  var addressTypes: String
  var destAddress: String
  var filterMode: excl | incl
  var netType: String
  var srcList: String
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
}

