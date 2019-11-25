package typings.relayDashRuntime.libUtilNormalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationRootArgument extends NormalizationArgumentDefinition {
  val kind: String
   // 'RootArgument';
  val name: String
  val `type`: js.UndefOr[String | Null] = js.undefined
}

object NormalizationRootArgument {
  @scala.inline
  def apply(kind: String, name: String, `type`: String = null): NormalizationRootArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationRootArgument]
  }
}

