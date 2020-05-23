package typings.prex.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dispose extends js.Object {
  def dispose(): js.Any
}

object Dispose {
  @scala.inline
  def apply(dispose: () => js.Any): Dispose = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[Dispose]
  }
}

