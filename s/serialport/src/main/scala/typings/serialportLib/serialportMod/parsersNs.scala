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
    extends serialportLib.serialportMod.SerialPortNs.parsersNs.ByteLength {
    def this(options: serialportLib.Anon_Length) = this()
  }
  
  @js.native
  class CCTalk ()
    extends serialportLib.serialportMod.SerialPortNs.parsersNs.CCTalk
  
  @js.native
  class Delimiter protected ()
    extends serialportLib.serialportMod.SerialPortNs.parsersNs.Delimiter {
    def this(options: serialportLib.Anon_DelimiterIncludeDelimiter) = this()
  }
  
  @js.native
  class Readline protected ()
    extends serialportLib.serialportMod.SerialPortNs.parsersNs.Readline {
    def this(options: serialportLib.Anon_DelimiterEncoding) = this()
  }
  
  @js.native
  class Ready protected ()
    extends serialportLib.serialportMod.SerialPortNs.parsersNs.Ready {
    def this(options: serialportLib.Anon_Delimiter) = this()
  }
  
  @js.native
  class Regex protected ()
    extends serialportLib.serialportMod.SerialPortNs.parsersNs.Regex {
    def this(options: serialportLib.Anon_Regex) = this()
  }
  
}

