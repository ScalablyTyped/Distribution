package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationClientExtension extends NormalizationSelection {
  var kind: String
   // 'ClientExtension';
  var selections: js.Array[NormalizationSelection]
}

object NormalizationClientExtension {
  @scala.inline
  def apply(kind: String, selections: js.Array[NormalizationSelection]): NormalizationClientExtension = {
    val __obj = js.Dynamic.literal(kind = kind, selections = selections)
  
    __obj.asInstanceOf[NormalizationClientExtension]
  }
}

