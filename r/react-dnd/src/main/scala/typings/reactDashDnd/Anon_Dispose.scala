package typings.reactDashDnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dispose extends js.Object {
  var dispose: js.Function0[Unit]
}

object Anon_Dispose {
  @scala.inline
  def apply(dispose: () => Unit): Anon_Dispose = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
  
    __obj.asInstanceOf[Anon_Dispose]
  }
}

