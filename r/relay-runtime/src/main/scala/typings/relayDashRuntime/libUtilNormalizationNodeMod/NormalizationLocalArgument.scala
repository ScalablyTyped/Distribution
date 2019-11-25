package typings.relayDashRuntime.libUtilNormalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationLocalArgument extends NormalizationArgumentDefinition {
  val defaultValue: js.Any
  val kind: String
   // 'LocalArgument';
  val name: String
  val `type`: String
}

object NormalizationLocalArgument {
  @scala.inline
  def apply(defaultValue: js.Any, kind: String, name: String, `type`: String): NormalizationLocalArgument = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationLocalArgument]
  }
}

