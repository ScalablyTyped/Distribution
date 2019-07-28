package typings.sdpDashTransform

import typings.sdpDashTransform.sdpDashTransformStrings.excl
import typings.sdpDashTransform.sdpDashTransformStrings.incl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressTypes extends js.Object {
  var addressTypes: String
  var destAddress: String
  var filterMode: excl | incl
  var netType: String
  var srcList: String
}

object Anon_AddressTypes {
  @scala.inline
  def apply(
    addressTypes: String,
    destAddress: String,
    filterMode: excl | incl,
    netType: String,
    srcList: String
  ): Anon_AddressTypes = {
    val __obj = js.Dynamic.literal(addressTypes = addressTypes, destAddress = destAddress, filterMode = filterMode.asInstanceOf[js.Any], netType = netType, srcList = srcList)
  
    __obj.asInstanceOf[Anon_AddressTypes]
  }
}

