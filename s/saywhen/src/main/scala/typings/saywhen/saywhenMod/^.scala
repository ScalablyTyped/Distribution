package typings.saywhen.saywhenMod

import typings.jasmine.jasmineNs.Spy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("saywhen", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T /* <: Func */](spy: T with Spy): CallHandler[T] = js.native
  def captor[T](): MatcherProxy[T] = js.native
  def captor[T](`val`: T): MatcherProxy[T] = js.native
  def is[T](`val`: T): Boolean = js.native
  def noConflict(): Unit = js.native
}

