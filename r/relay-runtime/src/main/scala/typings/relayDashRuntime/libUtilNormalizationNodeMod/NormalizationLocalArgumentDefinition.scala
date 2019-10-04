package typings.relayDashRuntime.libUtilNormalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationLocalArgumentDefinition extends js.Object {
  var defaultValue: js.Any
  var kind: String
  var name: String
  var `type`: String
}

object NormalizationLocalArgumentDefinition {
  @scala.inline
  def apply(defaultValue: js.Any, kind: String, name: String, `type`: String): NormalizationLocalArgumentDefinition = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, kind = kind, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NormalizationLocalArgumentDefinition]
  }
}

