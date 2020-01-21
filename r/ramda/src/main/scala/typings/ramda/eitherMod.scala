package typings.ramda

import typings.ramda.toolsMod.Pred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/either", JSImport.Namespace)
@js.native
object eitherMod extends js.Object {
  def default(pred1: Pred): js.Function1[/* pred2 */ Pred, Pred] = js.native
  def default(pred1: Pred, pred2: Pred): Pred = js.native
}

