package typings.smpteTimecode

import typings.smpteTimecode.smpteTimecodeDoubles.`23.976`
import typings.smpteTimecode.smpteTimecodeDoubles.`29.97`
import typings.smpteTimecode.smpteTimecodeDoubles.`59.94`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): TimecodeInstance = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[TimecodeInstance]
  inline def apply(timecode: Unit, frameRate: Unit, dropFrame: Boolean): TimecodeInstance = (^.asInstanceOf[js.Dynamic].apply(timecode.asInstanceOf[js.Any], frameRate.asInstanceOf[js.Any], dropFrame.asInstanceOf[js.Any])).asInstanceOf[TimecodeInstance]
  inline def apply(timecode: Unit, frameRate: FRAMERATE): TimecodeInstance = (^.asInstanceOf[js.Dynamic].apply(timecode.asInstanceOf[js.Any], frameRate.asInstanceOf[js.Any])).asInstanceOf[TimecodeInstance]
  inline def apply(timecode: Unit, frameRate: FRAMERATE, dropFrame: Boolean): TimecodeInstance = (^.asInstanceOf[js.Dynamic].apply(timecode.asInstanceOf[js.Any], frameRate.asInstanceOf[js.Any], dropFrame.asInstanceOf[js.Any])).asInstanceOf[TimecodeInstance]
  inline def apply(timecode: TIMECODE): TimecodeInstance = ^.asInstanceOf[js.Dynamic].apply(timecode.asInstanceOf[js.Any]).asInstanceOf[TimecodeInstance]
  inline def apply(timecode: TIMECODE, frameRate: Unit, dropFrame: Boolean): TimecodeInstance = (^.asInstanceOf[js.Dynamic].apply(timecode.asInstanceOf[js.Any], frameRate.asInstanceOf[js.Any], dropFrame.asInstanceOf[js.Any])).asInstanceOf[TimecodeInstance]
  inline def apply(timecode: TIMECODE, frameRate: FRAMERATE): TimecodeInstance = (^.asInstanceOf[js.Dynamic].apply(timecode.asInstanceOf[js.Any], frameRate.asInstanceOf[js.Any])).asInstanceOf[TimecodeInstance]
  inline def apply(timecode: TIMECODE, frameRate: FRAMERATE, dropFrame: Boolean): TimecodeInstance = (^.asInstanceOf[js.Dynamic].apply(timecode.asInstanceOf[js.Any], frameRate.asInstanceOf[js.Any], dropFrame.asInstanceOf[js.Any])).asInstanceOf[TimecodeInstance]
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("smpte-timecode", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with TimecodeInstance {
    def this(timecode: TIMECODE) = this()
    def this(timecode: Unit, frameRate: FRAMERATE) = this()
    def this(timecode: TIMECODE, frameRate: FRAMERATE) = this()
    def this(timecode: Unit, frameRate: Unit, dropFrame: Boolean) = this()
    def this(timecode: Unit, frameRate: FRAMERATE, dropFrame: Boolean) = this()
    def this(timecode: TIMECODE, frameRate: Unit, dropFrame: Boolean) = this()
    def this(timecode: TIMECODE, frameRate: FRAMERATE, dropFrame: Boolean) = this()
  }
  @JSImport("smpte-timecode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.smpteTimecode.smpteTimecodeDoubles.`23.976`
    - typings.smpteTimecode.smpteTimecodeInts.`24`
    - typings.smpteTimecode.smpteTimecodeInts.`25`
    - typings.smpteTimecode.smpteTimecodeDoubles.`29.97`
    - typings.smpteTimecode.smpteTimecodeInts.`30`
    - typings.smpteTimecode.smpteTimecodeInts.`50`
    - typings.smpteTimecode.smpteTimecodeDoubles.`59.94`
    - typings.smpteTimecode.smpteTimecodeInts.`60`
  */
  trait FRAMERATE extends StObject
  object FRAMERATE {
    
    inline def `23Dot976`: `23.976` = 23.976d.asInstanceOf[`23.976`]
    
    inline def `24`: typings.smpteTimecode.smpteTimecodeInts.`24` = 24.asInstanceOf[typings.smpteTimecode.smpteTimecodeInts.`24`]
    
    inline def `25`: typings.smpteTimecode.smpteTimecodeInts.`25` = 25.asInstanceOf[typings.smpteTimecode.smpteTimecodeInts.`25`]
    
    inline def `29Dot97`: `29.97` = 29.97d.asInstanceOf[`29.97`]
    
    inline def `30`: typings.smpteTimecode.smpteTimecodeInts.`30` = 30.asInstanceOf[typings.smpteTimecode.smpteTimecodeInts.`30`]
    
    inline def `50`: typings.smpteTimecode.smpteTimecodeInts.`50` = 50.asInstanceOf[typings.smpteTimecode.smpteTimecodeInts.`50`]
    
    inline def `59Dot94`: `59.94` = 59.94d.asInstanceOf[`59.94`]
    
    inline def `60`: typings.smpteTimecode.smpteTimecodeInts.`60` = 60.asInstanceOf[typings.smpteTimecode.smpteTimecodeInts.`60`]
  }
  
  type TIMECODE = Double | String | js.Date | TimecodeObject
  
  @js.native
  trait TimecodeInstance extends StObject {
    
    def add(timecode: TIMECODE): TimecodeInstance = js.native
    def add(timecode: TIMECODE, negative: Boolean): TimecodeInstance = js.native
    def add(timecode: TIMECODE, negative: Boolean, rollOverMaxHours: Double): TimecodeInstance = js.native
    def add(timecode: TIMECODE, negative: Unit, rollOverMaxHours: Double): TimecodeInstance = js.native
    
    var dropFrame: Boolean = js.native
    
    var frameCount: Double = js.native
    
    var frameRate: Double = js.native
    
    var frames: Double = js.native
    
    var hours: Double = js.native
    
    var minutes: Double = js.native
    
    var seconds: Double = js.native
    
    def subtract(timecode: TIMECODE): TimecodeInstance = js.native
    def subtract(timecode: TIMECODE, rollOverMaxHours: Double): TimecodeInstance = js.native
    
    def toDate(): js.Date = js.native
    
    def toString(options: String): String = js.native
  }
  
  trait TimecodeObject extends StObject {
    
    var frames: Double
    
    var hours: Double
    
    var minutes: Double
    
    var seconds: Double
  }
  object TimecodeObject {
    
    inline def apply(frames: Double, hours: Double, minutes: Double, seconds: Double): TimecodeObject = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimecodeObject]
    }
    
    extension [Self <: TimecodeObject](x: Self) {
      
      inline def setFrames(value: Double): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
