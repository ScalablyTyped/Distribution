package typings.relayRuntime.readerNodeMod

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
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderConnection]
  }
}

