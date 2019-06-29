package typings
package smpteDashTimecodeLib.smpteDashTimecodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smpte-timecode", JSImport.Namespace)
@js.native
class ^ () extends TimecodeInstance {
  def this(timecode: TIMECODE) = this()
  def this(timecode: TIMECODE, frameRate: FRAMERATE) = this()
  def this(timecode: TIMECODE, frameRate: FRAMERATE, dropFrame: scala.Boolean) = this()
}

@JSImport("smpte-timecode", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): TimecodeInstance = js.native
  def apply(timecode: TIMECODE): TimecodeInstance = js.native
  def apply(timecode: TIMECODE, frameRate: FRAMERATE): TimecodeInstance = js.native
  def apply(timecode: TIMECODE, frameRate: FRAMERATE, dropFrame: scala.Boolean): TimecodeInstance = js.native
}

