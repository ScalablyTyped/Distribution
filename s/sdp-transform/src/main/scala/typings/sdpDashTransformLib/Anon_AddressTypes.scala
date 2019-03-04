package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressTypes extends js.Object {
  var addressTypes: java.lang.String
  var destAddress: java.lang.String
  var filterMode: sdpDashTransformLib.sdpDashTransformLibStrings.excl | sdpDashTransformLib.sdpDashTransformLibStrings.incl
  var netType: java.lang.String
  var srcList: java.lang.String
}

object Anon_AddressTypes {
  @scala.inline
  def apply(
    addressTypes: java.lang.String,
    destAddress: java.lang.String,
    filterMode: sdpDashTransformLib.sdpDashTransformLibStrings.excl | sdpDashTransformLib.sdpDashTransformLibStrings.incl,
    netType: java.lang.String,
    srcList: java.lang.String
  ): Anon_AddressTypes = {
    val __obj = js.Dynamic.literal(addressTypes = addressTypes, destAddress = destAddress, filterMode = filterMode.asInstanceOf[js.Any], netType = netType, srcList = srcList)
  
    __obj.asInstanceOf[Anon_AddressTypes]
  }
}

