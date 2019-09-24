package typings.relayDashRuntime.libUtilReaderNodeMod

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
  def apply(kind: String, name: String, args: js.Array[ReaderArgument] = null): ReaderFragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (args != null) __obj.updateDynamic("args")(args)
    __obj.asInstanceOf[ReaderFragmentSpread]
  }
}

