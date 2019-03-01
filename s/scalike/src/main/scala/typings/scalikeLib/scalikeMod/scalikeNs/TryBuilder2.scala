package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TryBuilder2[A, B, C] extends js.Object {
  var oa: js.Any
  var ob: js.Any
  var oc: js.Any
  def chain[D](od: Try[D]): TryBuilder3[A, B, C, D]
  def run[D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Try[D]
}

object TryBuilder2 {
  @scala.inline
  def apply[A, B, C](
    chain: js.Function1[Try[js.Any], TryBuilder3[A, B, C, js.Any]],
    oa: js.Any,
    ob: js.Any,
    oc: js.Any,
    run: js.Function1[js.Function3[/* a */ A, /* b */ B, /* c */ C, js.Any], Try[js.Any]]
  ): TryBuilder2[A, B, C] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chain")(chain)
    __obj.updateDynamic("oa")(oa)
    __obj.updateDynamic("ob")(ob)
    __obj.updateDynamic("oc")(oc)
    __obj.updateDynamic("run")(run)
    __obj.asInstanceOf[TryBuilder2[A, B, C]]
  }
}

