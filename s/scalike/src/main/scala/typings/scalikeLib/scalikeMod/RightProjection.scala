package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "RightProjection")
@js.native
class RightProjection[A, B] protected ()
  extends scalikeLib.scalikeMod.scalikeNs.RightProjection[A, B] {
  def this(self: scalikeLib.scalikeMod.scalikeNs.Either[A, B]) = this()
  /* CompleteClass */
  override var self: js.Any = js.native
  /* CompleteClass */
  override def exists(f: js.Function1[B, scala.Boolean]): scala.Boolean = js.native
  /* CompleteClass */
  override def filter(f: js.Function1[B, scala.Boolean]): scalikeLib.scalikeMod.scalikeNs.Optional[scalikeLib.scalikeMod.scalikeNs.Either[A, B]] = js.native
  /* CompleteClass */
  override def flatMap[X](f: js.Function1[B, scalikeLib.scalikeMod.scalikeNs.Either[A, X]]): scalikeLib.scalikeMod.scalikeNs.Either[A, X | B] = js.native
  /* CompleteClass */
  override def forall(f: js.Function1[B, scala.Boolean]): scala.Boolean = js.native
  /* CompleteClass */
  override def foreach(f: js.Function1[B, scala.Unit]): scala.Unit = js.native
  /* CompleteClass */
  override def get(): B = js.native
  /* CompleteClass */
  override def getOrElse[X /* <: B */](x: X): B = js.native
  /* CompleteClass */
  override def map[X](f: js.Function1[B, X]): scalikeLib.scalikeMod.scalikeNs.Either[A, X | B] = js.native
  /* CompleteClass */
  override def toOptional(): scalikeLib.scalikeMod.scalikeNs.Optional[B] = js.native
}

