package typings
package serialportLib.serialportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serialport", "parsers")
@js.native
object parsersNs extends js.Object {
  @js.native
  class ByteLength protected ()
    extends nodeLib.streamMod.Transform {
    def this(options: serialportLib.Anon_Length) = this()
  }
  
  @js.native
  class CCTalk ()
    extends nodeLib.streamMod.Transform
  
  @js.native
  class Delimiter protected ()
    extends nodeLib.streamMod.Transform {
    def this(options: serialportLib.Anon_Delimiter) = this()
  }
  
  @js.native
  class Readline protected () extends Delimiter {
    def this(options: serialportLib.Anon_Ascii) = this()
  }
  
  @js.native
  class Ready protected ()
    extends nodeLib.streamMod.Transform {
    def this(options: serialportLib.Anon_DelimiterArray) = this()
  }
  
  @js.native
  class Regex protected ()
    extends nodeLib.streamMod.Transform {
    def this(options: serialportLib.Anon_Regex) = this()
  }
  
}

