package typings.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderFragmentSpread extends ReaderSelection {
  val args: js.UndefOr[js.Array[ReaderArgument] | Null] = js.undefined
  val kind: String
   // 'FragmentSpread';
  val name: String
}

object ReaderFragmentSpread {
  @scala.inline
  def apply(kind: String, name: String, args: js.UndefOr[Null | js.Array[ReaderArgument]] = js.undefined): ReaderFragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(args)) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderFragmentSpread]
  }
}

