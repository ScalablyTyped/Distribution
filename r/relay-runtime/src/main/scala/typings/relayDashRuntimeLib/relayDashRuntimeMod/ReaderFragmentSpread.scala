package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderFragmentSpread extends ReaderSelection {
  val args: js.UndefOr[js.Array[ReaderArgument] | scala.Null] = js.undefined
  val kind: java.lang.String
   // 'FragmentSpread';
  val name: java.lang.String
}

object ReaderFragmentSpread {
  @scala.inline
  def apply(kind: java.lang.String, name: java.lang.String, args: js.Array[ReaderArgument] = null): ReaderFragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (args != null) __obj.updateDynamic("args")(args)
    __obj.asInstanceOf[ReaderFragmentSpread]
  }
}

