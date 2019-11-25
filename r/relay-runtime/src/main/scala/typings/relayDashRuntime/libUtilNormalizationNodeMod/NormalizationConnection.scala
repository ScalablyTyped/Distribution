package typings.relayDashRuntime.libUtilNormalizationNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizationConnection extends js.Object {
  var args: js.Array[NormalizationArgument]
  var edges: NormalizationLinkedField
  var kind: String
  var label: String
  var name: String
  var pageInfo: NormalizationLinkedField
}

object NormalizationConnection {
  @scala.inline
  def apply(
    args: js.Array[NormalizationArgument],
    edges: NormalizationLinkedField,
    kind: String,
    label: String,
    name: String,
    pageInfo: NormalizationLinkedField
  ): NormalizationConnection = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NormalizationConnection]
  }
}

