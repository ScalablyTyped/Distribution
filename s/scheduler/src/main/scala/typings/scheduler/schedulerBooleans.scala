package typings.scheduler

import typings.scheduler.tracingMod._EnableSchedulerTracing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object schedulerBooleans {
  @js.native
  sealed trait `false` extends _EnableSchedulerTracing
  
  @js.native
  sealed trait `true` extends _EnableSchedulerTracing
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

