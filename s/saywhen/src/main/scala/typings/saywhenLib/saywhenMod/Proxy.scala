package typings
package saywhenLib.saywhenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy[T /* <: saywhenLib.Func */] extends js.Object {
  def `then`(fn: T): Proxy[T]
  def thenReturn(`val`: js.Any): Proxy[T]
  def thenThrow(err: stdLib.Error): Proxy[T]
}

object Proxy {
  @scala.inline
  def apply[T /* <: saywhenLib.Func */](
    `then`: js.Function1[T, Proxy[T]],
    thenReturn: js.Function1[js.Any, Proxy[T]],
    thenThrow: js.Function1[stdLib.Error, Proxy[T]]
  ): Proxy[T] = {
    val __obj = js.Dynamic.literal(`then` = `then`)
    __obj.updateDynamic("thenReturn")(thenReturn)
    __obj.updateDynamic("thenThrow")(thenThrow)
    __obj.asInstanceOf[Proxy[T]]
  }
}

