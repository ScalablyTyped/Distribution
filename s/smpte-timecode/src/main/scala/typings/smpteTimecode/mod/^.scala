package typings.smpteTimecode.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smpte-timecode", JSImport.Namespace)
@js.native
class ^ () extends TimecodeInstance {
  def this(timecode: TIMECODE) = this()
  def this(timecode: js.UndefOr[TIMECODE], frameRate: FRAMERATE) = this()
  def this(timecode: js.UndefOr[TIMECODE], frameRate: js.UndefOr[scala.Nothing], dropFrame: Boolean) = this()
  def this(timecode: js.UndefOr[TIMECODE], frameRate: FRAMERATE, dropFrame: Boolean) = this()
}
@JSImport("smpte-timecode", JSImport.Namespace)
@js.native
object ^
  extends TopLevel[
      Instantiable0[TimecodeInstance] with (Instantiable1[/* timecode */ TIMECODE, TimecodeInstance]) with (Instantiable2[
        /* timecode */ js.UndefOr[scala.Nothing], 
        /* frameRate */ FRAMERATE, 
        TimecodeInstance
      ]) with (Instantiable2[/* timecode */ TIMECODE, /* frameRate */ FRAMERATE, TimecodeInstance]) with (Instantiable3[
        /* timecode */ js.UndefOr[scala.Nothing], 
        /* frameRate */ js.UndefOr[scala.Nothing], 
        /* dropFrame */ Boolean, 
        TimecodeInstance
      ]) with (Instantiable3[
        /* timecode */ js.UndefOr[scala.Nothing], 
        /* frameRate */ FRAMERATE, 
        /* dropFrame */ Boolean, 
        TimecodeInstance
      ]) with (Instantiable3[
        /* timecode */ TIMECODE, 
        /* frameRate */ js.UndefOr[scala.Nothing], 
        /* dropFrame */ Boolean, 
        TimecodeInstance
      ]) with (Instantiable3[
        /* timecode */ TIMECODE, 
        /* frameRate */ FRAMERATE, 
        /* dropFrame */ Boolean, 
        TimecodeInstance
      ])
    ] {
  
  def apply(): TimecodeInstance = js.native
  def apply(timecode: js.UndefOr[TIMECODE], frameRate: js.UndefOr[scala.Nothing], dropFrame: Boolean): TimecodeInstance = js.native
  def apply(timecode: js.UndefOr[TIMECODE], frameRate: FRAMERATE): TimecodeInstance = js.native
  def apply(timecode: js.UndefOr[TIMECODE], frameRate: FRAMERATE, dropFrame: Boolean): TimecodeInstance = js.native
  def apply(timecode: TIMECODE): TimecodeInstance = js.native
}
