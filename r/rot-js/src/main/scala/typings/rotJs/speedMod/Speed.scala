package typings.rotJs.speedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Speed[T /* <: SpeedActor */]
  extends typings.rotJs.schedulerSchedulerMod.default[T] {
  
  def add(item: T, repeat: Boolean, time: Double): this.type = js.native
}
