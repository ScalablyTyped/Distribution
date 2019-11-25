package typings.relayDashRuntime.libUtilNormalizationNodeMod

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
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NormalizationClientExtension]
  }
}

