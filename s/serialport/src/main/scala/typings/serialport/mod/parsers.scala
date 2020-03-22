package typings.serialport.mod

import typings.node.streamMod.Transform
import typings.serialport.Anon0
import typings.serialport.AnonDelimiter
import typings.serialport.AnonEncoding
import typings.serialport.AnonLength
import typings.serialport.AnonRegex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serialport", "parsers")
@js.native
object parsers extends js.Object {
  @js.native
  class ByteLength protected () extends Transform {
    def this(options: AnonLength) = this()
  }
  
  @js.native
  class CCTalk () extends Transform
  
  @js.native
  class Delimiter protected () extends Transform {
    def this(options: AnonDelimiter) = this()
  }
  
  @js.native
  class Readline protected () extends Delimiter {
    def this(options: AnonEncoding) = this()
  }
  
  @js.native
  class Ready protected () extends Transform {
    def this(options: Anon0) = this()
  }
  
  @js.native
  class Regex protected () extends Transform {
    def this(options: AnonRegex) = this()
  }
  
}

