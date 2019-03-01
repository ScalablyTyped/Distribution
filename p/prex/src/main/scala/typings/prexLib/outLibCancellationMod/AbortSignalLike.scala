package typings
package prexLib.outLibCancellationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortSignalLike extends js.Object {
  val aborted: scala.Boolean
  @JSName("addEventListener")
  def addEventListener_abort(`type`: prexLib.prexLibStrings.abort, callback: js.Function0[_]): js.Any
}

object AbortSignalLike {
  @scala.inline
  def apply(
    aborted: scala.Boolean,
    addEventListener_abort: js.Function2[prexLib.prexLibStrings.abort, js.Function0[_], js.Any]
  ): AbortSignalLike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aborted")(aborted)
    __obj.updateDynamic("addEventListener")(addEventListener_abort)
    __obj.asInstanceOf[AbortSignalLike]
  }
}

