package typings.scalike.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scalike", "LeftProjection")
@js.native
class LeftProjection[A, B] protected () extends js.Object {
  def this(self: Either[A, B]) = this()
  
  def exists(f: js.Function1[/* a */ A, Boolean]): Boolean = js.native
  
  def filter(f: js.Function1[/* a */ A, Boolean]): Optional[Either[A, B]] = js.native
  
  def flatMap[X](f: js.Function1[/* a */ A, Either[X, B]]): Either[X | A, B] = js.native
  
  def forall(f: js.Function1[/* a */ A, Boolean]): Boolean = js.native
  
  def foreach(f: js.Function1[/* a */ A, Unit]): Unit = js.native
  
  def get(): A = js.native
  
  def getOrElse[X /* <: A */](x: X): A = js.native
  
  def map[X](f: js.Function1[/* a */ A, X]): Either[X | A, B] = js.native
  
  var self: js.Any = js.native
  
  def toOptional(): Optional[A] = js.native
}
