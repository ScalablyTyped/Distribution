package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalBuilder1[A, B] extends js.Object {
  var oa: js.Any
  var ob: js.Any
  def chain[C](oc: Optional[C]): OptionalBuilder2[A, B, C]
  def run[C](f: js.Function2[/* a */ A, /* b */ B, C]): Optional[C]
}

object OptionalBuilder1 {
  @scala.inline
  def apply[A, B](
    chain: Optional[js.Any] => OptionalBuilder2[A, B, js.Any],
    oa: js.Any,
    ob: js.Any,
    run: js.Function2[/* a */ A, /* b */ B, js.Any] => Optional[js.Any]
  ): OptionalBuilder1[A, B] = {
    val __obj = js.Dynamic.literal(chain = js.Any.fromFunction1(chain), oa = oa, ob = ob, run = js.Any.fromFunction1(run))
  
    __obj.asInstanceOf[OptionalBuilder1[A, B]]
  }
}

