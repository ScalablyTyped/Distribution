package typings
package skatejsLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropOptionsAttributeIdentifierMap extends js.Object {
  var source: js.UndefOr[PropOptionsAttributeIdentifier] = js.undefined
  var target: js.UndefOr[PropOptionsAttributeIdentifier] = js.undefined
}

object PropOptionsAttributeIdentifierMap {
  @scala.inline
  def apply(source: PropOptionsAttributeIdentifier = null, target: PropOptionsAttributeIdentifier = null): PropOptionsAttributeIdentifierMap = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropOptionsAttributeIdentifierMap]
  }
}

