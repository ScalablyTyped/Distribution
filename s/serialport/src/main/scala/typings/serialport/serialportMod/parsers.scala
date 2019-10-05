package typings.serialport.serialportMod

import typings.node.streamMod.Transform
import typings.serialport.Anon_Ascii
import typings.serialport.Anon_Delimiter
import typings.serialport.Anon_DelimiterArray
import typings.serialport.Anon_Length
import typings.serialport.Anon_Regex
import typings.serialport.serialportMod.parsers.Delimiter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serialport", "parsers")
@js.native
object parsers extends js.Object {
  @js.native
  class ByteLength protected () extends Transform {
    def this(options: Anon_Length) = this()
  }
  
  @js.native
  class CCTalk () extends Transform
  
  @js.native
  class Delimiter protected () extends Transform {
    def this(options: Anon_Delimiter) = this()
  }
  
  @js.native
  class Readline protected () extends Delimiter {
    def this(options: Anon_Ascii) = this()
  }
  
  @js.native
  class Ready protected () extends Transform {
    def this(options: Anon_DelimiterArray) = this()
  }
  
  @js.native
  class Regex protected () extends Transform {
    def this(options: Anon_Regex) = this()
  }
  
}

