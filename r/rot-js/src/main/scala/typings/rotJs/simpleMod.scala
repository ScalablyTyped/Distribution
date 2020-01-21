package typings.rotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/scheduler/simple", JSImport.Namespace)
@js.native
object simpleMod extends js.Object {
  @js.native
  trait Simple[T]
    extends typings.rotJs.schedulerSchedulerMod.default[T] {
    def add(item: js.Any, repeat: Boolean): this.type = js.native
  }
  
  @js.native
  class default[T] () extends Simple[T]
  
}

