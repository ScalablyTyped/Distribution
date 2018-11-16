package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "OptionalBuilder3")
@js.native
class OptionalBuilder3[A, B, C, D] protected ()
  extends scalikeLib.scalikeMod.scalikeNs.OptionalBuilder3[A, B, C, D] {
  def this(oa: scalikeLib.scalikeMod.scalikeNs.Optional[A], ob: scalikeLib.scalikeMod.scalikeNs.Optional[B], oc: scalikeLib.scalikeMod.scalikeNs.Optional[C], od: scalikeLib.scalikeMod.scalikeNs.Optional[D]) = this()
  /* CompleteClass */
  override var oa: js.Any = js.native
  /* CompleteClass */
  override var ob: js.Any = js.native
  /* CompleteClass */
  override var oc: js.Any = js.native
  /* CompleteClass */
  override var od: js.Any = js.native
  /* CompleteClass */
  override def chain[E](oe: scalikeLib.scalikeMod.scalikeNs.Optional[E]): scalikeLib.scalikeMod.scalikeNs.OptionalBuilder4[A, B, C, D, E] = js.native
  /* CompleteClass */
  override def run[E](f: js.Function4[A, B, C, D, E]): scalikeLib.scalikeMod.scalikeNs.Optional[E] = js.native
}

