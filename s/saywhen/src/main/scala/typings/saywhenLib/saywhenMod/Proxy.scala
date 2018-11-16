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

