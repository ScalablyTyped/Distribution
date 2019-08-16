package typings.rfc4648

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loose[T] extends js.Object {
  var loose: js.UndefOr[Boolean] = js.undefined
  var out: js.UndefOr[Anon_T[T]] = js.undefined
}

object Anon_Loose {
  @scala.inline
  def apply[T](loose: js.UndefOr[Boolean] = js.undefined, out: Anon_T[T] = null): Anon_Loose[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose)
    if (out != null) __obj.updateDynamic("out")(out)
    __obj.asInstanceOf[Anon_Loose[T]]
  }
}

