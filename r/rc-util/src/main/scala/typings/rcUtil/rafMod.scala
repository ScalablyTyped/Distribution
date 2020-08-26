package typings.rcUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-util/lib/raf", JSImport.Namespace)
@js.native
object rafMod extends js.Object {
  @js.native
  object default extends js.Object {
    var cancel: js.Function1[/* num */ Double, Unit] = js.native
    def apply(callback: js.Function0[Unit]): Double = js.native
  }
  
}

