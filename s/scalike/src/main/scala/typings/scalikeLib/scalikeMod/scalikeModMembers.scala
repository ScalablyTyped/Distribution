package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", JSImport.Namespace)
@js.native
object scalikeModMembers extends js.Object {
  val None: scalikeLib.scalikeMod.scalikeNs.Optional[js.Any] = js.native
  def Failure[A](e: stdLib.Error): scalikeLib.scalikeMod.scalikeNs.Try[A] = js.native
  def Future[A](f: js.Function0[A]): scalikeLib.scalikeMod.scalikeNs.Future[A] = js.native
  def Future[A](f: js.Promise[A]): scalikeLib.scalikeMod.scalikeNs.Future[A] = js.native
  def Left[A, B](a: A): scalikeLib.scalikeMod.scalikeNs.Either[A, B] = js.native
  def Optional[A](a: A): scalikeLib.scalikeMod.scalikeNs.Optional[A] = js.native
  def Right[A, B](b: B): scalikeLib.scalikeMod.scalikeNs.Either[A, B] = js.native
  def Some[A](a: A): scalikeLib.scalikeMod.scalikeNs.Optional[A] = js.native
  def Success[A](a: A): scalikeLib.scalikeMod.scalikeNs.Try[A] = js.native
  def Try[A](f: js.Function0[A]): scalikeLib.scalikeMod.scalikeNs.Try[A] = js.native
}

