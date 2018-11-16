package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "OptionalBuilder1")
@js.native
class OptionalBuilder1[A, B] protected ()
  extends scalikeLib.scalikeMod.scalikeNs.OptionalBuilder1[A, B] {
  def this(oa: scalikeLib.scalikeMod.scalikeNs.Optional[A], ob: scalikeLib.scalikeMod.scalikeNs.Optional[B]) = this()
  /* CompleteClass */
  override var oa: js.Any = js.native
  /* CompleteClass */
  override var ob: js.Any = js.native
  /* CompleteClass */
  override def chain[C](oc: scalikeLib.scalikeMod.scalikeNs.Optional[C]): scalikeLib.scalikeMod.scalikeNs.OptionalBuilder2[A, B, C] = js.native
  /* CompleteClass */
  override def run[C](f: js.Function2[A, B, C]): scalikeLib.scalikeMod.scalikeNs.Optional[C] = js.native
}

