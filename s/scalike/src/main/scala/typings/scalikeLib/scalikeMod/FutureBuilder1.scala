package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "FutureBuilder1")
@js.native
class FutureBuilder1[A, B] protected ()
  extends scalikeLib.scalikeMod.scalikeNs.FutureBuilder1[A, B] {
  def this(oa: scalikeLib.scalikeMod.scalikeNs.Future[A], ob: scalikeLib.scalikeMod.scalikeNs.Future[B]) = this()
  /* CompleteClass */
  override var oa: js.Any = js.native
  /* CompleteClass */
  override var ob: js.Any = js.native
  /* CompleteClass */
  override def chain[C](oc: scalikeLib.scalikeMod.scalikeNs.Future[C]): scalikeLib.scalikeMod.scalikeNs.FutureBuilder2[A, B, C] = js.native
  /* CompleteClass */
  override def run[C](f: js.Function2[A, B, C]): scalikeLib.scalikeMod.scalikeNs.Future[C] = js.native
}

