package typings.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderRootArgument extends ReaderArgumentDefinition {
  val kind: String
   // 'RootArgument';
  val name: String
  val `type`: js.UndefOr[String | Null] = js.undefined
}

object ReaderRootArgument {
  @scala.inline
  def apply(kind: String, name: String, `type`: js.UndefOr[Null | String] = js.undefined): ReaderRootArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderRootArgument]
  }
}

