package typings.saywhen.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy[T /* <: Func */] extends js.Object {
  def `then`(fn: T): Proxy[T]
  def thenReturn(`val`: js.Any): Proxy[T]
  def thenThrow(err: Error): Proxy[T]
}

object Proxy {
  @scala.inline
  def apply[T /* <: Func */](`then`: T => Proxy[T], thenReturn: js.Any => Proxy[T], thenThrow: Error => Proxy[T]): Proxy[T] = {
    val __obj = js.Dynamic.literal(thenReturn = js.Any.fromFunction1(thenReturn), thenThrow = js.Any.fromFunction1(thenThrow))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[Proxy[T]]
  }
}

