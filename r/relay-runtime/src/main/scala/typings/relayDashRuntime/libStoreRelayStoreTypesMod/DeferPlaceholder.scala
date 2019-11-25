package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.PayloadData
import typings.relayDashRuntime.relayDashRuntimeStrings.defer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeferPlaceholder extends IncrementalDataPlaceholder {
  val data: PayloadData
  val kind: defer_
  val label: String
  val path: js.Array[String]
  val selector: NormalizationSelector
  val typeName: String
}

object DeferPlaceholder {
  @scala.inline
  def apply(
    data: PayloadData,
    kind: defer_,
    label: String,
    path: js.Array[String],
    selector: NormalizationSelector,
    typeName: String
  ): DeferPlaceholder = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeferPlaceholder]
  }
}

