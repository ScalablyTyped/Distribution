package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FutureBuilder4[A, B, C, D, E] extends js.Object {
  var oa: js.Any
  var ob: js.Any
  var oc: js.Any
  var od: js.Any
  var oe: js.Any
  def chain[F](of: Future[F]): FutureBuilder5[A, B, C, D, E, F]
  def run[F](f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]): Future[F]
}

object FutureBuilder4 {
  @scala.inline
  def apply[A, B, C, D, E](
    chain: js.Function1[Future[js.Any], FutureBuilder5[A, B, C, D, E, js.Any]],
    oa: js.Any,
    ob: js.Any,
    oc: js.Any,
    od: js.Any,
    oe: js.Any,
    run: js.Function1[
      js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, js.Any], 
      Future[js.Any]
    ]
  ): FutureBuilder4[A, B, C, D, E] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chain")(chain)
    __obj.updateDynamic("oa")(oa)
    __obj.updateDynamic("ob")(ob)
    __obj.updateDynamic("oc")(oc)
    __obj.updateDynamic("od")(od)
    __obj.updateDynamic("oe")(oe)
    __obj.updateDynamic("run")(run)
    __obj.asInstanceOf[FutureBuilder4[A, B, C, D, E]]
  }
}

