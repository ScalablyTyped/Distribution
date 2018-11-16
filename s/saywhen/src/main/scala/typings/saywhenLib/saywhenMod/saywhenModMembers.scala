package typings
package saywhenLib.saywhenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("saywhen", JSImport.Namespace)
@js.native
object saywhenModMembers extends js.Object {
  def apply[T /* <: saywhenLib.Func */](spy: T with jasmineLib.jasmineNs.Spy): CallHandler[T] = js.native
  def captor[T](): MatcherProxy[T] = js.native
  def captor[T](`val`: T): MatcherProxy[T] = js.native
  def is[T](`val`: T): scala.Boolean = js.native
  def noConflict(): scala.Unit = js.native
}

