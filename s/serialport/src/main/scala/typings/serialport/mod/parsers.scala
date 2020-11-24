package typings.serialport.mod

import typings.node.streamMod.Transform
import typings.serialport.anon.Encoding
import typings.serialport.anon.Length
import typings.serialport.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("serialport", "parsers")
@js.native
object parsers extends js.Object {
  
  @js.native
  class ByteLength protected () extends Transform {
    def this(options: Length) = this()
  }
  
  @js.native
  class CCTalk () extends Transform
  
  @js.native
  class Delimiter protected () extends Transform {
    def this(options: typings.serialport.anon.Delimiter) = this()
  }
  
  @js.native
  class Readline protected () extends Delimiter {
    def this(options: Encoding) = this()
  }
  
  @js.native
  class Ready protected () extends Transform {
    def this(options: `0`) = this()
  }
  
  @js.native
  class Regex protected () extends Transform {
    def this(options: typings.serialport.anon.Regex) = this()
  }
}
