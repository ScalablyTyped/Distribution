package typings.prex.cancellationMod

import typings.prex.prexStrings.abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortSignalLike extends js.Object {
  val aborted: Boolean
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, callback: js.Function0[_]): js.Any
}

object AbortSignalLike {
  @scala.inline
  def apply(aborted: Boolean, addEventListener: (abort, js.Function0[_]) => js.Any): AbortSignalLike = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener))
  
    __obj.asInstanceOf[AbortSignalLike]
  }
}

