package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "LeftProjection")
@js.native
class LeftProjection[A, B] protected ()
  extends scalikeLib.scalikeMod.scalikeNs.LeftProjection[A, B] {
  def this(self: scalikeLib.scalikeMod.scalikeNs.Either[A, B]) = this()
  /* CompleteClass */
  override var self: js.Any = js.native
  /* CompleteClass */
  override def exists(f: js.Function1[A, scala.Boolean]): scala.Boolean = js.native
  /* CompleteClass */
  override def filter(f: js.Function1[A, scala.Boolean]): scalikeLib.scalikeMod.scalikeNs.Optional[scalikeLib.scalikeMod.scalikeNs.Either[A, B]] = js.native
  /* CompleteClass */
  override def flatMap[X](f: js.Function1[A, scalikeLib.scalikeMod.scalikeNs.Either[X, B]]): scalikeLib.scalikeMod.scalikeNs.Either[X | A, B] = js.native
  /* CompleteClass */
  override def forall(f: js.Function1[A, scala.Boolean]): scala.Boolean = js.native
  /* CompleteClass */
  override def foreach(f: js.Function1[A, scala.Unit]): scala.Unit = js.native
  /* CompleteClass */
  override def get(): A = js.native
  /* CompleteClass */
  override def getOrElse[X /* <: A */](x: X): A = js.native
  /* CompleteClass */
  override def map[X](f: js.Function1[A, X]): scalikeLib.scalikeMod.scalikeNs.Either[X | A, B] = js.native
  /* CompleteClass */
  override def toOptional(): scalikeLib.scalikeMod.scalikeNs.Optional[A] = js.native
}

