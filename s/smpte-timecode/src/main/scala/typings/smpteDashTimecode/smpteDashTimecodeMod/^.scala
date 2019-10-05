package typings.smpteDashTimecode.smpteDashTimecodeMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smpte-timecode", JSImport.Namespace)
@js.native
class ^ () extends TimecodeInstance {
  def this(timecode: TIMECODE) = this()
  def this(timecode: TIMECODE, frameRate: FRAMERATE) = this()
  def this(timecode: TIMECODE, frameRate: FRAMERATE, dropFrame: Boolean) = this()
}

@JSImport("smpte-timecode", JSImport.Namespace)
@js.native
object ^ extends TopLevel[
      Instantiable0[TimecodeInstance] with (Instantiable1[/* timecode */ TIMECODE, TimecodeInstance]) with (Instantiable2[/* timecode */ TIMECODE, /* frameRate */ FRAMERATE, TimecodeInstance]) with (Instantiable3[
        /* timecode */ TIMECODE, 
        /* frameRate */ FRAMERATE, 
        /* dropFrame */ Boolean, 
        TimecodeInstance
      ])
    ] {
  def apply(): TimecodeInstance = js.native
  def apply(timecode: TIMECODE): TimecodeInstance = js.native
  def apply(timecode: TIMECODE, frameRate: FRAMERATE): TimecodeInstance = js.native
  def apply(timecode: TIMECODE, frameRate: FRAMERATE, dropFrame: Boolean): TimecodeInstance = js.native
}

