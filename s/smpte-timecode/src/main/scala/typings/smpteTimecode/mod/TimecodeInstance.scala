package typings.smpteTimecode.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimecodeInstance extends js.Object {
  
  def add(timecode: TIMECODE): TimecodeInstance = js.native
  def add(timecode: TIMECODE, negative: js.UndefOr[scala.Nothing], rollOverMaxHours: Double): TimecodeInstance = js.native
  def add(timecode: TIMECODE, negative: Boolean): TimecodeInstance = js.native
  def add(timecode: TIMECODE, negative: Boolean, rollOverMaxHours: Double): TimecodeInstance = js.native
  
  var dropFrame: Boolean = js.native
  
  var frameCount: Double = js.native
  
  var frameRate: Double = js.native
  
  var frames: Double = js.native
  
  var hours: Double = js.native
  
  var minutes: Double = js.native
  
  var seconds: Double = js.native
  
  def subtract(timecode: TIMECODE): TimecodeInstance = js.native
  def subtract(timecode: TIMECODE, rollOverMaxHours: Double): TimecodeInstance = js.native
  
  def toDate(): Date = js.native
  
  def toString(options: String): String = js.native
}
