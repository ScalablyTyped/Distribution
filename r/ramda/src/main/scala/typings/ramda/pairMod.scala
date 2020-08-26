package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/pair", JSImport.Namespace)
@js.native
object pairMod extends js.Object {
  def default[F](fst: F): js.Function1[/* snd */ js.Any, js.Tuple2[F, _]] = js.native
  def default[F, S](fst: F, snd: S): js.Tuple2[F, S] = js.native
}

