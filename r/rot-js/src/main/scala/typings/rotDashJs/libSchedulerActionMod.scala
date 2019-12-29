package typings.rotDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/scheduler/action", JSImport.Namespace)
@js.native
object libSchedulerActionMod extends js.Object {
  @js.native
  trait Action[T]
    extends typings.rotDashJs.libSchedulerSchedulerMod.default[T] {
    var _defaultDuration: Double = js.native
    var _duration: Double = js.native
    def add(item: T, repeat: Boolean, time: Double): this.type = js.native
    def remove(item: T): Boolean = js.native
    /**
      * Set duration for the active item
      */
    def setDuration(time: Double): this.type = js.native
  }
  
  @js.native
  class default[T] () extends Action[T]
  
}

