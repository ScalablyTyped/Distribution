package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.PayloadData
import typings.relayDashRuntime.relayDashRuntimeStrings.defer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeferPlaceholder extends IncrementalDataPlaceholder {
  var data: PayloadData
  var kind: defer
  var label: String
  var path: js.Array[String]
  var selector: NormalizationSelector
  var typeName: String
}

object DeferPlaceholder {
  @scala.inline
  def apply(
    data: PayloadData,
    kind: defer,
    label: String,
    path: js.Array[String],
    selector: NormalizationSelector,
    typeName: String
  ): DeferPlaceholder = {
    val __obj = js.Dynamic.literal(data = data, kind = kind, label = label, path = path, selector = selector, typeName = typeName)
  
    __obj.asInstanceOf[DeferPlaceholder]
  }
}

