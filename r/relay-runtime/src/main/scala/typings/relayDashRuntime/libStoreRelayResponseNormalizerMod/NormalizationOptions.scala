package typings.relayDashRuntime.libStoreRelayResponseNormalizerMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizationOptions extends js.Object {
  @JSName("getDataID")
  var getDataID_Original: GetDataID = js.native
  var path: js.UndefOr[js.Array[String]] = js.native
  var request: RequestDescriptor = js.native
  def getDataID(fieldValue: StringDictionary[js.Any], typeName: String): js.Any = js.native
}

