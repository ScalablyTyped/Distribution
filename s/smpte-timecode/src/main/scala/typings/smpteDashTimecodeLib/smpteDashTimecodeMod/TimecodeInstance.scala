package typings
package smpteDashTimecodeLib.smpteDashTimecodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimecodeInstance extends js.Object {
  var dropFrame: scala.Boolean = js.native
  var frameCount: scala.Double = js.native
  var frameRate: scala.Double = js.native
  var frames: scala.Double = js.native
  var hours: scala.Double = js.native
  var minutes: scala.Double = js.native
  var seconds: scala.Double = js.native
  def add(timecode: TIMECODE): TimecodeInstance = js.native
  def add(timecode: TIMECODE, negative: scala.Boolean): TimecodeInstance = js.native
  def add(timecode: TIMECODE, negative: scala.Boolean, rollOverMaxHours: scala.Double): TimecodeInstance = js.native
  def subtract(timecode: TIMECODE): TimecodeInstance = js.native
  def subtract(timecode: TIMECODE, rollOverMaxHours: scala.Double): TimecodeInstance = js.native
  def toDate(): stdLib.Date = js.native
  def toString(options: java.lang.String): java.lang.String = js.native
}

