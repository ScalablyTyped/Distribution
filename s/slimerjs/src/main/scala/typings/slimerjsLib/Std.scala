package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Std extends js.Object {
  def read(): js.Any
  def write(arg: js.Any): scala.Unit
}

object Std {
  @scala.inline
  def apply(read: js.Function0[js.Any], write: js.Function1[js.Any, scala.Unit]): Std = {
    val __obj = js.Dynamic.literal(read = read, write = write)
  
    __obj.asInstanceOf[Std]
  }
}

