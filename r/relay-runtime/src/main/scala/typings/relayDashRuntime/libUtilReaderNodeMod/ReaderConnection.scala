package typings.relayDashRuntime.libUtilReaderNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderConnection extends js.Object {
  val args: js.Array[ReaderArgument]
  val edges: ReaderLinkedField
  val kind: String
  val label: String
  val name: String
  val pageInfo: ReaderLinkedField
}

object ReaderConnection {
  @scala.inline
  def apply(
    args: js.Array[ReaderArgument],
    edges: ReaderLinkedField,
    kind: String,
    label: String,
    name: String,
    pageInfo: ReaderLinkedField
  ): ReaderConnection = {
    val __obj = js.Dynamic.literal(args = args, edges = edges, kind = kind, label = label, name = name, pageInfo = pageInfo)
  
    __obj.asInstanceOf[ReaderConnection]
  }
}

