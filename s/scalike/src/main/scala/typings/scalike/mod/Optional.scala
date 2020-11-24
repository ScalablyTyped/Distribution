package typings.scalike.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Optional[A] extends js.Object {
  
  def apply1[B, C](ob: Optional[B], f: js.Function2[/* a */ A, /* b */ B, C]): Optional[C] = js.native
  
  def apply2[B, C, D](ob: Optional[B], oc: Optional[C], f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Optional[D] = js.native
  
  def chain[B](ob: Optional[B]): OptionalBuilder1[A, B] = js.native
  
  def contains[B /* <: A */](b: B): Boolean = js.native
  
  def exists(f: js.Function1[/* a */ A, Boolean]): Boolean = js.native
  
  def filter(f: js.Function1[/* a */ A, Boolean]): Optional[A] = js.native
  
  def flatMap[B](f: js.Function1[/* a */ A, Optional[B]]): Optional[B] = js.native
  
  def flatten(): Optional[A] = js.native
  
  def fold[B](ifEmpty: B, f: js.Function1[/* a */ A, B]): B = js.native
  
  def forall(f: js.Function1[/* a */ A, Boolean]): Boolean = js.native
  
  def foreach(f: js.Function1[/* a */ A, Unit]): Unit = js.native
  
  def get(): A = js.native
  
  def getOrElse[B /* <: A */](a: B): A = js.native
  
  var isEmpty: Boolean = js.native
  
  def map[B](f: js.Function1[/* a */ A, B]): Optional[B] = js.native
  
  var nonEmpty: Boolean = js.native
  
  def orElse[B /* <: A */](ob: Optional[B]): Optional[A] = js.native
}
@JSImport("scalike", "Optional")
@js.native
object Optional extends js.Object {
  
  def apply[A](a: A): Optional[A] = js.native
}
