package typings
package saywhenLib.saywhenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CallHandler[T /* <: saywhenLib.Func */] extends js.Object {
  val isCalled: Proxy[T]
  def isCalledWith(args: js.Any*): Proxy[T]
}

