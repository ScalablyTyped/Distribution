package typings
package ractiveLib.RactiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observe extends js.Object {
  def cancel(): scala.Unit
}

object Observe {
  @scala.inline
  def apply(cancel: js.Function0[scala.Unit]): Observe = {
    val __obj = js.Dynamic.literal(cancel = cancel)
  
    __obj.asInstanceOf[Observe]
  }
}

