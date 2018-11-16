package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "OptionalBuilder2")
@js.native
class OptionalBuilder2[A, B, C] protected ()
  extends scalikeLib.scalikeMod.scalikeNs.OptionalBuilder2[A, B, C] {
  def this(oa: scalikeLib.scalikeMod.scalikeNs.Optional[A], ob: scalikeLib.scalikeMod.scalikeNs.Optional[B], oc: scalikeLib.scalikeMod.scalikeNs.Optional[C]) = this()
  /* CompleteClass */
  override var oa: js.Any = js.native
  /* CompleteClass */
  override var ob: js.Any = js.native
  /* CompleteClass */
  override var oc: js.Any = js.native
  /* CompleteClass */
  override def chain[D](od: scalikeLib.scalikeMod.scalikeNs.Optional[D]): scalikeLib.scalikeMod.scalikeNs.OptionalBuilder3[A, B, C, D] = js.native
  /* CompleteClass */
  override def run[D](f: js.Function3[A, B, C, D]): scalikeLib.scalikeMod.scalikeNs.Optional[D] = js.native
}

