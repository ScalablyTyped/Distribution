package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val None: Optional[js.Any] = js.native
  def Failure[A](e: stdLib.Error): Try[A] = js.native
  def Future[A](f: js.Function0[A]): scalikeLib.scalikeMod.Future[A] = js.native
  def Future[A](f: js.Promise[A]): scalikeLib.scalikeMod.Future[A] = js.native
  def Left[A, B](a: A): Either[A, B] = js.native
  def Optional[A](a: A): scalikeLib.scalikeMod.Optional[A] = js.native
  def Right[A, B](b: B): Either[A, B] = js.native
  def Some[A](a: A): Optional[A] = js.native
  def Success[A](a: A): Try[A] = js.native
  def Try[A](f: js.Function0[A]): scalikeLib.scalikeMod.Try[A] = js.native
}

