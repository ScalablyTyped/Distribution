package typings.scalike.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Try[A] extends js.Object {
  
  def apply1[B, C](ob: Try[B], f: js.Function2[/* a */ A, /* b */ B, C]): Try[C] = js.native
  
  def apply2[B, C, D](ob: Try[B], oc: Try[C], f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Try[D] = js.native
  
  def chain[B](ob: Try[B]): TryBuilder1[A, B] = js.native
  
  def failed(): Try[A] = js.native
  
  def filter(f: js.Function1[/* a */ A, Boolean]): Try[A] = js.native
  
  def flatMap[B](f: js.Function1[/* a */ A, Try[B]]): Try[B] = js.native
  
  def fold[B](fe: js.Function1[/* e */ Error, B], ff: js.Function1[/* a */ A, B]): B = js.native
  
  def foreach[B](f: js.Function1[/* a */ A, Unit]): Unit = js.native
  
  def get(): A = js.native
  
  def getError(): Error = js.native
  
  def getOrElse[B /* <: A */](a: B): A = js.native
  
  var isFailure: Boolean = js.native
  
  var isSuccess: Boolean = js.native
  
  def map[B](f: js.Function1[/* a */ A, B]): Try[B] = js.native
  
  def orElse[B /* <: A */](a: Try[B]): Try[A] = js.native
  
  def recover[B /* <: A */](f: js.Function1[/* e */ Error, Optional[Try[B]]]): Try[A] = js.native
  
  def toOptional(): Optional[A] = js.native
  
  def transform[B](fs: js.Function1[/* a */ A, Try[B]], ff: js.Function1[/* e */ Error, Try[B]]): Try[B] = js.native
}
@JSImport("scalike", "Try")
@js.native
object Try extends js.Object {
  
  def apply[A](f: js.Function0[A]): Try[A] = js.native
}
